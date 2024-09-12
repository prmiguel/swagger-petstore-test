import {check} from 'k6';
import http from 'k6/http';
import Utils from "../utils/utils.js";
import UserPayload from '../payloads/user.payload.js';

export default class User {

  constructor() {
    this.params = {
      headers: {
        'Content-Type': 'application/json',
        'monitor': false,
      },
    };
  }

  create() {
    let response = http.post(`${Utils.getBaseUrl()}/pet`, UserPayload.getUser(), this.params)
    check(response, {
      'is status 200': () => response.status == 200,
    });
  }
}
