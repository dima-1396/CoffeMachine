package com.company;

public class Bankomat implements BankomatIMPL {
    private Card[] _cards;
    private Card _userCard;

    Bankomat() {
        // в конструкторе создаем базу данных карточек
        this._cards = new Card[] {
                new Card("1234567", "1234", 12.9f),
                new Card("3452541", "7895", 0),
                new Card("2233558", "4897", 100),
                new Card("7788994" ,"8874", 45f),
        };
    }

    public boolean checkPin(String cardID, String pin) {
        int i = 0;
        for(; i < this._cards.length; i++) {
            if (this._cards[i].ID.equals(cardID)) {
                this._userCard = this._cards[i];
                break;
            }
        }
        // found = false; !found = true
        // found == true; !found = false
        // ! - инвертирует логическое значение
        // null - нулевая ссылка (ссылка не указывающая на область памяти)
        if (this._userCard == null) {
            System.out.println("Неверный ID карточки");
            return false;
        }
        // проверяем пин-код
        return this._cards[i].PIN.equals(pin);
    }

    public float getBalance() {
        return this._userCard.money;
    }

    public void getCash(float cash) {
        if (cash > this._userCard.money) {
            System.out.println("Недостаточно средств");
        }
        else {
            //this._userCard.money = this._userCard.money - cash;
            this._userCard.money -= cash;
        }
    }

    public void addCash(float cash) {
        this._userCard.money += cash;
    }

    public void reject() {
        this._userCard = null;
    }

    static class Card {
        String ID;
        String PIN;
        float money;

        Card(String id, String pin, float money) {
            this.ID = id;
            this.PIN = pin;
            this.money = money;
        }
    }

}
