package org.example.task2;

import java.util.*;
import java.util.stream.Collectors;

public class Solution extends Point {

    public Solution(double x, double y) {
        super(x, y);
    }

    public static Optional<Point> biggesX(List<Point> list) {
        return list.stream()
                .max(Comparator.comparing(Point::getX));

    }

    public static double hypotenuse(Point point) {
        return Math.sqrt(point.getX() * point.getX() + point.getY() * point.getY());
    }

    public static Point lenghtUpFive(Point point) {
        double p = Math.sqrt(point.getX() * point.getX() + point.getY() * point.getY());
        if (p > 5) {
            return point;
        } else {
            return null;
        }
    }

    public static void sortPoints(List<Point> list) {

        list.stream().collect(Collectors.groupingBy(Solution::hypotenuse))
                .entrySet()
                .stream()
                .sorted(Comparator.comparing(Map.Entry::getKey).reversed())
                .forEach(System.out::println);
    }
}