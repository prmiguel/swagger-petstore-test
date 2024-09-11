package io.swagger.petstore.utils;

import net.thucydides.model.util.EnvironmentVariables;

public class TestEnvironment {

    private EnvironmentVariables environmentVariables;

    public TestEnvironment(EnvironmentVariables environmentVariables){
        this.environmentVariables = environmentVariables;
    }

    public String getRestApiBaseUrl() {
        return environmentVariables.optionalProperty("restapi.baseurl").orElseThrow();
    }
}
