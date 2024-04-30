public class MinhaClasse{
    public static void main(String[] args) {

       String primeiroNome="Diego";
       String segundoNome="Vieira";

       String nome_Completo = nomeCompleto(primeiroNome, segundoNome);

       System.out.println(nome_Completo);

        
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);

    }

}