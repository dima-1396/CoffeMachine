package com.company;

public interface IngredientIMPL {
    double getWater(String CoffeMark);
    double getCoffe(String CoffeMark);
    void americano(double Water, double Coffe);
    void espreso(double Water, double Coffe);
    void doubleEspreso(double Water, double Coffe);

}