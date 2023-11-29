package atividadeprof;
import java.util.Scanner;

public class atividade05 {
		public static void main(String[] args) {
				Scanner scanner = new Scanner(System.in);
		        System.out.print("Digite uma letra (F ou M): ");
		        char letra = scanner.next().charAt(0);
		        if (letra == 'F' || letra == 'f') {
		            System.out.println("F - Feminino");
		        } else if (letra == 'M' || letra == 'm') {
		            System.out.println("M - Masculino");
		        } else {
		            System.out.println("Letra inválida. Por favor, digite F ou M.");
		        }
		        scanner.close();
		    }
		}
			
		

