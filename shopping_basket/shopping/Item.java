package shopping;
import java.util.*;

public abstract class Item{
  protected double price;
  private double itemWeight;
  

  public Item(double price, double itemWeight) {
    this.price = price;
    this.itemWeight = itemWeight;
  }

  public double getPrice() {
    return this.price;
  }

  public double getItemWeight() {
    return this.itemWeight;
  }
}