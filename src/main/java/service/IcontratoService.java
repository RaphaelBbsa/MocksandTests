package service;

public interface IcontratoService {
    String salvar ();
    String buscar (String id);
    String atualizar (String id, String  novoValor);
    String excluir(String id);

}
