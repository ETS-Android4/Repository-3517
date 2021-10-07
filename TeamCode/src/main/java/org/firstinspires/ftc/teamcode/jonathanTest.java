package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

import java.util.List;

@TeleOp(name = "jonathanTest")
public class jonathanTest extends LinearOpMode {

    private DcMotor motorLeft;
    private DcMotor motorRight;
    private DcMotor motorMiddle;

    public void runOpMode() throws InterruptedException {

        motorLeft = hardwareMap.dcMotor.get("motorLeft");
        motorRight = hardwareMap.dcMotor.get("motorRight");
        motorMiddle = hardwareMap.dcMotor.get("motorMiddle");

        waitForStart();

        motorLeft.setDirection(DcMotor.Direction.REVERSE);

        while (opModeIsActive()) {
            telemetry.addData("opModeIsActive", opModeIsActive());
            telemetry.update();

            telemetry.addData("Motors Running", "Cool");
            telemetry.update();
            if (Math.abs(gamepad1.left_stick_y) > 0){
                motorLeft.setPower(-gamepad1.left_stick_y);
                motorRight.setPower(-gamepad1.left_stick_y);
            }
            else if (Math.abs(gamepad1.right_stick_x) > 0){
                motorLeft.setPower(gamepad1.right_stick_x);
                motorRight.setPower(-gamepad1.right_stick_x);
            }
            motorMiddle.setPower(-gamepad1.left_stick_x);


            //idle();
        }
    }
}