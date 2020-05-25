package com.aritsd.arit.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;


class Config
        {
            @Bean(name="entityManagerFactory")
            public LocalSessionFactoryBean sessionFactory() {
                LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();

                return sessionFactory;
            }
        }