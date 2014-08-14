/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.saifiahmada.entity;

import java.util.Date;



/**
 *
 * @author saifi
 */
public class Tes {
    
    private String id;
    
    private Date tgl;

    public Tes() {
    
    }
    
    public Tes(String id) {
        this.id = id;
    }

    public Tes(String id, Date tgl) {
        this.id = id;
        this.tgl = tgl;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getTgl() {
        return tgl;
    }

    public void setTgl(Date tgl) {
        this.tgl = tgl;
    }
    
    
    
    
}
