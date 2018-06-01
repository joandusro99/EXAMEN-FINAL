/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miparqueadero;

import java.util.*;

/**
 *
 * @author Estudiantes
 */
public class MiParqueadero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Vehiculo miVehiculo = new Vehiculo();
        Scanner miScanner = new Scanner(System.in);
        int entrada = 0;
        System.out.println("Ingrese 1 para ingresar su vehiculo");
        System.out.println("Ingrese 2 para retirar su vehiculo");
        System.out.println("Ingrese 3 para consultar cupos disponibles");

        if (1 <= entrada  && entrada <= 3) {
            switch (entrada) {
                case 1:
                    System.out.println("Los datos de su vehiculo es");
                    System.out.println("#Placa");
                    break;
                case 2:
                    System.out.println("El costo del parqueadero es");
                    System.out.println("Tiempo");
                    break;
                case 3:
                    System.out.println("Los cupos disponibles son");
                    System.out.println("#");
                    break;
                default:
                     
                System.out.println("Este valor no es aceptado");
               

            }

        }
    }

}
