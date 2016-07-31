package com.lkbhargav.pi4led.com.lkbhargav.pi4led.controller;

import com.pi4j.io.gpio.PinState;

/**
 * Created by Bhargav on 6/29/2016.
 */
public class LEDdata extends controller {

    private int ledno;

    public PinState led0()
    {
        return pin0.getState();
    }

    public PinState led1()
    {
        return pin1.getState();
    }

    public PinState led2()
    {
        return pin2.getState();
    }

    public PinState led3()
    {
        return pin3.getState();
    }

    public PinState led4()
    {
        return pin4.getState();
    }

    public PinState led5()
    {
        return pin5.getState();
    }

    public PinState led6()
    {
        return pin6.getState();
    }

    public PinState led7()
    {
        return pin7.getState();
    }

    public PinState led8()
    {
        return pin8.getState();
    }

    public PinState led9()
    {
        return pin9.getState();
    }
}
