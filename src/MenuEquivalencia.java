import java.io.IOException;
import java.util.Scanner;

public class MenuEquivalencia {

    public static void mostrar() throws IOException, InterruptedException {
        MenuPrincipal menuPrincipal = new MenuPrincipal();
        int opcion = 0;

        String Menu = ("""
                *********************************EquiXChange******************************
                **************************************************************************
                ***************************EQUIVALENCIA DE MONEDAS************************
                **************************************************************************
                ELIGE UNA OPCION
                
                1.- DOLAR A OTRAS MONEDAS
                2.- DE UNA MONEDA A OTRA MONEDA
                3.- VOLVER AL MENU PRINCIPAL
                """);

        Scanner scanner= new Scanner(System.in);
        while (opcion != 3){

            opcion = scanner.nextInt();
            scanner.nextLine(); //limpiar el salto de línea pendiente
            boolean seguir = true;

            String menuEquivalencia = ("""
                      ARS => Peso argentino   |  CLP => Peso chileno          |  CRC   => Colón costarricense                           
                      BRL => Real brasileño   |  JMD => Dolar jamaicano       |  MXN   => Peso mexicano  
                      BZD => Dolar de Belice  |  GRQ => Quetzal guatemalteco  |  UYU   => Peso uruguayo          
                      """);

            switch (opcion){
                case 1:

                    System.out.println("MONEDA BASE: USD- DOLAR");


                    while (seguir){
                        System.out.println(menuEquivalencia);
                        System.out.println("Ingrese la moneda para conocer su equivalencia:");

                        String monedaDeEquivalencia = scanner.nextLine().toUpperCase();

                        EquivalenciaDolarOtraMoneda equivalencia = new EquivalenciaDolarOtraMoneda();
                        Moneda moneda = equivalencia.Conversion(monedaDeEquivalencia);

                        System.out.println("****************EQUIVALENCIA********************");
                        System.out.println("Moneda base: " + moneda.base_code());
                        System.out.println("Moneda destino: " + moneda.target_code());
                        System.out.println("Equivalencia: " + moneda.conversion_rate());
                        System.out.println("************************************************");

                        System.out.println("Desea consultar otra equivalencia");
                        System.out.println("1- Si");
                        System.out.println("2- Ir al menu");

                        int continuar = scanner.nextInt();
                        scanner.nextLine();// limpiar salto de linea
                        if (continuar != 1){
                            seguir = false;
                            System.out.println(Menu);
                        }
                    }

                    break;
                case 2:

                    while (seguir){
                        System.out.println(menuEquivalencia);
                        System.out.println("Ingrese moneda base");
                        String monedaBase = scanner.nextLine();

                        System.out.println("Ingrese moneda destino");
                        String monedaDestino = scanner.nextLine();


                        EquivalenciaDeMonedaAMoneda equivalenciaMoneda = new EquivalenciaDeMonedaAMoneda();
                        Moneda monedaAMoneda = equivalenciaMoneda.ConversionMonedas(monedaBase,monedaDestino);

                        System.out.println("******EQUIVALENCIA ENTRE MONEDAS****************");
                        System.out.println("Moneda base: " + monedaAMoneda.base_code());
                        System.out.println("Moneda destino: " + monedaAMoneda.target_code());
                        System.out.println("Equivalencia: " + monedaAMoneda.conversion_rate());
                        System.out.println("************************************************");

                        System.out.println("Desea consultar otra equivalencia");
                        System.out.println("1- Si");
                        System.out.println("2- Ir al menu");

                        int continuar = scanner.nextInt();
                        scanner.nextLine();// limpiar salto de linea

                        if (continuar != 1){
                            seguir = false;
                            System.out.println(Menu);
                        }
                    }

                    break;
                case 3:
                    menuPrincipal.mostrar();
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }
    }
}
