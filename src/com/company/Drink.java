package com.company;

public class Drink implements IngredientIMPL {

    private CoffeMachine[] _machins;
    private CoffeMachine _userMachins;

    Drink() {
        // в конструкторе создаем базу данных карточек
        this._machins = new CoffeMachine[] {
                new CoffeMachine("Bosh", 4.4, 3.5),
                new CoffeMachine("Bosh1", 34.3, 7.43),
                new CoffeMachine("Bosh2", 36.5, 89.3),
        };
    }

    public void americano() {
        double americanoWater = 5.45;
        double americanoCoffe = 4.45;
        boolean success = true;

        if (this._userMachins.bagWater < americanoWater) {
            System.out.println("Не хватает воды для создания американо.");
            success = false;
        }

        if (this._userMachins.bagCoffee < americanoCoffe) {
            System.out.println("Не хватает коффе для создания американо.");
            success = false;
        }

        if (success) {
            this._userMachins.bagWater -= americanoWater;
            this._userMachins.bagCoffee -= americanoWater;
            System.out.println("Кофе 'Американо' сделано.");
        }
    }

    public void espreso() {
        double americanoWater = 2.45;
        double americanoCoffe = 5.45;
        boolean success = true;

        if (this._userMachins.bagWater < americanoWater) {
            System.out.println("Не хватает воды для создания американо.");
            success = false;
        }

        if (this._userMachins.bagCoffee < americanoCoffe) {
            System.out.println("Не хватает коффе для создания американо.");
            success = false;
        }

        if (success) {
            System.out.println("Кофе 'Еспрессо' сделано.");
        }
    }

    public void doubleEspreso() {
        double americanoWater = 4.45;
        double americanoCoffe = 8.45;
        boolean success = true;

        if (this._userMachins.bagWater < americanoWater) {
            System.out.println("Не хватает воды для создания американо.");
            success = false;
        }

        if (this._userMachins.bagCoffee < americanoCoffe) {
            System.out.println("Не хватает коффе для создания американо.");
            success = false;
        }

        if (success) {
            System.out.println("Кофе 'Двойное Еспрессо' сделано.");
        }
    }

    public double getWater(String CoffeMark) {
        int i = 0;
        for(; i < this._machins.length; i++) {
            if (this._machins[i].CoffeMachineMark.equals(CoffeMark)) {
                this._userMachins = this._machins[i];
                break;
            }
        }

        if (this._userMachins == null) {
            System.out.println("Нету такой марки");
      //   return false;
        }
        return this._userMachins.bagWater;
    }

    public double getCoffe(String CoffeMark) {
        int i = 0;
        for(; i < this._machins.length; i++) {
            if (this._machins[i].CoffeMachineMark.equals(CoffeMark)) {
                this._userMachins = this._machins[i];
                break;
            }
        }

        if (this._userMachins == null) {
            System.out.println("Нету такой марки");
            // @TODO Релаизовать вывод в случае неправильной марки.
            //   return false;
        }
        return this._userMachins.bagCoffee;
    }



    static class CoffeMachine {
        String CoffeMachineMark;
      private   double bagWater;
       private double bagCoffee;

        CoffeMachine(String CoffeMachineMark, double bagWater, double bagCoffee) {
            this.CoffeMachineMark = CoffeMachineMark;
            this.bagWater = bagWater;
            this.bagCoffee = bagCoffee;
        }
    }

}
