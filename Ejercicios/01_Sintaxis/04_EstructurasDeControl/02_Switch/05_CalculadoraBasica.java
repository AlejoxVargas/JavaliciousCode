import java.util.Scanner;

public class proyectoSwitch {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        proyectoSwitch.requestExercise();
    }

 /*5.- Escribir un método que pida una operación (+, -, *, /) y dos números y realice la operación indicada imprimiendo el resultado.*/
    static void calcularOperacion(String signos, double numero1Operar, double numero2Operar) {
        switch (signos) {
            case "+" ->
                System.out.println(numero1Operar + numero2Operar);
            case "-" ->
                System.out.println(numero1Operar - numero2Operar);
            case "*" ->
                System.out.println(numero1Operar * numero2Operar);
            case "/" ->
                System.out.println(numero1Operar / numero2Operar);
            default ->
                System.out.println("Signo incorrecto");
        }

        //Lo siguiente es solo un cometario de ayuda y comparación con otros ejercicios.
        /*switch (signos) {
            case "+":
                System.out.println(numero1Operar + numero2Operar);
                break;
            case "-":
                System.out.println(numero1Operar - numero2Operar);
                break;
            case "*":
                System.out.println(numero1Operar * numero2Operar);
                break;
            case "/":
                System.out.println(numero1Operar / numero2Operar);
                break;
            default:
                System.out.println("Signo incorrecto");
        }*/
    }

}