package com.steam.api.sandbox3.recommand;

import javax.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.steam.api.sandbox3.user.User;
import com.steam.api.sandbox3.user.UserService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/library/recommand")
public class RecommendController {

    @Autowired
    private RecommendService recommendService;


    @GetMapping
    public String getRecommend(@RequestParam("id") String steamId) {
        recommendService.getRecommend(steamId);
        return "hello";
    }

    @PostMapping
    public String setCompleted() {
        return "ok";
    }

}
