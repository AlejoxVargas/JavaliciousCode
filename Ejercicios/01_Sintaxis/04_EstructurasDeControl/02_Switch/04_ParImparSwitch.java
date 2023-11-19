import java.util.Scanner;

public class proyectoSwitch {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        proyectoSwitch.requestExercise();
    }

 /*4. Escribir un método que pida al usuario un número e indica si es par o impar (con switch case).*/
    static void calcularPar(int numeroPar) {

        int resultado = (numeroPar % 2);
        switch (resultado) {
            case 0 ->
                System.out.println("El numero " + numeroPar + " es par");
            default ->
                System.out.println("El numero " + numeroPar + " es impar");
        }
        /*switch (resultado){
            case 0: 
                System.out.println("El numero " + numeroPar + "es par");
        break;
            default: System.out.println("El numero" + numeroPar + "es impar");*/
    }
}