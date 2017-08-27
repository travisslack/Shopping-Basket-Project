import static org.junit.Assert.*;
import org.junit.*;
import shopping.*;

public class CustomerTest {
  Customer customer1;
  Basket basket1;
  Bread bread;

  @Before
  public void before() {
    customer1 = new Customer("Keith", 40.00);
    basket1 = new Basket(15.00);
    bread = new Bread(2.00, 5.00);

  }

  @Test
  public void hasName() {
    assertEquals("Keith", customer1.getName());
  }

  @Test
  public void hasBudget() {
    assertEquals(40.00, customer1.getBudget(), 0.01);
  }

  @Test 
  public void canAffordItemTest() {
    boolean result = customer1.hasFunds();
    assertEquals(true, result);
  }

  @Test 
  public void basketCanHoldItem() {
    boolean result = basket1.canFitItem();
    assertEquals(true, result);
  }

  // @Test
  // public void canAddItemToBasket() {
  //   customer1.addToBasket(bread, basket1);
  //   assertEquals(1, basket.itemCount());
  // }

}
