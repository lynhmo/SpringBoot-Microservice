
## How to:

1. Start Eureka-Server first
2. Then start orther services
3. Call other service with Gateway-Service (port 8762)
4. SignIn/SignUp with Auth-Service (port 9100) via gateway localhost:8762/auth/signin
5. Then take the token to use for orther service (for now just the gallery service)
6. Gallery Service use the Auth Service to authenticate so use need to include the token into the header to authenticate localhost:8762/gallery/auth (use POST, send the token in the body)
7. after gallery call the auth from auth-service the auth-service will return username, roles. Gallery-Service will use the role to determined the authorities of the user (base on the token)

### Libs:
- io.jjwt 0.12.5
- Eureka Server/Client
- Security 6
- Spring Boot 3
- Lombok

TL;DR: Microservice Spring Boot with all the new libs (kind of) \
I haven't done the docker but what ever.