import java.util.Scanner;

public class proyectoSwitch {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        proyectoSwitch.requestExercise();
    }

  /*3. Escribir un método que reciba una letra (puede ser mayúscula o minúscula) del alfabeto por teclado y devuelva si es vocal o consonante. 
    Se considera que toda letra que no es una vocal es una consonante*/
    static void convertirLetra(int codigoASCII) {
        switch (codigoASCII) {
            case 33,37,41,47,53,97,101,105,111,117 ->
                System.out.println("Es vocal ");
            default ->
                System.out.println("Es consonante");
        }
    }
}