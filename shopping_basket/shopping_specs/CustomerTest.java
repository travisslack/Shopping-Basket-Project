import static org.junit.Assert.*;
import org.junit.*;
import shopping.*;

public class CustomerTest {
  Customer customer;
  Basket basket1;
  Bread bread;

  @Before
  public void before() {
    customer = new Customer("Keith", 40.00);
    basket1 = new Basket(15.00);
    bread = new Bread(2.00, 5.00);

  }

  @Test
  public void hasName() {
    assertEquals("Keith", customer.getName());
  }

  @Test
  public void hasBudget() {
    assertEquals(40.00, customer.getBudget(), 0.01);
  }
}
