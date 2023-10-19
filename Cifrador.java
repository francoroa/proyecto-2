public class Cifrador {
    // public String cifraIdiomaLetra ( String original, char x){
    //     String formato = dividirSilabas(original);
    //     String nueva = "";
    //     String ultimaVocal = "";
    //     boolean cambioSilaba = false;
    //     for (int i = 0; i < formato.length(); i++) {
    //         boolean fin = (i==formato.length()-1) ? true : false;
    //         char c = formato.charAt(i);
    //         cambioSilaba = (c=='-') ? true : false;
    //         boolean vocalActual = "aeiou".indexOf(c) != -1;
    //         if (!cambioSilaba && fin && vocalActual) {
    //             ultimaVocal = String.valueOf(c);
    //             nueva += String.valueOf(c) + String.valueOf(x) + ultimaVocal;
    //         } else if (!cambioSilaba && vocalActual) {
    //             nueva += String.valueOf(c);
    //             ultimaVocal = String.valueOf(c);
    //         } else if (!cambioSilaba) {
    //             nueva += String.valueOf(c);
    //         } else if (cambioSilaba) {
    //             nueva += String.valueOf(x) + ultimaVocal;
    //             cambioSilaba = false;
    //         }
    //     }
    //     System.out.println(nueva);
    //     return nueva;
    // }

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
    
    public static int cuentaSilabas(String palabra){
        int cuenta = 0;
        for(int i=0; i<palabra.length();i++){
            char c = palabra.charAt(i);
            if(c=='-'){
                cuenta += 1;
            }
        }
        return cuenta;
    }
}
