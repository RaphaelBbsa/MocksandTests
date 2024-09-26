package service;

import dao.IContratoDao;

public class ContratoService implements IcontratoService {
    @Override
    public String buscar(String id) {
        return contratoDao.buscar(id);
    }



    @Override
    public String atualizar(String id, String novoValor) {
      return  contratoDao.atualizar(id, novoValor);
    }

    @Override
    public String excluir(String id) {
        return "Contrato excluído";
    }

    private IContratoDao contratoDao;

    public ContratoService (IContratoDao dao){
        this.contratoDao = dao;
    }
    @Override
    public String salvar() {
        contratoDao.salvar();
        return "Sucesso";
    }
}
