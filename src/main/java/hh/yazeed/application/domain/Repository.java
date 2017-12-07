package hh.yazeed.application.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


public interface Repository extends CrudRepository <Student,Long> {
	List<Student> findBystudentnumber(String studentnumber);
}