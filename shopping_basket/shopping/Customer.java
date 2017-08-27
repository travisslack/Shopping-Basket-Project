package shopping;
import java.util.*;

public class Customer {
  private String name;
  protected double budget;

  public Customer(String name, double budget) {
    this.name = name;
    this.budget = budget;
  }

  public String getName() {
    return this.name;
  }

  public double getBudget() {
    return this.budget;
  }

  public void addToBasket(Item item, Basket basket) {
     basket.addToBasket(item);
  }

  public boolean hasFunds(double price) {
    if (this.budget >= price) {
      return true;
    } else {
      return false;
    }
  }

  public void addItemToBasket(Bread bread, Basket basket) {
    Basket foundSpace = (this.hasFunds(price)) && (this.canFitItem(itemWeight));
    if (foundSpace != false) {
      foundSpace.addToBasket(item);
    }
  }


}