package com.ayu.raksha.card.Ayu.Raksha.Card.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/**")
                .allowedOrigins(
                        "http://localhost:3000",
                        "http://192.168.1.243:3000",
                        "http://3.111.47.30:3000",
                        "http://192.168.29.203:3000",
                        "http://172.19.128.1:3000",
                        "http://13.233.98.216:3000",
                        "http://13.201.93.117:3000",
                        "https://ayuraksha.pllatinum.me",
                        "http://3.111.35.95",
                        "http://3.111.35.95:3000"
                )
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
                .allowedHeaders("*")
                .allowCredentials(true);
    }
}
