# SurvHey Project

Survey Creator featuring a React.js frontend and Spring Boot backend using a H2 embedded database.
This repo includes both [survhey-frontend](https://github.com/LucaMueller1/SurvHey-FrontEnd) and [survhey-backend](https://github.com/LucaMueller1/SurvHey-BackEnd) as well as the docker-compose.yml

# Run the entire SurvHey Project

Run the following from the project-root:
```shell
docker-compose up
```

The FrontEnd NGINX Server is reachable by navigating to "localhost" in your web browser.
The BackEnd is reachable under "localhost:8080"

![Image of SurvHey stack in Docker](https://i.ibb.co/R2CFqyT/Screenshot-2021-05-05-at-16-11-30.png)

# Project Architecture
![Architecture Overview](https://user-images.githubusercontent.com/64702286/147890095-d58bd95c-a7fc-48b0-963b-358d3a5c8f15.png)

# In-depth documentation

- [Project Documentation](https://github.com/LucaMueller1/SurvHey/blob/2d00e8a9cc22cc37a6a4c3013610a4b39713350e/project-documentation.pdf) containing sequence diagrams, ER-diagrams, flow charts and more
- [REST-API Documentation as OAS](https://github.com/LucaMueller1/SurvHey/blob/2d00e8a9cc22cc37a6a4c3013610a4b39713350e/SurvHey-API-Documentation.pdf)

# Screenshots
### Sample implementation on a customers website
<img width="1756" alt="Screenshot 2022-01-02 at 22 39 00" src="https://user-images.githubusercontent.com/64702286/147890162-ab1a821c-15e1-40ab-a5d0-e0ea9e4f0777.png">

### Overview over created surveys
<img width="1777" alt="Screenshot 2022-01-02 at 15 46 08" src="https://user-images.githubusercontent.com/64702286/147890177-bcb06f5d-daa9-4f61-ba5d-869d66d3b026.png">

### Sample survey and it's current voting results
<img width="1779" alt="Screenshot 2022-01-02 at 15 45 02" src="https://user-images.githubusercontent.com/64702286/147890183-eb98df36-fb42-4519-a967-ab61c8f3a8de.png">

### Geotracking of survey participants
<img width="1771" alt="Screenshot 2022-01-02 at 15 45 22" src="https://user-images.githubusercontent.com/64702286/147890185-a2c2e869-5e19-4e96-a5f0-6c746b0c1fbb.png">
