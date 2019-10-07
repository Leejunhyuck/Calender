package org.cal.persistence;

import java.util.List;

import org.cal.model.CalVO;
import org.springframework.data.repository.CrudRepository;


public interface CalRepository extends CrudRepository<CalVO,Long> {
	
	public List<CalVO> findByStartdateStartingWithOrTypeOrTypeOrEnddateStartingWith(String startdate,String type,String typ,String enddate);
	
	
	
}
