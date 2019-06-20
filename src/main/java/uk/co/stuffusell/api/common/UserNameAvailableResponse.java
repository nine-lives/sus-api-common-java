package uk.co.stuffusell.api.common;

public class UserNameAvailableResponse {
    private boolean available;

    private UserNameAvailableResponse() {

    }

    public UserNameAvailableResponse(boolean available) {
        this.available = available;
    }

    public boolean isAvailable() {
        return available;
    }
}
