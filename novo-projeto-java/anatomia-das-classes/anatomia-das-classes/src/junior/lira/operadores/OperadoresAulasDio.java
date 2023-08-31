package junior.lira.operadores;

public class OperadoresAulasDio {

  public static void main(String[] args) {

    int numero = 2;

    numero++;
    System.out.println(numero);

    numero += 2;
    System.out.println(numero);

    // booleano

    boolean variavel = true;
    System.out.println(!variavel);
    System.out.println(variavel);

    variavel = !variavel;
    System.out.println(variavel);

    // TENARIO
    int a, b;
    a = 5;
    b = 6;

    String resultado = a == b ? "verdadeiro" : "falso";

    System.out.println(resultado);

    a = 8;
    b = 5;
    int resultado2 = a > b ? 1 : 0;

    System.out.println(resultado2);
  }
}
