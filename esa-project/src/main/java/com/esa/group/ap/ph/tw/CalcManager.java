/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esa.group.ap.ph.tw;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author tilo
 */
@ManagedBean
public class CalcManager {

    private int zahl1;
    private int zahl2;
    
    @EJB
    private Calc calc;

    public int add() {
        return calc.add(zahl1, zahl2);
    }

    public int sub() {
        return calc.sub(zahl1, zahl2);
    }

    public int mul() {
        return calc.mul(zahl1, zahl2);
    }

    public int div() {
        return calc.div(zahl1, zahl2);
    }
    public int div2() {
        return div();
    }

    public int getZahl1() {
        return zahl1;
    }

    public void setZahl1(int zahl1) {
        this.zahl1 = zahl1;
    }

    public int getZahl2() {
        return zahl2;
    }

    public void setZahl2(int zahl2) {
        this.zahl2 = zahl2;
    }
}
