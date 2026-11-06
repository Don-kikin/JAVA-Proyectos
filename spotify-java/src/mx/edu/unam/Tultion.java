package mx.edu.unam;

public class Tultion  {
    private boolean paid;

    public Tultion(boolean paid){
        this.paid=paid;
    }

    public boolean meetsRequirement(){
        return paid;
    }
}
