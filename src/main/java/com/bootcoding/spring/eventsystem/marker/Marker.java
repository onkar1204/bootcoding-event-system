package com.bootcoding.spring.eventsystem.marker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Marker {

    private Cap cap;
    private Ink ink;

    public Marker(Cap cap, Ink ink){
        this.cap=cap;
        this.ink=ink;

        print();
    }
    public void print(){
        System.out.println("This Is The MAterial:- "+cap.material);
        System.out.println("This Is The Colour:-   "+cap.colour);
        System.out.println("This Is The Shape:-    "+cap.shape);
        System.out.println("This Is  Ink Colour:-  "+ink.colour);
        System.out.println("This Is The Form:-     "+ink.form);
    }
}
