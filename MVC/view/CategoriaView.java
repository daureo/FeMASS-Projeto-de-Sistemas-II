package view;

import controller.CategoriaController;

public class CategoriaView {
    public CategoriaController controller;

    public CategoriaView (CategoriaController controller){
        this.controller = controller;
    }

    public void mostrar_categoria(){
        System.out.println(this.controller.interface_get_categoria());
    }
}
