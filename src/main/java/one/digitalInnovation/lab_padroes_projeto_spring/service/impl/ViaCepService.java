package one.digitalInnovation.lab_padroes_projeto_spring.service.impl;

import one.digitalInnovation.lab_padroes_projeto_spring.model.Endereco;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


/**
 * cliebnte Http criado via <b>OpenFeingn<b/>, para consumo da API <b>ViaCEP</b>.
 */
@FeignClient(name = "viaCep", url="https://viacep.com.br/ws")
public interface ViaCepService {
    @GetMapping("/{cep}/json/")
    Endereco consultarCep(@PathVariable("cep") String cep);
}
