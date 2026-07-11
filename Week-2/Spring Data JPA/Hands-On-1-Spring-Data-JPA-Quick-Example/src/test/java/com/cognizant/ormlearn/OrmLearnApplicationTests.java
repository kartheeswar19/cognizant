package com.cognizant.ormlearn;

import com.cognizant.ormlearn.repository.CountryRepository;
import com.cognizant.ormlearn.service.CountryService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class OrmLearnApplicationTests {

    @Autowired
    private CountryRepository countryRepository;

    @Autowired
    private CountryService countryService;

    @Test
    void contextLoads() {
        assertThat(countryRepository).isNotNull();
        assertThat(countryService).isNotNull();
    }

    @Test
    void countryTableReturnsRecords() {
        var countries = countryService.getAllCountries();
        assertThat(countries).isNotEmpty();
        assertThat(countries).extracting(country -> country.getCode()).contains("IN", "US");
    }
}
