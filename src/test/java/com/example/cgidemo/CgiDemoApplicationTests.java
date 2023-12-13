package com.example.cgidemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class CgiDemoApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void testIsInside() {
        Point center = new Point(1, 1);
        Circle circle = new Circle(center, 6);

        Point insidePoint = new Point(3, 4);
        Point outsidePoint = new Point(7, 7);

        assertTrue(circle.isInside(insidePoint));
        assertFalse(circle.isInside(outsidePoint));
    }
}
