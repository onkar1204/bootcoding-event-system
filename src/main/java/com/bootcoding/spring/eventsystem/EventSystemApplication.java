package com.bootcoding.spring.eventsystem;

import com.bootcoding.spring.eventsystem.laptop.Laptop;
import com.bootcoding.spring.eventsystem.marker.Marker;
import com.bootcoding.spring.eventsystem.switch_board.SwitchBoard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@Component
@SpringBootApplication
public class EventSystemApplication {
//    @Autowired
//    private Marker marker;
//    @Autowired
//    private Laptop laptop;
    @Autowired
    private SwitchBoard switchBoard;

    public static void main(String[] args) {
        SpringApplication.run(EventSystemApplication.class, args);
    }

}
