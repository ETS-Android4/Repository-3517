package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

import java.util.List;

@TeleOp
public class seunghoTest extends LinearOpMode {
    private DcMotor motorLeft;
    private DcMotor motorRight;

    //private Servo armServo;

    public void runOpMode() throws InterruptedException {
        //TODO: what to declare here?
        motorLeft = hardwareMap.dcMotor.get("motorLeft");
        motorRight = hardwareMap.dcMotor.get("motorRight");

        //armServo = hardwareMap.servo.get("armServo");

        waitForStart();
        while (opModeIsActive()) {

            telemetry.addData("opModeIsActive", opModeIsActive());
            telemetry.update();

            /**
             * Wheels
             */
            //TODO: Write a program that tells uses the controller to control the wheels... hint: gamepad1.right_stick_x
            motorLeft.setPower(-gamepad1.left_stick_y);
            motorRight.setPower(-gamepad1.right_stick_y);
        }
    }
}