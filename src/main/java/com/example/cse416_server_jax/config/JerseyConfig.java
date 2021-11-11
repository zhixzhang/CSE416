package com.example.cse416_server_jax.config;

//import com.example.demo.hello.HelloService;
//import cse416.tacos.app.services.DistrictPlanService;
import com.example.cse416_server_jax.HTTP_RequestController.StateController;
import com.example.cse416_server_jax.HelloService.Hello;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        register(Hello.class);
        register(StateController.class);
    }
}
