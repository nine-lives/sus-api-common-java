package uk.co.stuffusell.api.common;

public class SuccessResponse {
    private boolean success;

    private SuccessResponse() {

    }

    public SuccessResponse(boolean success) {
        this.success = success;
    }

    public boolean isSuccess() {
        return success;
    }
}
