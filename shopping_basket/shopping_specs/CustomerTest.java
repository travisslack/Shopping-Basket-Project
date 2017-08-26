import static org.junit.Assert.*;
import org.junit.*;
import shopping.*;

public class CustomerTest {
  Customer customer;

  @Before
  public void before() {
    customer = new Customer("Keith");
  }

  @Test
  public void hasName() {
    assertEquals("Keith", customer.getName());
  }
}
