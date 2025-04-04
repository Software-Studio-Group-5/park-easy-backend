package org.park_easy_backend.dto;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;
import org.park_easy_backend.entity.LocationEntity;
import org.park_easy_backend.entity.ParkingSpaceEntity;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ParkingSpaceDTO {
    private Long Id;
    private Long city_Id;
    private String city_name;
    private Boolean availability;
    private Double price;

    public static ParkingSpaceDTO toParkingSpaceDTO(ParkingSpaceEntity parkingSpaceEntity) {
        ParkingSpaceDTO parkingSpaceDTO = new ParkingSpaceDTO();
        parkingSpaceDTO.setId(parkingSpaceEntity.getId());

        if (parkingSpaceEntity.getCity_Id() != null) {
            parkingSpaceDTO.setCity_Id(parkingSpaceEntity.getCity_Id().getId());
            parkingSpaceDTO.setCity_name(parkingSpaceEntity.getCity_Id().getCity());

        }
        parkingSpaceDTO.setAvailability(parkingSpaceEntity.getAvailability());
        parkingSpaceDTO.setPrice(parkingSpaceEntity.getPrice());
        return parkingSpaceDTO;
    }
}
