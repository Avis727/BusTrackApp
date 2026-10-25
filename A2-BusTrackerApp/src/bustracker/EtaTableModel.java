package bustracker;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;
//Table model for JTable needed to store ETA
public class EtaTableModel extends AbstractTableModel {
	private List<Bus> data = new ArrayList<>();
    private List<String> etaMessages = new ArrayList<>();
    private final String[] columnNames = {"Bus Number", "ETA Message"};    

    public void addEtaMessage(String msg) {
        //Add to list
    	//fire event
    }
    
    public void addBus(Bus bus) {
    	//Add to list
    	//fire event
    }

    @Override
    public int getRowCount() {
        //return count
    }

    @Override
    public int getColumnCount() {
        //return count
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        //arrange values for bus number and eta message
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }
    
    public Bus getBusAt(int row) {
        //return bust at a specific row index
    }
}
