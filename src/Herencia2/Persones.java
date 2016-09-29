package Herencia2;

/**
 * Created by mahernandezd on 29/09/16.
 */
public class Persones {
    private String nom;
    private String adreca;
}

class Estudiant extends Persones {
    private String documentIdentificacio;
    private int edat;
    private String dataAlta;
}

class Intercanvi extends Estudiant {
    private String paisOrigen;
}

class Treballadors extends Persones{
    private String numeroSeguridadSocial;
}

class Professor extends Treballadors{
    private String titulacio;
    private String especialitat;
}

class PersonalGestio extends Treballadors{
    private String posicio;
}