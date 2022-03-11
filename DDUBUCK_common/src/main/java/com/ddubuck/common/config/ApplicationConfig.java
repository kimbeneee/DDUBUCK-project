package com.ddubuck.common.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@EntityScan({"com.ddubuck.common.domain"})
public class ApplicationConfig {
}