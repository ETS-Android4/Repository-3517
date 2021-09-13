package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

import java.util.List;

@TeleOp
public class EricTest extends LinearOpMode {

    private DcMotor MotorLeft;
    private DcMotor MotorRight;

    public void runOpMode() throws InterruptedException {

        MotorLeft = hardwareMap.dcMotor.get("motorLeft");
        MotorRight = hardwareMap.dcMotor.get("motorRight");

        MotorLeft.setDirection(DcMotor.Direction.REVERSE);

        waitForStart();
        MotorLeft.setDirection(DcMotor.Direction.REVERSE);
        while (opModeIsActive()) {

            telemetry.addData("opModeIsActive", opModeIsActive());
            telemetry.update();

            MotorLeft.setPower(1);
            telemetry.addData("Motors running", "Running");
            telemetry.update();
            /**
             * Wheels
             */
            //TODO: Write a program that tells uses the controller to control the wheels... hint: gamepad1.right_stick_x
        }
    }
}