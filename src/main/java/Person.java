public class Person {
  private String name;
  private String gender;
  private int age;

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return "Person{" +
            "name='" + name + '\'' +
            ", gender='" + gender + '\'' +
            ", age=" + age +
            '}';
  }

  public String getGender() {
    return gender;
  }

  public int getAge() {
    return age;
  }

  public Person(String name, String gender, int age) {
    this.name = name;
    this.gender = gender;
    this.age = age;
  }

  public static void main(String[] args) {
    System.out.println("second main - should not run ");
  }
}
