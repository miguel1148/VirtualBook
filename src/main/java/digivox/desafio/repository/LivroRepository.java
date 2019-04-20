package digivox.desafio.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import digivox.desafio.model.Livro;

@Repository
@Transactional
public interface LivroRepository extends CrudRepository<Livro, Long>{

	
	
	
}
