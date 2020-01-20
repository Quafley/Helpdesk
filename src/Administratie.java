import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Administratie {

    private ArrayList<Medewerker> medewerkers = new ArrayList<>();

    public String load(String fileName)  {
        try {
            String jsonString = new String(Files.readAllBytes(Paths.get(fileName)));
            JSONArray jsonArray = new JSONArray(jsonString);
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                Medewerker medewerker = new Medewerker(jsonObject);
                medewerkers.add(medewerker);
            }
        } catch (IOException e) {
            return "The file was not read!";
        }
        return "Read the json file correctly!";
    }

    public String printAllEmployees() {
        StringBuilder sb = new StringBuilder();
        for (Medewerker medewerker: medewerkers) {
            sb.append(medewerker);
        }
        return sb.toString();
    }

    /**
     * Het toevoegen van een user aan AL_medewerkers
     * @param username username
     * @param password password
     * @param department department
     * @param expertise expertise
     */
    public void addSMedewerker(String username, String password, String department, String expertise) {
        medewerkers.add(new S_Medewerker(username, password, department, expertise));
    }

    @Override
    public String toString() {
        return medewerkers.toString();
    }
}
