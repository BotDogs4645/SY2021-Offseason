package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;

public class MotorCommand extends CommandBase{
 
  public MotorCommand() {
    addRequirements(RobotContainer.motorSubsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
      RobotContainer.motorSubsystem.startMotor();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {}

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
      RobotContainer.motorSubsystem.stopMotor();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
    
}