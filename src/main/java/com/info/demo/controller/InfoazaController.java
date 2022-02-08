package com.info.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.info.demo.model.Infoaza;
import com.info.demo.repo.InfoRepo;

@Controller
public class InfoazaController {
	@Autowired
	InfoRepo inf;

@RequestMapping("/")
public String login() {
	return "login.jsp";
}

@RequestMapping("/loginuser")
public String userpage(Infoaza infoaza) {
   String s=infoaza.getUser_name();
   try {
	   Infoaza i=inf.getById(s);
	   System.out.println(i);
	   if(infoaza.getUser_pass().equals(i.getUser_pass())) {
		   return "userpage.jsp";
	   }
	   else {
		   System.out.println("Wrong password");
		   return "login.jsp";
	   }
   }
   catch(Exception e) {
	   System.out.println("Username not forund");
	   return "login.jsp";
   }
}
}

