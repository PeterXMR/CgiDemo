package com.example.cgidemo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/circle")
public class CircleController {

    @PostMapping("/isInside")
    public boolean isInside(@RequestBody CircleRequest circleRequest) {
        Circle circle = new Circle(new Point(circleRequest.getCenter().getX(), circleRequest.getCenter().getY()), circleRequest.getRadius());
        Point point = new Point(circleRequest.getPoint().getX(), circleRequest.getPoint().getY());
        return circle.isInside(point);
    }
}