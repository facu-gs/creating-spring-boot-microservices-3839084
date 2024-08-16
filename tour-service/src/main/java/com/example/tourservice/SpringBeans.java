package com.example.tourservice;

/* Here we have the configuration for our dependendy injection */

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.tourservice.utilities.TourRepository;

/* 
* @Configuration is a class-level annotation indicating 
* that an object is a source of bean definitions.  
*/

@Configuration
public class SpringBeans {

  /*
   * The @Bean annotation is used to indicate that a method instantiates,
   * configures, and initializes a new object to be managed by the Spring IoC
   * container.
   */
  @Bean
  public TourRepository tourRepository() {
    return new TourRepository();
  }

  @Bean
  public TourManagementService tourManagementService() {
    return new TourManagementService(tourRepository());
  }

  @Bean
  public TravelAgentService travelAgentService() {
    return new TravelAgentService(tourRepository());
  }
}
