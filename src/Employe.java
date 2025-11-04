public class Employe {
    private int id ;
    private String nom ;
    private String prenom ;
    private String nomDepartemnt ;
    private int grade ;
    public Employe(){};
    public Employe(int id, String nom, String prenom, String nomDepartemnt, int grade) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.nomDepartemnt = nomDepartemnt;
        this.grade = grade;
    };

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNomDepartemnt() {
        return nomDepartemnt;
    }

    public void setNoimDepartemnt(String nomDepartemnt) {
        this.nomDepartemnt = nomDepartemnt;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", noimDepartemnt='" + nomDepartemnt + '\'' +
                ", grade=" + grade +
                '}';
    }
}
