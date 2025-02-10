/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labpractice1;

import java.util.ArrayList;
import java.util.Scanner;
public class LabPractice1 {

    
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int opcion1, opcion2, opcion3, columna, opcion_4 = 0;
        String palabraString, palabraNueva2, palabraNueva3, palabraNueva;
        ArrayList<String> listaPalabras = new ArrayList<>();
        do{
            System.out.println("Bienvenido, Juega y crea tu propia sopa de letras");
            System.out.println("1) Nueva partida");
            System.out.println("2) Historial de partidas");
            System.out.println("3) Mostrar puntuaciones mas altas");
            System.out.println("4) Informacion del estudiante");
            System.out.println("5) Salir");
            opcion1 = sc.nextInt();
             
            switch(opcion1){
                case 1:
                    do {
                        System.out.println("Ingrese a donde quiere ir");
                        System.out.println("1) Menú palabras");
                        System.out.println("2) Jugar");
                        System.out.println("3) Terminar partida");
                        System.out.println("4) Salir");
                        opcion2 = sc.nextInt();
                        sc.nextLine();
                        switch (opcion2) {
                            case 1:
                            do{ 
                                System.out.println("Bienvenido al menú de palabras");
                                System.out.println("1) Insertar palabra");
                                System.out.println("2) Modificar palabra");
                                System.out.println("3) Eliminar palabra");
                                System.out.println("4) Volver a menú principal");
                                opcion3 = sc.nextInt();
                                sc.nextLine();
                                switch (opcion3) {
                                    case 1:
                                        System.out.println("Ingrese el numero de palabras deseadas.");
                                        int palabras = sc.nextInt();
                                        sc.nextLine();
                                        System.out.println("Ingrese palabras de 5 a 10 caracteres");
                                        for(int i = 1; i <= palabras; i++ ){
                                            do {
                                                System.out.print("Palabra " + i + ": ");
                                                palabraString = sc.nextLine();
                                                int longitud = palabraString.length();
                                                if(longitud < 5 || longitud > 10){
                                                    System.out.println("Error, debe ingresar una palabra de 5 a 10 caracteres");
                                                
                                                }
                                            } while (palabraString.length() < 5 || palabraString.length() > 10);
                                            listaPalabras.add(palabraString);
                                        }
                                        break;
                                    case 2:
                                        System.out.println("\nListado de palabras:");
                                        for (String palabra : listaPalabras) {
                                            System.out.println("- " + palabra);
                                        }
                                        
                                        System.out.println("Ingrese que palabra desea modificar");
                                        palabraNueva = sc.nextLine();
                                            if(listaPalabras.contains(palabraNueva)){
                                                do {
                                                    System.out.println("Ingrese la nueva palabra");
                                                    palabraNueva2 = sc.nextLine();
                                                    int longitud = palabraNueva2.length();
                                                    if(longitud < 5 || longitud > 10){
                                                        System.out.println("Error, debe ingresar una palabra de 5 a 10 caracteres");
                                                    }
                                                }while (palabraNueva2.length() < 5 || palabraNueva2.length() > 10);
                                                int index = listaPalabras.indexOf(palabraNueva);
                                                listaPalabras.set(index, palabraNueva2);
                                            } 
                                        break;
                                    case 3:
                                        System.out.println("\nListado de palabras:");
                                        for (String palabra : listaPalabras) {
                                            System.out.println("- " + palabra);
                                        }
                                        System.out.println("Ingrese la palabra que desea eliminar");
                                        palabraNueva3 = sc.nextLine();
                                        if(listaPalabras.contains(palabraNueva3)){
                                            listaPalabras.remove(palabraNueva3);
                                        }else{
                                            System.out.println("Esa palabra no existe, eliga otra");
                                        }
                                        System.out.println("\nListado de palabras:");
                                        for (String palabra : listaPalabras) {
                                            System.out.println("- " + palabra);
                                        }

                                        break;
                                    case 4:
                                        System.out.println("Volviendo al menú principal");
                                        break;
                                    default:
                                }
                              }while(opcion3 != 4);
                               break;
                        case 2:
                            // Generar la sopa de letras una sola vez
                                char[][] tablero = new char[15][15];
                                for (int fila = 0; fila < 15; fila++) {
                                    for (int colum = 0; colum < 15; colum++) {
                                        tablero[fila][colum] = (char) (Math.random() * 26 + 65);
                                    }
                                }
                                
                                // Mostrar la sopa de letras y mantenerla en pantalla
                                System.out.println("\nSopa de letras:");
                                for (int fila = 0; fila < 15; fila++) {
                                    for (int colum = 0; colum < 15; colum++) {
                                        System.out.print(tablero[fila][colum] + "|");
                                    }
                                    System.out.println("");
                                }
                                System.out.println("******************************");
                                
                                //hasta que el usuario decida salir
                                System.out.println("volver al menú principal...");
                                sc.nextLine();
                                break;
                        case 3:
                            break;
                        case 4:
                            System.out.println("Volviendo al menu principal");
                            break;
                        default:
                            break;
                        }
                    } while (opcion2 != 4);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("Hasta pronto");
                    break;
                default:
                    System.out.println("Porfavor ingrese una opcion valida.");
                    
            }
        }while(opcion1 != 5);
    }
}