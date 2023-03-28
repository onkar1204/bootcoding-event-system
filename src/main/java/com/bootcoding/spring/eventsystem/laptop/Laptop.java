package com.bootcoding.spring.eventsystem.laptop;

import org.springframework.stereotype.Component;

@Component
public class Laptop {
    private  Platform platform;
    private  JDKSoftware jdkSoftware;

    public Laptop(Platform platform, JDKSoftware jdkSoftware) {
        this.platform = platform;
        this.jdkSoftware = jdkSoftware;
        print();
    }
    public void print(){
        System.out.println("Laptop Class "+platform.windows.HP);
    }
}
