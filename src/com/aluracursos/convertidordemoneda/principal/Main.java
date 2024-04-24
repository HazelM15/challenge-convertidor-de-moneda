package com.aluracursos.convertidordemoneda.principal;

import com.aluracursos.convertidordemoneda.modelos.ConsultaMoneda;
import com.aluracursos.convertidordemoneda.modelos.Moneda;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcion = 0;
        double montoConvertir;

        Scanner lectura = new Scanner(System.in);
        ConsultaMoneda consultaMoneda = new ConsultaMoneda();

        String menu = """
                *********************************************************
                Sea bienvenido/a al Conversor de Moneda
                
                1) Dolar =>> Peso Argentino
                2) Peso Argentino =>> Dolar
                3) Dolar ==> Peso Colombiano
                4) Peso Colombiano ==> Dolar
                5) Dolar ==> Real Brasileño
                6) Real Brasileño =>> Dolar
                7) Dolar ==> Colon Costarricense
                8) Colon Costarricense ==> Dolar
                9) Salir
                
                Elija una opcion del menu de opciones
                *********************************************************
                """;

        String ingresarMonto = "Digite el monto que desea convertir en el siguiente espacio ";

        try {
            while (opcion != 9) {
                System.out.println(menu);
                opcion = lectura.nextInt();

                if (opcion == 1) {
                    System.out.println(ingresarMonto);
                    montoConvertir = lectura.nextDouble();
                    Moneda tipoDeMoneda = consultaMoneda.moneda("USD", "ARS", montoConvertir);
                    System.out.println(tipoDeMoneda + "\n");
                } else if (opcion == 2) {
                    System.out.println(ingresarMonto);
                    montoConvertir = lectura.nextDouble();
                    Moneda tipoDeMoneda = consultaMoneda.moneda("ARS", "USD", montoConvertir);

                    System.out.println(tipoDeMoneda + "\n");
                } else if (opcion == 3) {
                    System.out.println(ingresarMonto);
                    montoConvertir = lectura.nextDouble();
                    Moneda tipoDeMoneda = consultaMoneda.moneda("USD", "COP", montoConvertir);
                    System.out.println(tipoDeMoneda + "\n");
                } else if (opcion == 4) {
                    System.out.println(ingresarMonto);
                    montoConvertir = lectura.nextDouble();
                    Moneda tipoDeMoneda = consultaMoneda.moneda("COP", "USD", montoConvertir);
                    System.out.println(tipoDeMoneda + "\n");
                } else if (opcion == 5) {
                    System.out.println(ingresarMonto);
                    montoConvertir = lectura.nextDouble();
                    Moneda tipoDeMoneda = consultaMoneda.moneda("USD", "BRL", montoConvertir);
                    System.out.println(tipoDeMoneda + "\n");
                } else if (opcion == 6) {
                    System.out.println(ingresarMonto);
                    montoConvertir = lectura.nextDouble();
                    Moneda tipoDeMoneda = consultaMoneda.moneda("BRL", "USD", montoConvertir);
                    System.out.println(tipoDeMoneda + "\n");
                } else if (opcion == 7) {
                    System.out.println(ingresarMonto);
                    montoConvertir = lectura.nextDouble();
                    Moneda tipoDeMoneda = consultaMoneda.moneda("USD", "CRC", montoConvertir);
                    System.out.println(tipoDeMoneda + "\n");
                } else if (opcion == 8) {
                    System.out.println(ingresarMonto);
                    montoConvertir = lectura.nextDouble();
                    Moneda tipoDeMoneda = consultaMoneda.moneda("CRC", "USD", montoConvertir);
                    System.out.println(tipoDeMoneda + "\n");
                } else if (opcion == 9) {
                    System.out.println("Ha salido de la aplicacion. Muchas gracias por utilizar el convertidor");
                } else {
                    System.out.println("Opcion no valida. Introduzca una opcion del menu de opciones");
                }
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            System.out.println("Finalizando la aplicacion");
        }
    }
}
