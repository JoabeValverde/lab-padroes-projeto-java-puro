package one.digitalinnovation.gof.subsistema;

public class CrmService{
    public static void gravarCliente(String nome, String cep, String cidade, String estado, String endereco){
        System.out.println("Cliente salvo no sistema de CRM.");
        System.out.println(nome);
        System.out.println(cep);
        System.out.println(cidade);
        System.out.println(estado);
        System.out.println(endereco);
    }
}

