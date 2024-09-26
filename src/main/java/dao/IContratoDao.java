package dao;

public interface IContratoDao {

    void salvar ();
    String buscar (String id);
    String atualizar(String id, String NovoId);
    String excluir (String id);






}
