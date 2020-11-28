
public class TVWorkingObject {

	public static void main(String[] args) {
//Create Object from the Circle Class using the constructor [1st Object] :	
		TV homeTV = new TV();
//Then use Dot Operator [.method();]to call the object method
		homeTV.turnOn();
		homeTV.setChannel(50);
		homeTV.setVolume(6);
		homeTV.volumeUp();
			
//Then Print TV status & updated channel & updated volume
		System.out.println("Home TV is "+homeTV.isTVOn());
		System.out.println("Home TV channel is "+homeTV.getTVChannel());
		System.out.println("Home TV Volume level is "+homeTV.getTVVolume());

//===========================
//Create the [2nd Object] :		
		TV workTV = new TV();

		workTV.turnOn();
		workTV.setChannel(70);
		workTV.setChannel(130);
		workTV.setVolume(10);
		workTV.volumeUp();

System.out.println("--------------------");
		System.out.println("Home TV is "+workTV.isTVOn());
		System.out.println("Home TV channel is "+workTV.getTVChannel());
		System.out.println("Home TV Volume level is "+workTV.getTVVolume());

	}
}
