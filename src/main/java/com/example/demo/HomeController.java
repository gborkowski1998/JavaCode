package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class HomeController {
    @RequestMapping("/")
    @ResponseBody // <------------------- zwaracanie wartosci
    public String index() {
        return "Hello World!";
    }
    // http://localhost:85/szablon
    @RequestMapping("/szablon")
    public String szablon() {
        return "szablon"; // szablon.html w folderze templates
    }
    @RequestMapping("/szablon2")
    public String szablon2() {
        return "szablon2"; // szablon2.html w folderze templates
    }
}