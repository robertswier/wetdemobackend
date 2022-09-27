package com.example.demo.controllers;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@WebMvcTest(CustomerBackendController.class)
class CustomerBackendControllerTest {

    @Autowired
    MockMvc mockMvc;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @Test
    public void customerBackendControllerTest() throws Exception {
        mockMvc.perform(get("http://localhost:18000/backend/customer"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("BACKEND")));


//        mockMvc.perform(get("/"))    // <3>
//                .andExpect(status().isOk())  // <4>
//                .andExpect(view().name("home"))  // <5>
//                .andExpect(content().string(           // <6>
//                        containsString("Welcome to...")));

    }
}