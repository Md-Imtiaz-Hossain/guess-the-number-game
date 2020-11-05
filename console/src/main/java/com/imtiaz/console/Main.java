package com.imtiaz.console;

import com.imtiaz.config.GameConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Slf4j
public class Main {

    public static void main(String[] args) {

        log.info("Guess The Number Game.");


        // === Create context (Container) ===
        ConfigurableApplicationContext context
                = new AnnotationConfigApplicationContext(GameConfig.class);


        // === close context (Container) ===
        context.close();

    }
}
