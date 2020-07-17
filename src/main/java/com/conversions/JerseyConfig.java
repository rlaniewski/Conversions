package com.conversions;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.conversions.resources.ConversionsResource;

@Component
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        register(ConversionsResource.class);
    }
}
