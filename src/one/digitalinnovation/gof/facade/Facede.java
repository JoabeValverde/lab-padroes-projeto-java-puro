package one.digitalinnovation.gof.facade;

import one.digitalinnovation.gof.subsistema.CrmService;
import one.digitalinnovation.gof.subsistema2.CepApi;

public class Facede {
    public void migrarCliente(String nome, String cep){
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);
        String endereco = CepApi.getInstancia().recuperarEndereco(cep);
        CrmService.gravarCliente(nome,cep,cidade,estado, endereco);
    }
}
