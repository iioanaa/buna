import java.util.*;
public class Gradina {
// campuri
    public int teren;
    public int nrFlori=0;
    private int litriiApa = 0;
    private int nrVizitatori = 0;


//constructor
    public Gradina(){
        this.teren = teren;
        this.nrFlori = nrFlori;
        this.litriiApa = litriiApa;
        this.nrVizitatori = nrVizitatori;
    }

   // Planta trandafir  = new Planta();

// metode get/set pt campurile private
    public void setVizitatori(int nrVizitatori_Gradina){
        nrVizitatori = nrVizitatori_Gradina;
    }
    public int getVizitatori(){
        return this.nrVizitatori;
    }

    public void setApa(int litriiApa_Gradina){
        litriiApa = litriiApa_Gradina;
    }
    public int getApa(){
         return this.litriiApa;
    }

// metode
    public void suprafataTeren(int teren){
        teren  = teren;
    }

// construiesc vectorul
    Planta musetel = new Planta();
    Planta papadie= new Planta();
    Planta lalea= new Planta();
    Planta trandafir = new Planta();
    Planta muscata = new Planta();
    Planta goala = new Planta();
    Planta[] planteGeo = {musetel, papadie, lalea,trandafir,muscata,goala};


}


