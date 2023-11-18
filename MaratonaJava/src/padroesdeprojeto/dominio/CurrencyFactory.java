package padroesdeprojeto.dominio;

import static padroesdeprojeto.dominio.Country.BRAZIL;
import static padroesdeprojeto.dominio.Country.USA;

public class CurrencyFactory {
    public static Currency newCurrency(Country country) {
        switch (country){
            case USA:
                return new UsDollar();
            case BRAZIL:
                return new Real();
            default:throw new IllegalArgumentException("No currency found for this contry");
        }
    }
}
