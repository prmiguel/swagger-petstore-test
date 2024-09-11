package io.swagger.petstore.features;

import io.swagger.petstore.actors.NewUser;
import net.thucydides.model.util.EnvironmentVariables;
import org.junit.jupiter.api.BeforeEach;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;

public class SettingStage {

    private EnvironmentVariables environmentVariables;

    @BeforeEach
    void setting() {
        setTheStage(new NewUser(environmentVariables));

    }
}
