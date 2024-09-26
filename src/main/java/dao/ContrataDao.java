package dao;

public class ContrataDao implements IContratoDao{
    @Override
    public String buscar(String id) {
        //simulação de busca
        return "Contrato encontrado";
    }

    @Override
    public String atualizar(String id, String NovoId) {
        //simulação de atualização
        return "Contrato atualizado";
    }

    @Override
    public String excluir(String id) {
        //simulação de exclusão
        return "Contrato excluído";
    }

    @Override
    public void salvar() {
        throw new UnsupportedOperationException("Não dá");
    }
}
