package com.sist.web.controller;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.sist.web.entity.*;
import com.sist.web.dao.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
	@Autowired
	private EmpDAO dao;
	
	@GetMapping("/")
	public String emp_list(Model model) {
		List<Emp> list=dao.findAll();
		model.addAttribute("list", list);
		return "main";
	}
	
}
