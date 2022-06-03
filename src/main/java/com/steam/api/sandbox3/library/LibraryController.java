package com.steam.api.sandbox3.library;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("library")
public class LibraryController {

    @GetMapping("/hello")
    public String getHello() {
        return "hello";
    }

}
