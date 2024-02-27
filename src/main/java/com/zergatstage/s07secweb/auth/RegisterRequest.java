package com.zergatstage.s07secweb.auth;

import com.zergatstage.s07secweb.model.UserRole;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {
    private String firstName;
    private String lastName;
    private String userEmail;
    private String password;
    private UserRole role;

}
