package org.park_easy_backend.repository;

import org.park_easy_backend.entity.LocationEntity;
import org.park_easy_backend.entity.ParkingSpaceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MapRepository extends JpaRepository<LocationEntity, Long> {
    Optional<LocationEntity> findByCity(String name);
}
