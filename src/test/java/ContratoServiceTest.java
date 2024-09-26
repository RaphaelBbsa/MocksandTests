import dao.ContrataDao;
import dao.IContratoDao;
import org.junit.Assert;
import org.junit.Test;
import service.ContratoService;
import service.IcontratoService;
//esses testes são para testar a depedência da Interface. Se eu quisesse simular o comportamento dessa dependência
//eu faria um mock de contratoDao

public class ContratoServiceTest {

    @Test(expected = UnsupportedOperationException.class)
    public void salvarTest(){
        IContratoDao dao = new ContrataDao();
        IcontratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);

    }

    @Test
    public void buscarTest(){
        IContratoDao dao = new ContrataDao();
        IcontratoService service = new ContratoService(dao);
        String resultado = service.buscar("1");//o método buscar aqui é a do contratoService, que chama o método buscar da instância contratoDao, que é o objeto que passei no construtor
        Assert.assertEquals("Contrato encontrado", resultado);//no contraDao, ele retorna a string "Contrato enocntrado"
        //houve uma confusão para eu entender, mas agora já compreendi
    }
    @Test
    public void atualizarTest (){
        IContratoDao dao = new ContrataDao();
        IcontratoService service = new ContratoService(dao);
        String resultado = service.atualizar("1", "2");
        Assert.assertEquals("Contrato atualizado", resultado);
    }

    @Test
    public void excluirTest (){
        IContratoDao dao = new ContrataDao();
        IcontratoService service = new ContratoService(dao);
        String resultado = service.excluir("1");
        Assert.assertEquals("Contrato excluído", resultado);
    }
}
