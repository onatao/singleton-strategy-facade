package facade;

import subsistema1.crm.CrmService;
import subsistema2.cep.CepApi;

public class Facade {
    public void migrarCliente(String nome, String CEP) {
        String cidade = CepApi.getInstance().recuperarCidade(CEP);
        String estado = CepApi.getInstance().recuperarEstado(CEP);

        CrmService.gravarCliente("Nathan", cidade, estado);

        System.out.println(nome);
        System.out.println(cidade);
        System.out.println(estado);
    }
}
