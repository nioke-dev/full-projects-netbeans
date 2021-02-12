/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TableModel;

import Domain.Domain;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Acer Pc
 */
public class TableModel extends AbstractTableModel{
 List<Domain> listOfDomain=new ArrayList<Domain>();
    
    private final String[] header={"Judul","Nama Gambar"};
    
    public TableModel(List<Domain> listOfDomain){
        this.listOfDomain=listOfDomain;
    }
    
    public void save(Domain domain){
        listOfDomain.add(domain);
        
        fireTableRowsInserted(getRowCount()-1, getRowCount()-1);
    }
    
    public Domain findOne(int index){
        return listOfDomain.get(index);
    }

    public int getRowCount() {
        return listOfDomain.size();
    }

    public int getColumnCount() {
        return header.length;
    }
    
    public String getColumnName(int column){
        return header[column];
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        Domain domain=listOfDomain.get(rowIndex);
        
        switch(columnIndex){
            case 0:return domain.getTitle();
            case 1:return domain.getImage();
            default:return null;
        }
    }
     
}
