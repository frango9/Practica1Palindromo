import java.util.Scanner;
import java.util.Stack;

public class Comprobador3 {
    private String frase;
    private Stack pila1;
    private Stack pila2;

    public Comprobador3(){

        frase = "";
        pila1= new Stack();
        pila2= new Stack();

    }

    public Comprobador3(String fras){

        frase = fras;
        pila1= new Stack();
        pila2= new Stack();

    }


    public void esPalindromo(){

        int z = 0;
        int j = 0;

        String posiblepal= frase.replaceAll(" ", "");
        int n;

        n = posiblepal.length();

        for (int i = 0; i < n; i++){
            pila1.push(posiblepal.charAt(i));
        }

        for (int i = 0; i < n/2; i++) {
            pila2.push(pila1.pop());
        }

        if(pila1.size() != pila2.size()) pila1.pop();

        while (z == 0 && j < n/ 2) {
            if (pila1.pop() != pila2.pop()) {
                z = 1;
                j++;
            } else j++;
        }

        if (z == 0) System.out.println("Es palindromo.");
        else System.out.println("No es palindromo");

    }

    public void leerFrase() {
        System.out.print("Escriba frase a continuacion: ");
        Scanner sc = new Scanner(System.in);
        frase = sc.nextLine();
    }

}
