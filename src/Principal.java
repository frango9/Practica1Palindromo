public class Principal {
    public static void main(String[] args) {

        Comprobador1 cp1 = new Comprobador1("aroma a mora");
        Comprobador1 cp2 = new Comprobador1("camino a casa");
        Comprobador1 cp3 = new Comprobador1("dabale arroz a la zorra el abad");
        Comprobador1 cp4 = new Comprobador1();

        cp1.esPalindromo();
        cp2.esPalindromo();
        cp3.esPalindromo();

        cp4.leerFrase();
        cp4.esPalindromo();

        Comprobador2 cp5 = new Comprobador2("aroma a mora");
        Comprobador2 cp6 = new Comprobador2("camino a casa");
        Comprobador2 cp7 = new Comprobador2("dabale arroz a la zorra el abad");
        Comprobador2 cp8 = new Comprobador2();

        cp5.esPalindromo();
        cp6.esPalindromo();
        cp7.esPalindromo();

        cp8.leerFrase();
        cp8.esPalindromo();


    }


}
