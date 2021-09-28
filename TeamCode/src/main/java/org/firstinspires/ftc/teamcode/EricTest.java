package org.firstinspires.ftc.teamcode;

import android.animation.ArgbEvaluator;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.AccelerationSensor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.ColorSensor;
import java.util.List;

@TeleOp
public class EricTest extends LinearOpMode {

    private DcMotor MotorLeft;
    private DcMotor MotorRight;
    private ColorSensor colorSensor;

    public void runOpMode() throws InterruptedException {

        MotorLeft = hardwareMap.dcMotor.get("motorLeft");
        MotorRight = hardwareMap.dcMotor.get("motorRight");
        colorSensor = hardwareMap.colorSensor.get("colorSensor");

        MotorLeft.setDirection(DcMotor.Direction.REVERSE);

        waitForStart();
        MotorLeft.setDirection(DcMotor.Direction.REVERSE);
        while (opModeIsActive()) {

            telemetry.addData("opModeIsActive", opModeIsActive());
            telemetry.update();

            if (colorSensor.red() == 2) {
                MotorLeft.setPower(1);
                MotorRight.setPower(1);
                if (colorSensor.alpha() >= 0.5){

                }
            }
            MotorLeft.setPower(1);
            MotorRight.setPower(1);
            telemetry.addData("Motors running", "Running");
            telemetry.update();
            int j = 100;
            while(j != 0) {
                MotorRight.setPower(100);
                MotorLeft.setPower(100);

                MotorRight.setPower(1);
                MotorLeft.setPower(1);
                j--;
            }//TODO: Write a program that tells uses the controller to control the wheels... hint: gamepad1.right_stick_x
        }
    }
}