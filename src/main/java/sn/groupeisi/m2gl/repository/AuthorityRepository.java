package sn.groupeisi.m2gl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.groupeisi.m2gl.domain.Authority;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {}
