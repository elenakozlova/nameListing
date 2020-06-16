import junit.framework.TestCase;

import java.util.List;

public class nameListGradleExampleTest extends TestCase {
  public void testAddDefaultUsers() {
    System.out.println("-------------------------------------");
    System.out.println("Testing number of people on the list");
    System.out.println("-------------------------------------");
    nameListGradleExample.addDefaultUsers();
    List<Person> people = nameListGradleExample.people;
    assertEquals(8, people.size());
  }
}