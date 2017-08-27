import static org.junit.Assert.*;
import org.junit.*;
import shopping.*;

public class BasketTest {
  Basket basket;
  Bread bread;


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

  // @Test 
  // public void basketCanHoldItem() {
  //   basket = new Basket(19.00);
  //   bread = new Bread(4.50, 3.00);
  //   assertEquals(16.00, )
  // }



}