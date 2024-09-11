package io.swagger.petstore.interactions;

import io.swagger.petstore.domain.User;
import io.swagger.petstore.endpoints.UserEndpoints;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Post;

public class UserRequest {

    public static Task createUser(User user) {
        return Task.where("{0} creates a new user", Post.to(UserEndpoints.User.path()).with(request -> request.body(user)));
    }
}
