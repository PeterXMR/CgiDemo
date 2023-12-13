package com.example.cgidemo;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Circle {
    private final Point center;
    private final double radius;

    public boolean isInside(Point point) {
        double distance = Math.sqrt(Math.pow(point.getX() - center.getX(), 2) + Math.pow(point.getY() - center.getY(), 2));
        return distance <= radius;
    }
}

