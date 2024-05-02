
package edu.canisius.csc213.project2.quotes;


public class StockQuote {
private String symbol;
private double openPrice;
private double closePrice;
private double highestPrice;
private double lowestPrice;
private double tradingVolume;
private double numberOfTransactions;
private double timestamp;


public StockQuote(String symbol,
double closePrice, 
double highPrice, 
double lowPrice, 
double numberOfTransactions, 
double openPrice, 
double timestamp,
double tradingVolume) {

this.symbol = symbol;
this.openPrice = openPrice;
this.closePrice = closePrice;
this.highestPrice = highPrice;
this.lowestPrice = lowPrice;
this.numberOfTransactions = numberOfTransactions;
this.tradingVolume = tradingVolume;
this.timestamp = timestamp;
}





public String getSymbol() {
return symbol;
}


public double getOpenPrice() {
return openPrice;
}


public double getClosePrice() {
return closePrice;
}


public double getHighPrice() {
return highestPrice;
}


public double getLowPrice() {
return lowestPrice;
}


public double getNumberOfTransactions() {
return numberOfTransactions;
}


public double getTradingVolume() {
return tradingVolume;
}


public double getTimestamp() {
return timestamp;
}


public String prettyPrint() {
return "Symbol: " + this.symbol + "\n" +
"Close Price: " + this.closePrice + "\n" +
"Highest Price: " + this.highestPrice + "\n" +
"Lowest Price: " + this.lowestPrice + "\n" +
"Number of Transactions: " + (int)this.numberOfTransactions + "\n" +
"Open Price: " + this.openPrice + "\n" +
"Trading Volume: " + this.tradingVolume + "\n";
}


}
