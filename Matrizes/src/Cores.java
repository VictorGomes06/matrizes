import java.util.Scanner;

public class Cores {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		String Cores[] = new String[10];
		
		
		Cores[0] = "Azul";
		Cores[1] = "Amarelo";
		Cores[2] = "Vermelho";
		Cores[3] = "Roxo";
		Cores[4] = "Preto";
		Cores[5] = "Verde,";
		Cores[6] = "Cinza";
		Cores[7] = "Branco";
		Cores[8] = "Laranja";
		Cores[9] = "Lilás";
		
		boolean encontrei = false;
		
	    String escolha = "";
		System.out.println("Scolha uma cor :");
		escolha = leitor.next();
		System.out.println("---------------------------");
		leitor.close();
		
		for (int i = 0; i < Cores.length; i ++){
			if(escolha.equalsIgnoreCase (Cores[i])) {
				System.out.println("essa cor esta na lista");
				encontrei = true;
				break;
			}
			if(encontrei == false) {
				System.out.println("essa cor não esta na lista");
				
			}
		}
		
		
			
			
		
		

	}

}
