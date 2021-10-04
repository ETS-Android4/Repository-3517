package org.firstinspires.ftc.teamcode;

        import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
        import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
        import com.qualcomm.robotcore.hardware.DcMotor;
        import com.qualcomm.robotcore.hardware.Servo;

@TeleOp
public class ServoTeleOp extends LinearOpMode {

    public Servo servo1;

    public void runOpMode() throws InterruptedException {

        servo1 = hardwareMap.Servo.get("servo1");


        waitForStart();
        double tgtPower = 0;
        while (opModeIsActive()) {
            // check to see if we need to move the servo.
            if(gamepad1.y) {
                // move to 0 degrees.
                servo1.setPosition(0);
            } else if (gamepad1.x || gamepad1.b) {
                // move to 90 degrees.
                servo1.setPosition(0.5);
            } else if (gamepad1.a) {
                // move to 180 degrees.
                servo1.setPosition(1);
            }
            telemetry.addData("Servo Position", servo1.getPosition());
            telemetry.addData("Target Power", tgtPower);
            telemetry.update();

        }

    }
}
