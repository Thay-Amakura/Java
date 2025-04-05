import java.util.Scanner;

    public class Calculadora{
        
	    public static void main(String[] args) {
		    Scanner scanner = new Scanner(System.in);
		    
		    System.out.println("====== Calculadora ======");
		    
		    System.out.print("Digite o primeiro número: ");
		    double num1 = scanner.nextDouble();
		    
		    System.out.print("Digite o opoerados (+,-,*,/): ");
		    char operador = scanner.next().charAt(0);
		    
		    System.out.print("Digite o segundo número: ");
		    double num2 = scanner.nextDouble();
		    
		    double resultado;
		    
		    switch (operador){
		        case '+':
		            resultado = num1 + num2;
		            break;
		        case '-':
		            resultado = num1 - num2;
		            break;
	            case '*':
	                resultado = num1 * num2;
	                break;
                case '/':
                    if(num2 == 0) {
                        System.out.println("Divisão por zero não é permitida!");
                        scanner.close();
                        return;
                    }
                    resultado = num1 / num2;
                    break;
                default:
                    System.out.println("Operador Inválido!");
                    scanner.close();
                    return;
		    }
		    
		    System.out.println("Resultado: " + resultado);
		    
		    scanner.close();
	    }
    }
