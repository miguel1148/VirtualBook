package digivox.desafio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import digivox.desafio.model.Livro;

@Controller
public class AluguelController {
	
	
	
	@RequestMapping(method = RequestMethod.GET, value="/alugarLivro")
	public ModelAndView inicio() {
		
		ModelAndView view = new ModelAndView("cadastro/alugarLivro");
		view.addObject("livroObj", new Livro());
		return view;
	}

}
