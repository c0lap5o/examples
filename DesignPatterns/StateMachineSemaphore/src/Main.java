
import io.bootcamp.vimtages.context.Car;
import io.bootcamp.vimtages.context.TrafficLight;
//https://www.geeksforgeeks.org/state-design-pattern/
public class Main {
    /**
     * State Machine DP Example
     * @param args does nothing
     * @throws InterruptedException gets interrupted if cpu gets tired
     */
    public static void main(String[] args) throws InterruptedException {

        start();

    }

    /**
     * Start the state machine example
     * @throws InterruptedException your pc might get tired running this for too long
     */
    private static void start() throws InterruptedException {
       //Traffic Light state machine
        TrafficLight trafficLight = new TrafficLight();
        //Create car
        Car car = new Car();
        trafficLight.setCar(car);
        int n = 0;
        //Generates a random number of times the traffic light is set
        while (true) {

            n = (int) Math.ceil(Math.random()*5);
            for (int i = 0; i < n; i++) {
                trafficLight.switchLight();
                Thread.sleep(2000);


            }
            //Shows the car state
            car.move();
        }
    }
}