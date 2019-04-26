/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notacionpolacainversa;


public class Pila { // Last In First Out

    public int top = -1;
    private int max = 100;
    private int numbers[] = new int[max];

    public boolean push(int num) {
        if (top + 1 == max) {
            return false;
        } else {
            numbers[++top] = num;
            return true;
        }
    }

    public Object pop() throws Exception {

        if (top < 0) {
            throw new Exception("Negative Top");
        }
        return numbers[top--];
    }

    public Object top() {
        return numbers[top];
    }

    public void empty() {
        top = -1;
    }

    public void add() {
        numbers[top - 1] = numbers[top] + numbers[top - 1];
        top--;
    }

    public void sub() {
        numbers[top - 1] = numbers[top] - numbers[top - 1];
        top--;
    }

    public void mul() {
        numbers[top - 1] = numbers[top] * numbers[top - 1];
        top--;
    }

    public void div() {
        if (numbers[top - 1] == 0) {
            System.out.println("\nNo se puede dividir por cero!\n");
        } else {
            numbers[top - 1] = numbers[top] / numbers[top - 1];
            top--;
        }
    }
}
