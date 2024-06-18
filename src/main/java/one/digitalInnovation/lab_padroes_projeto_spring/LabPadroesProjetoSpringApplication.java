package one.digitalInnovation.lab_padroes_projeto_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
/**
 * Projeto spring boot gerado via springInitializr
 * Incluídas as seguintes dependencias
 * Spring data Jpa
 * Spring Web
 * H2 database
 * OpenFegn
 *
 * @Author RogerioDonizete - seghuindo aula do  falvoje instruto DIO
 *
 */
@EnableFeignClients
@SpringBootApplication
public class LabPadroesProjetoSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabPadroesProjetoSpringApplication.class, args);
	}

}
