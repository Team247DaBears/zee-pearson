package frc.robot;
//import edu.wpi.first.wpilibj.DoubleSolenoid;
import frc.robot.DriverStation;
import frc.robot.Devices;
public class  Drive
{


    
    public void drive()
      {
          

          double leftSideMotorSpeed= DriverStation.getLeftSpeed();
          double rightSideMotorSpeed=DriverStation.getRightSpeed();

         Devices.backLeft.set(leftSideMotorSpeed);
         Devices.frontLeft.set(leftSideMotorSpeed);
         Devices.frontRight.set(rightSideMotorSpeed);
          Devices.backRight.set(rightSideMotorSpeed); 
      }
    
    }
