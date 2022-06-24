package com.steam.api.sandbox3.common;

import java.util.Collections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class SteamApiService {

    @Autowired
    private RestTemplate restTemplate;

    private static final String GetOwnedGames = "http://api.steampowered.com/IPlayerService/GetOwnedGames/v0001/";

    public void getOwnedApps(String steamId, String apikey, boolean isIncludeFree) {

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));

        String url = UriComponentsBuilder.fromUriString(GetOwnedGames)
                .queryParam("key", apikey)
                .queryParam("steamid", steamId)
                .queryParam("format", "json")
                .queryParam("include_played_free_games", isIncludeFree)
                .toUriString();

        ResponseEntity<String> response = restTemplate.exchange(RequestEntity.get(url).build(), String.class);
        response.getStatusCode();
    }


}
