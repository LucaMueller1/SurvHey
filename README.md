# SurvHey-Delivery

This repo includes both survhey-frontend and survhey-backend as well as the docker-compose.yml
The backEnd.tar and frontEnd.tar are the saved docker images as tar archives. They can be loaded with [docker load](https://docs.docker.com/engine/reference/commandline/load/)

# Run the entire SurvHey Project

Run the following from the project-root:
```shell
docker-compose up
```

The FrontEnd NGINX Server is reachable by navigating to "localhost" in your web browser.
The BackEnd is reachable under "localhost:8080"

![Image of SurvHey stack in Docker](https://i.ibb.co/R2CFqyT/Screenshot-2021-05-05-at-16-11-30.png)
