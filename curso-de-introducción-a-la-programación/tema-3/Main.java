public class Main {
  public static void main(String[] args) throws Exception {
    
    //Primera parte:
    int result;
    result =  sum(2, 4, 6);
    System.out.println("Resultado de la suma: " + result);
    
    //Segunda parte:
    Car myCar = new Car();
    myCar.addDoor();
    System.out.println("Número de puertas que tiene el objeto myCar: " +  myCar.doors);
  }
  
  public static int sum(int a, int b, int c){
    return a + b + c;
  }
}

class Car {
  int doors = 4;
  
  public void addDoor(){
    this.doors++;
  }
}