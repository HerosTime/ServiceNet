package org.benetech.servicenet.service.mapper;

import org.benetech.servicenet.domain.Eligibility;
import org.benetech.servicenet.service.dto.EligibilityDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.UUID;

import static org.mapstruct.ReportingPolicy.IGNORE;

/**
 * Mapper for the entity Eligibility and its DTO EligibilityDTO.
 */
@Mapper(componentModel = "spring", uses = {ServiceMapper.class}, unmappedTargetPolicy = IGNORE)
public interface EligibilityMapper extends EntityMapper<EligibilityDTO, Eligibility> {

    @Mapping(source = "srvc.id", target = "srvcId")
    @Mapping(source = "srvc.name", target = "srvcName")
    EligibilityDTO toDto(Eligibility eligibility);

    @Mapping(source = "srvcId", target = "srvc")
    Eligibility toEntity(EligibilityDTO eligibilityDTO);

    default Eligibility fromId(UUID id) {
        if (id == null) {
            return null;
        }
        Eligibility eligibility = new Eligibility();
        eligibility.setId(id);
        return eligibility;
    }
}
