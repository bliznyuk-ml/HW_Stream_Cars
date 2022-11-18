package org.example.task2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class AppPoint {
    public static void main(String[] args) {
        List<Point> points = new ArrayList<>();

        Point a = new Point(2,5);
        Point b = new Point(4,1);
        Point c = new Point(8,3);
        Point d = new Point(7,4);
        Point e = new Point(1,7);

        points.add(a);
        points.add(b);
        points.add(c);
        points.add(d);
        points.add(e);

        System.out.println("Одержаня точки (об'єкту) з найбільшим значенням координати x");
        System.out.println(Solution.biggesX(points));
        System.out.println();

        System.out.println("Потік чисел типу double. Кожне число є відстанню від точки до початку координат");
        points.stream()
                .map(Solution::hypotenuse)
                .forEach(System.out::println);
        System.out.println();

        System.out.println("У потоці точки (об'єкти), відстань від яких до початку координат понад 5;");
        points.stream()
                .map(Solution::lenghtUpFive)
                .filter(Objects::nonNull)
                .forEach(System.out::println);
        System.out.println();

        System.out.println("Сортування об'єктів в порядку зменшення за критерієм відстані від точки до початку координат");
        Solution.sortPoints(points);
    }


}
