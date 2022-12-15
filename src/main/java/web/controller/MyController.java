package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

@Controller
//@RequestMapping("/car")
public class MyController {

    private CarService carService;          // внедрение бина от конструктора, а не класса. Внедряем бин через конструктор, а не через  @Autowired
    @Autowired
    public MyController(CarService carService) {

        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String printCar(@RequestParam(defaultValue = "5") int count, ModelMap model) {                // извлекает параметры из запроса, сопоставляет запросы с методами. урок 19 Алишев,
        model.addAttribute("cars", carService.getCountedCars(count));
        return "cars";                                                                                       // возвращаю страницу cars.html
    }

}
