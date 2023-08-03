package com.arcadag.docservice.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@SpringBootTest
@AutoConfigureMockMvc
public class PdfControllerTest {
    @Autowired
    private MockMvc mockMvc;
    @Test
    void createPdf() throws Exception {
        mockMvc.perform(get("/createPdf"))
                .andExpectAll(
                    status().isOk(),
                        content().contentType(MediaType.APPLICATION_PDF)
                );
    }
}
