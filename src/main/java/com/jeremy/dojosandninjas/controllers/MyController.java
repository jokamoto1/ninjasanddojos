package com.jeremy.dojosandninjas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jeremy.dojosandninjas.models.Dojo;
import com.jeremy.dojosandninjas.models.Ninja;
import com.jeremy.dojosandninjas.services.DojoService;
import com.jeremy.dojosandninjas.services.NinjaService;

@Controller
public class MyController {
	@Autowired
	DojoService dojoService;
	@Autowired
	NinjaService ninjaService;
	
	@RequestMapping("/new/dojo")
	public String newDojoView(@ModelAttribute("dojo") Dojo dojo) {	
			return "addDojo.jsp";
	}
	@PostMapping("/new/dojo")
		public String newDojoPost(@ModelAttribute("dojo") Dojo dojo) {
			dojoService.create(dojo);
			return "redirect:/new/dojo";
		}
	@PostMapping("/new/ninja")
	public String newNinjnaPost(@ModelAttribute("ninja") Ninja ninja) {
		ninjaService.create(ninja);
		return "redirect:/new/ninja";
	}
	@RequestMapping("/new/ninja")
	public String newNinjaView(@ModelAttribute("ninja") Ninja ninja, Model model) {
		List<Dojo> allDojos = dojoService.findAll();;
		model.addAttribute("dojos", allDojos);
		return "addNinja.jsp";
	}
	@RequestMapping("/dojo/{id}")
	public String newDojosView(Model model, @PathVariable("id") Long id) {
//		List<Ninja> allNinjas = ninjaService.findAllFromDojoId(id);

		Dojo dojo = dojoService.findOne(id);
		List<Ninja> allNinjas = dojo.getNinjas();
		model.addAttribute("dojo", dojo);
		model.addAttribute("ninjas", allNinjas);
		return "viewNinjasInDojo.jsp";
	}
	@RequestMapping("/info")
	public String viewDojos(Model model) {

		List<Dojo> dojos = dojoService.findAll();	
		model.addAttribute("dojos", dojos);
		return "info.jsp";
	}

}
