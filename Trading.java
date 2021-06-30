module TradingStrategy {
    void buy();
    void sell();   
}

class HedgingLongTermStrategy implements TradingStrategy {
    void buy() { /* TODO: */ };
    void sell() { /* TODO: */ };   
}

class HighFreqIntradayStrategy implements TradingStrategy {
    void buy() { /* TODO: */ };
    void sell() { /* TODO: */ };   
}

class CompositeTradingStrategy extends ArrayList<TradingStrategy> implements TradingStrategy {
    void buy() {
       for (TradingStrategy strategy : this) {
           strategy.buy();
       }
    }
    void sell() {
       for (TradingStrategy strategy : this) {
           strategy.sell();
       }
    }
}

// sample code
TradingStrategy composite = new CompositeTradingStrategy();
composite.add(new HighFreqIntradayStrategy());  
composite.add(new HedgingLongTermStrategy());
composite.buy();