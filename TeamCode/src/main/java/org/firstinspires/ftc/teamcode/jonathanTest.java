package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

import java.util.List;

@TeleOp(name = "jonathanTest")
public class jonathanTest extends LinearOpMode {

    private DcMotor motorLeft;
    private DcMotor motorRight;
    private DcMotor motorMiddle;
    private Servo bucketServo;
    private DcMotor craneMotor;
    private DcMotor intakeMotor;


    private float leftMotorPower = 0f;
    private float rightMotorPower = 0f;
    private float middleMotorPower = 0f;
    public float intakeMotorPower = 0.5f;
    public float craneMotorUpPower = 0.5f;
    public float craneMotorDownPower = -0.4f;
    public float bucketServoSpeed = 0.25f;

    public void runOpMode() throws InterruptedException {

        motorLeft = hardwareMap.dcMotor.get("motorLeft");
        motorRight = hardwareMap.dcMotor.get("motorRight");
        motorMiddle = hardwareMap.dcMotor.get("motorMiddle");

        waitForStart();

        motorLeft.setDirection(DcMotor.Direction.REVERSE);

        while (opModeIsActive()) {

            //drive code

            telemetry.addData("opModeIsActive", opModeIsActive());
            telemetry.update();

            leftMotorPower = gamepad1.left_stick_y;
            rightMotorPower = gamepad1.right_stick_y;
            middleMotorPower = gamepad1.right_stick_x;

            if (Math.abs(gamepad1.right_stick_x) > 0 && Math.abs(gamepad1.left_stick_y) > 0) {
                if(gamepad1.right_stick_x > 0){
                    leftMotorPower = 0;
                    rightMotorPower = gamepad1.right_stick_x;
                }
                else if (gamepad1.right_stick_x < 0){
                    rightMotorPower = 0;
                    leftMotorPower = gamepad1.right_stick_x;
                }
            }
            else if (Math.abs(gamepad1.right_stick_x) > 0){
                if(gamepad1.right_stick_x > 0){
                    leftMotorPower = -gamepad1.right_stick_x;
                    rightMotorPower = gamepad1.right_stick_x;
                }
                else if (gamepad1.right_stick_x < 0){
                    rightMotorPower = gamepad1.right_stick_x;
                    leftMotorPower = -gamepad1.right_stick_x;
                }
            }

            motorLeft.setPower(leftMotorPower);
            motorRight.setPower(rightMotorPower);
            motorMiddle.setPower(middleMotorPower);

            //intake stuff
            if (gamepad1.cross){
                intakeMotor.setPower(intakeMotorPower);
            }
            else if (gamepad1.circle){
                intakeMotor.setPower(-intakeMotorPower);
            }

            //lifting
            if (gamepad1.dpad_up) {
                craneMotor.setPower(craneMotorUpPower);
            }
            else if (gamepad1.dpad_down){
                craneMotor.setPower(craneMotorDownPower);
            }

            //bucket

            //make sure position is within servo bounds
            if (gamepad1.dpad_right) {
                bucketServo.setPosition(bucketServo.getPosition() + bucketServoSpeed);
            }
            if (gamepad1.dpad_left){
                bucketServo.setPosition(bucketServo.getPosition() + bucketServoSpeed);
            }
        }
    }
}