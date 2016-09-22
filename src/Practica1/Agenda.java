package Practica1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * Created by mahernandezd on 21/09/16.
 */

public class Agenda {
    private int any;
    private List<Pagina> pagines = new ArrayList<>();
    private int paginaActual = 0;

    public Agenda (){
        Scanner s = new Scanner(System.in);
        System.out.println("¿Año de la agenda?");
        any = s.nextInt();
        boolean festiu = false;

        for (int i = 1; i < 31; i++) {
            if (i % 7 == 0){
                festiu = true;
            }
            Pagina p = new Pagina(i,9,festiu);
            pagines.add(p);
            festiu = false;
        }
        pagines.get(paginaActual);
    }


    public void avPag(){
        if (pagines.size() > paginaActual){
            paginaActual++;
        }
    }

    public void rePag(){
        if (0 < paginaActual){
            paginaActual--;
        }
    }

    public int getAny() {
        return any;
    }
    public List<Pagina> getPagines() {
        return pagines;
    }

}

class Pagina{
    private int dia, mes;
    private boolean festiu;
    private List<Cita> citas = new ArrayList<>();

    public Pagina(int d, int m, boolean f){
        this.dia = d;
        this.mes = m;
        this.festiu = f;
    }

    public void createCita(){
        String horaI,horaF;

        Scanner s = new Scanner(System.in);
        System.out.println("Hora inicio de la cita (HH:MM):");
        horaI = s.nextLine();
        System.out.println("Hora final de la cita (HH:MM):");
        horaF = s.nextLine();

        Cita c = new Cita(horaI,horaF);
        c.writeContent();
        citas.add(c);
    }

    public void deleteCita(){


    }

    public String fecha(){
        Scanner s = new Scanner(System.in);
        int m,d;
        String hym;

        System.out.println("Mes de la cita? (0-12)");
        m = s.nextInt();
        System.out.println("Dia de la cita? (0-31)");
        d = s.nextInt();
        System.out.println("Hora y minutos de la cita? (HH:MM)");
        hym = s.nextLine();
        return m + " " + d + " " + hym;
    }

    public int getDia() {
        return dia;
    }
    public int getMes() {
        return mes;
    }
}

class Cita {
    private String horaInici, horaFi, motiu;

    public Cita(String horaI, String horaF){
        this.horaInici = horaI;
        this.horaFi = horaF;
    }

    public void writeContent(){
        Scanner s = new Scanner(System.in);
        motiu = s.nextLine();
    }

    public String getHoraInici() {
        return horaInici;
    }
    public String getHoraFi() {
        return horaFi;
    }
    public String getMotiu() {
        return motiu;
    }
}
