package uk.co.stuffusell.api.common;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(getterVisibility = JsonAutoDetect.Visibility.NONE, fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class PasswordResetRequestRequest {
    private String email;

    private PasswordResetRequestRequest() {
    }

    public PasswordResetRequestRequest(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
}
