package web.service;

import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.dao.CarDaoImpl;
import web.model.Car;
import java.util.List;

@Service
public class CarService {
    private CarDao carDao;

    public CarService(CarDao carDao) {
        this.carDao = new CarDaoImpl();
    }

    public List<Car> getCars(int count) {
        return carDao.getByCount(count);
    }
}
