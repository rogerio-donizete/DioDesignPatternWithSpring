package one.digitalInnovation.lab_padroes_projeto_spring.service.impl;

import one.digitalInnovation.lab_padroes_projeto_spring.model.Cliente;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImplementation implements ClienteService{
    @Override
    public Iterable<Cliente> buscarTodos() {
        return null;
    }

    @Override
    public Cliente buscaporId(Long id) {
        return null;
    }

    @Override
    public void inserir(Cliente cliente) {

    }

    @Override
    public void atualizar(Long id, Cliente cliente) {

    }

    @Override
    public void deletar(Long id) {

    }
}
