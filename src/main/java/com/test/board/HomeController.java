package com.test.board;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		model.addAttribute("nick", "장동건" );
		
	/*	int nowTime = date.getHours();
		if(nowTime<6) {
			model.addAttribute("welcome","새벽");
		}else if(nowTime<12 && nowTime>=6) {
			model.addAttribute("welcome","아침");
		}else if(nowTime<18 && nowTime>=12) {
			model.addAttribute("welcome","오후");
		}else {
			model.addAttribute("welcome","저녁");
		}*/
		
		model.addAttribute("welcome","새벽,아침,오후,저녁".split(",")[date.getHours()/6]);
		
		return "home";
	}
	
}
