package ua.ucu.edu.flowers;


import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/flowers")
public class FlowerController {

    @GetMapping("/")
    public String hello() {
        return "WELLCOME TO FLOWER STORE!";
    }

    @GetMapping("/user-flowers")
    public List<Flower> chooseDelivery() {
        return List.of(new Flower(FlowerColor.BLUE, 210, 10),
                new Flower(FlowerColor.RED, 230, 23));
    }
}

    



