package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@RequestMapping("/cars")
@Controller
public class CarController {

    private final CarService carService;
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping
    public String index(@RequestParam("count") int count , Model model) {
        model.addAttribute("cars", carService.getSomeCars(count));
        return "cars";
    }

}