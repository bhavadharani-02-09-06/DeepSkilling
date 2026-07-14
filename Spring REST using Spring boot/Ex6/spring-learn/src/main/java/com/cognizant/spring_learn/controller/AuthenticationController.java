package com.cognizant.spring_learn.controller;

import com.cognizant.spring_learn.model.AuthenticationResponse;
import com.cognizant.spring_learn.util.JwtUtil;
import org.springframework.web.bind.annotation.*;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

@RestController
public class AuthenticationController {

    @RequestMapping("/authenticate")
    public AuthenticationResponse authenticate(
            @RequestHeader("Authorization") String authHeader) {

        String base64Credentials = authHeader.substring("Basic ".length());

        byte[] credDecoded = Base64.getDecoder().decode(base64Credentials);

        String credentials = new String(credDecoded, StandardCharsets.UTF_8);

        String username = credentials.split(":", 2)[0];

        String token = JwtUtil.generateToken(username);

        return new AuthenticationResponse(token);
    }
}