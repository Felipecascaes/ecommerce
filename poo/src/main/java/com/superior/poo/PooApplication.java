package com.superior.poo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class PooApplication {

	public static void main(String[] args) {
		SpringApplication.run(PooApplication.class, args);
	}

    /*
    HTTP <> != HTTPS  -  Se um site não tiver HTTPS://  -  Desconfie

    Get Buscar as informações ou Pegar
    Post Enviar as informações ou Empurrar
    Put Alterar as informações ou Mudar
    Patch Alterar as informações ou Mudar
    Delete Deletar as informações
     */
    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }
}
