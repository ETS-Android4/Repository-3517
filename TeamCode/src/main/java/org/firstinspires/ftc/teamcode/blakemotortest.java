package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

import java.util.List;

@TeleOp
public class blakemotortest extends LinearOpMode {

    private DcMotor motor1;

    public void runOpMode() throws InterruptedException {
        motor1 = hardwareMap.dcMotor.get("motor1");

        waitForStart();
        while (opModeIsActive()) {

            telemetry.addData("opModeIsActive", opModeIsActive());
            telemetry.update();

            motor1.setPower (1)
            telemetry.addData("motor_power", "running");
            telemetry.update();
















        }
    }
}