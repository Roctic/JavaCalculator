package com.mycompany.hello;

/**
 *
 * @author Roctic
 */
public class Calculadora {
    private int value1;
    private int value2;

    public Calculadora(int value1, int value2) {
        this.value1 = value1;
        this.value2 = value2;
    }
    
    public int somar(){
        int soma = getValue1() + getValue2();
        return soma;   
    }
    
    public int sub(){
        int subtract = getValue1() - getValue2();
        return subtract;
        
    }
    
    public int multi(){
        int multiplic = getValue1() * getValue2();
        return multiplic;
    }
    
    public int dividir(){
        int split = getValue1() / getValue2();
        return split;
    }

    public int getValue1() {
        return value1;
    }

    public void setValue1(int value1) {
        this.value1 = value1;
    }

    public int getValue2() {
        return value2;
    }

    public void setValue2(int value2) {
        this.value2 = value2;
    }
    
    
    
    
}
