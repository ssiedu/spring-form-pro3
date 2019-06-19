package com.ssi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ssi.dao.BranchDAO;
import com.ssi.dao.StudentDAO;
import com.ssi.entities.Student;

@Controller
public class StudentController {
	
	@Autowired
	private BranchDAO branchDAO;
	@Autowired
	private StudentDAO studentDAO;
	
	@RequestMapping("updatestudent")
	public ModelAndView showUpdateForm(@RequestParam("id") int code){
		Student student=studentDAO.getStudentById(code);
		ModelAndView mv=new ModelAndView("updateform");
		mv.addObject("student",student);
		return mv;
	}
	@RequestMapping("viewall")
	public ModelAndView showAllStudents(){
		List<Student> students = studentDAO.getAllStudents();
		ModelAndView mv=new ModelAndView("studentjstl");
		mv.addObject("students",students);
		return mv;
	}
	
	@RequestMapping(value="savestudent",method=RequestMethod.POST)
	public ModelAndView addStudentData(@ModelAttribute("student") Student student){
		studentDAO.addStudent(student);
		ModelAndView mv=new ModelAndView("saveconfirm");
		return mv;
	}
	@RequestMapping("newstudent")
	public ModelAndView showEntryForm(){
		
		ModelAndView mv=new ModelAndView("dataentry");
		Student student=new Student();
		student.setBranch("CS"); student.setSem(1);
		mv.addObject("studentModel", student);
		
		List<String> branches=branchDAO.getAllBranches();
		//List<String> branches=new ArrayList<>();
		//branches.add("CS");	branches.add("IT"); branches.add("MECH");
		
		List<Integer> semesters=new ArrayList<>();
		for(int i=1;i<=8;i++){semesters.add(i);}
		
		mv.addObject("semestervalues",semesters);
		mv.addObject("branchvalues",branches);
		return mv;
	}
	
}
