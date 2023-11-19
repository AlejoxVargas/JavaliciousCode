import java.util.Scanner;

public class proyectoSwitch {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        proyectoSwitch.requestExercise();
    }

 /*1.- Escribir un método que reciba un número introducido por teclado entre 1 y 12 y devuelva el número de días que tiene ese mes.*/
    static int numeroDias(int mes) {
        int diastotales;
        diastotales = switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12 ->
                31;
            case 2 ->
                28;
            case 4, 6, 9, 11 ->
                30;
            default ->
                0;
        };
        return diastotales;
    }

}