public class Main {
  public static void main(String[] args) throws Exception {
      
    //if, esle if, else
    int numeroIf = -4;
    if(numeroIf > 0){
      System.out.println("La variable numeroIf con valor " + numeroIf + " es un número positivo");
    }else if (numeroIf < 0){
      System.out.println("La variable numeroIf con valor " + numeroIf + " es un número negativo");
    }else{
      System.out.println("La variable numeroIf con valor " + numeroIf + " es el número 0");
    }
    
    //while
    int numeroWhile = 1;
    while(numeroWhile < 3){
      numeroWhile++;
      System.out.println("La variable numeroWhile tiene el valor: " + numeroWhile);
    }
    
    //do while
    int numeroDoWhile = 3;
    do{
      numeroDoWhile++;
      System.out.println("La variable numeroDoWhile tiene el valor: " + numeroDoWhile);
    }while(numeroDoWhile < 3);
    
    //for
    for (int numeroFor = 0; numeroFor <= 3 ; numeroFor++){
      System.out.println("La variable numeroFor tiene el valor: " + numeroFor);
    } 
    
    //switch
    String estacion = "otoño";
    switch (estacion) {
      case "primavera":  
        System.out.println("La estación es primavera");
        break;
      case "verano":
        System.out.println("La estación es verano");
        break;
      case "otoño":
        System.out.println("La estación es otoño");
        break;
      case "invierno":
        System.out.println("La estación es invierno");
        break;
      default: System.out.println("No es una estación");
    }
  }
}