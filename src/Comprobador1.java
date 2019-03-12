import java.util.Scanner;

public class Comprobador1 {

    private String frase;
    private PilaCaracteres pila1;
    private PilaCaracteres pila2;

    public Comprobador1(){

        frase = "";
        pila1= new PilaCaracteres();
        pila2= new PilaCaracteres();

    }

    public Comprobador1(String fras){

        frase = fras;
        pila1= new PilaCaracteres();
        pila2= new PilaCaracteres();

    }

    /* private int contarFrase(){
        int n = 0;
        int i = 0;

        while(frase.charAt(i) != ''){
            if(frase.charAt(i) != ' ') {
                n++;
                i++;
            }
            else i++;
        }

        return n;
    } */

    public void esPalindromo(){

        int z = 0;
        int j = 0;

        String posiblepal= frase.replaceAll(" ", "");
        int n;

        n = posiblepal.length();
        System.out.println(posiblepal);

        if(n != 0){

            for (int i = 0; i < n; i++){
                pila1.apilar(posiblepal.charAt(i));
            }

            for (int i = 0; i < (n-1)/2; i++) {
                pila2.apilar(pila1.desapilar());
            }

            pila1.desapilar();

            while (z == 0 && j < (n-1) / 2) {
                if (pila1.desapilar() != pila2.desapilar()) {
                    z = 1;
                    j++;
                } else j++;
            }
        }
        else {
            for (int i = 0; i < n; i++) {
                pila1.apilar(posiblepal.charAt(i));
            }

            for (int i = 0; i < n / 2; i++) {
                pila2.apilar(pila1.desapilar());
            }

            while (z == 0 && j < n / 2) {
                if (pila1.desapilar() != pila2.desapilar()) {
                    z = 1;
                } else j++;
            }
        }
        if (z == 0) System.out.println("Es palindromo.");
        else System.out.println("No es palindromo");

    }

    public void leerFrase() {
        System.out.print("Escriba frase a continuacion: ");Scanner sc = new Scanner(System.in);
        frase = sc.nextLine();
    }


}






