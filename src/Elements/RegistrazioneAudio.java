package Elements;

import interfaccie.Riproducibile;

public class RegistrazioneAudio extends Multimedia implements Riproducibile {

	// definizione attributi
	private String titolo;
	private int volume = 5;
	public int durata;

	// costruttori
	public RegistrazioneAudio(String titolo, int durata) {
		this.titolo = titolo;
		this.durata = durata;
	}

	// metodi
	public void alzaVolume(int volume) {
		if (volume < 10)
			this.volume = volume++;
		else
			System.out.println("Il volume non può essere alzato ulteriormente");
	}

	public void abbassaVolume(int volume) {
		if (volume > 0)
			this.volume = volume--;
		else
			System.out.println("Il volume non può essere diminuito ulteriormente");
	}

	@Override
	public void play() {
		String stringaVolume = "";
		for (int j = 0; j < this.volume; j++) {
			stringaVolume = stringaVolume + "!";
		}
		for (int i = 0; i < durata; i++) {
			System.out.printf("Titolo: %s \nVolume: %s \n", this.titolo, stringaVolume);
		}
	}

	// setters e getters
	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

}
