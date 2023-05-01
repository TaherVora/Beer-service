package com.taher.beerservice.repositories;

import com.taher.beerservice.domain.Beer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.UUID;
@Repository
public interface BeerRepository extends JpaRepository<Beer, UUID> {
}
