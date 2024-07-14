package com.nit.main;

import com.nit.service.Arithmetic;

/**
 * Hello world!
 *
 */
public class ApplicationRun 
{
    public static void main( String[] args )
    {
        Arithmetic ar=new Arithmetic();
        System.out.println(ar.sum(10,20));
        
    }
}
