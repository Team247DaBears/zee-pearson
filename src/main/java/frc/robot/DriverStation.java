package frc.robot;

import edu.wpi.first.wpilibj.Joystick;



public class DriverStation {

    private static final int LEFTPORT=0;
    private static final int RIGHTPORT=1;
    private static final int OPERATORPORT=2;

    private static final int Y_AXIS=1;
    private static final int X_AXIS=0;

    private static  Joystick leftStick;
    private static  Joystick rightStick;
    private static Joystick operatorStick;  //Joystick or controller for operator (Driver 2)
  private static final int JSB_ROLLERSFORWARD=0;
    private static final int JSB_ROLLERSREVERSE=1;
    private static final int AXIS_CLAWOPENCLOSE=2;


    private static final int JSB_GEARSHIFT=1;





    //Buttons for operator (driver 2)  probably a game controller.




    public void Init()
    {
       // System.out.println("Joystick");
        leftStick=new Joystick(LEFTPORT);
        rightStick=new Joystick(RIGHTPORT);
        operatorStick=new Joystick(OPERATORPORT);
           }

    public static double  getLeftSpeed()
    {
        return -1*leftStick.getRawAxis(Y_AXIS);
    }

    public static double getRightSpeed()
    {
        return -1*rightStick.getRawAxis(Y_AXIS); 
    }


public static boolean getGearButton()
    {
         
		return rightStick.getRawButton(JSB_GEARSHIFT);
    }

    public static boolean getClawButton()
    {
         if (operatorStick.getRawAxis(AXIS_CLAWOPENCLOSE)>0.5) return true;
        else return false;
    }

    public static boolean rollersForward()
    {
        return operatorStick.getRawButton(JSB_ROLLERSFORWARD);
    }

    public static boolean rollersReverse()
    {
        return operatorStick.getRawButton(JSB_ROLLERSREVERSE);
    }
}

  


