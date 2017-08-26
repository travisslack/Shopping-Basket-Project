import static org.junit.Assert.*;
import org.junit.*;
import shopping.*;

public class CustomerTest {
  Customer customer;
  Basket basket1;
  Bread bread;

  @Before
  public void before() {
    customer = new Customer("Keith");
    basket1 = new Basket(15.00);
    bread = new Bread(2.00, 5.00);

  }

  @Test
  public void hasName() {
    assertEquals("Keith", customer.getName());
  }
}
