import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class BusTest {

  Bus bus;
  Person person;

  @Before 
  public void before() {
    bus = new Bus("kirkcaldy");
  }

  @Test 
  public void hasRoute() {
    assertEquals("kirkcaldy", bus.getRoute());
  }

  @Test
  public void busStartsEmpty(){
    assertEquals(0, bus.passengerCount());
  }






}