package com.cognizant.ormlearn;

import com.cognizant.ormlearn.service.CountryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class OrmLearnApplication {

    private static final Logger logger = LoggerFactory.getLogger(OrmLearnApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(OrmLearnApplication.class, args);
    }

    @Bean
    public CommandLineRunner testGetAllCountries(CountryService countryService) {
        return args -> {
            logger.info("Start");
            var countries = countryService.getAllCountries();
            logger.info("Countries = {}", countries);
            logger.info("End");
        };
    }
}
