package com.steam.api.sandbox3;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

public class RecommendControllerTest extends SteamSandboxApplicationTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void test() throws Exception {
        // given
//        mockUser();

        // when
        ResultActions result = mockMvc.perform(MockMvcRequestBuilders.get("/library/recommand")
                .param("id", "1234"));

        // then
        result.andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("result.code").value(200))
        ;

    }


}
