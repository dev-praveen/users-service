package com.hex.users.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.hex.users")
public class UsersServiceApplication {

  public static void main(String[] args) {

    SpringApplication.run(UsersServiceApplication.class);
  }
}
