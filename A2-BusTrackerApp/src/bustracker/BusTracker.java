package bustracker;
import java.util.*;

public class BusTracker extends Observable{
    private Bus bus;
    
    public BusTracker(Bus bus){
        this.bus = bus;
    }

    public Bus getBus(){return bus;}

    public void notifyArrival(RouteComponent stop, int etaMinutes){
        String message = "%s arriving at %s in %d mins".formatted(getBus().getBusNumber(), stop.toString(), etaMinutes);
        setChanged();
        notifyObservers(message);
    }
}
