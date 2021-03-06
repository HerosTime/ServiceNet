package org.benetech.servicenet.service.dto;

import java.time.ZonedDateTime;
import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProviderRecordDTO {

    private OrganizationDTO organization;

    private ZonedDateTime lastUpdated;

    private Set<LocationRecordDTO> locations;

    private Set<ServiceRecordDTO> services;

    private UserDTO owner;

    private Set<DailyUpdateDTO> dailyUpdates;

    public ProviderRecordDTO(OrganizationDTO organization, ZonedDateTime lastUpdated,
        Set<LocationRecordDTO> locations, Set<ServiceRecordDTO> services) {
        this.organization = organization;
        this.lastUpdated = lastUpdated;
        this.locations = locations;
        this.services = services;
    }
}
