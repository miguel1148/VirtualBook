package digivox.desafio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import digivox.desafio.model.Livro;
import digivox.desafio.model.Pessoa;
import digivox.desafio.repository.LivroRepository;




@Controller
public class LivroController {
	
	@Autowired
	private LivroRepository livroRepository;
	
	@RequestMapping(method = RequestMethod.GET, value="/cadastroLivro")
	public String inicio() {
		return "cadastro/cadastroLivro";
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/salvarLivro")
	public String salvar(Livro livro) {

		livroRepository.save(livro);
		return "cadastro/cadastroLivro";
		
	}
	
	
	@RequestMapping(method = RequestMethod.GET, value="/listaLivros")
	public ModelAndView livros() {
		ModelAndView view = new ModelAndView("cadastro/cadastroLivro");
		Iterable<Livro> livroIt = livroRepository.findAll();
		view.addObject("livros", livroIt);
		return view;
	}
	

}
