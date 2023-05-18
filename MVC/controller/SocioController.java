package controller;

import java.util.ArrayList;

import model.Socio;
import view.SocioView;

public class SocioController {
    public ArrayList<SocioView> views = new ArrayList<>();
    public Socio model;

    public SocioController(Socio socio){
        this.model = socio;
        this.nova_view();
    }

    public void nova_view(){
        this.views.add(new SocioView(this));
    }

    public String getDadosSocio(Long cartao){
        return "Cartao: " + cartao + " - Nome: " + this.model.getNome_socio() + " - Endereco: " + this.model.getEnd_socio() + " - Telefone: " + this.model.getTel_socio() + " - E-mail: " + this.model.getEmail_socio() + " - Categoria: " + this.model.getCategoria().getCategoria();
    }

}
