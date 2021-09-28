package org.firstinspires.ftc.teamcode;
//doesnt work :(
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

import java.util.List;

@TeleOp(name = "MaxLan")
public class MaxLan extends LinearOpMode {
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

            motorLeft.setPower(1);
            motorRight.setPower(1);
            telemetry.addData("motorsRunning", ":)");
            telemetry.update();

            //motorRight.setPower(-gamepad1.right_stick_y);
            //motorLeft.setPower(-gamepad1.right_stick_y);



            //TODO: Write a program that tells uses the controller to control the wheels... hint: gamepad1.right_stick_x

        }
    }
}

