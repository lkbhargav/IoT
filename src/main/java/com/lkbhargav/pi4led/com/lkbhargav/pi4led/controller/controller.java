package com.lkbhargav.pi4led.com.lkbhargav.pi4led.controller;

import com.pi4j.io.gpio.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Bhargav on 6/13/2016.
 */

public class controller {

    private static GpioPinDigitalOutput pin;

    @RequestMapping("/")
    public String greeting()
    {
        return "Sai Baba..";
    }

    @RequestMapping("/light")
    public String light()
    {
        if(pin == null)
        {
            GpioController gpio = GpioFactory.getInstance();
            pin = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_18, "MyLED", PinState.LOW);
        }
        pin.toggle();
        return "Light Bulb";
    }
}
