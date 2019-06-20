package uk.co.stuffusell.api.common;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import org.joda.time.LocalDate;

import java.util.List;
import java.util.stream.Collectors;

@JsonAutoDetect(getterVisibility = JsonAutoDetect.Visibility.NONE, fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class DateListDto {
    private List<String> dates;

    public DateListDto(List<LocalDate> dates) {
        this.dates = dates.stream().map(LocalDate::toString).collect(Collectors.toList());
    }

    public List<LocalDate> getDates() {
        return dates.stream().map(LocalDate::parse).collect(Collectors.toList());
    }
}
