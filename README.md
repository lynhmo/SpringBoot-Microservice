
## How to:

1. Start Eureka-Server first
2. Then start other services
3. Call other service with Gateway-Service (port [8762](localhost:8762))
4. SignIn/SignUp with Auth-Service (port [9100](localhost:9100)) via gateway [localhost:8762/auth/signin](localhost:8762/auth/signin)
5. Then take the token to use for other service (for now just the gallery service)
6. Gallery Service use the Auth Service to authenticate so use need to include the token into the header to authenticate [localhost:8762/gallery/auth](localhost:8762/gallery/auth) (use **POST**, send the token in the body)
7. after gallery call the auth from auth-service the auth-service will return username, roles. Gallery-Service will use the role to determine the authorities of the user (base on the token)

No need to start the **zuul gateway** it's not working yet!

### Libs:
- io.jjwt 0.12.5
- Eureka Server/Client
- Security 6
- Spring Boot 3
- Lombok
- ...

#### JDK: 17 and Java 8

TL;DR: Microservice Spring Boot with all the new libs (kind of)

Run the docker if u want. \
**Note**: build the jar file before run docker
- <a href="https://github.com/lynhmo/SpringBoot-Microservice/blob/main/docker-compose.yml">MySQL Docker For Auth Service</a> run this service before Auth Service
- it's the docker compose file from the root folder

~~I haven't made the Role data when init so after run MySQL and Auth Service (need to run this to make all the table we need) \
Create 3 role **ROLE_USER, ROLE_MODERATOR, ROLE_ADMIN**
Then continue the work~~ 

****Remember turn the EurekaServer first**