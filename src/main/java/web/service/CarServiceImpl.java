package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl implements CarService {

    private List<Car> listOfCars;

    /*public CarServiceImpl() */   {
        listOfCars = new ArrayList<>();
        listOfCars.add(new Car("Lexus", "RX350", "4WD"));
        listOfCars.add(new Car("Toyota", "Verso", "2WD"));
        listOfCars.add(new Car("Toyota", "Alphard", "4WD"));
        listOfCars.add(new Car("Toyota", "Regius", "4WD"));
        listOfCars.add(new Car("Toyota", "Chaser", "2WD"));
    }

    @Override
    public List<Car> getCarsList() {
        return listOfCars;
    }

    @Override
    public List<Car> getCountedCars(int count) {
        return listOfCars.stream().limit(count).collect(Collectors.toList());
    }

  /*  int count = 3;
    private List<Car> countedCars;

    @Override
    public List<Car> getCountedCars() {
        countedCars = listOfCars.subList(0, (count + 1));
        return countedCars;
    }

*/

}
