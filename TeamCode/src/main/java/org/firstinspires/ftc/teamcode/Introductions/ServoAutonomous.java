package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.hardware.Servo;
import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.hardwareMap;

@Autonomous
public class ServoAutonomous {

    public Servo servo1;

    @Override
    public void main() throws InterruptedException {
        servo1 = hardwareMap.servo.get("servo1");
    }
}
