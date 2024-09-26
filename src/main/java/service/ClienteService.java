package service;

import dao.ClienteDao;
import dao.ClienteDaoMock;
import dao.IClienteDAO;

public class ClienteService {

    private IClienteDAO clienteDao;

    public ClienteService(IClienteDAO clienteDao){
        //clienteDao = new ClienteDao();
        this.clienteDao = clienteDao;
    }

    public String salvar (){
        clienteDao.salvar();
        return "Sucesso";
    }
}
