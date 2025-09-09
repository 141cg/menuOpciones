package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //programa para crear un ciclo
        // crear un menu de opciones
        Integer opcionSeleccionada=0;
        while (opcionSeleccionada!=5) {
            System.out.println("menu de opciones");
            System.out.println("****************");
            System.out.println("➕digita 1 para sumar");
            System.out.println("➖digita 2 para restar");
            System.out.println("✖digita 3 para multiplicar");
            System.out.println("➗digita 4 para dividir");
            System.out.println("➡digita 5 para SALIR DEL PROGRAMA");
            Scanner leerTeclado=new Scanner(System.in);
            System.out.println("digita una opcion🧡");
            opcionSeleccionada=leerTeclado.nextInt();
            
        }

    }
}