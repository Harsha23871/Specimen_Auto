package org.firstinspires.ftc.teamcode.drive.AutoLeague3;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.NormalizedColorSensor;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;

public class Team6976HWMap2023 {
    public DcMotor DriveRightBack = null;
    public DcMotor DriveLeftBack = null;
    public DcMotor DriveLeftFront = null;
    public DcMotor DriveRightFront = null;

//    public DcMotor Elevator = null;
    public DcMotor intake = null;

    public NormalizedColorSensor ColorSensor = null;

    HardwareMap hwMap =  null;


    private ElapsedTime runtime = new ElapsedTime();
    private DcMotor leftFrontDrive, leftBackDrive, rightFrontDrive, rightBackDrive = null;
    private DcMotor left_Shoulder_Motor, right_Shoulder_Motor, elbow_motor, intake_motor = null;
    private Servo
            finger_one_servo,
            finger_two_servo,
            wrist_Right_Servo,
            drone_Launcher_servo = null;

    public void Map(HardwareMap hardwareMap)
    {
          hwMap = hardwareMap;

        leftFrontDrive = hardwareMap.get(DcMotor.class, "leftFront");
        leftBackDrive = hardwareMap.get(DcMotor.class, "leftRear");
        rightFrontDrive = hardwareMap.get(DcMotor.class, "rightFront");
        rightBackDrive = hardwareMap.get(DcMotor.class, "rightRear");

        left_Shoulder_Motor = hardwareMap.get(DcMotor.class, "leftShoulderMotor");
        right_Shoulder_Motor = hardwareMap.get(DcMotor.class, "rightShoulderMotor");
//jaws


        elbow_motor = hardwareMap.get(DcMotor.class, "elbowMotor");
        intake_motor = hardwareMap.get(DcMotor.class, "intakeMotor");

        finger_one_servo =  hardwareMap.get(Servo.class,"fingerOne");
        finger_two_servo = hardwareMap.get(Servo.class,"fingerTwo");

        wrist_Right_Servo = hardwareMap.get(Servo.class,"rightWrist");

        drone_Launcher_servo = hardwareMap.get(Servo.class, "droneLauncher");



//
//
//          DriveLeftFront = hwMap.get(DcMotor.class,"leftFront");
//          DriveRightFront = hwMap.get(DcMotor.class,"rightFront");
//
//          DriveLeftBack = hwMap.get(DcMotor.class,"leftRear");
//          DriveRightBack = hwMap.get(DcMotor.class,"rightRear");
//
//          DriveLeftFront.setDirection(DcMotor.Direction.FORWARD);
//          DriveLeftFront.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
//          DriveLeftFront.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
//
//          DriveRightFront.setDirection(DcMotor.Direction.REVERSE);
//          DriveRightFront.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
//          DriveRightFront.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
//
//          DriveLeftBack.setDirection(DcMotor.Direction.FORWARD);
//          DriveLeftBack.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
//          DriveLeftBack.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
//
//          DriveRightBack.setDirection(DcMotor.Direction.REVERSE);
//          DriveRightBack.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
//          DriveRightBack.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
//
//          intake = hwMap.get(DcMotor.class, "Intake");
//
//          ColorSensor = hwMap.get(NormalizedColorSensor.class, "Sensor");

    }

    public void outtake_auto_pixel(){
        intake.setPower(-1);
    }

}