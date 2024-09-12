import { sleep } from 'k6';
import User from "../requests/user.request.js";

export const options = {
  vus: 10,
  duration: '30s',
};

export default function() {
  let user = new User();
  user.create();
  sleep(1);
}
