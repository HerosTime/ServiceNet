package org.benetech.servicenet.repository;

import org.benetech.servicenet.domain.UserProfile;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

/**
 * Spring Data JPA repository for the User entity.
 */
@Repository
public interface UserProfileRepository extends JpaRepository<UserProfile, UUID> {

    String USERS_BY_LOGIN_CACHE = "usersByLogin";

    Optional<UserProfile> findOneByLogin(String login);

    Optional<UserProfile> findOneByUserId(UUID userId);

    Page<UserProfile> findAllByLoginNot(Pageable pageable, String login);

    @Cacheable(cacheNames = USERS_BY_LOGIN_CACHE)
    @EntityGraph(attributePaths = { "systemAccount" })
    Optional<UserProfile> findOneWithAccountByLogin(String login);
}
