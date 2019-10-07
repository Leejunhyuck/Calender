package org.cal.controller;

import java.util.List;

import org.cal.model.CalVO;
import org.cal.model.DayVO;
import org.cal.persistence.CalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.extern.java.Log;

@Controller
@RequestMapping("/calender/*")
@Log
public class CalController {

	@Autowired
	private CalRepository repo;

	@GetMapping("/cal")
	public void calender(Model model) {
		log.info("init..........");

	}

	

	
	@PostMapping(value = "/list", consumes = "application/json")
	@ResponseBody
	public List<CalVO> list(@RequestBody DayVO vo,Model model) {

		log.info("list................");
		log.info("" + vo.getDay());

		
		log.info(""+repo.findByStartdateStartingWithOrTypeOrTypeOrEnddateStartingWith(vo.getDay(),"CR","NR",vo.getDay()));
		
		
		
		return repo.findByStartdateStartingWithOrTypeOrTypeOrEnddateStartingWith(vo.getDay(),"CR","NR",vo.getDay());
	}

	@PostMapping(value = "/register", consumes = "application/json")
	@ResponseBody
	public void register(@RequestBody CalVO vo) {

		log.info("register................");
		log.info("" + vo);

		repo.save(vo);

	}

}
