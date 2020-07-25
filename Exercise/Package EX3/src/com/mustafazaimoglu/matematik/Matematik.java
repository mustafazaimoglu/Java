
package com.mustafazaimoglu.matematik;

public class Matematik implements IMatematik
{

    //properties > packaging > ilk 3'ü tikle!
    //Clean and build yapmazsan jar dosyasi olusmaz!!!
    
    
    @Override
    public void toplama(int a, int b)
    {
        System.out.println("Toplama Sonucu : " + (a + b));
    }

    @Override
    public void carpma(int a, int b)
    {
        System.out.println("Carpma Sonucu : " + (a * b));
    }

    @Override
    public void cikarma(int a, int b)
    {
        System.out.println("Cikarma Sonucu : " + (a - b));
    }

    @Override
    public void bolme(int a, int b)
    {
        System.out.println("Bolme Sonucu : " + ((double)a / b));
    }
    
}
