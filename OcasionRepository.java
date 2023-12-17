package com.Sweets.Sweets.Ocasion;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OcasionRepository extends JpaRepository<Ocasion, String> {

}
