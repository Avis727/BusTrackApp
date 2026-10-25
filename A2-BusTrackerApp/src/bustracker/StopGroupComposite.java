package bustracker;
import java.util.*;

public class StopGroupComposite extends RouteComponent{
    protected ArrayList<RouteComponent> children;

    public StopGroupComposite(String name, int dwellMinutes){
        super(name, dwellMinutes);
        children = new ArrayList<RouteComponent>();
    }

    public void add(RouteComponent c){children.add(c);}

    public void remove(RouteComponent c){children.remove(c);}

    @Override
    public int getTotalDwellMinutes(){
        int totalDwellMinutes = dwellMinutes;
        for(RouteComponent child : children){
            totalDwellMinutes += child.getTotalDwellMinutes();
        }
        return totalDwellMinutes;
    }

    @Override
    public String toString() {
        return String.format("%s(%dmin) %s", name, dwellMinutes, children);
    }

}
