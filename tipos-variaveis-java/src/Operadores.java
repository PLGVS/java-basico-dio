public class Operadores {
    public static void main(String[] args) {
        String nomeUm = "Pedro";
        String nomeDois = new String("Pedro");

        System.out.println(nomeUm.equals(nomeDois));

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;
        System.out.println("numeroUm é igual ao numeroDois?" + simNao);

        simNao = numero1 != numero2;

        System.out.println("numeroUm é diferente do numeroDois?" + simNao);

    }
}
