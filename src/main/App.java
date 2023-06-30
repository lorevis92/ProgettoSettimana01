package main;

import Elements.RegistrazioneAudio;

public class App {

	public static void main(String[] args) {
		RegistrazioneAudio rec1 = new RegistrazioneAudio("VoiceMemo1", 10);
		rec1.play();
	}

}
