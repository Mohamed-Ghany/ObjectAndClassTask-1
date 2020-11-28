
//create Class TV
public class TV {   
	
//Create Data Field
	private int channel =1;
	private int volumLevel =3;
	private boolean on =false;

//Then create the constructors
	
	public TV() {  //default constructor		
	}
	public void turnOn() {   //One Argue Constructor
		on=true;	
	}
public void turnOff() {
	   on=false;		
	}
//==========================
//Then create the Methods:[ which will be called from "homeTV" object

public void setChannel (int newChannel) {    //Method for setChannel , which will be used by "homeTV" object to call the "channel" in Data field
	//the code
	if (on && newChannel >=1 && newChannel<=120 ) 
		channel=newChannel;
	}
	
	public void setVolume (int newVolume) {  //Method for setVolume , which will be used by "homeTV" object to call the "volumLevel" in Data field
		//the code
		if (on && newVolume >=1 && newVolume<=7 ) 
			volumLevel=newVolume;
		}
//============================	
	public void channelUp() {    //after u made Setchannel & updated "channel" do the below function to increase channel
		if (on && channel<120 )
		   channel++;
	}
	
	public void channelDown() {
    	if (on && channel>1 )
 		   channel--;   	
	}
//=============================	
	public void volumeUp() {    
		if (on && volumLevel<7 )
		   volumLevel++;
	}
	public void volumeDown() {    
		if (on && volumLevel>1 )
			volumLevel--;
	}
	
//==========================    
//Create method to return is the TV is On or of ?
		public boolean isTVOn() { 
			
			 return on;
		}
//==========================	
//Create method to return the current channel after update :
		public int getTVChannel() { 
					
				return channel;
	}
//==========================
//Create method to return the current volume level :
		public int getTVVolume() { 
					
				return volumLevel;
	    
		}
	}

	





