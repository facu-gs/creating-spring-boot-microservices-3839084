package com.example;

/* This interface represents the Spring IoC container and is responsible for instantiating, configuring, and assembling the beans */
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.tourservice.SpringBeans;
import com.example.tourservice.TravelAgentService;

public class Application {

    public static void main(String[] args) {
        /* Instantiate the application context */
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringBeans.class);
        /*
         * You use .class when you need to reference the Class object without creating
         * an instance of the class
         * The Class Object it is used to hold metadata about a class
         */
        TravelAgentService agent = context.getBean(TravelAgentService.class);

        
        System.out.println("\n******Explore California Tour Catalogue******");
        agent.displayTours();

        System.out.println("\n******Explore California Tour Kid Friendly Tours******");
        agent.displayToursBy(true);
    }
}