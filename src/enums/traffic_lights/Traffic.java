package enums.traffic_lights;

public class Traffic {
    private Light state;
    public void changeState(){
        if (state == Light.RED){
            state = Light.GREEN;
        } else if(state == Light.GREEN){
            state = Light.YELLOW;
        } else {
            state = Light.RED;
        }
    }
    
    
}
