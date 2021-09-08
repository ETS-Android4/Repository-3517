package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

import java.util.List;

@TeleOp
public class periTest extends LinearOpMode {

    public void runOpMode() throws InterruptedException {

        DcMotor motorLeft = hardwareMap.dcMotor.get("motorLeft");
        DcMotor motorRight = hardwareMap.dcMotor.get("motorRight");

        waitForStart();
        while (opModeIsActive()) {

            motorLeft.setPower(gamepad1.left_stick_x);
            motorRight.setPower(gamepad1.right_stick_x);

            /**
             * Wheels
             */
            //TODO: Write a program that tells uses the controller to control the wheels... hint: gamepad1.right_stick_x

        }
    }
}