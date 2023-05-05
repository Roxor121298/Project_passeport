package projet_passeport;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Passeport {

    public Dose[] doses;

    // passeport sans Dose
    public Passeport ( )
    {
       doses = new Dose[3];
    }
    // passeport avec doses déjà données
    public Passeport ( Dose[] doses)
    {
      this.doses = doses;
    }

    public int possibleDAvoirAutreDose(Dose[] doses)
    {
        int i=-1;
        // vérifier s'il y a une Dose libre sur 3, retourner l'indice ou -1 s'il n'y a plus d'indice libre sur 3
        for (int j=0;j<3;j++) {
            if (doses[j].getDateVaccination() == null)
                i++;
        }
        return i;
    }

    public boolean ajouterDose (Dose[] d)
    {
        int indice = possibleDAvoirAutreDose(d);
	    //s'il y a pas de doses possibles, retourner faux
        if (indice == -1)
            return false;
        // si la dose possible est le premier vaccin , rien à vérifier
        if (indice == 0)
            return true;
	// si ce n'est pas le premier vaccin, calculer délai de 6 mois pour savoir si possible, l'ajouter dans le tableau si ce l'est
        else

            return true;
     }
}


