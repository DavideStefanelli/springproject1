package com.sys.configuration;

import com.sys.beans.Persona;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ConfigurationContext {

    @Bean(name = "persona")
    @Scope("singleton")
    public Persona persona(){
        return new Persona();
    }

}
