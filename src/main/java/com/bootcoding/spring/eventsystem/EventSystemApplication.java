package com.bootcoding.spring.eventsystem;

import com.bootcoding.spring.eventsystem.laptop.Laptop;
import com.bootcoding.spring.eventsystem.marker.Marker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@Component
@SpringBootApplication
public class EventSystemApplication {
    @Autowired
    private Marker marker;
    @Autowired
    private Laptop laptop;



    public static void main(String[] args) {
        SpringApplication.run(EventSystemApplication.class, args);
    }

}
