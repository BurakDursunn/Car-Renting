package com.example.carrentingbackend.mapper;

import com.example.carrentingbackend.dto.RentalDTO;
import com.example.carrentingbackend.model.Car;
import com.example.carrentingbackend.model.Rental;
import com.example.carrentingbackend.model.User;
import org.springframework.stereotype.Component;

@Component
public class RentalMapper {
    public RentalDTO toDTO(Rental rental) {
        RentalDTO dto = new RentalDTO();
        dto.setId(rental.getId());
        dto.setUserId(rental.getUser().getId());
        dto.setCarId(rental.getCar().getId());
        dto.setStartDate(rental.getStartDate());
        dto.setEndDate(rental.getEndDate());
        return dto;
    }

    public Rental toEntity(RentalDTO dto, User user, Car car) {
        Rental rental = new Rental();
        rental.setId(dto.getId());

        rental.setUser(user);
        rental.setCar(car);

        rental.setStartDate(dto.getStartDate());
        rental.setEndDate(dto.getEndDate());

        return rental;
    }
}
