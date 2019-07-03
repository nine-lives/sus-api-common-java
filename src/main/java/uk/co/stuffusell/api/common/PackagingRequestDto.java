package uk.co.stuffusell.api.common;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.joda.time.LocalDate;
import uk.co.stuffusell.api.common.mapper.LocalDateIso8601DateDeserializer;
import uk.co.stuffusell.api.common.mapper.LocalDateIso8601DateSerializer;

@JsonAutoDetect(getterVisibility = JsonAutoDetect.Visibility.NONE, fieldVisibility = JsonAutoDetect.Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PackagingRequestDto {
    private PackagingType type;
    private int requested;
    @JsonSerialize(using = LocalDateIso8601DateSerializer.class)
    @JsonDeserialize(using = LocalDateIso8601DateDeserializer.class)
    private LocalDate requestedDate;
    private int sent;
    @JsonSerialize(using = LocalDateIso8601DateSerializer.class)
    @JsonDeserialize(using = LocalDateIso8601DateDeserializer.class)
    private LocalDate sentDate;
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

    public LocalDate getRequestedDate() {
        return requestedDate;
    }

    public PackagingRequestDto withRequestedDate(LocalDate requestedDate) {
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

    public LocalDate getSentDate() {
        return sentDate;
    }

    public PackagingRequestDto withSentDate(LocalDate sentDate) {
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
