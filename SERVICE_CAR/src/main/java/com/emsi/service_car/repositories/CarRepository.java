package com.emsi.service_car.repositories;


import com.emsi.service_car.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car,Long> {
}
