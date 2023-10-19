public class Refactorizado {
    public String cifraIdiomaLetra ( String original, char x){
        String formato = dividirSilabas(original);
        String nueva = "";
        String ultimaVocal = "";
        boolean cambioSilaba = false;
        for (int i = 0; i < formato.length(); i++) {
            boolean fin = (i==formato.length()-1) ? true : false;
            char c = formato.charAt(i);
            cambioSilaba = (c=='-') ? true : false;
            boolean vocalActual = "aeiou".indexOf(c) != -1;
            if (!cambioSilaba && fin && vocalActual) {
                nueva += String.valueOf(c) + String.valueOf(x) + ultimaVocal;
                ultimaVocal = String.valueOf(c);
            } else if (!cambioSilaba && vocalActual) {
                ultimaVocal = String.valueOf(c);
                nueva += String.valueOf(c);
            } else if (!cambioSilaba) {
                nueva += String.valueOf(c);
            } else if (cambioSilaba) {
                cambioSilaba = false;
                nueva += String.valueOf(x) + ultimaVocal;
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
