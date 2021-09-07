package com.tsbookstore.springbootbookstore.service;

import com.tsbookstore.springbootbookstore.model.User;

public interface IAuthenticationService {
    User signInAndReturnJWT(User signInRequest);
}
