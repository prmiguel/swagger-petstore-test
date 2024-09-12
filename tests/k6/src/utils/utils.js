export default class Utils {
  static getBaseUrl() {
    switch (process.env.NODE_ENV) {
      case "production":
        return "https://8081-prmiguel-swaggerpetstor-zz7eb0dbtr2.ws-us116.gitpod.io/api/v3";
      default:
        console.error("Url or env not defined");
    }
  }
}
