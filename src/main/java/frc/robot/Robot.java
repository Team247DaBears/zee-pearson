/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the TimedRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the build.gradle file in the
 * project.

  /**
   * This function is run when the robot is first started up and should be used
   * for any initialization code.
   */
  public class Robot extends TimedRobot {
 
    Drive drive;
    Devices devices;
    
    DriverStation driverstation;

  
  
  @Override
  public void robotInit() {
         devices=new Devices();
         
 devices.Init();
      driverstation=new DriverStation();
    driverstation.Init();
 drive=new Drive();
       drive.drive();
       




  }

  @Override
  public void autonomousInit() {
  }

  @Override
  public void autonomousPeriodic() {
  }

  @Override
  public void teleopInit() {

  }

  @Override
  public void teleopPeriodic() {
  
    drive.drive();

  }

  @Override
  public void testInit() {
  }

  @Override
  public void testPeriodic() {
  }

}
