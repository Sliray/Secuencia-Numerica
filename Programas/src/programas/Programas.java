/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programas;

import java.util.Scanner;

/**
 *
 * @author shelb
 */
public class Programas {

    private static boolean isNumeric(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SecuenciaNumerica sn = new SecuenciaNumerica();
        String seleccion;
        do {
            System.out.println("***************************");
            System.out.println("¡Bienvenid@!, ¿qué es lo que desea hacer?");
            System.out.println("1.- Secuencia de Fibonacci");
            System.out.println("2.- Sucesión de Padovan");
            System.out.println("3.- Triángulo de Pascal");
            System.out.println("4.- Salir");
            System.out.println("***************************");
            seleccion = sc.nextLine();

            if (isNumeric(seleccion)) {
                if(seleccion.equals("4")){
                    break;
                }else{
                switch (seleccion) {
                    case "1":
                        System.out.println("Ha seleccionado secuencia de Fibonacci, por favor introduzca el límite");
                        String limite = sc.nextLine();
                        System.out.println("La secuencia de Fibonacci es:");
                        if (isNumeric(limite)) {
                            sn.Fibonacci(Integer.parseInt(limite));
                        } else {
                            System.err.println("Error de formato, solo se permiten números enteros");
                            System.err.println("Lo que introdujo: " + limite);
                        }
                        break;

                    case "2":
                        System.out.println("Ha seleccionado sucesión de Padovan, por favor introduzca el límite");
                        String lim = sc.nextLine();
                        System.out.println("Sucesión de Padovan es:");
                        
                        if (isNumeric(lim)) {
                            sn.Padovan(Integer.parseInt(lim));
                        } else {
                            System.err.println("Error de formato, solo se permiten números enteros");
                            System.err.println("Lo que introdujo: " + lim);
                        }
                        break;

                    case "3":
                        System.out.println("Ha seleccionado sucesión de Padovan, por favor introduzca el límite");
                        String l = sc.nextLine();
                        
                        
                        if (isNumeric(l)) {
                            if (Integer.parseInt(l) <= 150) {
                                System.out.println("Triangulo de Pascal es:");
                            sn.TrianguloPascal( Integer.parseInt(l));
                            } else {
            System.out.println("Error a excedido el limite");
        }
                        } else {
                            System.err.println("Error de formato, solo se permiten números enteros");
                            System.err.println("Lo que introdujo: " + l);
                        }
                        break;
                   
                        
                default:
                        System.out.println("Ha seleccionado una opcion no válida");
                }
                }
            } else {

                System.err.println("Error de formato, no ha introducido un número");
            }
            

            }while (seleccion != "4");
            
           System.err.println("Saliste del programa, vuelva pronto :)");

        }

    }
