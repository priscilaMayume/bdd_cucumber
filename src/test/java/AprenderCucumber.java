import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class AprenderCucumber  {
    @Dado("^que criei o arquivo corretamente$")
    public void queCrieiOArquivoCorretamente()  throws Throwable {
        System.out.printf("*************** PASSOU POR AQUI 1  ***************");

    }

    @Quando("^executar$")
    public void executar()  throws Throwable{
        System.out.printf("*************** PASSOU POR AQUI 2  ***************");
    }

    @Entao("^a especificacao deve finalizar com sucesso$")
    public void aEspecificacaoDeveFinalizarComSucesso() throws Throwable {
        System.out.printf("*************** PASSOU POR AQUI 3  ***************");

    }
}
