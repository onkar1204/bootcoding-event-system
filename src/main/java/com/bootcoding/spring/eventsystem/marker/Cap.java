package com.bootcoding.spring.eventsystem.marker;

import org.springframework.stereotype.Component;

@Component
public class Cap {
    public String material;
    public String colour;
    public String shape;

    public Cap(){
        material = "Plastic";
        colour = "Black";
        shape = "Circle";
    }
}
