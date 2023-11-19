import java.util.Scanner;

public class proyectoSwitch {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        proyectoSwitch.requestExercise();
    }

 /*2.- Escribir un método que reciba un nombre de mes introducido por teclado y devuelva el número de días que tiene ese mes.*/
    static int numeroDiasString(String mes) {
        return switch (mes) {
            case "enero","marzo","mayo","julio","agosto","octubre","diciembre" ->
                31;
            case "abril","junio","septiembre","noviembre" ->
                30;
            case "febrero" ->
                28;
            default ->
                0;
        };
    }
}