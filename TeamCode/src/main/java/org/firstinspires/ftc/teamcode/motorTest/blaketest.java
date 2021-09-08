package org.firstinspires.ftc.teamcode;

import  pcom.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

import java.util.List;

@TeleOp
public class TeleOp359 extends LinearOpMode {

    private DcMotor motorLeft;
    private DcMotor motorRight;

    public void runOpMode() throws InterruptedException {
        motorLeft = hardewareMap.dcMotor.get("motorLeft")
        motorRight = hardewareMap.dcMotor.get("motorRight")

        waitForStart();
        while (opModeIsActive()) {

            telemetry.addData("opModeIsActive", opModeIsActive());
            telemetry.update();

            /**
             * Wheels
             */
           motorLeft.setPower (-gamepad1.left_stick_y)
            motorRight.setPower (-gamepad1.right_stick_y)
        }
    }
}