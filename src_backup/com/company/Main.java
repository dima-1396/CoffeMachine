package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Drink drink = new Drink();
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите марку");
        String CoffeMark = sc.nextLine();

        System.out.println(CoffeMark);

        System.out.println("Главное меню");
        System.out.println("1. Показать текущий объем воды и кофе");
        System.out.println("2. Приготовить “Американо”");
        System.out.println("3. Приготовить “Эспрессо”");
        System.out.println("4. Приготовить “Двойной эспрессо”");
        System.out.println("5. Заполнить бак с водой");
        System.out.println("6. Заполнить бак с кофе");
        System.out.println("7. Информация");
        System.out.println("8. Выключить кофемашину");

        int menu = sc.nextInt();

        System.out.println(menu);

        switch (menu) {
            case 1:
                double WaterAndCoffe = drink.getWaterAndCoffe(CoffeMark);
                System.out.println(WaterAndCoffe);
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
        }
    }
}
