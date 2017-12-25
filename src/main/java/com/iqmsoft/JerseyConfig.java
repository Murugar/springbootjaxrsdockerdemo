package com.iqmsoft;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.iqmsoft.service.HelloWorldController;


@Component
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        register(HelloWorldController.class);
    }


}
