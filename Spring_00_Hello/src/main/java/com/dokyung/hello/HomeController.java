package com.dokyung.hello;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HomeController {

    @ResponseBody
    @RequestMapping(value="/",method= RequestMethod.GET)
    public String home() {

        return "수발좀되라";
    }
}