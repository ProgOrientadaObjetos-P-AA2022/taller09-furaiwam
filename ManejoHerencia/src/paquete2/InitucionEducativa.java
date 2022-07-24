package paquete2;

public class InitucionEducativa {
    private String nom;
    private String siglas;

    public InitucionEducativa(String n, String s){
        nom = n;
        siglas = s;
    }

    public void establecerNom(String n) {
        nom = n;
    }

    public void establecerSiglas(String n) {
        siglas = n;
    }

    public String obtenerNom() {
        return nom;
    }

    public String obtenerSiglas() {
        return siglas;
    }

    @Override
    public String toString() {
        String cadena = String.format("%s - %s\n",
                nom, siglas);
        return cadena;
    }
}