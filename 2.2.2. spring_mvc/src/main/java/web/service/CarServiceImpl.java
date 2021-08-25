package web.service;


import org.springframework.stereotype.Service;
import web.model.Car;
import java.util.List;
@Service
public class CarServiceImpl implements CarService{

    final
    private CarsBD carsBD;

    public CarServiceImpl(CarsBD carsBD) {
        this.carsBD = carsBD;
    }

    @Override
    public List<Car> getSomeCars(int count) {
        if(count >= 5) {
            return carsBD.getBD();
        }
        return carsBD.getBD().subList(0,count);
    }
}
