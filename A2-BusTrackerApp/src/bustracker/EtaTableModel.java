package bustracker;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

//Table model for JTable needed to store ETA
public class EtaTableModel extends AbstractTableModel {
	private List<Bus> buses = new ArrayList<>();
    private List<String> etaMessages = new ArrayList<>();
    private final String[] columnNames = {"Bus Number", "ETA Message"};    

    public void addEtaMessage(String msg) {
        etaMessages.add(msg);
    	fireTableRowsInserted(etaMessages.size()-1, etaMessages.size()-1);
    }

    
    public void addBus(Bus bus) {
        buses.add(bus);
    	fireTableRowsInserted(buses.size()-1, buses.size()-1);
    }

    @Override
    public int getRowCount() {
        return buses.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if(columnIndex == 0){
            return getBusAt(rowIndex).getBusNumber();
        }else if(columnIndex == 1){
            return etaMessages.get(rowIndex);
        }else{
            return new Exception("invalid row index");
        }
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }
    
    public Bus getBusAt(int row) {
        return buses.get(row);
    }
}
