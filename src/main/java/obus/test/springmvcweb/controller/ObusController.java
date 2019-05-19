package obus.test.springmvcweb.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import obus.test.springmvcweb.model.Obus;
import obus.test.springmvcweb.service.ObusService;

@Controller
public class ObusController {

	@Autowired
	@Qualifier("obusService")
	private ObusService obusService;

	@RequestMapping(value = { "/", "/home" }, method = RequestMethod.GET)
	public ModelAndView hello(HttpServletResponse response) throws IOException {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home");
		return mv;
	}

	@RequestMapping(value = "/obus", method = RequestMethod.POST)
	public ModelAndView showAllObus() {
		System.out.println("Obus Page Requested : All Obus");
		ModelAndView mv = new ModelAndView();
		List<Obus> obus = obusService.getObuses();
		mv.addObject("obusList", obus);
		mv.setViewName("allObus");
		return mv;
	}

}
