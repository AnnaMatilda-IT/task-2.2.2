package web.service;

import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;
import java.util.List;

@Service
public class CarService {
    private final CarDao carDao;

    public CarService(CarDao carDao) {
        this.carDao = carDao;
    }

    public List<Car> getByCount(int count) {
        return carDao.getByCount(count);
    }
}
