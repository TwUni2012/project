/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esa.group.ap.ph.tw;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author tiloW7-2012
 */
@ManagedBean
public class GreetingManager {
    
    private String name;
    
    @EJB
    GreetingService greetService;
    
    public String getGreeting() {
        return greetService.greet(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
