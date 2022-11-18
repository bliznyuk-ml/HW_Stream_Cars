package org.example.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CarShop {
    public static void main(String[] args) {

        List <Car> carList = new ArrayList<Car>();

        Car fiesta = new Car(Cars.FIESTA, 2020, 13000, Color.WHITE, 1.1);
        Car fiesta2 = new Car(Cars.FIESTA, 2020, 13000, Color.RED, 1.1);
        Car fiesta3 = new Car(Cars.FIESTA, 2022, 14500, Color.WHITE, 1.3);
        Car focus = new Car(Cars.FOCUS, 2021, 18300, Color.SILVER, 1.6);
        Car focus2 = new Car(Cars.FOCUS, 2022, 19500, Color.BLUE, 1.6);
        Car focus3 = new Car(Cars.FOCUS, 2022, 19600, Color.RED, 2.0);
        Car mondeo = new Car(Cars.MONDEO, 2021, 23000, Color.WHITE, 1.8);
        Car mondeo2 = new Car(Cars.MONDEO, 2021, 24200, Color.BLACK, 2.4);
        Car mondeo3 = new Car(Cars.MONDEO, 2022, 26000, Color.BLACK, 2.4);
        Car fusion = new Car(Cars.FUSION, 2022, 28000, Color.SILVER, 1.8);
        Car mustang = new Car(Cars.MUSTANG, 2022, 32000, Color.RED, 5.0);
        Car edge = new Car(Cars.EDGE, 2022, 25000, Color.SILVER, 2.0);
        Car edge2 = new Car(Cars.EDGE, 2022, 26000, Color.BLUE, 2.5);
        Car f150 = new Car(Cars.F150, 2021, 35000, Color.BLUE, 5.0);

        carList.add(fiesta);
        carList.add(fiesta2);
        carList.add(fiesta3);
        carList.add(focus);
        carList.add(focus2);
        carList.add(focus3);
        carList.add(mondeo);
        carList.add(mondeo2);
        carList.add(mondeo3);
        carList.add(fusion);
        carList.add(mustang);
        carList.add(edge);
        carList.add(edge2);
        carList.add(f150);

        System.out.println("Вивід всіх автомобілів:");
        System.out.println(carList);
        System.out.println();

        System.out.println("Вивід автомобілів чорного кольору :");
        carList.stream()
                .filter(c -> c.getColor().equals(Color.BLACK))
                .forEach(System.out::println);
        System.out.println();

        System.out.println("Відображення автомобілів дорожче зазначеної ціни 20000:");
        carList.stream()
                .filter(c -> c.getPrice() > 20000)
                .forEach(System.out::println);
        System.out.println();

        System.out.println("Відображення автомобілів, рік випуску яких з 2020 по 2021");
        carList.stream()
                .filter(c -> c.getYear() >=2020 && c.getYear() <= 2021)
                .forEach(System.out::println);
        System.out.println();

        System.out.println("Сортування автомобілів у порядку зменшення вартості:");
        carList.stream()
                .sorted(Comparator.comparing(Car::getPrice).reversed())
                .forEach(System.out::println);

    }
}
