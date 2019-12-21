package com.company;

public interface IngredientIMPL {
    double getWater(String CoffeMark);
    double getCoffe(String CoffeMark);
    void americano();
    void espreso();
    void doubleEspreso();
    void setMaxBagWater();
    void setMaxBagCoffe();
    void getInfo();
}