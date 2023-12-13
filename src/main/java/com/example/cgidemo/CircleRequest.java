package com.example.cgidemo;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CircleRequest {
    private Point center;
    private Point point;
    private double radius;
}

