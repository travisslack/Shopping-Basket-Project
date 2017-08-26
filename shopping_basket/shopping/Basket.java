package shopping;
import java.util.*;
import java.util.ArrayList;

public class Basket {
  private double weight;
  protected ArrayList<Item> items;


  public Basket(double weight) {
    this.weight = weight;
    this.items = new ArrayList<Item>();

  }

  public double getWeight() {
    return this.weight;
  }

  public int itemCount() {
    return this.items.size();
  }
}