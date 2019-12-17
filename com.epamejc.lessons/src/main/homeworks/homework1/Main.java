
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private final static String hint ="Enter time in minutes.If you want to exit ENTER stop!";
    private final static String stop = "stop";
    private final static String description = "The trafficlights color is: ";
    private final static String inccrrectInput = "incorrect input";

    private BufferedReader reader;
    private String UserRequest;
    private TrafficLight trafficLight;

    private double time;

    public static void main(String[] args) {
        new Main().work();
    }
    public void work(){
       reader = new BufferedReader(new InputStreamReader(System.in));
       trafficLight = new TrafficLight();
        System.out.println(hint);
        try {
            while (!(UserRequest=reader.readLine()).equals(stop)){
                if (!UserRequest.equals("") && parse(UserRequest)) {
                    trafficLight.setColor(time);
                    System.out.println(description + trafficLight.getColor()+"\n"+hint);
                } else printIfEx();
            }
            reader.close();
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }
    private boolean parse(String request){
        try {
            String temp = request.replaceAll(",",".");
            time = Double.parseDouble(temp);
            return true;
        }catch (Exception ex){
            return false;
        }
    }
    private void printIfEx(){
        System.out.println(inccrrectInput+"\n"+hint);
    }

}