package hh.yazeed.application.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import hh.yazeed.application.domain.Repository;
import hh.yazeed.application.domain.Student;


@Controller

public class Mycontroller {

	@Autowired
	private Repository srepository;

	
	@RequestMapping(value="/login")
    public String login() {	
        return "login";
    }	
	
	@RequestMapping(value = "/index")
	public String Display(Model model) {
		model.addAttribute("students", srepository.findAll());

		return "Display";
	}

	@RequestMapping(value = "/add")
	public String addBooking(Model model) {
		model.addAttribute("student", new Student());
		return "addbooking";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String save(Student student) {
		srepository.save(student);
		return "redirect:index";
	}
	
	@RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
	public String editBooking(@PathVariable("id") Long studentId, Model model) {
		model.addAttribute("student", srepository.findOne(studentId));
	
		return "editbooking";
		}
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
		public String deleteStudent(@PathVariable("id") Long studentId, Model model) {
			srepository.delete(studentId);
			return "redirect:../index";
		}
}