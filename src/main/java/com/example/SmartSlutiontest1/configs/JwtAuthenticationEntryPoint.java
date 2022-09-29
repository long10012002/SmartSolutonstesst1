package com.example.SmartSlutiontest1.configs;

import java.io.IOException;
import java.io.Serializable;

import javax.naming.AuthenticationException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

/**
 * This class will extend Spring's AuthenticationEntryPoint class and override its method commence.
 * It rejects every unauthenticated request and send error code 401
 * AuthenticationEntryPoint, Serializable
 */

@Component
public class JwtAuthenticationEntryPoint implements AuthenticationEntryPoint,Serializable {

    private static final long serialVersionUID = -7858869558953243875L;

//    @Override
//    public void commence(HttpServletRequest request, HttpServletResponse response,
//                         AuthenticationException authException) throws IOException {
//
//        response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Unauthorized");
//    }

    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response,
                         org.springframework.security.core.AuthenticationException authException)
                        throws IOException, ServletException {
        response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Unauthorized");
    }
}