package view;

import controller.SocioController;

public class SocioView {
    public SocioController controller;

    public SocioView(SocioController controller){
        this.controller = controller;
    }

    public void mostrarSocio(Long cartao){
        System.out.println(this.controller.getDadosSocio(cartao));
    }
}
