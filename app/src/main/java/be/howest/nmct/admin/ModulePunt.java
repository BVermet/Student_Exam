package be.howest.nmct.admin;

/**
 * Created by Bryan on 13/02/2015.
 */
public class ModulePunt {

    private String moduleNaam;
    private int aantalStudiePunten;
    private double score;


    public String getModuleNaam(){
        return moduleNaam;
    }

    public void setModuleNaam(){
        this.moduleNaam = moduleNaam;
    }

    public int getAantalStudiePunten(){
        return aantalStudiePunten;
    }

    public void setAantalStudiePunten(){
        this.aantalStudiePunten = aantalStudiePunten;
    }

    public double getScore(){
        return score;
    }

    public void setScore(){
        this.score = score;
    }

    public ModulePunt(){
        super();
        this.moduleNaam = "placeholder";
        this.aantalStudiePunten = 0;
        this.score = 0;
    }

    public ModulePunt(String moduleNaam, int aantalStudiePunten, double score){
    super();
    this.moduleNaam = moduleNaam;
    this.aantalStudiePunten = aantalStudiePunten;
    this.score = score;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Uw module naam is: ")
        .append(moduleNaam)
        .append(", uw aantal studiepunten: ")
        .append(aantalStudiePunten)
        .append(", uw score: ")
        .append(score);

        return sb.toString();
    }
    @Override
    public int hashCode(){
    final int prime = 31;
        int result = 1;
        result = prime * result + ((moduleNaam == null) ? 0 : moduleNaam.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj){
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ModulePunt other = (ModulePunt) obj;
        if (moduleNaam == null) {
            if (other.moduleNaam != null)
                return false;
        } else if (!moduleNaam.equals(other.moduleNaam))
            return false;
        return true;
    }


}
