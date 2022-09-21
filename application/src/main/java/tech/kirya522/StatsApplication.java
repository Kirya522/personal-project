package tech.kirya522;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableAsync
public class StatsApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(StatsApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);
    }
}
