FROM node:lts-alpine AS bundler
WORKDIR /code
COPY . .
RUN npm ci
RUN npm run bundle

FROM grafana/k6
WORKDIR /simulation
COPY --from=bundler /code/dist /simulation
