package com.company;

public class Drink implements IngredientIMPL {

    private CoffeMachine[] _machins;
    private CoffeMachine _userMachins;

    Drink() {
        // в конструкторе создаем базу данных карточек
        this._machins = new CoffeMachine[] {
                new CoffeMachine("Bosh", 3.43, 12.9),
                new CoffeMachine("Bosh1", 34.3, 7.43),
                new CoffeMachine("Bosh2", 36.5, 89.3),
        };
    }

    public double getWaterAndCoffe(String CoffeMark) {
        int i = 0;
        for(; i < this._machins.length; i++) {
            if (this._machins[i].CoffeMachineMark.equals(CoffeMark)) {
                this._userMachins = this._machins[i];
                break;
            }
        }
        // found = false; !found = true
        // found == true; !found = false
        // ! - инвертирует логическое значение
        // null - нулевая ссылка (ссылка не указывающая на область памяти)
        if (this._userMachins == null) {
            System.out.println("Нету такой марки");
//            return false;
        }
        // проверяем пин-код
        return this._userMachins.bagWater;
    }

    static class CoffeMachine {
        String CoffeMachineMark;
        double bagWater;
        double bagCoffee;

        CoffeMachine(String CoffeMachineMark, double bagWater, double bagCoffee) {
            this.CoffeMachineMark = CoffeMachineMark;
            this.bagWater = bagWater;
            this.bagCoffee = bagCoffee;
        }
    }

}
