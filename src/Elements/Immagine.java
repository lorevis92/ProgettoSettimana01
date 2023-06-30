package Elements;

public class Immagine extends Multimedia {
	// definizione attributi
	private String titolo;
	private int luminosità = 3;

	// costruttori
	public Immagine(String titolo) {
		this.titolo = titolo;
	}

	// metodi
	public void show() {
		String stringaLuminosità = "";
		for (int j = 0; j < this.luminosità; j++) {
			stringaLuminosità = stringaLuminosità + "*";
		}
		System.out.printf("Titolo immagine: %s \nLuminosità: %s \n\n-----------------------------------------\n\n",
				this.titolo,
				stringaLuminosità);
	}

	public void alzaLuminosità() {
		if (luminosità < 5)
			this.luminosità++;
		else
			System.out.println("La luminosità non può essere alzata ulteriormente");
	}

	public void abbassaLiminosità() {
		if (luminosità > 0)
			this.luminosità--;
		else
			System.out.println("La luminosità non può essere diminuita ulteriormente");
	}

	@Override
	public void esegui() {
		this.show();
	}

	// setters e getters

	public int getLuminosità() {
		return luminosità;
	}

	public void setLuminosità(int luminosità) {
		this.luminosità = luminosità;
	}

}
