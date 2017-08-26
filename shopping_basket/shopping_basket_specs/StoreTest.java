import shopping_basket.*;
import org.junit.*;
import static org.junit.Assert.*;
// import behaviours.*;

public class StoreTest {
  Store store;

  @Before
  public void before() {
    store = new Store("Keiths Grocery Store");
  }

  @Test
  public void hasStoreName() {
    assertEquals("Keiths Grocery Store", store.getStoreName());
  }
}