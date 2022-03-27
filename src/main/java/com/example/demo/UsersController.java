package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;
import java.util.stream.Collectors;

@Controller
public class UsersController {
    List<UserEntity> usersList = Arrays.asList(new UserEntity("John", 26, 1),new UserEntity("John", 26, 2),new UserEntity("Kate", 23, 3));

    Map<Integer, UserEntity> usersMap = usersList.stream().collect(
            Collectors.toMap(UserEntity::getUserid, user -> user));

    @RequestMapping("/users")
    @ResponseBody
    public Object GetAllUsers(
    ) {
        return usersMap;
    }

    @RequestMapping("/users/{id}/get")
    @ResponseBody
    public String GetSpecificUser(
            @PathVariable Integer id
    ) {
        String UserDetails = "Name: " + usersMap.get(id).getName().toString() + " Age: " + usersMap.get(id).getAge().toString();
        return UserDetails;
    }

    @RequestMapping("/users/{id}/remove")
    @ResponseBody
    public Object RemoveUser(
            @PathVariable Integer id
    ) {
        usersMap.remove(id);

        return usersMap;
    }

    @RequestMapping("/users/add")
    @ResponseBody
    public Object RemoveUser(
            @RequestParam(required = false) String name,
            @RequestParam(required = false) Integer age,
            @RequestParam Integer userid
    ) {
        usersMap.put(userid, new UserEntity(name, age, userid));

        return usersMap;
    }
}