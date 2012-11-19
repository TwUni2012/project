/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esa.group.ap.ph.tw;

import javax.ejb.Stateless;

/**
 *
 * @author tilo
 */
@Stateless
public class CalcImple implements Calc{

    @Override
    public int add(int zahl1, int zahl2) {
        return zahl1 + zahl2;
    }

    @Override
    public int sub(int zahl1, int zahl2) {
        return zahl1 - zahl2;
    }

    @Override
    public int mul(int zahl1, int zahl2) {
        return zahl1 * zahl2;
    }

    @Override
    public int div(int zahl1, int zahl2) {
        if(zahl2 == 0) {
//            throw new IllegalArgumentException("dividieren durch 0 nicht möglich");
            return 0;
        }
        return zahl1/zahl2;
    }
    
}
