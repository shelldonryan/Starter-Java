package br.com.cz.examTest.Model;

import br.com.cz.examTest.Interface.OperacaoMatematica;

public class Division implements OperacaoMatematica{
    public double calcular(double a, double b) {
        return a / b;
    }   
}
