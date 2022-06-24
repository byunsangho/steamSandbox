package com.steam.api.sandbox3.recommand;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.steam.api.sandbox3.common.SteamApiService;
import com.steam.api.sandbox3.user.User;
import com.steam.api.sandbox3.user.UserService;

@Service
public class RecommendService {

    @Autowired
    private SteamApiService steamApiService;

    @Autowired
    private UserService userService;

    public void getRecommend(String steamId) {
        User user = userService.getUser(steamId);
        if (user == null) {
            user = userService.getAnyUser();
        }
        steamApiService.getOwnedApps(user.getSteamId(), user.getApiKey(), false);

    }

}
