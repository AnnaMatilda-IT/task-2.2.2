package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.Arrays;
import java.util.List;

@Service
public class CarService {
    private List<Car> cars;

    public CarService() {
        // Инициализация списка из 5 машин
        cars = Arrays.asList(
                new Car("Toyota", "Camry", 2020),
                new Car("Honda", "Civic", 2021),
                new Car("BMW", "X5", 2019),
                new Car("Mercedes", "C-Class", 2022),
                new Car("Audi", "A4", 2018)
        );
    }

    public List<Car> getCars(int count) {
        if (count >= 5) {
            return cars;
        }
        return cars.subList(0, count);
    }
}
