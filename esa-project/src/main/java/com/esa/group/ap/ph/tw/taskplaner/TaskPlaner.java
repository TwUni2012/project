/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esa.group.ap.ph.tw.taskplaner;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.ejb.Stateful;
import javax.ejb.Stateless;
import javax.faces.bean.ManagedBean;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.NotSupportedException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.UserTransaction;

/**
 *
 * @author Vylyb
 */
@Stateful
@ManagedBean(name="taskPlaner")
public class TaskPlaner extends TaskInterface<Task> implements TaskLocalInterface {
    @PersistenceContext(unitName = "com.mycompany_mavenproject1_war_1.0-SNAPSHOTPU")
    private EntityManager manager;
    
    @Resource
    UserTransaction ut;

    @Override
    protected EntityManager getEntityManager() {
        return manager;
    }

    public TaskPlaner() {
        super(Task.class);
    }
    
    private String text="",username;

    public String getText() {
        return text;
    }
    
    private String taskYear="",taskMonth="",taskDay="";

    public String getTaskDay() {
        return taskDay;
    }

    public void setTaskDay(String taskDay) {
        this.taskDay = taskDay;
    }

    public String getTaskMonth() {
        return taskMonth;
    }

    public void setTaskMonth(String taskMonth) {
        this.taskMonth = taskMonth;
    }

    public String getTaskYear() {
        return taskYear;
    }

    public void setTaskYear(String taskYear) {
        this.taskYear = taskYear;
    }
    
    public void setText(String text) {
        this.text = text;
    }
    
    public Task createNewTask()
    {
        Task t;
        try{
            t=new Task(
                Integer.parseInt(taskYear), 
                Integer.parseInt(taskMonth), 
                Integer.parseInt(taskDay), 
                text, 
                username);
        } catch(Exception e) {
            t=null;
        }
        
        taskDay="";
        taskMonth="";
        taskYear="";
        text="";
        
        manager.persist(t);
        
        return t;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    public String listAll()
    {
        String tasks="";
        
        try{
            for(Task t:findAll())
            {
                if(t.getUsername().equals(username))
                {
                    tasks+=t+"<br>";
                }
            }
        } catch(Exception e) {
            return e.getMessage();
        }
        
        return tasks;
    }
    
}
