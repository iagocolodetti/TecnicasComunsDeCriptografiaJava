/**
 *
 * @author iagocolodetti
 */
public class MetodosUteis {
    public String padLeft(String text, int length, char c) {
        String textpad = "";
        for (int i = 0; i < length; i++) textpad += c;
        return textpad.substring(text.length()) + text;   
    }
    
    public boolean isBinary(String text) {
        for (char c : text.toCharArray()) if (c != '0' && c != '1') return false;
        return true;
    }

    public boolean isInvalidChar(char c, int min, int max) {
        return (c < min || c > max);
    }

    public String invalidCharsInString(String text, int min, int max) {
        String invalidchars = "";
        for (char c : text.toCharArray()) if (isInvalidChar(c, min, max)) invalidchars += c + " (" + (int)c + ")   ";
        return invalidchars;
    }
    
    public boolean intTryParse(String s) {
        try {
            Integer.parseInt(s);
            return true;
        }
        catch (NumberFormatException nfe) {
            return false;
        }
    }
}
