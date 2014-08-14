/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saifiahmada.koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author saifi
 */
public class Koneksi {

    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String USER = "root";
    private static final String PASS = "ahmids";
    private static final String URL = "jdbc:mysql://localhost:3306/db_face";

    public static void main(String[] args) {
        Connection con = null;
        Koneksi kon = new Koneksi();
        con = kon.getKoneksi();
        if (con == null) {
            System.out.println("Koneksi NULL");
        } else {
            System.out.println("Koneksi Sukses");
        }
    }

    public Connection getKoneksi() {
        Connection con = null;
        try {
            Class.forName(DRIVER);
            try {
                con = DriverManager.getConnection(URL, USER, PASS);

            } catch (SQLException ex) {
                Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }

}
