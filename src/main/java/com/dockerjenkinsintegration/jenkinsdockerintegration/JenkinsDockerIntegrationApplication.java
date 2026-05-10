package com.dockerjenkinsintegration.jenkinsdockerintegration;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsDockerIntegrationApplication {

    public static Logger logger = LoggerFactory.getLogger(JenkinsDockerIntegrationApplication.class);

    @PostConstruct
    public void test()
    {
        logger.info("Application is going to start now .....");
    }

    public static void main(String[] args) {

        logger.info("Application started...");

        SpringApplication.run(JenkinsDockerIntegrationApplication.class, args);
    }

}
