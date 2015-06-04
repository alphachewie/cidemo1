package com.alphachewie.service;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class ServiceTrackerApplication extends Application<ServiceTrackerConfiguration> {

    public static void main(final String[] args) throws Exception {
        new ServiceTrackerApplication().run(args);
    }

    @Override
    public String getName() {
        return "ServiceTracker";
    }

    @Override
    public void initialize(final Bootstrap<ServiceTrackerConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final ServiceTrackerConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
