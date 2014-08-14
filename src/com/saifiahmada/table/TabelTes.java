/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.saifiahmada.table;

import com.saifiahmada.entity.Tes;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author saifi
 */
public class TabelTes extends AbstractTableModel {
    
    private String [] kolom = {"ID" ,"TGL"};
    
    private List<Tes> list;

    public TabelTes() {
    }
    
    public TabelTes(List<Tes> list) {
        this.list = list;
    }
    
    

    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return kolom.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Tes tes = list.get(rowIndex);
        switch (columnIndex) {
            case 0 : return tes.getId();
            case 1 : return tes.getTgl();
            default: return null;
        }
    }
    
}
