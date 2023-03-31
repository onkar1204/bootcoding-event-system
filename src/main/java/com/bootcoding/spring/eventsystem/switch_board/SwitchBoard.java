package com.bootcoding.spring.eventsystem.switch_board;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class SwitchBoard {


    @Value("${app.version}")
    private String version;


    private String red;

    private Switch swich;

    @Value("${RED}")
    public String color;
    @Value("${BLUE}")
    public String buttonColor;
    private String brand;
    private String shape;


    public SwitchBoard(Switch swich) {
        this.swich = swich;

        swich.color = "Red";
        System.out.println("I am switchboard!");
        System.out.println("Switch Color : " + swich.color);
    }
    public void print(){
        System.out.println("APP VERSION = " + version);
        swich.button.color = buttonColor;
        System.out.println("Button Color : " + swich.button.color);
        swich.color = red;

        System.out.println("SwitchBoard Color : " + this.color);
    }
}
