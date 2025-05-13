import java.io.IOException;
import java.util.Scanner;

public class MenuConversor {

    public static void mostrar() throws IOException, InterruptedException {
        MenuPrincipal menuPrincipal = new MenuPrincipal();
        int opcion = 0;

        String menu = ("""
                **************************************************************************
                ***************************CONVERSOR DE MONEDAS***************************
                **************************************************************************
                                
                ELIGE UNA OPCION
                
                DOLAR ESTADOUNIDENSE = USD
                1.- DOLAR(USD)           => PESO ARGENTINO(ARS)
                2.- PESO ARGENTINO(ARS)  => DOLAR(USD)
                3.- DOLAR(USD)           => REAL BRASILEÑO(BRL)
                4.- REAL BRASILEÑO(BRL)  => DOLAR(USD)
                5.- DOLAR(USD)           => DOLAR DE BELICE(BZD)
                6.- DOLAR DE BELICE(BZD) => DOLAR(USD)
                7.- DOLAR(USD)           => PESO CHILENO(CLP)
                8.- PESO CHILENO(CLP)    => DOLAR(USD)
                9.- VOLVER AL MENU PRINCIPAL
               """);

        Scanner scanner= new Scanner(System.in);
        while (opcion != 9){
            System.out.println(menu);
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion){
                case 1:
                    System.out.println("Ingrese la cantidad a convertir:");
                    var cantidad = scanner.nextInt();

                    EquivalenciaDeMonedaAMoneda dolarPesoArgentino = new EquivalenciaDeMonedaAMoneda();
                    Moneda moneda = dolarPesoArgentino.ConversionMonedas("USD","ARS");
                    double valor = moneda.conversion_rate(); //convertir de string a double un valor

                    ConvertirMoneda convertirMoneda = new ConvertirMoneda();
                    double conversion = convertirMoneda.Conversion(valor,cantidad);

                    System.out.println("1 DOLAR(USD) = " + moneda.conversion_rate() + " PESO ARGENTINO(ARS)");
                    System.out.println("****************CONVERSION********************");
                    System.out.println("Moneda base: DOLAR(USD)");
                    System.out.println("Moneda destino: PESO ARGENTINO(ARS)");
                    System.out.println("Cantidad convertida: " + cantidad);
                    System.out.println("Valor de la conversion: " + conversion);
                    System.out.println("***********************************************");

                    System.out.println("1- Ir al menu");
                    int continuar = scanner.nextInt();
                    scanner.nextLine();

                    if (continuar == 1){
                        System.out.println(menu);
                    }
                    break;
                case 2:
                    System.out.println("Ingrese la cantidad a convertir:");
                    int cantidadARS = scanner.nextInt();

                    EquivalenciaDeMonedaAMoneda equivalenciaARSaUSD = new EquivalenciaDeMonedaAMoneda();
                    Moneda monedaDolar = equivalenciaARSaUSD.ConversionMonedas("ARS","USD");
                    double valorDolar = monedaDolar.conversion_rate(); //convertir de string a double un valor

                    ConvertirMoneda convertirARS = new ConvertirMoneda();
                    double conversionDolar = convertirARS.Conversion(valorDolar,cantidadARS);

                    System.out.println("1 PESO ARGENTINO(ARS) = " + monedaDolar.conversion_rate() + " DOLAR(USD)");
                    System.out.println("****************CONVERSION********************");
                    System.out.println("Moneda base: PESO ARGENTINO(ARS)");
                    System.out.println("Moneda destino: DOLAR(USD)");
                    System.out.println("Cantidad convertida: " + cantidadARS);
                    System.out.println("Valor de la conversion: " + conversionDolar);
                    System.out.println("***********************************************");

                    System.out.println("1- Ir al menu");
                    int continuar2 = scanner.nextInt();
                    scanner.nextLine();

                    if (continuar2 == 1){
                        System.out.println(menu);
                    }
                    break;
                case 3:
                    System.out.println("Ingrese la cantidad a convertir:");
                    int cantidadUSD = scanner.nextInt();

                    EquivalenciaDeMonedaAMoneda equivalenciaUSDaBRL  = new EquivalenciaDeMonedaAMoneda();
                    Moneda monedaBRL = equivalenciaUSDaBRL.ConversionMonedas("USD","BRL");
                    double valorBRL = monedaBRL.conversion_rate(); //convertir de string a double un valor

                    ConvertirMoneda convertirUSDaBRL = new ConvertirMoneda();
                    double conversionBRL = convertirUSDaBRL.Conversion(valorBRL,cantidadUSD);

                    System.out.println("1 DOLAR(USD) = " + monedaBRL.conversion_rate() + " REAL BRASILEÑO(BRL)");
                    System.out.println("****************CONVERSION********************");
                    System.out.println("Moneda base: DOLAR(USD)");
                    System.out.println("Moneda destino: REAL BRASILEÑO(BRL)");
                    System.out.println("Cantidad convertida: " + cantidadUSD);
                    System.out.println("Valor de la conversion: " + conversionBRL);
                    System.out.println("***********************************************");


                    System.out.println("1- Ir al menu");
                    int continuar3 = scanner.nextInt();
                    scanner.nextLine();

                    if (continuar3 == 1){
                        System.out.println(menu);
                    }
                case 4:
                    System.out.println("Ingrese la cantidad a convertir:");
                    int cantidadBRL = scanner.nextInt();

                    EquivalenciaDeMonedaAMoneda equivalenciaBRLaUSD  = new EquivalenciaDeMonedaAMoneda();
                    Moneda monedaUSD = equivalenciaBRLaUSD.ConversionMonedas("BRL","USD");
                    double valorUSD = monedaUSD.conversion_rate(); //convertir de string a double un valor

                    ConvertirMoneda convertirBRLaUSD = new ConvertirMoneda();
                    double conversionUSD = convertirBRLaUSD.Conversion(valorUSD,cantidadBRL);

                    System.out.println("1 REAL BRASILEÑO(BRL) = " + monedaUSD.conversion_rate() + " DOLAR(USD)");
                    System.out.println("****************CONVERSION********************");
                    System.out.println("Moneda base: REAL BRASILEÑO(BRL)");
                    System.out.println("Moneda destino: DOLAR(USD)");
                    System.out.println("Cantidad convertida: " + cantidadBRL);
                    System.out.println("Valor de la conversion: " + conversionUSD);
                    System.out.println("***********************************************");

                    System.out.println("1- Ir al menu");
                    int continuar4 = scanner.nextInt();
                    scanner.nextLine();

                    if (continuar4 == 1){
                        System.out.println(menu);
                    }
                case 5:
                    System.out.println("Ingrese la cantidad a convertir:");
                    int cantidadUSD2 = scanner.nextInt();

                    EquivalenciaDeMonedaAMoneda equivalenciaUSDaBZD  = new EquivalenciaDeMonedaAMoneda();
                    Moneda monedaBZD = equivalenciaUSDaBZD.ConversionMonedas("USD","BZD");
                    double valorBZD = monedaBZD.conversion_rate(); //convertir de string a double un valor

                    ConvertirMoneda convertirUSDaBZD = new ConvertirMoneda();
                    double conversionBZD = convertirUSDaBZD.Conversion(valorBZD,cantidadUSD2);

                    System.out.println("1 DOLAR(USD) = " + monedaBZD.conversion_rate() + " DOLAR DE BELICE(BZD)");
                    System.out.println("****************CONVERSION********************");
                    System.out.println("Moneda base: DOLAR(USD)");
                    System.out.println("Moneda destino: DOLAR DE BELICE(BZD)");
                    System.out.println("Cantidad convertida: " + cantidadUSD2);
                    System.out.println("Valor de la conversion: " + conversionBZD);
                    System.out.println("***********************************************");

                    System.out.println("1- Ir al menu");
                    int continuar5 = scanner.nextInt();
                    scanner.nextLine();

                    if (continuar5 == 1){
                        System.out.println(menu);
                    }
                    break;
                case 6:
                    System.out.println("Ingrese la cantidad a convertir:");
                    int cantidadBZD = scanner.nextInt();

                    EquivalenciaDeMonedaAMoneda equivalenciaBZDaUSD  = new EquivalenciaDeMonedaAMoneda();
                    Moneda monedaUSD2 = equivalenciaBZDaUSD.ConversionMonedas("BZD","USD");
                    double valorUSD2 = monedaUSD2.conversion_rate(); //convertir de string a double un valor

                    ConvertirMoneda convertirBZDaUSD = new ConvertirMoneda();
                    double conversionUSD2 = convertirBZDaUSD.Conversion(valorUSD2,cantidadBZD);

                    System.out.println("1 DOLAR DE BELICE(BZD) = " + monedaUSD2.conversion_rate() + " DOLAR(USD)");
                    System.out.println("****************CONVERSION********************");
                    System.out.println("Moneda base: DOLAR DE BELICE(BZD)");
                    System.out.println("Moneda destino: DOLAR(USD)");
                    System.out.println("Cantidad convertida: " + cantidadBZD);
                    System.out.println("Valor de la conversion: " + conversionUSD2);
                    System.out.println("***********************************************");

                    System.out.println("1- Ir al menu");
                    int continuar6 = scanner.nextInt();
                    scanner.nextLine();

                    if (continuar6 == 1){
                        System.out.println(menu);
                    }
                    break;
                case 7:
                    System.out.println("Ingrese la cantidad a convertir:");
                    int cantidadUSD3 = scanner.nextInt();

                    EquivalenciaDeMonedaAMoneda equivalenciaUSDaCLP  = new EquivalenciaDeMonedaAMoneda();
                    Moneda monedaCLP = equivalenciaUSDaCLP.ConversionMonedas("USD","CLP");
                    double valorCLP = monedaCLP.conversion_rate(); //convertir de string a double un valor

                    ConvertirMoneda convertirUSDaCLP = new ConvertirMoneda();
                    double conversionCLP = convertirUSDaCLP.Conversion(valorCLP,cantidadUSD3);

                    System.out.println("1 DOLAR(USD) = " + monedaCLP.conversion_rate() + " PESO CHILENO(CLP)");
                    System.out.println("****************CONVERSION********************");
                    System.out.println("Moneda base: DOLAR(USD)");
                    System.out.println("Moneda destino: PESO CHILENO(CLP)");
                    System.out.println("Cantidad convertida: " + cantidadUSD3);
                    System.out.println("Valor de la conversion: " + conversionCLP);
                    System.out.println("***********************************************");

                    System.out.println("1- Ir al menu");
                    int continuar7 = scanner.nextInt();
                    scanner.nextLine();

                    if (continuar7 == 1){
                        System.out.println(menu);
                    }
                    break;
                case 8:
                    System.out.println("Ingrese la cantidad a convertir:");
                    int cantidadCLP = scanner.nextInt();

                    EquivalenciaDeMonedaAMoneda equivalenciaCLPaUSD  = new EquivalenciaDeMonedaAMoneda();
                    Moneda monedaUSD3 = equivalenciaCLPaUSD.ConversionMonedas("CLP","USD");
                    double valorUSD3 = monedaUSD3.conversion_rate(); //convertir de string a double un valor

                    ConvertirMoneda convertirCLPaUSD = new ConvertirMoneda();
                    double conversionUSD3 = convertirCLPaUSD.Conversion(valorUSD3,cantidadCLP);

                    System.out.println("1 PESO CHILENO(CLP) = " + monedaUSD3.conversion_rate() + " DOLAR(USD)");
                    System.out.println("****************CONVERSION********************");
                    System.out.println("Moneda base: PESO CHILENO(CLP)");
                    System.out.println("Moneda destino: DOLAR(USD)");
                    System.out.println("Cantidad convertida: " + cantidadCLP);
                    System.out.println("Valor de la conversion: " + conversionUSD3);
                    System.out.println("***********************************************");

                    System.out.println("1- Ir al menu");
                    int continuar8 = scanner.nextInt();
                    scanner.nextLine();

                    if (continuar8 == 1){
                        System.out.println(menu);
                    }
                    break;
                case 9:
                    menuPrincipal.mostrar();
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }
    }
}

