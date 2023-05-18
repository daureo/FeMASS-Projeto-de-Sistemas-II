import controller.CategoriaController;
import controller.SocioController;
import model.Categoria;
import model.Socio;
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

    }
}