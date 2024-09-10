public class MyOpmode extends LinearOpMode {
  @Override
  public void runOpMode() {
    SampleMecanumDrive drive = new SampleMecanumDrive(hardwareMap);

    Pose2d startPose = new Pose2d(10, -8, Math.toRadians(90));

    drive.setPoseEstimate(startPose);
    
    Trajectory autoStepOne = drive.trajectoryBuilder(new Pose2d())
        
    
    waitForStart();

    if(isStopRequested()) return;

    drive.followTrajectory(myTrajectory);
  }
}
