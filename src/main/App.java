package main;

import Elements.Immagine;
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

		Immagine immagineProva = new Immagine("ImmagineDiProva");
		immagineProva.alzaLuminosità();
		immagineProva.alzaLuminosità();
		immagineProva.alzaLuminosità();
		immagineProva.show();

		System.out.println(videoProva.getVolume());
		System.out.println(videoProva.getLuminosità());
		System.out.println(immagineProva.getLuminosità());
	}
}
