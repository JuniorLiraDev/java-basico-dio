package junior.lira.segundasemana;

public class MinhaClass {
    public static void main(String[] args) throws Exception {

        String primeiroNome = "Junior";
        String segundoNome = "Lira";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);

    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
    }

}
