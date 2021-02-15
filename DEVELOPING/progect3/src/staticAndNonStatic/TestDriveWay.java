package staticAndNonStatic;

public class TestDriveWay {
	
	public static void main(String[] args) {
		DriveWay munib = new DriveWay();
		munib.setDriveWaySize(6);
		System.out.println("Munib's Drive Way Size: "+ munib.driveWaySize);
		
		DriveWay bary = new DriveWay();
		bary.setDriveWaySize(8);
		System.out.println("bary's Drive Way Size: "+ bary.driveWaySize);
		
		System.out.println("Munib's Drive Way Size: "+ munib.driveWaySize);
		
		DriveWay.prepareDriveWay();
	}

}
