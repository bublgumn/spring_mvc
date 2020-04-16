package services;

import web.model.Car;

import java.util.List;

public interface Service {
    void add(Car car);

    List<Car> listCars();

    Car getCarById(Long id);

}
