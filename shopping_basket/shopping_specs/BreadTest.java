import static org.junit.Assert.*;
import org.junit.*;
import shopping.*;

public class BreadTest {
  Bread bread;

  @Before
  public void before() {
    bread = new Bread(4.50);
  }

  @Test
  public void hasPrice() {
    assertEquals(4.50, bread.getPrice(), 0.01);
  }
}