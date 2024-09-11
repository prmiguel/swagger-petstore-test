package io.swagger.petstore.endpoints;

public enum UserEndpoints {
    User("/user"),
    Login("/user/login"),
    Logout("/user/logout");

    private final String path;

    UserEndpoints(String path) {
        this.path = path;
    }

    public String path() {
        return path;
    }
}
