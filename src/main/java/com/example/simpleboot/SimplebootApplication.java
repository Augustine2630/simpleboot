//главный класс управления
package com.example.simpleboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//аннотация для конфигурирования других компонентов spring framework
@SpringBootApplication
public class SimplebootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimplebootApplication.class, args);
    }

}
