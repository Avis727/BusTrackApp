package bustracker;
import javax.swing.*;
import java.util.*;

import java.util.ArrayList;
import javax.swing.AbstractListModel;

public class StopListModel extends AbstractListModel<BusStop>{
    private ArrayList<BusStop> stopList;

    public StopListModel(){
        this.stopList = new ArrayList<BusStop>();
    }

    @Override
    public int getSize(){return stopList.size();}

    @Override
    public BusStop getElementAt(int index){return stopList.get(index);}
    
    public void addElement(BusStop element){
        if(findStopByName(element.getName()) == -1){
            stopList.add(element);
            fireIntervalAdded(this, getSize()-1, getSize()-1);
        } 
        
    }
    
    public void removeElementAt(int index){
        stopList.remove(index);
        fireIntervalRemoved(this, index, index);
    }

    public int findStopByName(String name){
        int targetStopIndex = -1;
        for(BusStop bustop : stopList){
            if(bustop.getName().toLowerCase().equalsIgnoreCase(name)){
                targetStopIndex = stopList.indexOf(bustop);
                break;
            } 
        }
        return targetStopIndex;

    }
}




