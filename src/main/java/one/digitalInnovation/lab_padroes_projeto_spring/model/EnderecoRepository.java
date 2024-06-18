package one.digitalInnovation.lab_padroes_projeto_spring.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository //não é obrigatorio declarar o @repository pois essa classe estende da CrudReposytory
public interface EnderecoRepository extends CrudRepository<Endereco, String> {
}
