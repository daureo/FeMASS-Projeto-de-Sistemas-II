import java.util.Date;

import controller.CategoriaController;
import controller.DependenteController;
import controller.MensalidadeController;
import controller.SocioController;
import model.Categoria;
import model.Dependente;
import model.Mensalidade;
import model.Socio;
import view.DependenteView;
import view.MensalidadeView;
import view.SocioView;

public class Main {

    public static void main(String[] args) {
        Categoria novaCat = new Categoria();
        CategoriaController novoCatController = new CategoriaController(novaCat);

        novoCatController.interface_set_categoria("Premium");

        Socio novoSocio = new Socio(new Long(1), "Daureo", "Rua Violetas, 41", "22988212088", "daureocosta@gmail.com", novaCat);
        SocioController novoSocioController = new SocioController(novoSocio);
        SocioView novoSocioView = new SocioView(novoSocioController);

        novoSocioView.mostrarSocio(new Long(1));

        Dependente novoDependente = new Dependente(new Long(1), "Thomas", "Filho", "na", novoSocio);
        DependenteController novoDepController = new DependenteController(novoDependente);
        DependenteView novoDepView = new DependenteView(novoDepController);

        novoDepView.mostrarDependente();

        Mensalidade novaMensalidade = new Mensalidade(novoSocio, new Date(), 145.00 );
        MensalidadeController novaMensalidadeController = new MensalidadeController(novaMensalidade);
        MensalidadeView novaMensalidadeView = new MensalidadeView(novaMensalidadeController);

        novaMensalidadeView.mostrarMensalidade();
        



    }
}