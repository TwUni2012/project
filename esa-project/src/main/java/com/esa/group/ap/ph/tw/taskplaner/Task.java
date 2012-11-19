/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esa.group.ap.ph.tw.taskplaner;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Vylyb
 */
@Entity
public class Task implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    //daten des tasks
    private int taskYear,taskMonth,taskDay;
    private String text,username;

    public Task() {
    }

    public String getUsername() {
        return username;
    }
    
    public int getTaskDay() {
        return taskDay;
    }

    public int getTaskMonth() {
        return taskMonth;
    }

    public int getTaskYear() {
        return taskYear;
    }

    public String getText() {
        return text;
    }

    public void setTaskDay(int taskDay) {
        this.taskDay = taskDay;
    }

    public void setTaskMonth(int taskMonth) {
        this.taskMonth = taskMonth;
    }

    public void setTaskYear(int taskYear) {
        this.taskYear = taskYear;
    }

    public void setText(String text) {
        this.text = text;
    }
    
    public Task(int year, int month, int day, String text,String username) {
        this.taskYear = year;
        this.taskMonth = month;
        this.taskDay = day;
        this.text = text;
        this.username=username;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Task)) {
            return false;
        }
        Task other = (Task) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return taskYear+"-"+taskMonth+"-"+taskDay+": "+text;
    }
    
}
