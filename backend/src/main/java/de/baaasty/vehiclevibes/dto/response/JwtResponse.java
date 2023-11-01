package de.baaasty.vehiclevibes.dto.response;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class JwtResponse {

    private String token;
    private String type = "Bearer";
    private Long id;
    private String username;
    private String email;
    private List<String> roles;

    public static JwtResponse of(String accessToken, Long id, String username, String email, List<String> roles) {
        return new JwtResponse(accessToken, null, id, username, email, roles);
    }

}