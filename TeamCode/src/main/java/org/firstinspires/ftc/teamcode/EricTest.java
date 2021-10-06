package org.firstinspires.ftc.teamcode;

import android.animation.ArgbEvaluator;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.AccelerationSensor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;

import java.util.List;

@TeleOp
public class EricTest extends LinearOpMode {

    private DcMotor MotorLeft;
    private DcMotor MotorRight;
    private ColorSensor colorSensor;
    Servo armservo = null;

    public void runOpMode() throws InterruptedException {
        armservo = hardwareMap.servo.get("armservo");

        armservo.setPosition(.8);

        waitForStart();
        while (opModeIsActive()) {

            telemetry.addData("opModeIsActive", opModeIsActive());
            telemetry.update();

            armservo.setPosition(.5);
            armservo.setPosition(.2);
            telemetry.addData("Motors running", "Running");
            telemetry.update();
            //TODO: Write a program that tells uses the controller to control the wheels... hint: gamepad1.right_stick_x
        }
    }
    public void PutBlock(){

    }

}