package shopping;
import java.util.*;

public class Customer {
  private String name;
  private double budget;

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


}