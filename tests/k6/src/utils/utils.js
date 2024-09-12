export default class Utils {
  static getBaseUrl() {
    switch (process.env.NODE_ENV) {
      case "production":
        return "http://app:8080/api/v3";
      default:
        console.error("Url or env not defined");
    }
  }
}
