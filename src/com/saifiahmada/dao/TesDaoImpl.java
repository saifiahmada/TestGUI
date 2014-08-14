/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.saifiahmada.dao;

import com.saifiahmada.entity.Tes;
import com.saifiahmada.koneksi.Koneksi;
import java.util.List;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author saifi
 */
public class TesDaoImpl implements TesDao {
    
    private Koneksi koneksi;
    private Connection con = null;

    @Override
    public void simpan(Tes tes) {
        koneksi = new Koneksi();
        con = koneksi.getKoneksi();
        String sql = "INSERT INTO TES (ID, TGL) VALUES (?,?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, tes.getId());
            ps.setDate(2,  new java.sql.Date(tes.getTgl().getTime()));
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(TesDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @Override
    public List<Tes> findAll() {
        
        List<Tes> list = new ArrayList<Tes>();
        
        koneksi = new Koneksi();
        con = koneksi.getKoneksi();
        
        String sql = "SELECT * FROM TES";
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                Tes tes = new Tes();
                String id = rs.getString(1);
                Date tgl = rs.getDate(2);
                tes.setId(id);
                tes.setTgl(tgl);
                list.add(tes);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(TesDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return list;
        
    }
    
}
