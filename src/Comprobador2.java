import java.util.Scanner;

public class Comprobador2 {

    private String frase;
    private PilaCaracteres pila1;
    private ColaCaracteres cola1;

    public Comprobador2(){

        frase = "";
        pila1 = new PilaCaracteres();
        cola1 = new ColaCaracteres();

    }

    public Comprobador2(String fras){

        frase = fras;
        pila1 = new PilaCaracteres();
        cola1 = new ColaCaracteres();

    }

    public void esPalindromo(){

        int n;
        int z = 0;
        int j = 0;

        String posiblepal= frase.replaceAll(" ", "");

        n = posiblepal.length();
        System.out.println(posiblepal);

        for (int i = 0; i < n ; i++) {
            pila1.apilar(posiblepal.charAt(i));
            cola1.encolar(posiblepal.charAt(i));
        }

        while(z == 0 && j < n){
            if (pila1.desapilar() == cola1.desencolar()){
                j++;
            }
            else z = 1;
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
