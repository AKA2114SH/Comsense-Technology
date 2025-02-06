package smart_home_device;

public class SmartSpeaker extends Device implements SmartDevice,VoiceAssistant{

	@Override
	public void respondToVoice() {
		System.out.println("Responce is gone.");
		
	}

	@Override
	public void connectToWiFi() {
		System.out.println("Device connected.");
		
	}
	public static void main(String[] args) {
		SmartSpeaker s=new SmartSpeaker();
		s.respondToVoice();
		s.connectToWiFi();

	}



}
