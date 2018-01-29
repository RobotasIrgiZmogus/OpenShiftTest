package lt.robot.config;

import lt.robot.API;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MainConfig {

    @Bean
    public ResourceConfig resourceConfig(){
        return new ResourceConfig().register(API.class);
    }
}
