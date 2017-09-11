import junit.framework.TestCase;

/**
 * A JUnit test case class.
 * Every method starting with the word "test" will be called when running
 * the test with JUnit.
 */

public class ItemTest extends TestCase {

  /**
   * A test method.
   * (Replace "X" with a name describing the test. You may write as
   * many "testSomething" methods in this class as you wish, and each
   * one will be called when running JUnit over this class.)
   */
  public void testTripCreated(){
    Item t = new Item("bag",3000);
    Item u = new Item("tablet",999);
    Item v = new Item("phone",1001);
    
    assertEquals("bag", t.name);
    assertEquals(3000.0, t.price);
    assertEquals("tablet", u.name);
    assertEquals(999.0, u.price);
    assertEquals("phone", v.name);
    assertEquals(1001.0, v.price);
  }
  
  public void testNoDiscount(){
    Item t = new Item("dress",1000);
    Item u = new Item("tablet",999);
    Item v = new Item("wallet",500);
    
    assertEquals(1000.0, t.newAmount());
    assertEquals(999.0, u.newAmount());
    assertEquals(500.0, v.newAmount());
  }
  
  public void testDiscount(){
    Item t = new Item("laptop",2000);
    Item u = new Item("phone",1001);
    Item v = new Item("chair",1500);
    
    assertEquals(1700.0, t.newAmount());
    assertEquals(850.85, u.newAmount());
    assertEquals(1275.0, v.newAmount());
  }
}