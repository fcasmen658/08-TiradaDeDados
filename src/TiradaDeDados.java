public class TiradaDeDados {
    public static void main(String[] args) {

    // TIRADA DE DADOS
        int dado1 = (int) (Math.random() * 6) + 1;
        int dado2 = (int) (Math.random() * 6) + 1;
        System.out.println("El valor de los dados es:\n" + "\tDado 1: " + dado1 + "\n" + "\tDado 2: " + dado2);
        System.out.println("");

    // TIRADA DE DADOS ENTRE 1 Y 6
        int valorEntero = (int) (Math.floor(Math.random()*(1-6+1)+6));  // Valor entre M y N, ambos incluidos.
        System.out.println("El valor aleatorio es: " + valorEntero);
        System.out.println("");

    // TIRADA DE DADOS ENTRE 1 Y 100
        int valorEntero2 = (int) (Math.floor(Math.random()*(1-100+1)+100));  // Valor entre M y N, ambos incluidos.
        System.out.println("El valor aleatorio es: " + valorEntero2);
        System.out.println("");
    }
}
