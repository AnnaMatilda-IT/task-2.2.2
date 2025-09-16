package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao {

    @Override
    public List<Car> createCarList() {
        return Arrays.asList(
                new Car("Toyota", "Camry", 2020),
                new Car("Honda", "Civic", 2021),
                new Car("BMW", "X5", 2019),
                new Car("Mercedes", "C-Class", 2022),
                new Car("Audi", "A4", 2018)
        );
    }

    @Override
    public List<Car> getByCount(int count) {
        List<Car> cars = createCarList();

        return cars.stream()
                   .limit(count <= 0 ? 0 : count)
                   .collect(Collectors.toList());
    }
}
