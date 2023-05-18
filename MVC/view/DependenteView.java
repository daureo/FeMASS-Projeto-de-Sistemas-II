package view;

import controller.DependenteController;

public class DependenteView {
    private DependenteController controller;
    
    public DependenteView(DependenteController controller){
        this.controller = controller;
    }

    public void mostrarDependente(){
        System.out.println(this.controller.getDadosDepentente());
    }

}
