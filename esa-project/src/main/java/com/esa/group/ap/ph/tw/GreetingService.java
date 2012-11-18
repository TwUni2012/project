/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esa.group.ap.ph.tw;

import javax.ejb.Stateless;

/**
 *
 * @author tiloW7-2012
 */
@Stateless
public class GreetingService {
    
    public String greet(String name) {
        if (name != null && !name.trim().isEmpty()) {
            return "From GreetingService: \nHallo " + name + "!";
        } else {
            return "From GreetingService: \n Sie haben vergessen Ihren Namen einzugeben!";
        }
    }
}
