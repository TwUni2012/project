/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esa.group.ap.ph.tw;

/**
 *
 * @author tiloW7-2012
 */
public class GreetingService {
    
    public String greet(String name) {
        if (name != null && !name.trim().isEmpty()) {
            return "Hallo " + name + "!";
        } else {
            return "Hallo Welt";
        }
    }
}
