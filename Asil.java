package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.Command;
import com.ctre.phoenix6.hardware.TalonFX;
import com.ctre.phoenix6.configs.TalonFXConfiguration;

public class Asil extends Command {

private TalonFX leftmot;
private TalonFX rightmot;
private Joystick joystick;
private TalonFXConfiguration leftconfig;
private TalonFXConfiguration rightconfig;

@Override
public void initialize() {

    leftmot = new TalonFX(0);
    rightmot= new TalonFX(1);
    joystick= new Joystick(0);
    leftconfig = new TalonFXConfiguration();
    rightconfig = new TalonFXConfiguration();

    leftmot.getConfigurator().apply(leftconfig);
    rightmot.getConfigurator().apply(rightconfig);


}

@Override
public void execute() {

    double forward = joystick.getY();
    double turn = joystick.getX();

    
    if (joystick.getRawButton(1)) {

        leftmot.set(1.0);
        rightmot.set(1.0);
        


    }
  
    else if (joystick.getRawButton(2)) {

        leftmot.set(-1.0);
        rightmot.set(-1.0);
        


    }

    else {

        double LeftSpeed = forward + turn;
        double RightSpeed = forward - turn;

        leftmot.set(LeftSpeed);
        rightmot.set(RightSpeed);







    }



}





    
}









