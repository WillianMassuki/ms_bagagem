package br.com.ms_bagagem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class MsBagagemApplication {

    static void main(String[] args) {
        SpringApplication.run(MsBagagemApplication.class, args);
    }

}
