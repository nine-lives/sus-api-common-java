package uk.co.stuffusell.api.common;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonAutoDetect(getterVisibility = JsonAutoDetect.Visibility.NONE, fieldVisibility = JsonAutoDetect.Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PackagingRequestDto {
    private PackagingType type;
    private int requested;
    private String requestedDate;
    private int sent;
    private String sentDate;
    private boolean cancelled;

    public PackagingType getType() {
        return type;
    }

    public PackagingRequestDto withType(PackagingType type) {
        this.type = type;
        return this;
    }

    public int getRequested() {
        return requested;
    }

    public PackagingRequestDto withRequested(int requested) {
        this.requested = requested;
        return this;
    }

    public String getRequestedDate() {
        return requestedDate;
    }

    public PackagingRequestDto withRequestedDate(String requestedDate) {
        this.requestedDate = requestedDate;
        return this;
    }

    public int getSent() {
        return sent;
    }

    public PackagingRequestDto withSent(int sent) {
        this.sent = sent;
        return this;
    }

    public String getSentDate() {
        return sentDate;
    }

    public PackagingRequestDto withSentDate(String sentDate) {
        this.sentDate = sentDate;
        return this;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public PackagingRequestDto withCancelled(boolean cancelled) {
        this.cancelled = cancelled;
        return this;
    }
}
