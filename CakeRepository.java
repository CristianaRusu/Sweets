package com.Sweets.Sweets.Cakes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CakeRepository extends JpaRepository<Cake, String> {

}
