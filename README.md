# Spring Book Boot Store

### Endpoints

#### Sign-up

```
POST /api/authentication/sign-up HTTP/1.1
Host: localhost:8080
Content-Type: application/json

{
    "name": "admin",
    "username": "admin",
    "password": "admin"
}
```

#### Sign-in

```
POST /api/authentication/sign-in HTTP/1.1
Host: localhost:8080
Content-Type: application/json

{
    "username": "admin",
    "password": "admin"
}
```

#### Make-admin

```
PUT /api/internal/make-admin/admin HTTP/1.1
Host: localhost:8080
Authorization: Bearer InternalApiKey3.10
Content-Type: application/json
```