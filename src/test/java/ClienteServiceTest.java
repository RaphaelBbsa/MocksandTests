import dao.ClienteDao;
import dao.ClienteDaoMock;
import org.junit.Assert;
import org.junit.Test;
import service.ClienteService;

public class ClienteServiceTest {

    @Test
    public void salvarTest(){
        ClienteDaoMock mock = new ClienteDaoMock();
        ClienteService service = new ClienteService(mock);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarTest (){
        ClienteDao mock2 = new ClienteDao();
        ClienteService service = new ClienteService(mock2);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }
}
