package controller;

import java.util.ArrayList;

import model.Categoria;
import view.CategoriaView;

public class CategoriaController {
    public ArrayList<CategoriaView> views = new ArrayList<>();
    public Categoria model;


    public CategoriaController(Categoria categoria){
        this.model = categoria;
        this.nova_view();
    }
    
    public String interface_get_categoria(){
        return this.model.getCategoria();
    }

    public void interface_set_categoria(String categoria){
        this.model.setCategoria(categoria);
    }

    public void nova_view(){
        this.views.add(new CategoriaView(this));
    }

    public ArrayList<CategoriaView> getAllCategorias(){
        return this.views;
    }

    public Categoria getModel() {
      return this.model;
    }
    public void setModel(Categoria value) {
      this.model = value;
    }
}
