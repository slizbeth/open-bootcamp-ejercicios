public class Main {
  public static void main(String[] args) throws Exception {
    Person myPerson = new Person() ; 
    
    myPerson.setName("Juan");
    myPerson.setAge(34);
    myPerson.setPhone(654532450);
    
    System.out.print("Se llama " + myPerson.getName());
    System.out.print(", tiene " + myPerson.getAge() + " años ");
    System.out.print("y su teléfono de contacto es " + myPerson.getPhone());
  }
}

class Person {
  private String name;
  private int age;
  private int phone;

  public String getName() {
      return this.name;
  }

  public void setName(String name) {
      this.name = name;
  }
  
  public int getAge() {
      return this.age;
  }

  public void setAge(int age) {
      this.age = age;
  }
  
  public int getPhone() {
      return this.phone;
  }

  public void setPhone(int phone) {
      this.phone = phone;
  }
}