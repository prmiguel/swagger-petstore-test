package io.swagger.petstore.actors;

import io.swagger.petstore.utils.TestEnvironment;
import net.serenitybdd.screenplay.Ability;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import net.thucydides.model.util.EnvironmentVariables;

public class NewUser extends Cast {
    private final TestEnvironment testEnvironment;

    public NewUser(EnvironmentVariables environmentVariables) {
        testEnvironment = new TestEnvironment(environmentVariables);
    }

    @Override
    public Actor actorNamed(String actorName, Ability... abilities) {
        Actor actor = super.actorNamed(actorName, abilities);
        actor.can(CallAnApi.at(testEnvironment.getRestApiBaseUrl()));
        return actor;
    }
}
