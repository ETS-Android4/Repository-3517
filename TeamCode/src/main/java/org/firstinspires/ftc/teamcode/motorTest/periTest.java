package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

import java.util.List;

@TeleOp
public class TeleOp359 extends LinearOpMode {

    public void runOpMode() throws InterruptedException {

        LeftMotor = hardwareMap.dcMotor.get("LeftMotor")
        RightMotor = hardwareMap.dcMotor.get("RightMotor")

        waitForStart();
        while (opModeIsActive()) {

            LeftMotor.setPower(gamepad1.left_stick_x)
            RightMotor.setPower(gamepad1.right_stick_x)

            /**
             * Wheels
             */
            TODO: Write a program that tells uses the controller to control the wheels... hint: gamepad1.right_stick_x

        }
    }
}