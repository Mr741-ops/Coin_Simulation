import java.util.Random;

public class Exercicio_5_9 {
	public static int cara = 0, coroa = 0;

	public static void main(String[] args) {
		gerarNumero();
		escrever();
	}

	public static void gerarNumero() {
		Random rand = new Random();
		int face;

		for (int i = 1; i < 21; i++) {
			face = 1 + rand.nextInt(2);
			if (face == 1) {
				cara++;
			} else if (face == 2) {
				coroa++;
			}
		}
	}
	
	public static void escrever() {
		System.out.println("Cara: " + cara +
						   "\nCoroa: " + coroa);
	}
}
