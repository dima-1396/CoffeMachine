package com.company;

public class Drink implements IngredientIMPL {

    private CoffeMachine[] _machins;
    private CoffeMachine _userMachins;

    Drink() {
        // в конструкторе создаем базу данных карточек
        this._machins = new CoffeMachine[] {
                new CoffeMachine("Bosh", 4.4, 3.5, 40.0, 40.0),
                new CoffeMachine("Bosh1", 34.3, 7.43, 50.0, 50.0),
                new CoffeMachine("Bosh2", 36.5, 20.3, 60.0, 60.0),
        };
    }

    public void getInfo() {
        System.out.print("Максимальный обьем кофе данной кофе машины:");
        System.out.println(this._userMachins.MaxBagCoffee);

        System.out.print("Максимальный обьем воды данной кофе машины:");
        System.out.println(this._userMachins.MaxBagWater);

        System.out.print("Марка машины:");
        System.out.println(this._userMachins.CoffeMachineMark);
    }

    public void setMaxBagWater() {
        boolean success = true;

        if (this._userMachins.bagWater == this._userMachins.MaxBagWater) {
            System.out.println("Бак уже полон.");
            success = false;
        }

        if (success) {
            this._userMachins.bagWater = this._userMachins.MaxBagWater;
            System.out.println("Максимальный обьем воды заполнен.");
        }
    }

    public void setMaxBagCoffe() {
        boolean success = true;

        if (this._userMachins.bagCoffee == this._userMachins.MaxBagCoffee) {
            System.out.println("Бак уже полон.");
            success = false;
        }

        if (success) {
            this._userMachins.bagCoffee = this._userMachins.MaxBagCoffee;
            System.out.println("Максимальный обьем коффе заполнен.");
        }
    }

    // Делает американо.
    public void americano() {
        double americanoWater = 5.45;
        double americanoCoffe = 4.45;
        boolean success = true;

        // Сравнивает значение обьекта воды(this._userMachins.bagWater), с требуемым обьемом воды(americanoWater).
        if (this._userMachins.bagWater < americanoWater) {
            System.out.println("Не хватает воды для создания американо.");
            success = false;
        }

        // Сравнивает значение обьекта коффе(this._userMachins.bagWater), с требуемым обьемом коффе(americanoWater).
        if (this._userMachins.bagCoffee < americanoCoffe) {
            System.out.println("Не хватает коффе для создания американо.");
            success = false;
        }

        // Если все хорошо то отнимаем с общего обьема воды и кофе, требуемый обьев воды и кофе для создания кофе.И выдает сообщение о том что кофе готово.
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
            this._userMachins.bagWater -= americanoWater;
            this._userMachins.bagCoffee -= americanoWater;
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
            this._userMachins.bagWater -= americanoWater;
            this._userMachins.bagCoffee -= americanoWater;
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

    public void reject() {
        this._userMachins = null;
    }

    static class CoffeMachine {
        String CoffeMachineMark;
      private   double bagWater;
       private double bagCoffee;
       private double MaxBagWater;
       private double MaxBagCoffee;


        CoffeMachine(String CoffeMachineMark, double bagWater, double bagCoffee, double MaxBagWater, double MaxBagCoffee) {
            this.CoffeMachineMark = CoffeMachineMark;
            this.bagWater = bagWater;
            this.bagCoffee = bagCoffee;
            this.MaxBagWater = MaxBagWater;
            this.MaxBagCoffee = MaxBagCoffee;
        }
    }

}
