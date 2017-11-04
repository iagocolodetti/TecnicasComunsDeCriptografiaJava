/**
 *
 * @author iagocolodetti
 */

public class Criptografia extends Exception {
    MetodosUteis mu = new MetodosUteis();

    /**
    * Método de ciframento baseado na substituição de caracteres, no qual cada caractere é convertido para binário de acordo com a tabela ASCII e somado a uma chave binária.
    * Este método também decifra em caso de ser um(a) texto/palavra cifrado por ele.
    * Técnica conhecida como 'Cifra XOR'.
    * parâmetro "text" -> Texto/Palavra a ser cifrado(a).
    * parâmetro "key" -> Chave binária.
    */
    public String Cifrar(String text, String key) 
            throws Exception {
        if (text.isEmpty()) throw new Exception("Digite algum(a) texto/palavra para ser cifrado(a).");
        if (key.isEmpty()) throw new Exception("Digite uma chave (em binário).");
        if (!mu.isBinary(key)) throw new Exception("A chave deve ser em binário (0 ou 1).");
        if (key.length() > 8) throw new Exception("A chave deve ter no máximo 8 dígitos.");
        String invalidchars = mu.invalidCharsInString(text, 0, 255);
        if (!invalidchars.isEmpty()) throw new Exception("Existe(m) caractere(s) inválido(s) no(a) texto/palavra.\nCaracteres inválidos: " + invalidchars);

        String textCifrado = "";
        key = mu.padLeft(key, 8, '0');
        for (char c : text.toCharArray())
        {
            String charBinary = mu.padLeft(Integer.toBinaryString(c), 8, '0');
            String charCifrado = "";
            
            for (int i = 0; i < 8; i++) {
                if (Character.compare(charBinary.charAt(i), key.charAt(i)) == 0) charCifrado = charCifrado + "0";
                else charCifrado = charCifrado + "1";
            }
            textCifrado += (char)Integer.parseInt(charCifrado, 2);
        }
        return textCifrado;
    }

    /**
    * Método de ciframento baseado na substituição, no qual cada caractere é deslocado de acordo com um inteiro (k) usado para deslocamento. Técnica conhecida como 'Cifra de César'.
    * parâmetro "text" -> Texto/Palavra a ser cifrado(a).
    * parâmetro "deslocamento" -> Número inteiro (k) que será usado como base para efetuar o deslocamento do(s) caractere(s).
    * parâmetro "min" -> Caractere mínimo permitido.
    * parâmetro "max" -> Caractere máximo permitido.
    */
    public String Cifrar(String text, int deslocamento, int min, int max) 
            throws Exception {
        int MAX_DESLOCAMENTO = ((max + 1) - min);
        if (text.isEmpty()) throw new Exception("Digite algum(a) texto/palavra para ser cifrado(a).");
        if (deslocamento < 0 || deslocamento > MAX_DESLOCAMENTO) throw new Exception("O deslocamento não pode ser menor que 0 e não pode ser maior que " + MAX_DESLOCAMENTO + ".");
        String invalidchars = mu.invalidCharsInString(text, min, max);
        if (!invalidchars.isEmpty()) throw new Exception("Existe(m) caractere(s) inválido(s) no(a) texto/palavra.\nCaracteres inválidos: " + invalidchars);

        String textCifrado = "";
        for (char c : text.toCharArray()) {
            if ((c - deslocamento) < min) textCifrado += (char)((max + 1) - (min - (c - deslocamento)));
            else textCifrado += (char)(c - deslocamento);
        }
        return textCifrado;
    }

    /**
    * Método de deciframento para decifrar palavras cifradas com a técnica 'Cifra de César'.
    * parâmetro "text" -> Texto/Palavra a ser decifrado(a).
    * parâmetro "deslocamento" -> Número inteiro (k) que será usado como base para efetuar o deslocamento do(s) caractere(s).
    * parâmetro "min" -> Caractere mínimo permitido.
    * parâmetro "max" -> Caractere máximo permitido.
    */
    public String Decifrar(String text, int deslocamento, int min, int max) 
            throws Exception {
        int MAX_DESLOCAMENTO = ((max + 1) - min);
        if (text.isEmpty()) throw new Exception("Digite algum(a) texto/palavra para ser decifrado(a).");
        if (deslocamento < 0 || deslocamento > MAX_DESLOCAMENTO) throw new Exception("O deslocamento não pode ser menor que 0 e não pode ser maior que " + MAX_DESLOCAMENTO);
        String invalidchars = mu.invalidCharsInString(text, min, max);
        if (!invalidchars.isEmpty()) throw new Exception("Existe(m) caractere(s) inválido(s) no(a) texto/palavra.\nCaracteres inválidos: " + invalidchars);

        String textDecifrado = "";
        for (char c : text.toCharArray()) {
            if ((c + deslocamento) > max) textDecifrado += (char)((c + deslocamento) - MAX_DESLOCAMENTO);
            else textDecifrado += (char)(c + deslocamento);
        }
        return textDecifrado;
    }

    /**
    * Método de ciframento baseado na transposição, no qual cada caracteres são embaralhados. Técnica conhecida como 'Cifra Rail Fence (Zig Zag)'.
    * parâmetro "text" -> Texto/Palavra a ser cifrado(a).
    */
    public String Cifrar(String text) 
            throws Exception {
        if (text.isEmpty()) throw new Exception("Digite algum(a) texto/palavra para ser cifrado(a).");

        String linha1 = "";
        String linha2 = "";
        for (int i = 0; i < text.length(); i++) {
            if (i == 0 || (i % 2) == 0) linha1 += text.charAt(i);
            else linha2 += text.charAt(i);
        }
        return (linha1 + linha2);
    }

    /**
    * Método de deciframento para decifrar palavras cifradas com a técnica 'Cifra Rail Fence (Zig Zag)'.
    * parâmetro "text" -> Texto/Palavra a ser decifrado(a).
    */
    public String Decifrar(String text) 
            throws Exception {
        if (text.isEmpty()) throw new Exception("Digite algum(a) texto/palavra para ser decifrado(a).");

        String textDecifrado = "";
        String linha1 = "";
        String linha2 = "";
        if ((text.length() % 2) == 0) {
            linha1 = text.substring(0, (text.length() / 2));
            linha2 = text.substring((text.length() / 2));
        }
        else {
            linha1 = text.substring(0, ((text.length() / 2) + 1));
            linha2 = text.substring(((text.length() / 2) + 1));
        }
        int index = 0;
        for (int i = 0; i < text.length(); i++) {
            if (i == 0 || (i % 2) == 0) textDecifrado += linha1.charAt(index);
            else {
                textDecifrado += linha2.charAt(index);
                index++;
            }
        }
        return textDecifrado;
    }

    /**
    * Método de ciframento usando matemática. A partir da chave um valor é gerado e é somado ao valor em decimal de cada caractere na tabela ASCII.
    * parâmetro "text" -> Texto/Palavra a ser cifrado(a).
    * parâmetro "key" -> Chave.
    */
    public String CifrarM(String text, String key) 
            throws Exception {
        if (text.isEmpty()) throw new Exception("Digite algum(a) texto/palavra para ser cifrado(a).");
        if (key.isEmpty()) throw new Exception("Digite uma chave.");
        if (key.length() > 8) throw new Exception("A chave deve ter no máximo 8 dígitos.");
        String invalidchars = mu.invalidCharsInString(text, 32, 255);
        if (!invalidchars.isEmpty()) throw new Exception("Existe(m) caractere(s) inválido(s) no(a) texto/palavra.\nCaracteres inválidos: " + invalidchars);
        invalidchars = mu.invalidCharsInString(key, 33, 255);
        if (!invalidchars.isEmpty()) throw new Exception("Existe(m) caractere(s) inválido(s) na chave.\nCaracteres inválidos: " + invalidchars);

        int valorDaChave = 0;
        for (int i = 0; i < key.length(); i++) valorDaChave += (key.charAt(i) * (key.length() - i));
        int MAX_BLOCK_LENGTH = Integer.toHexString(255 + valorDaChave).length();
        String textCifrado = String.valueOf(MAX_BLOCK_LENGTH);
        for (char c : text.toCharArray()) textCifrado += mu.padLeft(Integer.toHexString(c + valorDaChave), MAX_BLOCK_LENGTH, '0');
        return textCifrado.toUpperCase();
    }

    /**
    * Método de deciframento usando matemática. Usando a mesma chave no qual um(a) determinado(a) texto/palavra foi cifrado(a) é possível decifrá-lo(a) usando este método.
    * parâmetro "text" -> Texto/Palavra a ser decifrado(a).
    * parâmetro "key" -> Chave.
    */
    public String DecifrarM(String text, String key) 
            throws Exception {
        if (text.isEmpty()) throw new Exception("Digite algum(a) texto/palavra para ser cifrado(a).");
        if (key.isEmpty()) throw new Exception("Digite uma chave.");
        if (key.length() > 8) throw new Exception("A chave deve ter no máximo 8 dígitos.");
        String invalidchars = mu.invalidCharsInString(text, 32, 255);
        if (!invalidchars.isEmpty()) throw new Exception("Existe(m) caractere(s) inválido(s) no(a) texto/palavra.\nCaracteres inválidos: " + invalidchars);
        invalidchars = mu.invalidCharsInString(key, 33, 255);
        if (!invalidchars.isEmpty()) throw new Exception("Existe(m) caractere(s) inválido(s) na chave.\nCaracteres inválidos: " + invalidchars);
        if (!mu.intTryParse(String.valueOf(text.charAt(0)))) throw new Exception("Não foi possível decifrar, texto cifrado adulterado.");
        int MAX_BLOCK_LENGTH = Integer.parseInt(String.valueOf(text.charAt(0)));

        int valorDaChave = 0;
        for (int i = 0; i < key.length(); i++) valorDaChave += (key.charAt(i) * (key.length() - i));
        String textDecifrado = "";
        for (int i = 1; i < text.length(); i += MAX_BLOCK_LENGTH) textDecifrado += (char)(Integer.parseInt(text.substring(i, i + MAX_BLOCK_LENGTH), 16) - valorDaChave);
        return textDecifrado;
    }
}
