package web.service;


import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Service
public class CarServiceImpl implements CarService{

    public  List<Car> getBD () {
        List<Car> list = new ArrayList<>();

        Car car1 = new Car("BMW", "200", "Black");
        Car car2 = new Car("Audi", "100", "Красный");
        Car car3 = new Car("Запр", "1", "Серый");
        Car car4 = new Car("Ford", "mustang", "Green");
        Car car5 = new Car("Suzuki", "TR2", "White");

        list.add(car1);
        list.add(car2);
        list.add(car3);
        list.add(car4);
        list.add(car5);

        return list;
    }

    @Override
    public List<Car> getSomeCars(int count) {
        if(count >= 5) {
            return getBD();
        }
        return getBD().subList(0,count);
    }
}
