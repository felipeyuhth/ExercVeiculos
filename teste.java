package exe4_teste;
import exe4.*;
public class exe4_atributos {
	public static void main (String[] args) {
		System.out.println("Moto:");
		Moto a = new Moto("lexus", "Axx motosport SS", "Gasolina");
		a.apresentarMoto();
		
		System.out.println("");
		System.out.println("Carro:");
		
		Carro f = new Carro("ferrari", "fxxk Evo", "Gasolina");
		f.apresentarCarro();
		
		System.out.println("");
		System.out.println("Caminhao: ");
		
		Caminhao g = new Caminhao("land rouver", "sport car", "Etanol");
		g.apresentarCaminhao();
	}
}
