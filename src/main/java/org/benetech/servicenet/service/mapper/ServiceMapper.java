package org.benetech.servicenet.service.mapper;

import org.benetech.servicenet.domain.Service;
import org.benetech.servicenet.service.dto.ServiceDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * Mapper for the entity Service and its DTO ServiceDTO.
 */
@Mapper(componentModel = "spring", uses = {OrganizationMapper.class, ProgramMapper.class})
public interface ServiceMapper extends EntityMapper<ServiceDTO, Service> {

    @Mapping(source = "organization.id", target = "organizationId")
    @Mapping(source = "organization.name", target = "organizationName")
    @Mapping(source = "program.id", target = "programId")
    @Mapping(source = "program.name", target = "programName")
    ServiceDTO toDto(Service service);

    @Mapping(source = "organizationId", target = "organization")
    @Mapping(source = "programId", target = "program")
    @Mapping(target = "location", ignore = true)
    @Mapping(target = "regularSchedule", ignore = true)
    @Mapping(target = "holidaySchedule", ignore = true)
    @Mapping(target = "funding", ignore = true)
    @Mapping(target = "eligibility", ignore = true)
    @Mapping(target = "areas", ignore = true)
    @Mapping(target = "docs", ignore = true)
    @Mapping(target = "paymentsAccepteds", ignore = true)
    @Mapping(target = "langs", ignore = true)
    @Mapping(target = "taxonomies", ignore = true)
    Service toEntity(ServiceDTO serviceDTO);

    default Service fromId(Long id) {
        if (id == null) {
            return null;
        }
        Service service = new Service();
        service.setId(id);
        return service;
    }
}
