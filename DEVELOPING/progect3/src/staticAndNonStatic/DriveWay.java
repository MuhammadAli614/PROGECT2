package staticAndNonStatic;

public class DriveWay {
	public static int driveWaySize;
	
	public void setDriveWaySize(int driveWaySize) {
		this.driveWaySize = driveWaySize;
	}
	
	public static void prepareDriveWay() {
		System.out.println("Prepare drive soon");
	}

}
