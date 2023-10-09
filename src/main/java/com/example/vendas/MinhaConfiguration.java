package com.example.vendas;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

@Development
public class MinhaConfiguration {


    @Bean
    public CommandLineRunner executar(){
        return args -> {
            System.out.println("rodando a configuracao de desenvolvimento");
        };
    }


}
//    @Bean(name="applicationName")
//    public String applicationName(){
//        return "Sistema de vendas";
//    }
