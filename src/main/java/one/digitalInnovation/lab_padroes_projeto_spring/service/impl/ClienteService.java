package one.digitalInnovation.lab_padroes_projeto_spring.service.impl;

import one.digitalInnovation.lab_padroes_projeto_spring.model.Cliente;
import org.springframework.stereotype.Service;

/**
 * Imterface padrão <b>Strategy</b> no dominio cliente. Com isso, se
 * necessário podemos ter multiplas implementações da mesma interface.
 */
public interface ClienteService {

    Iterable<Cliente> buscarTodos();
    Cliente buscaporId(Long id);
    void inserir(Cliente cliente);
    void atualizar(Long id, Cliente cliente);
    void deletar(Long id);

}
