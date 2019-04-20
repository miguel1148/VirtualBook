package digivox.desafio.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import digivox.desafio.model.Livro;
import digivox.desafio.model.Pessoa;



@Repository
@Transactional
public interface PessoaRepository extends CrudRepository<Pessoa, Long>{

	

}
