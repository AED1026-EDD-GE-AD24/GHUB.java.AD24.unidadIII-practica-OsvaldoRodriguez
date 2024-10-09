package hashtable;

public class Ciudades {
    private String Ciudad;
    private String Estado;
    private String Pais;
    public Ciudades() {
    }
    public Ciudades(String ciudad, String estado, String pais) {
        Ciudad = ciudad;
        Estado = estado;
        Pais = pais;
    }
    public String getCiudad() {
        return Ciudad;
    }
    public void setCiudad(String ciudad) {
        Ciudad = ciudad;
    }
    public String getEstado() {
        return Estado;
    }
    public void setEstado(String estado) {
        Estado = estado;
    }
    public String getPais() {
        return Pais;
    }
    public void setPais(String pais) {
        Pais = pais;
    }

    @Override
    public String toString() {
        return Ciudad + Estado + Pais;
    }
    

}
