package digivox.desafio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import digivox.desafio.model.Pessoa;
import digivox.desafio.repository.GenericRepository;



@Controller
public class PessoaController {
	
	
	@Autowired
	private GenericRepository pessoaRepository;
	
	@RequestMapping(method = RequestMethod.GET, value="/cadastroPessoa")
	public String inicio() {
		return "cadastro/cadastroPessoa";
	}
	
	
	@RequestMapping(method = RequestMethod.POST, value="/salvarPessoa")
	public String salvar(Pessoa pessoa) {
		
		pessoaRepository.save(pessoa);
		return "cadastro/cadastroPessoa";
		
		
	}
	
	/*
	@RequestMapping(method = RequestMethod.GET, value="/listapessoas")
	public ModelAndView pessoas() {
		ModelAndView view = new ModelAndView("cadastro/cadastroPessoa");
		Iterable<Pessoa> pessoaIt = pessoaRepository.findAll();
		view.addObject("pessoas", pessoaIt);
		return view;
				
		
	}
	
*/

}
