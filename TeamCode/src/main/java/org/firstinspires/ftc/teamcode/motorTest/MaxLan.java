package org.firstinspires.ftc.teamcode;
//doesnt work :(
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

import java.util.List;

@TeleOp(name = "TeleOp359")
public class TeleOp359 extends LinearOpMode {
    private DcMotor motorLeft;
    private DcMotor motorRight;

    public void runOpMode() throws InterruptedException {
        //TODO: what to declare here?
        motorLeft = hardwareMap.dcMotor.get("motorLeft");
        motorRight = hardwareMap.dcMotor.get("motorRight");
        waitForStart();

        motorLeft.setDirection(DcMotor.Direction.REVERSE);
        while (opModeIsActive()) {


            telemetry.addData("opModeIsActive", opModeIsActive());
            telemetry.update();
            motorRight.setPower(-gamepad1.right_stick_X);
            motorLeft.setPower(-gamepad1.right_stick_Y);
            /**
             * Wheels
             */
            //TODO: Write a program that tells uses the controller to control the wheels... hint: gamepad1.right_stick_x

        }
    }
}

