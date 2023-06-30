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
	public void alzaVolume() {
		if (volume < 10)
			this.volume++;
		else
			System.out.println("Il volume è già al massimo e non può essere alzato ulteriormente");
	}

	public void abbassaVolume() {
		if (volume > 0)
			this.volume--;
		else
			System.out.println("Il volume è già al minimo e non può essere diminuito ulteriormente");
	}

	@Override
	public void play() {
		String stringaVolume = "";
		for (int j = 0; j < this.volume; j++) {
			stringaVolume = stringaVolume + "!";
		}
		for (int i = 0; i < durata; i++) {
			System.out.printf("Titolo: %s \nVolume: %s \n", this.titolo, stringaVolume);
			if (i == durata - 1)
				System.out.println("\n-----------------------------------------\n");
		}
	}

	@Override
	public void esegui() {
		this.play();
	}

	// setters e getters
	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

}
