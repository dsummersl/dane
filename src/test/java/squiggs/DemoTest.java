package squiggs;

import org.junit.*;
import static org.junit.Assert.*;

public class DemoTest {
  @Test
  public void testHelloworld() {
    assertEquals(Demo.helloworld(),"Hello World");
  }
}
