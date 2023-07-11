package ua.ithillel.drink.service;


import ua.ithillel.drink.exception.DrinkClientException;
import ua.ithillel.drink.model.Drink;

public interface DrinkService {
    Drink getDrinkByName(String name) throws DrinkClientException;
}
