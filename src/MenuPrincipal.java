import java.io.IOException;
import java.util.Scanner;

public class MenuPrincipal {

    public static void mostrar() throws IOException, InterruptedException {
        MenuConversor menuConversor = new MenuConversor();
        MenuEquivalencia menuEquivalencia = new MenuEquivalencia();
        int opcion=0;

        System.out.println("""
                ***************************************************************************
                *******************************EquiXChange*********************************
                ***************************************************************************
                                         Bienvenido EquiXChange
                EquiXChange es un sistema donde el usuario puede conocer la equivalencia 
                entre monedas y hacer conversiones entre ellas.
                
                 --------------------------  ELIGE UNA OPCION  -----------------------------         
                
                1.- EQUIVALENCIAS DE MONEDAS
                2.- CONVERSOR DE MONEDAS
                3.- SALIR
                """);

        Scanner  scanner= new Scanner(System.in);
        while (opcion != 3){
            opcion = scanner.nextInt();
            scanner.nextLine(); //limpiar el salto de línea pendiente

            switch (opcion){
                case 1:
                    MenuEquivalencia.mostrar();
                    break;
                case 2:
                    MenuConversor.mostrar();
                    break;
                case 3:
                    System.out.println("Gracias por utilizar nuestros servicios");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }
    }
}
