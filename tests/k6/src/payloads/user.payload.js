export default class UserPayload {
  static getUser() {
    let user = {
      id: 10,
      name: "doggie",
      category: {
        id: 1,
        name: "Dogs",
      },
      photoUrls: ["string"],
      tags: [
        {
          id: 0,
          name: "string",
        },
      ],
      status: "available",
    };
    return user;
  }
}
