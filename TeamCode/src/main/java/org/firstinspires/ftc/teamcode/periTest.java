package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

import java.util.List;

@TeleOp
public class periTest extends LinearOpMode {
    public DcMotor motor1;
    //public DcMotor motor2;

    public void runOpMode() throws InterruptedException {

        motor1 = hardwareMap.dcMotor.get("motor1");
        //motor2 = hardwareMap.dcMotor.get("motor2");

        waitForStart();
        while (opModeIsActive()) {
            telemetry.addData("opModeIsActive",opModeIsActive());
            telemetry.update();

            motor1.setPower(1);
            //motor2.setPower(gamepad1.right_stick_y);

            /**
             * Wheels
             */
            //TODO: Write a program that tells uses the controller to control the wheels... hint: gamepad1.right_stick_x

        }
    }
}