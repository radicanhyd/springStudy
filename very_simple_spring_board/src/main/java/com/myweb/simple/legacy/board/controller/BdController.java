package com.myweb.simple.legacy.board.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.myweb.simple.HomeController;
import com.myweb.simple.legacy.board.service.BdService;

@Controller
public class BdController {
	
	
	
	
private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	
	@RequestMapping(value = "/lboard/list", method = RequestMethod.GET)
	public String home(Locale locale, Model model, HttpServletRequest servletRequest) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		model.addAttribute("request", servletRequest);
		
		BdService service = new BdService();
		service.executeList(model);
		
		
		return "lboard/list";
	}

}
