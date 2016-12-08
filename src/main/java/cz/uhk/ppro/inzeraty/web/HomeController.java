package cz.uhk.ppro.inzeraty.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cz.uhk.ppro.inzeraty.model.Inzerat;
import cz.uhk.ppro.inzeraty.sluzby.UlozisteInzeratu;

@Controller
public class HomeController {
	@Autowired
	private UlozisteInzeratu uloziste;

	@RequestMapping("/")
	public String home(Model m) {
		System.out.println("huh");
		m.addAttribute("inzeraty", uloziste.getInzeraty());
		return "home";
	}
	
	@RequestMapping(value="/add", method=RequestMethod.GET)
	public String add(@ModelAttribute Inzerat inzerat) {
		return "form";
	}

	@RequestMapping(value="/add", method=RequestMethod.POST)
	public String addSubmited(@ModelAttribute Inzerat inzerat) {
		// TODO validovat
		uloziste.pridej(inzerat);
		//return "form";
		return "redirect:/"; // presmerovat na vypis inzeratu
	}
}
