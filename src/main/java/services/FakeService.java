package services;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

/*@org.springframework.stereotype.Service*/
public class FakeService implements Service {

    @Override
    public void add(Car car) {
    }

    @Override
    public List<Car> listCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(2, "Acura", 111111));
        cars.add(new Car(4, "Audi", 111222));
        cars.add(new Car(7, "BMW", 222111));
        return cars;
    }

    @Override
    public Car getCarById(Long id) {
        return null;
    }

}
