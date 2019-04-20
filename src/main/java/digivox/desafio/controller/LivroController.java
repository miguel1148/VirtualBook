package digivox.desafio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import digivox.desafio.model.Livro;
import digivox.desafio.model.Pessoa;
import digivox.desafio.repository.GenericRepository;




@Controller
public class LivroController {
	
	@Autowired
	private GenericRepository pessoaRepository;
	
	@RequestMapping(method = RequestMethod.GET, value="/cadastroLivro")
	public String inicio() {
		return "cadastro/cadastroLivro";
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/salvarLivro")
	public String salvar(Livro livro) {
		
		pessoaRepository.save(livro);
		return "cadastro/cadastroLivro";
		
		
	}

}
