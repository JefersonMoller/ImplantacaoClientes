/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.GroupLayout;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author j
 */
public class CargaIniModel extends AbstractTableModel{
    
    private List<CargaInicial> d = new ArrayList<>();
    
    private String[] colunas = {"Descrição","Observação"};

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }
    
    
    

    @Override
    public int getRowCount() {
        return d.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linhas, int colunas) {
        
        switch(colunas){
            case 0:
                return d.get(linhas).getDescricao();
            case 1:
                return d.get(linhas).getObservacao();
        }
        return null;
        
        
        
        
    }
    
    public void addRows(CargaInicial ca){
        this.d.add(ca);
        this.fireTableDataChanged();
    }
    
   
}
