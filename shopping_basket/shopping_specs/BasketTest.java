import static org.junit.Assert.*;
import org.junit.*;
import shopping.*;

public class BasketTest {
  Basket basket;

  @Before 
  public void before() {
    basket = new Basket(19.00);
  }

  @Test
  public void hasWeight() {
    assertEquals(19.00, basket.getWeight(), 0.01);
  }

  @Test
  public void basketStartsEmpty() {
    assertEquals(0, basket.itemCount());
  }


}