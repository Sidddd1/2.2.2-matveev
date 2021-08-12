package web.dao;

import java.util.List;
import web.model.Car;

public interface CarDao {
    public List<Car> getSomeCars(int count);
}