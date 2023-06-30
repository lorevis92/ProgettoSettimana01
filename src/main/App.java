package main;

import Elements.RegistrazioneAudio;
import Elements.Video;

public class App {

	public static void main(String[] args) {

		RegistrazioneAudio rec1 = new RegistrazioneAudio("VoiceMemo1", 10);
		rec1.play();


		Video videoProva = new Video("VideoDiProva", 7);
		videoProva.abbassaLiminosità();
		videoProva.abbassaVolume();
		videoProva.play();

		System.out.println(videoProva.getVolume());
		System.out.println(videoProva.getLuminosità());
	}
}
