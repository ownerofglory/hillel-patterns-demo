package ua.ithillel.drink.client;


import ua.ithillel.drink.exception.DrinkClientException;
import ua.ithillel.drink.model.response.CocktailResponse;
import ua.ithillel.pattern.proxy.Cacheable;

public interface DrinkClient {
    @Cacheable
    CocktailResponse getByName(String name) throws DrinkClientException;
}
