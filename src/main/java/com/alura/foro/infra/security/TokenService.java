package com.alura.foro.infra.security;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.alura.foro.account.Account;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.DecodedJWT;

@Service
public class TokenService {

	@Value("${api.security.secret}")
	private String apiSecret;
	
	public String generateToken(Account account) {
		try {	
		    Algorithm algorithm = Algorithm.HMAC256(apiSecret);
		    return JWT.create()
		        .withExpiresAt(generateExpirationDate())
		        .sign(algorithm);	
		} catch (JWTCreationException exception) {
			throw new RuntimeException();
		}
	}
	
	public String getSubject(String token) {
		if(token == null) {
			throw new RuntimeException();
		}
		
		DecodedJWT verifier = null;
		
		try {
		    Algorithm algorithm = Algorithm.HMAC256(apiSecret);
		    verifier = JWT.require(algorithm)
		        .withIssuer("com.alura")
		        .build()
		        .verify(token);
		} catch (JWTVerificationException exception){
		}
		
		if(verifier == null||verifier.getSubject() == null) {
			throw new RuntimeException("Verificador inválido");
		}
		return verifier.getSubject();
		
	}
	
	public Instant generateExpirationDate() {
		return LocalDateTime.now().plusHours(12).toInstant(ZoneOffset.of("-05:00"));
	}
	
	
}
