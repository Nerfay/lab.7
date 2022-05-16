package com.company;

public class Drob {
    private int numerator;
    private int denominator;
    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public Drob(int numerator, int denominator) {
        this.setNumerator(numerator);
        this.setDenominator(denominator);
    }

    public Drob reduction(){
        int limit = Math.min(this.numerator, this.denominator);
        for (int i = limit; i >= 2; i--) {
            if (this.numerator % i == 0 && this.denominator % i == 0) {
                return new Drob(this.numerator/i,this.denominator/i);
            }
        }
        return new Drob(this.numerator,this.denominator);
    }

    @Override
    public String toString() {
        return
                this.getNumerator() +
                        "\n" + "---" + " \n"+
                        this.getDenominator();
    }

    public Drob plus(Drob second){
        similar(second);
        return new Drob((this.getNumerator() + second.getNumerator()), this.denominator);
    }

    private void similar(Drob second) {
        if (this.getDenominator() != second.getDenominator()) {
            Drob temp = new Drob(this.getNumerator(), this.getDenominator());
            this.setNumerator(this.getNumerator() * second.getDenominator());
            this.setDenominator(this.getDenominator() * second.getDenominator());
            second.setNumerator(second.getNumerator() * temp.getDenominator());
            second.setDenominator(second.getDenominator() * temp.getDenominator());
        }
    }

    public Drob minus(Drob second){
        similar(second);
        return new Drob((this.getNumerator() - second.getNumerator()), this.denominator);
    }
    public Drob multiplication(Drob second){
        return new Drob(this.getNumerator() * second.getNumerator(), this.getDenominator() * second.getDenominator());
    }
    public Drob division(Drob second){
        return new Drob(this.getNumerator() * second.getDenominator(), this.getDenominator() * second.getNumerator());
    }

}

