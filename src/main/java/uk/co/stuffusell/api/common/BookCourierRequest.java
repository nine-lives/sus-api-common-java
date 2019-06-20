package uk.co.stuffusell.api.common;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.joda.time.LocalDate;
import uk.co.stuffusell.api.common.mapper.LocalDateIso8601DateSerializer;

@JsonAutoDetect(getterVisibility = JsonAutoDetect.Visibility.NONE, fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class BookCourierRequest {
    @JsonSerialize(using = LocalDateIso8601DateSerializer.class)
    private LocalDate pickupDate;
    private Integer boxCount;
    private String address1;
    private String address2;
    private String city;
    private String postcode;

    public LocalDate getPickupDate() {
        return pickupDate;
    }

    public Integer getBoxCount() {
        return boxCount;
    }

    public String getAddress1() {
        return address1;
    }

    public String getAddress2() {
        return address2;
    }

    public String getCity() {
        return city;
    }

    public String getPostcode() {
        return postcode;
    }

    public BookCourierRequest withPickupDate(LocalDate pickupDate) {
        this.pickupDate = pickupDate;
        return this;
    }

    public BookCourierRequest withBoxCount(Integer boxCount) {
        this.boxCount = boxCount;
        return this;
    }

    public BookCourierRequest withAddress1(String address1) {
        this.address1 = address1;
        return this;
    }

    public BookCourierRequest withAddress2(String address2) {
        this.address2 = address2;
        return this;
    }

    public BookCourierRequest withCity(String city) {
        this.city = city;
        return this;
    }

    public BookCourierRequest withPostcode(String postcode) {
        this.postcode = postcode;
        return this;
    }
}
