package io.swagger.petstore.features.user;

import io.swagger.petstore.domain.User;
import io.swagger.petstore.features.SettingStage;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.serenitybdd.screenplay.rest.questions.TheResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static io.swagger.petstore.interactions.UserRequest.createUser;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;
import static org.hamcrest.Matchers.equalTo;


@ExtendWith(SerenityJUnit5Extension.class)
class WhenCreatingNewUser extends SettingStage {

    @Test
    void provideFullInformation() {
        var user = User.builder()
                .id(10)
                .username("theUser")
                .firstName("John")
                .lastName("James")
                .email("john@mail.com")
                .password("12345")
                .phone("123456")
                .userStatus(1)
                .build();
        var wendy = theActorCalled("wendy");
        wendy.attemptsTo(createUser(user));

        wendy.should(seeThat(TheResponse.statusCode(), equalTo(200)),
                seeThatResponse(response -> response.body("id", equalTo(user.id()))
                        .body("firstName", equalTo(user.firstName()))));
    }
}
