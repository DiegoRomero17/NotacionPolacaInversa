/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package notacionpolacainversa;

import java.util.Scanner;

public class NotacionPolacaInversa {
    public static void main(String[] args) {
        Pila math = new Pila();
        String op;
        int x;

        Scanner input = new Scanner(System.in);

        System.out.println("Calculadora de Notación Polaca Inversa\nOperaciones: + - * /\nMostrar último elemento: .\nVacío: !\nSalida: q\nIngrese dos números en el formato a b operación, seguido de la tecla enter\nEjemplo: 2 3 + salida: 5");

        do {
            System.out.print(": ");
            op = input.next();

            switch (op) {
                case "+":
                    if (math.top < 1) {
                        if (math.top == -1) {
                            System.out.println("\nPila vacía.\n");
                        } else {
                            System.out.println("\nEscriba al menos dos caracteres.\n");
                        }
                    } else {
                        math.add();
                        System.out.printf("%d\n", math.top());
                    }
                    break;

                case "-":
                    if (math.top < 1) {
                        if (math.top == -1) {
                            System.out.println("\nPila vacía.\n");
                        } else {
                            System.out.println("\nEscriba al menos dos caracteres.\n");
                        }
                    } else {
                        math.sub();
                        System.out.printf("%d\n", math.top());
                    }
                    break;

                case "*":
                    if (math.top < 1) {
                        if (math.top == -1) {
                            System.out.println("\nPila vacía.\n");
                        } else {
                            System.out.println("\nEscriba al menos dos caracteres.\n");
                        }
                    } else {
                        math.mul();
                        System.out.printf("%d\n", math.top());
                    }
                    break;

                case "/":
                    if (math.top < 1) {
                        if (math.top == -1) {
                            System.out.println("\nPila vacía.\n");
                        } else {
                            System.out.println("\nEscriba al menos dos caracteres.\n");
                        }
                    } else {
                        math.div();
                        System.out.printf("%d\n", math.top());
                    }
                    break;

                case "!":
                    math.empty();
                    System.out.println("\nLa pila se encuentra vacía.\n");
                    break;

                case ".":
                    if (math.top == -1) {
                        System.out.println("\nLa pila se encuentra vacía.\n");
                    } else {
                        System.out.println(math.top);
                    }
                    break;

                default:
                    x = Integer.parseInt(op);
                    math.push(x);
                    System.out.printf("%d\n", math.top());
            }
        }
        while (op.compareTo("q") != 0);
    }
}