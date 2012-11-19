/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esa.group.ap.ph.tw.taskplaner;

import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Vylyb
 */
@Local
public interface TaskLocalInterface {

    void create(Task task);

    void edit(Task task);

    void remove(Task task);

    Task find(Object id);

    List<Task> findAll();

    List<Task> findRange(int[] range);

    int count();
    
}
