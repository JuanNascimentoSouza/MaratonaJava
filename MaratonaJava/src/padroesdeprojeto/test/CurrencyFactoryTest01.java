package padroesdeprojeto.test;

import padroesdeprojeto.dominio.Country;
import padroesdeprojeto.dominio.Currency;
import padroesdeprojeto.dominio.CurrencyFactory;

public class CurrencyFactoryTest01 {
    public static void main(String[] args) {

        Currency currency = CurrencyFactory.newCurrency(Country.BRAZIL);

        System.out.println(currency.getSymbol());

    }
}