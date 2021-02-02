package frc.robot;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Victor;


public class Devices {

    private static final int GEARFORWARD = 1;
  private static final int GEARREVERSE = 0;
  
  private final int FRONTLEFTPWM = 1;
    private final int FRONTRIGHTPWM=2;
    private final int BACKLEFTPWM=0;
    private final int BACKRIGHTPWM=3;
    private final int LEFTROLLER=4;
    private final int RIGHTROLLER=5;


    public static SpeedController frontLeft;
    public static SpeedController frontRight;
    public static SpeedController backLeft;
    public static SpeedController backRight;
    public static DoubleSolenoid gearShift;
 
    //So, I'll add another set of controls, and you can comment out whichever is unused.
    public static SpeedController leftRollerMotor;
    public static SpeedController rightRollerMotor;



    public void Init()
    {
      System.out.println("Devices");
        leftRollerMotor=new Victor(LEFTROLLER);
        rightRollerMotor=new Victor(RIGHTROLLER);
        frontLeft=new Victor(FRONTLEFTPWM);
       
        frontRight=new Victor(FRONTRIGHTPWM);
        backLeft=new Victor(BACKLEFTPWM);
       
        backRight=new Victor(BACKRIGHTPWM);

        frontRight.setInverted(true);
        backRight.setInverted(true);
      
         gearShift = new DoubleSolenoid(GEARFORWARD, GEARREVERSE);
    }
}


