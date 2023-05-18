package view;

import controller.MensalidadeController;

public class MensalidadeView {
    private MensalidadeController controller;

    public MensalidadeView(MensalidadeController controller){
        this.controller = controller;
    }

    public void mostrarMensalidade(){
        System.out.println(this.controller.mostrarDetalhesMensalidade());
    }
}
