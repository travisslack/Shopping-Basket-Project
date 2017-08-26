package shopping;
package behaviours;

public abstract class Item{
  protected String name;
  protected double price;
  

  public Item(String name, double price) {
    this.name = name;
    this.price = price;
  }
}