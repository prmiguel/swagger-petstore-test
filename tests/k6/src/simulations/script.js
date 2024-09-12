import { sleep } from 'k6';
import User from "../requests/user.request.js";
import { htmlReport } from "https://raw.githubusercontent.com/benc-uk/k6-reporter/main/dist/bundle.js";

export const options = {
  vus: 10,
  duration: '30s',
};

export default function() {
  let user = new User();
  user.create();
  sleep(1);
}

export function handleSummary(data) {
  return {
    "summary.html": htmlReport(data),
  };
}
