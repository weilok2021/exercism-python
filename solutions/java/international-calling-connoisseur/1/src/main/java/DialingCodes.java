import java.util.Map;
import java.util.HashMap;

public class DialingCodes {
    Map<Integer, String> dictionary;

    public DialingCodes() {
        this.dictionary = new HashMap<>();
    }
    
    public Map<Integer, String> getCodes() {
        return dictionary;
    }

    public void setDialingCode(Integer code, String country) {
        dictionary.put(code, country);
    }

    public String getCountry(Integer code) {
        return dictionary.get(code);
    }

    public void addNewDialingCode(Integer code, String country) {
        // if theres no duplicate code, and country in dict, add this new (code,country) pair to dict
        if (!dictionary.containsKey(code) && !dictionary.containsValue(country)) {
            this.setDialingCode(code, country);
        }
        // else does nothing
    }

    public Integer findDialingCode(String country) {
        for (Integer code: dictionary.keySet()) {
            if (dictionary.get(code).equals(country)) {
                return code;
            }
        }
        return null;
    }

    public void updateCountryDialingCode(Integer code, String country) {
        Integer oldCode = findDialingCode(country);
        // Do nothing if the country is not in the map
        if (oldCode != null) {
            dictionary.remove(oldCode);
        }
        this.setDialingCode(code, country);
    }
}
