/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.pkg1_favionataren;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author favio
 */
public class Examen1_FavioNataren {

    static ArrayList<PC> pc = new ArrayList();
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

       

        int opcion = 0;
        do {
            System.out.println("Bienvenido al sistema de administrador de redes\n"
                    + "¿Qué desea hacer?\n"
                    + "1) CRUD de PC\n"
                    + "2) Ingresar PC\n"
                    + "3) Salir");
            opcion = leer.nextInt();
            switch (opcion) {
                case 0: {
                    System.out.println("saliendo");
                }
                break;

                case 1: {
                    System.out.println("--Crud--");
                    int opcion2 = 0;
                    do {
                        System.out.println("Bienvenido al CRUD\n"
                                + "¿Qué desea hacer?\n"
                                + "1) Crear PC\n"
                                + "2) Modificar PC\n"
                                + "3) Listar PC\n"
                                + "4) Eliminar PC\n"
                                + "5) Salir");
                        opcion2 = leer.nextInt();
                        switch (opcion2) {
                            case 1: {

                            }
                        }
                    } while (opcion2 != 5);
                }
                break;
                case 2: {
                    System.out.println("--Ingresar pc--");
                }
                break;
                
                default:{
                    System.out.println("Incorrecto");
                }break;
            }
        } while (opcion != 0);
    }

}
