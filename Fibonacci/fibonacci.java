import java.util.Scanner;

public class fibonacci {
  public static int secuencia(int numero) {
    if (numero == 0||numero == 1) {
      return numero;
    } else {
      return secuencia(numero-1)+secuencia(numero-2);
    }
  }
  public static void mostrarSerieFibonacci(int n) {
    System.out.println("La serie f de: " + n);
    for (int i = 0; i <= n; i++) {
      System.out.print(secuencia(i)+" ");
    }
  }
}

