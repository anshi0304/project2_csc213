package edu.canisius.csc213.project2.util;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import edu.canisius.csc213.project2.quotes.*;


import java.io.IOException;

public class PolygonJsonReplyTranslator {

    public StockQuote translateJsonToFinancialInstrument(String json) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = mapper.readTree(json);

        String symbol = root.path("ticker").asText();
        JsonNode results = root.path("results").get(0);
        double closePrice = results.path("c").asDouble();
        double highestPrice = results.path("h").asDouble();
        double lowestPrice = results.path("l").asDouble();
        int numberOfTransactions = results.path("n").asInt();
        double openPrice = results.path("o").asDouble();
        long timestamp = results.path("t").asLong();
        double tradingVolume = results.path("v").asDouble();


        //String symbol,
        //double closePrice, 
        //double highPrice, 
        //double lowPrice, 
        //double numberOfTransactions, 
        //double openPrice, 
        //double timestamp,
        //double tradingVolume
        
        return new StockQuote(symbol, 
        closePrice, 
        highestPrice, 
        lowestPrice, 
        numberOfTransactions,
        openPrice,
        timestamp,
        tradingVolume);
    }
}
