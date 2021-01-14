import java.util.Scanner;

public class TarefaDois {
    public static void main (String [] args) {
        boolean valida = true;
        while(valida == true){

        System.out.println("__________");
        System.out.println("");
        System.out.println("MENU DE OPÇÕES");
        System.out.println("1- Opção 1\n2- Opção 2\n3- Opção 3\n4- Sair");
        System.out.println("__________");
        
        Scanner opcao = new Scanner(System.in);
        System.out.println("Digite a opção desejada: ");
        int op = opcao.nextInt();

        
        switch(op){
            case 1:
            System.out.println("Você escolheu a primeira opção.");
            
            break;
            case 2:
            System.out.println("Você escolheu a segunda opção.");
            
            break;
            case 3:
            System.out.println("Você escolheu a terceira opção.");
            break;

            case 4:
            System.out.println("O programa foi encerrado.");
            valida = false;
            break;

            default:
            System.out.println("Digite uma opção válida!\nObrigado por usar o menu.");
            break;
        }
        }

    

    }
}
