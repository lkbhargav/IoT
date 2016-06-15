package com.lkbhargav.pi4led.com.lkbhargav.pi4led.controller;

import com.pi4j.io.gpio.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Bhargav on 6/13/2016.
 */
@RestController
public class controller {

    private static GpioPinDigitalOutput pin0, pin1, pin2, pin3, pin4, pi5, pi6, pi7, pi8, pi9;


    @RequestMapping("/")
    public String greeting()
    {
        return "index";
    }

    @RequestMapping("/light")
    public String light()
    {
        if(pin0 == null)
        {
            GpioController gpio = GpioFactory.getInstance();
            pin0 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_00, "MyLED", PinState.LOW);
        }
        pin0.toggle();
        return "LED 0 is On";
    }

    @RequestMapping("/blink")
    public String light1()
    {
        if(pin0 == null)
        {
            GpioController gpio = GpioFactory.getInstance();
            pin0 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_01, "MyLED", PinState.LOW);
        }
        pin0.blink(500L,5000L);
        return "Its working kid";
    }
}