package com.zergatstage.s07secweb.services;


import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Service;

import javax.crypto.SecretKey;
import java.util.function.Function;

@Service
public class JwtService {
    //TODO: Move to config and ignore git
    private static final String SECRET_KEY = "adae07e9f410f80eaf1a031eb99058447559c70c86226873ebbde1415feb7a5c";
    public String extractUserEmail(String token) {
        return null; //TODO: implement jwt token parse
    }

    public <T> T extractClaim(String token, Function<Claims, T> claimsResolver){
        final Claims claims = extractAllClaims(token);
        return claimsResolver.apply(claims);
    }

    /**
     * Reworked with 0.12.3 in favor 1.0
     *
     * @param token raw JWT token
     * @return clams from JWT body
     */
    private Claims extractAllClaims(String token) {
        return Jwts
                .parser()
                .verifyWith(getSigningKey())
                .build()
                .parseSignedClaims(token)
                .getPayload();
    }

    private SecretKey getSigningKey() {
        byte[] keyBytes = Decoders.BASE64.decode(SECRET_KEY);
        return Keys.hmacShaKeyFor(keyBytes);
    }
}
