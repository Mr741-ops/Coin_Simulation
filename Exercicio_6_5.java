public class Exercicio_6_5 {
	public static void main(String[] args) {
		dobrarPapel(pedirNumero());
	}

	public static void dobrarPapel(double espessura) {
		int dobragens = 0;
		double soma =0.074;
		
		while (soma < espessura) {
			
			soma = soma*2;
			
			dobragens++;
		}

		System.out.println("Dobragens= " + dobragens);
	}
	
	public static double pedirNumero(){
		//VARIAVEIS
		double espessura;

		do {
			espessura = Util.lerFloat("Espessura do papel");
		} while (espessura < 1.0);

		return espessura;
	}
}
