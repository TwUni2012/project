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
    
    @EJB
    GreetingService greetService;
    
    
}
