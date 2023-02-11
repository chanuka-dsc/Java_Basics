package minutes;

public class MotorBike {
  private int speed;


  public MotorBike () {}

  public MotorBike (int s){
    setSpeed(s);
    
  }

  public void start(){
    System.out.println("Bike started");
  }

  public void stop() {
    System.out.println("Bike stopped");
  }

  public void setSpeed(int s){
    if (s > 0){
      speed = s;
    }

    
    
  }

  public int getSpeed(){
    return speed;
  }

  public void increaseSpeed(){
    setSpeed(speed + 100);
  }

  public void decreaseSpeed(){
    if(speed -100 > 0)
      setSpeed(speed - 100);
    else{
      stop();
    }
  }
}
