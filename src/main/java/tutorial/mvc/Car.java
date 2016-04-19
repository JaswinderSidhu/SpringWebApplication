package tutorial.mvc;

/**
 * Created by jsidhu on 18/04/16.
 */
public class Car {
    private Engine engine;
    private String warningMessage;
    public Car(Engine engine){
        this.engine=engine;
    }
    public void accelrator(){
        engine.increaseRpm();
        if(engine.getRpm()>5000){
            warningMessage="Slow Down!";
        }
    }

    public String getWarningMessage() {
        return warningMessage;
    }

    public void setWarningMessage(String warningMessage) {
        this.warningMessage = warningMessage;
    }
}
