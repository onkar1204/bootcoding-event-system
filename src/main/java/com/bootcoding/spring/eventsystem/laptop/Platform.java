package com.bootcoding.spring.eventsystem.laptop;

import org.springframework.stereotype.Component;

@Component

public class Platform {


    public   Windows windows;
    private  MacOS macOS;
    private  Linux linux;

    public Platform(Windows windows, MacOS macOS, Linux linux) {
        this.windows = windows;
        this.macOS = macOS;
        this.linux = linux;
        print();
    }

    public void print(){
        System.out.println("plateform class "+windows.HP);
    }
}
