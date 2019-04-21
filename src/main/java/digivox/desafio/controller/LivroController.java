package digivox.desafio.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import digivox.desafio.model.Livro;
import digivox.desafio.repository.LivroRepository;




@Controller
public class LivroController {
	
	@Autowired
	private LivroRepository livroRepository;
	
	@RequestMapping(method = RequestMethod.GET, value="/cadastroLivro")
	public ModelAndView inicio() {
		
		ModelAndView view = new ModelAndView("cadastro/cadastroLivro");
		view.addObject("livroObj", new Livro());
		return view;
	}
	
	@RequestMapping(method = RequestMethod.POST, value="**/salvarLivro")
	public ModelAndView salvar(Livro livro) {

		livroRepository.save(livro);
		
		ModelAndView view = new ModelAndView("cadastro/cadastroLivro");
//		ModelAndView view = new ModelAndView("cadastro/alugarLivro");
		Iterable<Livro> livroIt = livroRepository.findAll();
		view.addObject("livros", livroIt);
		view.addObject("livroObj", new Livro());
		
		
		return view;
		
	}
	
	
	@RequestMapping(method = RequestMethod.GET, value="/listaLivros")
	public ModelAndView livros() {
		ModelAndView view = new ModelAndView("cadastro/cadastroLivro");
//		ModelAndView view = new ModelAndView("cadastro/alugarLivro");
		Iterable<Livro> livroIt = livroRepository.findAll();
		view.addObject("livros", livroIt);
		view.addObject("livroObj", new Livro());
		
		return view;
	}
					
	//UPDATE
	@GetMapping("/cadastroLivro/{idLivro}")
	public ModelAndView update(@PathVariable("idLivro") Long idLivro) {
		
		Optional<Livro> livro = livroRepository.findById(idLivro);
		ModelAndView view = new ModelAndView("cadastro/cadastroLivro");
		view.addObject("livroObj", livro.get());
		
		return view;
	}
	
	@GetMapping("/alugarLivro/{idLivro}")
	public ModelAndView alugar(@PathVariable("idLivro") Long idLivro) {
		
		Optional<Livro> livro = livroRepository.findById(idLivro);
		ModelAndView view = new ModelAndView("cadastro/alugarLivro");
		view.addObject("livroObj", livro.get());
		
		
		return view;
	}
	
	@GetMapping("/removerLivro/{idLivro}")
	public ModelAndView excluir(@PathVariable("idLivro") Long idLivro) {
		
		livroRepository.deleteById(idLivro);;
		
		ModelAndView view = new ModelAndView("cadastro/cadastroLivro");
		view.addObject("livros", livroRepository.findAll());
		view.addObject("livroObj", new Livro());
		
		return view;
	}

}
