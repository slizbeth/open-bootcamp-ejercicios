public class Main {
  public static void main(String[] args) throws Exception {
    Client myClient = new Client(); 
    
    myClient.setName("Juan");
    myClient.setAge(34);
    myClient.setPhone(654532450);
    myClient.setCredit(19000);
    
    System.out.print("Se llama " + myClient.getName());
    System.out.print(", tiene " + myClient.getAge() + " años");
    System.out.print(", su teléfono de contacto es " + myClient.getPhone());
    System.out.println(" y el valor del crédito que tiene es " + myClient.getCredit());

    Employee myEmployee = new Employee(); 
    
    myEmployee.setName("Ana");
    myEmployee.setAge(26);
    myEmployee.setPhone(654543231);
    myEmployee.setSalary(25000);
    
    System.out.print("Se llama " + myEmployee.getName());
    System.out.print(", tiene " + myEmployee.getAge() + " años");
    System.out.print(", su teléfono de contacto es " + myEmployee.getPhone());
    System.out.println(" y su salario anual es de " + myEmployee.getSalary());
  }
}

class Person {
  private int age;
  private String name;
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

class Client extends Person {
  private int credit;

  public int getCredit() {
      return this.credit;
  }

  public void setCredit(int credit) {
      this.credit = credit;
  }
}

class Employee extends Person {
  private int salary;

  public int getSalary() {
      return this.salary;
  }

  public void setSalary(int salary) {
      this.salary = salary;
  }
}