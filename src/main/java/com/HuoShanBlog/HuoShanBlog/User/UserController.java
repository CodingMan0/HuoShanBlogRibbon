package com.HuoShanBlog.HuoShanBlog.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Value("${server.port}")
    String port;

    @Autowired
    UserService userService;

    @GetMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        return userService.hiService( name );
    }

}
