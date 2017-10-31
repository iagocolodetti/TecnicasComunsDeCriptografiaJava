/**
 *
 * @author iagocolodetti
 */

public class MainClass {
    public static void main(String[] args) {
        Criptografia c = new Criptografia();
        
        String texto = "IAGO COLODETTI";
        
        String cifraAditivaKey = "00101000";
        int cifraCesarDeslocamento = 50;
        String cifraMatematicaKey = "ARROZ";
        
        String cifrado, decifrado;
        
        System.out.println("Texto/Palavra: " + texto);
        
        
        System.out.println("\n\n- Cifra Aditiva -");
        System.out.println("Chave: " + cifraAditivaKey);
        try {
            cifrado = c.Cifrar(texto, cifraAditivaKey);
            decifrado = c.Cifrar(cifrado, cifraAditivaKey);
            System.out.println("Texto/Palavra cifrado(a): " + cifrado);
            System.out.println("Texto/Palavra decifrado(a): " + decifrado);
        }
        catch (Exception ex) {
            System.out.println("Erro ao cifrar/decifrar.\nException: " + ex.getMessage());
        }
        
        
        System.out.println("\n\n- Cifra de César -");
        System.out.println("Chave/Deslocamento: " + cifraCesarDeslocamento);
        try {
            cifrado = c.Cifrar(texto, cifraCesarDeslocamento, 32, 255);
            decifrado = c.Decifrar(cifrado, cifraCesarDeslocamento, 32, 255);
            System.out.println("Texto/Palavra cifrado(a): " + cifrado);
            System.out.println("Texto/Palavra decifrado(a): " + decifrado);
        }
        catch (Exception ex) {
            System.out.println("Erro ao cifrar/decifrar.\nException: " + ex.getMessage());
        }
        
        
        System.out.println("\n\n- Cifra Rail Fence -");
        System.out.println("Chave: Método não tem chave.");
        try {
            cifrado = c.Cifrar(texto);
            decifrado = c.Decifrar(cifrado);
            System.out.println("Texto/Palavra cifrado(a): " + cifrado);
            System.out.println("Texto/Palavra decifrado(a): " + decifrado);
        }
        catch (Exception ex) {
            System.out.println("Erro ao cifrar/decifrar.\nException: " + ex.getMessage());
        }
        
        
        System.out.println("\n\n- Cifra Matemática -");
        System.out.println("Chave: " + cifraMatematicaKey);
        try {
            cifrado = c.CifrarM(texto, cifraMatematicaKey);
            decifrado = c.DecifrarM(cifrado, cifraMatematicaKey);
            System.out.println("Texto/Palavra cifrado(a): " + cifrado);
            System.out.println("Texto/Palavra decifrado(a): " + decifrado);
        }
        catch (Exception ex) {
            System.out.println("Erro ao cifrar/decifrar.\nException: " + ex.getMessage());
        }
    }
}
