import junit.framework.TestCase;
import org.junit.BeforeClass;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class nameListGradleExampleTest extends TestCase {
    public void testAddDefaultUsers() {
        System.out.println("Testing number of users");
        nameListGradleExample.addDefaultUsers();
        List<Person> people = nameListGradleExample.people;
        assertEquals(8, people.size());
    }
}