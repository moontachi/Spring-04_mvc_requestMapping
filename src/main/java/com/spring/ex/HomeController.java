package com.spring.ex;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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
		System.out.println("dateFormat: " + dateFormat);
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		System.out.println(formattedDate);
		return "home";
	}
	
	@RequestMapping("member/view")
	public String view() {
		System.out.println("view()");
		return  "member/memberView";
	}
	
	@RequestMapping("a")
	public String a() {
		return  "b";
	}
	
	@RequestMapping("member/input")
	public String input(Model model) {
		
		model.addAttribute("id","abc");//세션 설정 하듯이 id = abc 담음
		//model은 조금 다르지만  request.setAttribute("id","abc")라고 생각.(공통점)
		return  "member/result";
	}
	
	@RequestMapping("member/list")
	public ModelAndView list() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("name","박효신");
		mav.addObject("pw",1234);
		mav.setViewName("member/list"); //ModelAndView 이용 할 경우에는 넘어갈 위치도 설정 해준다.
		return mav;
	}
	
}
