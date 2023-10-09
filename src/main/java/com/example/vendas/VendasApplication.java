package com.example.vendas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@ComponentScan(basePackages = {"com.example.vendas.repository",
                                "com.example.vendas.service"}
)
@RestController
@ComponentScan("com.example.vendas")
public class VendasApplication {

//    @Autowired
//    @Qualifier("applicationName")
//    private String applicationName;

    @Value("${application.name}")
    private String applicationName;


    @Cachorro
    private Animal animal;


    @Bean(name="executarAnimal")
    public CommandLineRunner executar(){
        return args -> {
            this.animal.fazerBarulho();
        };
    }

    @GetMapping("/hello")
    public String helloWorld(){
        return applicationName;
    }


    @GetMapping("/")
    public String erroWorld(){
        return "olá muondo";
    }


    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class,args);
    }

}
