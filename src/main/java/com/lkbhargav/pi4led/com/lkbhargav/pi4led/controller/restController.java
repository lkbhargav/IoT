package com.lkbhargav.pi4led.com.lkbhargav.pi4led.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Bhargav on 6/29/2016.
 */

@RestController
public class restController {

    @RequestMapping("/getData")
    public LEDdata actualData()
    {
        return new LEDdata();
    }

}
