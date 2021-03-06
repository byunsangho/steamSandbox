package com.steam.api.sandbox3.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User getUser(String steamId) {
        return userRepository.findBySteamId(steamId);
    }

    public User getAnyUser() {
        return userRepository.findFirstBy();
    }

}
