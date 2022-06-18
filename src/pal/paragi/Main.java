package pal.paragi;

public class Main {
    public static void main(String[] args) {
        ComplexNumber complexNumber = new ComplexNumber(3,2);
        complexNumber.add(1,2);
        System.out.println("complexnumber + real = " + complexNumber.getReal());
        System.out.println("imaginary = " + complexNumber.getImaginary());
    }




}
