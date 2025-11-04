import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SocieteArrayList implements IGestion<Employe>, IRechercheAvancee<Employe> {

    private ArrayList<Employe> liste = new ArrayList<>();

    @Override
    public void ajouterEmploye(Employe t) {
        liste.add(t);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for (Employe e : liste) {
            if (e.getNom().equalsIgnoreCase(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employe t) {
        return liste.contains(t);
    }

    @Override
    public void supprimerEmploye(Employe t) {
        liste.remove(t);
    }

    @Override
    public void displayEmploye() {
        for (Employe e : liste) {
            System.out.println(e);
        }
    }

    @Override
    public void trierEmployeParId() {
        Collections.sort(liste, new Comparator<Employe>() {
            @Override
            public int compare(Employe e1, Employe e2) {
                return Integer.compare(e1.getId(), e2.getId());
            }
        });
    }

    @Override
    public void trierEmployeParNomDépartementEtGrade() {
        Collections.sort(liste, new Comparator<Employe>() {
            @Override
            public int compare(Employe e1, Employe e2) {
                int res = e1.getNomDepartemnt().compareToIgnoreCase(e2.getNomDepartemnt());
                if (res != 0) return res;
                res = Integer.compare(e1.getGrade(), e2.getGrade());
                if (res != 0) return res;
                return e1.getNom().compareToIgnoreCase(e2.getNom());
            }
        });
    }

    @Override
    public List<Employe> rechercherParDepartement(String nomDepartement) {
        List<Employe> resultat = new ArrayList<>();
        for (Employe e : liste) {
            if (e.getNomDepartemnt().equalsIgnoreCase(nomDepartement)) {
                resultat.add(e);
            }
        }
        return resultat;
    }
}
