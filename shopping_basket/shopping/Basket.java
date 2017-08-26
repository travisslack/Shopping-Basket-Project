package shopping;
import java.util.*;
// import java.util.ArrayList;

public class Basket {
  private double weight;
  // protected ArrayList<StockItem> stockItems;


  public Basket(double weight) {
    this.weight = weight;
    // this.stockItems = new ArrayList<StockItem>();

  }

  public double getWeight() {
    return this.weight;
  }
}