
import java.util.Map;

public class ColorMap {
    private Map<String, Integer> colorValues;

    

    public int getValue(String color) {
        return colorValues.getOrDefault(color, -1);
    }

    public Map<String, Integer> getColorValues() {
        return colorValues;
    }
}
