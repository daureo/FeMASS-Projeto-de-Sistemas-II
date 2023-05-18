package controller;

import java.util.ArrayList;

import model.Mensalidade;
import view.MensalidadeView;

public class MensalidadeController {
    public ArrayList<MensalidadeView> views = new ArrayList<>();
    public Mensalidade model;

    public MensalidadeController(Mensalidade mensalidade){
        this.model = mensalidade;
        this.nova_view();
    }

    public void nova_view(){
        this.views.add(new MensalidadeView(this));
    }

    public String mostrarDetalhesMensalidade(){
        return "Socio: " + this.model.getSocio().getNome_socio() + " - Valor Mensalidade: " + this.model.getValor_mens() + " - Vencimento: " + this.model.getData_mens();
    }
}

