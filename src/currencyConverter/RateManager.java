package currencyConverter;

import java.util.HashMap;

public class RateManager {
    private static RateManager instance;
    private HashMap<String, Double> exchangeRates;

    private RateManager() {
        exchangeRates = new HashMap<>();
        // Initialize default exchange rates here or load them from a file/database.
    }

    public static RateManager getInstance() {
        if (instance == null) {
            instance = new RateManager();
        }
        return instance;
    }

    public Double getExchangeRate(String currency1, String currency2) {
        // Implement logic to retrieve the exchange rate between currency1 and currency2
        String key = currency1 + "-" + currency2;
        return exchangeRates.getOrDefault(key, 0.0);
    }

    public void setExchangeRate(String currency1, String currency2, Double rate) {
        // Implement logic to set the exchange rate between currency1 and currency2
        String key = currency1 + "-" + currency2;
        exchangeRates.put(key, rate);
    }
}
