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

#### Save Book

```
POST /api/book HTTP/1.1
Host: localhost:8080
Authorization: Bearer ...
Content-Type: application/json
Content-Length: 113

{
    "title": "Test Book",
    "price": 10,
    "description": "Test description",
    "author": "Test author"
}
```

#### Delete Book

```
DELETE /api/book/2 HTTP/1.1
Host: localhost:8080
Authorization: Bearer ...
```

#### Get All Books

```
GET /api/book HTTP/1.1
Host: localhost:8080
```

#### Save Purchase

```
POST /api/purchase-history HTTP/1.1
Host: localhost:8080
Authorization: Bearer ...
Content-Type: application/json
Content-Length: 53

{
    "userId": 3,
    "bookId": 1,
    "price": 10
}
```

#### Get Purchases of User

```
GET /api/purchase-history HTTP/1.1
Host: localhost:8080
Authorization: Bearer ...
```

