package controller;

import java.util.ArrayList;

import model.Dependente;
import view.DependenteView;

public class DependenteController {
    public ArrayList<DependenteView> views = new ArrayList<>();
    public Dependente model;

    public DependenteController(Dependente dependente){
        this.model = dependente;
        this.nova_view();
    }

    public String getDadosDepentente(){
        return "Nome: " + this.model.getNom_dep() + " - Socio: " + this.model.getSocio().getNome_socio();
    }

    public void nova_view(){
        this.views.add(new DependenteView(this));
    }
}
