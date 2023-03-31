package com.bootcoding.spring.eventsystem.switch_board;

import org.springframework.stereotype.Component;

@Component
public class Switch {


    public String color;
    private Plug plug;
    public Button button;


    public Switch(Button button, Plug plug) {
        this.plug = plug;
        this.button = button;
        System.out.println("I am switch!");
    }

}
