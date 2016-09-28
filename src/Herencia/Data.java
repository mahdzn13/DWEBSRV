package Herencia;

/**
 * Created by mahernandezd on 28/09/16.
 */
public class Data {

    //#1
    private static final String SEPARADOR = "-";

    //private String data;
    int dia;
    int mes;
    int any;


    /*
    public String getData() {
        return data;
    }

    public void setData(String data) throws Exception {
        //#2
        if (!data.contains(SEPARADOR)) throw new Exception();
        this.data = data;
    }

    public int getAny(){
        return data != null ? descomposaData()[2] : 0;
    }

    private int[] descomposaData(){

        String[] dataDescomposada = data.split(SEPARADOR);
        int[] dataDescomposadaInt = new int[dataDescomposada.length];
        dataDescomposadaInt[0] = Integer.parseInt(dataDescomposada[0]);
        dataDescomposadaInt[1] = Integer.parseInt(dataDescomposada[1]);
        dataDescomposadaInt[2] = Integer.parseInt(dataDescomposada[2]);

        return dataDescomposadaInt;

    }*/

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

    public int getAny() {
        return any;
    }

    public void setAny(int any) {
        this.any = any;
    }
}

class AnyDeTrespas extends Data{
    private boolean esDeTrespas() {
        if (getAny() % 2 == 0) {
            return true;
        }
        return false;
    }
}