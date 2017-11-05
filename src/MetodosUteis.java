/**
 *
 * @author iagocolodetti
 */
public class MetodosUteis {
    /**
     * O método adiciona uma determinada quantidade de caracteres à esquerda se o texto não tiver o tamanho definido.<br>
     * Por exemplo: padLeft("teste", 7, 'a') => Como o texto "teste" só tem 5 caracteres, faltam 2 para chegar a 7, então o retorno será "aateste".
     * @param text Texto a ser alterado.
     * @param length Tamanho total em que o texto deve ter.
     * @param c Caractere que será adicionado à esquerda para chegar ao tamanho definido.
     * @return Retorna o texto com o caractere escolhido à esquerda se o texto não tiver o tamanho definido
     */
    public String padLeft(String text, int length, char c) {
        String textpad = "";
        for (int i = 0; i < length; i++) textpad += c;
        return textpad.substring(text.length()) + text;   
    }
    
    /**
     * O método testa se a string é um número binário.
     * @param text Texto a ser comparado.
     * @return Retorna true se a String for um número binário, retorna false se não for.
     */
    public boolean isBinary(String text) {
        for (char c : text.toCharArray()) if (c != '0' && c != '1') return false;
        return true;
    }

    /**
     * O método testa se o caractere é válido ou não de acordo com o valores definidos como mínimo e máximo usando a tabela ASCII.
     * @param c Caractere a ser testado.
     * @param min Valor do caractere válido mínimo de acordo com a tabela ASCII.
     * @param max Valor do caractere válido máximo de acordo com a tabela ASCII.
     * @return Retorna true se o caractere for inválido, false se for válido.
     */
    public boolean isInvalidChar(char c, int min, int max) {
        return (c < min || c > max);
    }

    /**
     * O método verifica se existe caracteres inválidos na string.
     * @param text Texto a ser comparado.
     * @param min Valor do caractere válido mínimo de acordo com a tabela ASCII.
     * @param max Valor do caractere válido máximo de acordo com a tabela ASCII.
     * @return Retorna vazio se não houver caracteres inválidos na string e se houver, retorna os caracteres inválidos.
     */
    public String invalidCharsInString(String text, int min, int max) {
        String invalidchars = "";
        for (char c : text.toCharArray()) if (isInvalidChar(c, min, max)) invalidchars += c + " (" + (int)c + ")   ";
        return invalidchars;
    }
    
    /**
     * O método testa se a string pode ser convertida para inteiro.
     * @param s String a ser testada.
     * @return Retorna true se for possível converter a string em inteiro, false se não for.
     */
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
