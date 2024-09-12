export default class UserPayload {
  static getUser() {
    let user = {
      id: 10,
      username: "theUser",
      firstName: "John",
      lastName: "James",
      email: "john@mail.com",
      password: "12345",
      phone: "123456",
      userStatus: 1,
    };
    return user;
  }
}
