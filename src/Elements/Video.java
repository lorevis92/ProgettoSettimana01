package Elements;

import interfaccie.Riproducibile;

public class Video extends Multimedia implements Riproducibile {

	// definizione attributi
	private String titolo;
	private int volume = 5;
	private int luminosità = 3;
	public int durata;

	// costruttori
	public Video(String titolo, int durata) {
		this.titolo = titolo;
		this.durata = durata;
	}

	// metodi
	public void alzaVolume() {
		if (volume < 10)
			this.volume++;
		else
			System.out.println("Il volume non può essere alzato ulteriormente");
	}

	public void abbassaVolume() {
		if (volume > 0)
			this.volume--;
		else
			System.out.println("Il volume non può essere diminuito ulteriormente");
	}

	public void alzaLuminosità() {
		if (volume < 5)
			this.luminosità++;
		else
			System.out.println("La luminosità non può essere alzata ulteriormente");
	}

	public void abbassaLiminosità() {
		if (volume > 0)
			this.luminosità--;
		else
			System.out.println("La luminosità non può essere diminuita ulteriormente");
	}

	@Override
	public void play() {
		String stringaVolume = "";
		String stringaLuminosità = "";
		for (int j = 0; j < this.volume; j++) {
			stringaVolume = stringaVolume + "!";
		}
		for (int j = 0; j < this.luminosità; j++) {
			stringaLuminosità = stringaLuminosità + "*";
		}
		for (int i = 0; i < durata; i++) {
			System.out.printf("Titolo: %s \nVolume: %s \nLuminosità: %s\n", this.titolo, stringaVolume,
					stringaLuminosità);
			if (i == durata - 1)
				System.out.println("\n-----------------------------------------\n");
		}
	}

	// setters e getters
	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public int getLuminosità() {
		return luminosità;
	}

	public void setLuminosità(int luminosità) {
		this.luminosità = luminosità;
	}

}
