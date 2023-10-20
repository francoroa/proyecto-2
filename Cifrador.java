public class Cifrador {

    public String cifraIdiomaLetra ( String original, char x){
        String formato = dividirSilabas(original);
        String nueva = "";
        String ultimaVocal = "";
        for (int i = 0; i < formato.length(); i++) {
            char c = formato.charAt(i);
            boolean esVocal = "aeiou".indexOf(c) != -1;
            if (esVocal) {
                ultimaVocal = String.valueOf(c);
            }
            if (c == '-') {
                nueva += String.valueOf(x) + ultimaVocal;
                continue;
            }
            if(i != formato.length()-1){
                nueva += c;
            }
            if (i == formato.length() - 1){
                if(esVocal){
                    nueva += c + String.valueOf(x) + ultimaVocal;
                } else {
                    nueva += String.valueOf(x) + ultimaVocal + c;
                }
            }
        }
        System.out.println(nueva);
        return nueva;
    }

    public String cifraIdiomaLadron(String original, char v){
        String cifra = "";
        for(int i = 0; i < original.length(); i++){
            char c = original.charAt(i);
            boolean esConsonante = "aeiou ".indexOf(c) == -1;
            String consonanteActual = "";
            if(esConsonante){
                consonanteActual = String.valueOf(c);
                cifra += consonanteActual + v + consonanteActual;
            } else {
                cifra += String.valueOf(c);
            }
        }
        System.out.println(cifra);
        return cifra;
    }

    public String decifraLadron(String cifrado){
        String nueva = "";
        for(int i = 0; i < cifrado.length(); i++){
            char c = cifrado.charAt(i);
            boolean esConsonanteActual = "bcdfghjklmnñpqrstvwxyz ".indexOf(c) != -1;
            boolean repetida = c==cifrado.charAt(i+2);
            if(esConsonanteActual && repetida){
                nueva += c;
                i += 2;
            } else {
                nueva += c;
            }
        }
        System.out.println(nueva);
        return nueva;
    }

    public String decifraLetra(String cifrado){
        String nueva = "";
        for(int i = 0; i < cifrado.length(); i++){
            char c = cifrado.charAt(i);
            if (i + 2 >= cifrado.length()) {
                nueva += c;
                break; 
            }
            boolean esVocalActual = "aeiou ".indexOf(c) != -1;
            boolean repetida = c==cifrado.charAt(i+2);
            if(esVocalActual && repetida){
                nueva += c;
                i += 2;
            } else {
                nueva += c;
            }
        }
        System.out.println(nueva);
        return nueva;
    }


    public static String dividirSilabas(String palabra) {
        String resultado = "";
        String silaba = "";
        boolean esVocalAnterior = false;

        for (int i = 0; i < palabra.length(); i++) {
            char c = palabra.charAt(i);
            boolean esVocalActual = "aeiou".indexOf(c) != -1;

            if (esVocalAnterior && !esVocalActual) {
                int j = i + 1;
                while (j < palabra.length() && "aeiou".indexOf(palabra.charAt(j)) == -1) {
                    j++;
                }
                if (j == palabra.length() || "aeiou".indexOf(palabra.charAt(j)) == -1) {
                    esVocalActual = true;
                } else {
                    resultado += silaba + "-";
                    silaba = "";
                }
            }

            silaba += c;
            esVocalAnterior = esVocalActual;
        }

        resultado += silaba;
        return resultado;
    }
    
}
