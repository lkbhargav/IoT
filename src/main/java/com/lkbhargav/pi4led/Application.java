package com.lkbhargav.pi4led;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Bhargav on 6/13/2016.
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args)
    {
        SpringApplication.run(Application.class,args);
    }
}