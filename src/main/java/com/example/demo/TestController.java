package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.ArrayList;
import java.util.List;

@Controller
public class TestController {
    @RequestMapping("/params")
    @ResponseBody
    public Object params1(
            @RequestParam(required = false) String name,
            @RequestParam(required = false) Integer age,
            @RequestParam(required = false) Integer userid
    ) {
        List<UserEntity> users = new ArrayList<>();
        users.add(new UserEntity(name,  age, userid));
        users.add(new UserEntity("John",  26, 1));
        users.add(new UserEntity("Kate",  23, 2));
        return users;
//        return new UserEntity(name,  age);
    }

    @RequestMapping("/params/{id}")
    @ResponseBody
    public String params2(
            @PathVariable Long id,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) Integer age
    ) {
        return id + ": " + name + " " + age;
    }
}