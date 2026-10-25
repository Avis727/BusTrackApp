package bustracker;

import java.util.Observable;
import java.util.Observer;

@SuppressWarnings("deprecation")
class Passenger implements Observer {
    private String name;

    public Passenger(String name) { this.name = name; }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(name + " received update: " + arg);
    }
}