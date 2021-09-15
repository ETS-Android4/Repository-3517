package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

import java.util.List;

@TeleOp
public class motortestperi extends LinearOpMode {
    private DcMotor motor1;

    public void runOpMode() throws InterruptedException {

        DcMotor motor1 = hardwareMap.dcMotor.get("motor1");


        waitForStart();
        while (opModeIsActive()) {

            telemetry.addData("opModeIsActive",opModeIsActive());
            telemetry.update();

            motor1.setPower(0.8);

            /**
             * Wheels
             */
            //TODO: Write a program that tells uses the controller to control the wheels... hint: gamepad1.right_stick_x

        }
    }
}
