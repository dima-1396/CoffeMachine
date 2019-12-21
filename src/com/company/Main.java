package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Drink drink = new Drink();
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите марку");
        String CoffeMark = sc.nextLine();

        while (true) {
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

            // Получаем текущий воду и кофе нашей кофемашинки.
            double Water = drink.getWater(CoffeMark);
            double Coffe = drink.getCoffe(CoffeMark);

            switch (menu) {
                case 8:
                    return;
                case 1:
                    System.out.print("Количество воды:");
                    System.out.println(Water);
                    System.out.print("Количество коффе:");
                    System.out.println(Coffe);
                    break;
                case 2:
                    drink.americano();
                    break;
                case 3:
                    drink.espreso();
                    break;
                case 4:
                    drink.doubleEspreso();
                    break;
                case 5:
                    drink.setMaxBagWater();
                    break;
                case 6:
                    drink.setMaxBagCoffe();
                    break;
                case 7:
            }
        }
    }
}
