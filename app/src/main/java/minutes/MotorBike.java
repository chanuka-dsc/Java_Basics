package minutes;

public class MotorBike {
  private int speed;



  public void start(){
    System.out.println("Bike started");
  }

  public void stop() {
    System.out.println("Bike stopped");
  }

  public void setSpeed(int s){
    speed = s;
  }

  public int getSpeed(){
    return speed;
  }
}
