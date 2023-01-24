package com.tigris.SpringSecurityJwtRole.modal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ReqisterRequest {

    private String firstname;
    private String lastname;
    private String email;
    private String password;
}
