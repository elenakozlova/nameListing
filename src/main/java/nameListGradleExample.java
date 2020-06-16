import java.util.*;

public class nameListGradleExample {
  public static List<Person> people = new LinkedList<>();
  public static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    int input;
    boolean processInput = true;
    addDefaultUsers();

    while (processInput) {
      printMenu();
      input = scanner.nextInt();
      switch (input) {
        case 1:
          addPerson();
          break;
        case 2:
          people.stream()
                  .sorted(Comparator.comparing(Person::getAge))
                  .forEach(System.out::println);
          break;
        case 3:
          people.stream()
                  .filter(person -> "F".equals(person.getGender()))
                  .forEach(System.out::println);
          break;
        case 0:
          System.out.println("See Ya");
          processInput = false;
        default:
          System.out.println("Invalid input");
          break;
      }
    }
    System.exit(0);
  }

  public static void addDefaultUsers() {
    people.add(new Person("Alex", "M", 15));
    people.add(new Person("Helen", "F", 25));
    people.add(new Person("Nikita", "F", 45));
    people.add(new Person("Trisha", "F", 35));
    people.add(new Person("Paul", "M", 12));
    people.add(new Person("Olga", "F", 14));
    people.add(new Person("Tracy", "F", 17));
    people.add(new Person("Alex", "M", 10));
  }

  public static void printMenu() {
    System.out.println("---------------------------------");
    System.out.println("-   Main Menu                   -");
    System.out.println("-       1. Add a person         -");
    System.out.println("-       2. List people by age   -");
    System.out.println("-       3. List Females         -");
    System.out.println("-   0. Exit                     -");
  }

  public static void addPerson() {
    System.out.println("Enter Name:");
    String name = scanner.next();
    System.out.println("Age:");
    int age = scanner.nextInt();
    System.out.println("Gender  M|F:");
    String gender = scanner.next();

    people.add(new Person(name, gender, age));
  }
}
