package com.example.aws_demo.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AwsServiceTest {

    //DI
    @Autowired
    AwsService awsService;

    @Test
    void plusInt() {
        //실제값과 기대값 비교...
        int s = awsService.plusInt(10, 15);

        assertEquals(25, s);
    }
}