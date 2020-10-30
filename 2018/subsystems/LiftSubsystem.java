/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.LiftCommand;

/**
 * Add your docs here.
 */
public class LiftSubsystem extends Subsystem {
  //Create liftMotor
  Spark liftMotor
    
  //Assign liftMotor
  public LiftSubsystem(){

  liftMotor = RobotMap.lift;


  }

  //Method to control liftMotor
  public void setLift(double x){

    liftMotor.set(x)
      
  }
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  //Set the default command
  @Override
  public void initDefaultCommand() {
    setDefaultCommand(new LiftCommand());
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
