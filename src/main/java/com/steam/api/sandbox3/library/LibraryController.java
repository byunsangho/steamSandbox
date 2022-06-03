package com.steam.api.sandbox3.library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.steam.api.sandbox3.user.User;
import com.steam.api.sandbox3.user.UserService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("library")
public class LibraryController {

    @Autowired
    private UserService userService;

    @GetMapping("/hello")
    public String getHello() {
        return "hello";
    }

}
