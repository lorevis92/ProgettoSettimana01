package main;

import java.util.Scanner;

import Elements.Immagine;
import Elements.Multimedia;
import Elements.RegistrazioneAudio;
import Elements.Video;

public class App {

	public static void main(String[] args) {
		// definizione attributi
		String titolo;
		int durata;
		Multimedia mediaInserito;
		Multimedia[] mediaArray;
		mediaArray = new Multimedia[5];

		Scanner input = new Scanner(System.in);
		System.out.println(
				"Di seguito potrai salvare 5 file multimediali a tua scelta tra un immagine, un video o una traccia audio.\n");
		for (int i = 0; i < 5; i++) {
			System.out.println(
					"Se desideri inserire un'immagine inserisci la parola 'Immagine', se desideri inserire un video inserisci la parola 'Video ed infine se vuoi inserire un file audio inserisici la parola 'Audio'\n\n");
			String tipoMediaInserito = input.nextLine();
			tipoMediaInserito = tipoMediaInserito.toUpperCase();
			switch (tipoMediaInserito) {
			case "IMMAGINE":
				System.out.println("Inserisci il titolo dell'immagine\n");
				titolo = input.nextLine();
				mediaInserito = new Immagine(titolo);
				mediaArray[i] = mediaInserito;
				break;
			case "VIDEO":
				System.out.println("Inserisci il titolo del video\n");
				titolo = input.nextLine();
				System.out.println("Inserisci la durata del video\n");
				durata = input.nextInt();
				mediaInserito = new Video(titolo, durata);
				mediaArray[i] = mediaInserito;
				break;
			case "AUDIO":
				System.out.println("Inserisci il titolo dell'audio\n");
				titolo = input.nextLine();
				System.out.println("Inserisci la durata dell'audio\n");
				durata = input.nextInt();
				mediaInserito = new RegistrazioneAudio(titolo, durata);
				mediaArray[i] = mediaInserito;
				break;
			default:
				System.out.println(
						"La parola da te inserita non è valida\n");
				i--;

			}

		}

		mediaArray[3].esegui();

		input.close();

		/*
		 * RegistrazioneAudio rec1 = new RegistrazioneAudio("VoiceMemo1", 10);
		 * rec1.play();
		 * 
		 * 
		 * Video videoProva = new Video("VideoDiProva", 7);
		 * videoProva.abbassaLiminosità(); videoProva.abbassaVolume();
		 * videoProva.play();
		 * 
		 * Immagine immagineProva = new Immagine("ImmagineDiProva");
		 * immagineProva.alzaLuminosità(); immagineProva.alzaLuminosità();
		 * immagineProva.alzaLuminosità(); immagineProva.show();
		 * 
		 * System.out.println(videoProva.getVolume());
		 * System.out.println(videoProva.getLuminosità());
		 * System.out.println(immagineProva.getLuminosità());
		 */}
}
