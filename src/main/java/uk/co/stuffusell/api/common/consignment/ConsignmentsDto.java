package uk.co.stuffusell.api.common.consignment;

import org.joda.time.LocalDate;
import uk.co.stuffusell.api.common.PricingDto;

import java.util.List;
import java.util.Map;

public class ConsignmentsDto {
    private List<ConsignmentDto> consignments;
    private List<ConsignmentInventorySummaryDto> statusSummaries;

    public List<ConsignmentDto> getConsignments() {
        return consignments;
    }

    public ConsignmentsDto withConsignments(List<ConsignmentDto> consignments) {
        this.consignments = consignments;
        return this;
    }

    public List<ConsignmentInventorySummaryDto> getStatusSummaries() {
        return statusSummaries;
    }

    public ConsignmentsDto withStatusSummaries(List<ConsignmentInventorySummaryDto> statusSummaries) {
        this.statusSummaries = statusSummaries;
        return this;
    }
}
