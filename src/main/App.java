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
		int mediaVisualizzato;
		Multimedia mediaInserito;
		Multimedia[] mediaArray;
		mediaArray = new Multimedia[5];

		// Raccolta file multimedia dall'utente e riempimento array
		Scanner input = new Scanner(System.in);
		System.out.println(
				"Di seguito potrai salvare 5 file multimediali a tua scelta tra un immagine, un video o una traccia audio.\n");
		for (int i = 0; i < 5; i++) {
			System.out.println(
					"Se desideri inserire un'immagine inserisci la parola 'Immagine'\nSe desideri inserire un video inserisci la parola 'Video'\nSe vuoi inserire un file audio inserisici la parola 'Audio'\n\n");
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

		// Visualizzazione elemento selezionato
		System.out.println(
				"Il caricamento dei media è andato a buon fine!\n\nInserisci un numero da 1 a 5 per visualizzare i dati del media inserito, inserisci 0 se non sei interessato a vedere nessuno dei media\n");

		do {
			mediaVisualizzato = input.nextInt();
			if (mediaVisualizzato > 0 && mediaVisualizzato <= 5) {
				mediaVisualizzato--;
				mediaArray[mediaVisualizzato].esegui();
				mediaVisualizzato++;
			}
			else if (mediaVisualizzato == 0)
				System.out.println("Visualizzazione media interrotto!");
			else
				System.out.println(
						"Il numero da te inserito non è compreso tra 1 e 5. Inserisci un nuovo compreso tra 1 a 5 per visualizzare i dati del media inserito, inserisci 0 se non sei interessato a vedere altri media caricati");
		} while (mediaVisualizzato != 0);

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
