public class Planta {

//campuri
    public double frunze;
    public String culoare;
    private  double vitamine = 0.0;
    private String nume;


//constructor
    public Planta() {
        this.frunze = frunze;
        this.culoare = culoare;
        this.vitamine = vitamine;
        this.nume = nume;
    }


//metode get/set pt campurile private
    public String getName(){
        return nume;
    }

    public void setName(String nume_planta){
        this.nume = nume_planta;
    }

    public void setVitamine(double vitamine_planta){
        vitamine = vitamine_planta;
    }

    public double getVitamine(){
        return this.vitamine;
    }


//metode
    public void culoarePlanta(String culoare){
        this.culoare  = culoare;
    }

    public void numarFrunze(double suma_frunze) {
        frunze += suma_frunze;
    }


// vitaminele vietii
    public void depozitareVitamine(double suma) {
        vitamine += suma;
    }

    public double afisareVitamine() {
        return vitamine;
    }

    public void retragereVitamine(double suma) {
        vitamine -= suma;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume=nume;
    }




}

