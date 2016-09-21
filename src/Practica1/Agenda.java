package Practica1;

/**
 * Created by mahernandezd on 21/09/16.
 */

public class Agenda {
    private int any;


    public void avPag(){

    }

    public void rePag(){

    }

    public int getAny() {
        return any;
    }

    public void setAny(int any) {
        this.any = any;
    }
}

class Pagina {
    private int dia;
    private int mes;
    private boolean festiu;

    public void createCita(){

    }

    public void deleteCita(){

    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }
}

class Cita {
    private String horaInici;
    private String horaFi;
    private String motiu;

    public void writeContent(){

    }

    public String getHoraInici() {
        return horaInici;
    }

    public void setHoraInici(String horaInici) {
        this.horaInici = horaInici;
    }

    public String getHoraFi() {
        return horaFi;
    }

    public void setHoraFi(String horaFi) {
        this.horaFi = horaFi;
    }

    public String getMotiu() {
        return motiu;
    }

    public void setMotiu(String motiu) {
        this.motiu = motiu;
    }
}
