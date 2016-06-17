package com.lkbhargav.pi4led.com.lkbhargav.pi4led.controller;

import com.pi4j.io.gpio.*;
import com.sun.org.apache.xalan.internal.xsltc.compiler.Parser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import static java.lang.Thread.sleep;

/**
 * Created by Bhargav on 6/13/2016.
 */

//@RestController will not allow us to run the html files, so instead we should use @controller

@Controller
public class controller {

    private static GpioPinDigitalOutput pin0, pin1, pin2, pin3, pin4, pin5, pin6, pin7, pin8, pin9;

    //8 = 25 and 9 = 27

    public Model printLED(Model model)
    {
        model.addAttribute("led1",(pin0.getState().toString().equals("HIGH"))?"on.png":"off.png");
        model.addAttribute("led2",(pin1.getState().toString().equals("HIGH"))?"on.png":"off.png");
        model.addAttribute("led3",(pin2.getState().toString().equals("HIGH"))?"on.png":"off.png");
        model.addAttribute("led4",(pin3.getState().toString().equals("HIGH"))?"on.png":"off.png");
        model.addAttribute("led5",(pin4.getState().toString().equals("HIGH"))?"on.png":"off.png");
        model.addAttribute("led6",(pin5.getState().toString().equals("HIGH"))?"on.png":"off.png");
        model.addAttribute("led7",(pin6.getState().toString().equals("HIGH"))?"on.png":"off.png");
        model.addAttribute("led8",(pin7.getState().toString().equals("HIGH"))?"on.png":"off.png");
        model.addAttribute("led9",(pin8.getState().toString().equals("HIGH"))?"on.png":"off.png");
        model.addAttribute("led10",(pin9.getState().toString().equals("HIGH"))?"on.png":"off.png");
        model.addAttribute("li1",(pin0.getState().toString().equals("HIGH"))?"Off":"On");
        model.addAttribute("li2",(pin1.getState().toString().equals("HIGH"))?"Off":"On");
        model.addAttribute("li3",(pin2.getState().toString().equals("HIGH"))?"Off":"On");
        model.addAttribute("li4",(pin3.getState().toString().equals("HIGH"))?"Off":"On");
        model.addAttribute("li5",(pin4.getState().toString().equals("HIGH"))?"Off":"On");
        model.addAttribute("li6",(pin5.getState().toString().equals("HIGH"))?"Off":"On");
        model.addAttribute("li7",(pin6.getState().toString().equals("HIGH"))?"Off":"On");
        model.addAttribute("li8",(pin7.getState().toString().equals("HIGH"))?"Off":"On");
        model.addAttribute("li9",(pin8.getState().toString().equals("HIGH"))?"Off":"On");
        model.addAttribute("li10",(pin9.getState().toString().equals("HIGH"))?"Off":"On");
        return model;
    }

    @RequestMapping("/")
    public String greeting(Model m)
    {
        initialize();
        m = printLED(m);
        return "index";
    }

    @RequestMapping("/turnon")
    public String turnon(Model m)
    {
        initialize();
        pin0.high();
        pin1.high();
        pin2.high();
        pin3.high();
        pin4.high();
        pin5.high();
        pin6.high();
        pin7.high();
        pin8.high();
        pin9.high();
        m = printLED(m);
        return "index";
    }

    @RequestMapping("/turnoff")
    public String turnoff(Model m)
    {
        initialize();
        pin0.low();
        pin1.low();
        pin2.low();
        pin3.low();
        pin4.low();
        pin5.low();
        pin6.low();
        pin7.low();
        pin8.low();
        pin9.low();
        m = printLED(m);
        return "index";
    }

    @RequestMapping("/light0")
    public String light0(Model m)
    {
        initialize();
        pin0.toggle();
        m = printLED(m);
        return "index";
    }

    @RequestMapping("/light1")
    public String light1(Model m)
    {
        initialize();
        pin1.toggle();
        m = printLED(m);
        return "index";
    }

    @RequestMapping("/light2")
    public String light2(Model m)
    {
        initialize();
        pin2.toggle();
        m = printLED(m);
        return "index";
    }

    @RequestMapping("/light3")
    public String light3(Model m)
    {
        initialize();
        pin3.toggle();
        m = printLED(m);
        return "index";
    }

    @RequestMapping("/light4")
    public String light4(Model m)
    {
        initialize();
        pin4.toggle();
        m = printLED(m);
        return "index";
    }

    @RequestMapping("/light5")
    public String light5(Model m)
    {
        initialize();
        pin5.toggle();
        m = printLED(m);
        return "index";
    }

    @RequestMapping("/light6")
    public String light6(Model m)
    {
        initialize();
        pin6.toggle();
        m = printLED(m);
        return "index";
    }

    @RequestMapping("/light7")
    public String light7(Model m)
    {
        initialize();
        pin7.toggle();
        m = printLED(m);
        return "index";
    }

    @RequestMapping("/light8")
    public String light8(Model m)
    {
        initialize();
        pin8.toggle();
        m = printLED(m);
        return "index";
    }

    @RequestMapping("/light9")
    public String light9(Model m)
    {
        initialize();
        pin9.toggle();
        m = printLED(m);
        return "index";
    }

    public static void initialize()
    {
            if(pin0 == null)
            {
                GpioController gpio = GpioFactory.getInstance();
                pin0 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_00, "MyLED", PinState.LOW);
            }

        if(pin1 == null)
        {
            GpioController gpio1 = GpioFactory.getInstance();
            pin1 = gpio1.provisionDigitalOutputPin(RaspiPin.GPIO_01, "MyLED1", PinState.LOW);
        }

        if(pin2 == null)
        {
            GpioController gpio2 = GpioFactory.getInstance();
            pin2 = gpio2.provisionDigitalOutputPin(RaspiPin.GPIO_02, "MyLED2", PinState.LOW);
        }

        if(pin3 == null)
        {
            GpioController gpio3 = GpioFactory.getInstance();
            pin3 = gpio3.provisionDigitalOutputPin(RaspiPin.GPIO_03, "MyLED3", PinState.LOW);
        }

        if(pin4 == null)
        {
            GpioController gpio4 = GpioFactory.getInstance();
            pin4 = gpio4.provisionDigitalOutputPin(RaspiPin.GPIO_04, "MyLED4", PinState.LOW);
        }

        if(pin5 == null)
        {
            GpioController gpio5 = GpioFactory.getInstance();
            pin5 = gpio5.provisionDigitalOutputPin(RaspiPin.GPIO_05, "MyLED5", PinState.LOW);
        }

        if(pin6 == null)
        {
            GpioController gpio6 = GpioFactory.getInstance();
            pin6 = gpio6.provisionDigitalOutputPin(RaspiPin.GPIO_06, "MyLED6", PinState.LOW);
        }

        if(pin7 == null)
        {
            GpioController gpio7 = GpioFactory.getInstance();
            pin7 = gpio7.provisionDigitalOutputPin(RaspiPin.GPIO_07, "MyLED7", PinState.LOW);
        }

        if(pin8 == null)
        {
            GpioController gpio8 = GpioFactory.getInstance();
            pin8 = gpio8.provisionDigitalOutputPin(RaspiPin.GPIO_25, "MyLED8", PinState.LOW);
        }

        if(pin9 == null)
        {
            GpioController gpio9 = GpioFactory.getInstance();
            pin9 = gpio9.provisionDigitalOutputPin(RaspiPin.GPIO_27, "MyLED9", PinState.LOW);
        }
    }

    @RequestMapping(value="/status", method={RequestMethod.GET, RequestMethod.POST})
    public String status(Model m)
    {
        initialize();
        m = printLED(m);
        return "index";
    }

    @RequestMapping(value = "/timer", method={RequestMethod.POST, RequestMethod.GET})
    public static String timer(@RequestParam(value="num", required=false, defaultValue = "1") final int num) throws InterruptedException {

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {

                int i = (int) Math.floor(num);
                if(i <= 17) {
                    i = i * 60;
                }

                initialize();

                while(i >= 0)
                {
                    int j = 9;
                    int[] num = new int[10];

                    pin9.low();
                    pin8.low();
                    pin7.low();
                    pin6.low();
                    pin5.low();
                    pin4.low();
                    pin3.low();
                    pin2.low();
                    pin1.low();
                    pin0.low();
                    String val = converter(i);

                    while(val.length() < 10)
                    {
                        val += "0";
                    }

                    while(j >= 0)
                    {
                        num[j] = Integer.parseInt(val.substring(0,1));
                        val = val.substring(1);
                        j--;
                    }

                    i--;

                    if(num[9] == 1)
                    {
                        pin9.high();
                    }

                    if(num[8] == 1)
                    {
                        pin8.high();
                    }

                    if(num[7] == 1)
                    {
                        pin7.high();
                    }

                    if(num[6] == 1)
                    {
                        pin6.high();
                    }

                    if(num[5] == 1)
                    {
                        pin5.high();
                    }

                    if(num[4] == 1)
                    {
                        pin4.high();
                    }

                    if(num[3] == 1)
                    {
                        pin3.high();
                    }

                    if(num[2] == 1)
                    {
                        pin2.high();
                    }

                    if(num[1] == 1)
                    {
                        pin1.high();
                    }

                    if(num[0] == 1)
                    {
                        pin0.high();
                    }

                    try {
                        sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

            public String converter(int num)
            {
                String Binnum="";
                int numbin=0;
                if(num!=0||num!=1){
                    while(num>1){
                        numbin=num%2;
                        num=num/2;
                        Binnum=Binnum+numbin;
                    }
                    Binnum=Binnum+num;
                }
                else{
                    Binnum=Binnum+num;
                }
                String reverse = new StringBuffer(Binnum).reverse().toString();
                return Binnum;
            }
        });

        return "index";
    }
}