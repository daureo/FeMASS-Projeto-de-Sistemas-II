package model;

public class Socio {
    private Long cartao_socio;
    private String nome_socio;
    private String end_socio;
    private String tel_socio;
    private String email_socio;
    private Categoria categoria;

    
    public Long regSocio(){
        //Logica de registro de um novo socio
        return this.cartao_socio;
    }

    public String consSocio(){
        //Logica de consulta a um socio
        return "Dados do Socio";
    }

    public Long getCartao_socio() {
      return this.cartao_socio;
    }
    public void setCartao_socio(Long value) {
      this.cartao_socio = value;
    }

    public String getNome_socio() {
      return this.nome_socio;
    }
    public void setNome_socio(String value) {
      this.nome_socio = value;
    }

    public String getEnd_socio() {
      return this.end_socio;
    }
    public void setEnd_socio(String value) {
      this.end_socio = value;
    }

    public String getTel_socio() {
      return this.tel_socio;
    }
    public void setTel_socio(String value) {
      this.tel_socio = value;
    }

    public String getEmail_socio() {
      return this.email_socio;
    }
    public void setEmail_socio(String value) {
      this.email_socio = value;
    }

    public Categoria getCategoria() {
      return this.categoria;
    }
    public void setCategoria(Categoria categoria) {
      this.categoria = categoria;
    }
}
