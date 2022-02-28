package com.example.scandaemon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScanDaemonApplication {

    @Autowired
    public static void main(String[] args) {
        SpringApplication.run(ScanDaemonApplication.class, args);
    }

}
