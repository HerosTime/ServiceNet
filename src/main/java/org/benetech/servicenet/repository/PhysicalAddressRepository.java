package org.benetech.servicenet.repository;

import org.benetech.servicenet.domain.PhysicalAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the PhysicalAddress entity.
 */
@SuppressWarnings("unused")
@Repository
public interface PhysicalAddressRepository extends JpaRepository<PhysicalAddress, Long> {

}
