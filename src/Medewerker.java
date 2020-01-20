import org.json.JSONObject;

public class Medewerker {
    private String username;
    private String password;
    private String department;

    public Medewerker(String username, String password, String adfeling) {
        this.username = username;
        this.password = password;
        this.department = adfeling;
    }

    public Medewerker(JSONObject jsonObject) {
        this.username = jsonObject.getString("username");
        this.password = jsonObject.getString("password");
        this.department = jsonObject.getString("department");
    }

    // getters
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "\nUsername: " + getUsername() +
                "\nPassword: " + getPassword() +
                "\nDepartment: " + getDepartment() + "\n";

    }
}
