public class S_Medewerker extends Medewerker {

    private String expertise;

    public S_Medewerker(String username, String password, String department, String expertise) {
        super(username, password, department);
        this.expertise = expertise;
    }

    // getters
    public String getExpertise() {
        return expertise;
    }
}
