public class Cifrador {


    public String cifraIdiomaLetra ( String original, char x){
        String formato = dividirSilabas(normalizador(original));
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
        String formato = normalizador(original);
        String cifra = "";
        for(int i = 0; i < formato.length(); i++){
            char c = formato.charAt(i);
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

    public String aplicaVesre(String cadena){
        String palabra = "";
        String resultado = "";
        String cadenaFormato = normalizador(cadena);

        for (int i = 0; i < cadenaFormato.length(); i++) {
            char c = cadenaFormato.charAt(i);
            if (c == ' ' || i == cadenaFormato.length() - 1) {
                if (i == cadenaFormato.length() - 1 && c != ' ') {
                    palabra += c;
                }
                resultado += vesrePalabra(palabra);
                if (c == ' ') {
                    resultado += ' ';
                }
                palabra = "";
            } else {
                palabra += c;
            }
        }
        return resultado;
    }

    public static String normalizador(String cadena){
        String nuevo = "";
        for(int i = 0; i<cadena.length();i++){
            char c = cadena.charAt(i);
            switch (c) {
                case 'á':
                    nuevo += 'a';
                    break;
                case 'é':
                    nuevo += 'e';
                    break;
                case 'í':
                    nuevo += 'i';
                    break;
                case 'ó':
                    nuevo += 'o';
                    break;
                case 'ú':
                    nuevo += 'u';
                    break;
                case 'ü':
                    nuevo += 'u';
                    break;
                default:
                    nuevo += c;
                    break;
            }
        }
        return nuevo;
    }

    public static String vesrePalabra(String mensaje){
        String formato = mensaje;
        String vesre = "";
        boolean inicioVocal = "aeiou".indexOf(formato.charAt(0)) != -1;
        boolean finalVocal = "aeiou".indexOf(formato.charAt(formato.length()-1)) != -1;
        char inicio = ' ';
        char fin = ' ';


        if(inicioVocal&&!finalVocal){
            inicio = formato.charAt(0);
            fin = formato.charAt(formato.length()-1);
            formato = formato.substring(1, formato.length()-1);
            vesre = inicio + inversionSilabica(dividirSilabas(formato)) + fin;
        }else if(inicioVocal){
            inicio = formato.charAt(0);
            formato = formato.substring(1);
            vesre = inicio + inversionSilabica(dividirSilabas(formato));
        } else if(!finalVocal){
            fin = formato.charAt(formato.length()-1);
            formato = formato.substring(0, formato.length()-1);
            vesre = inversionSilabica(dividirSilabas(formato)) + fin;
        }

        return vesre;

    }

    public static String inversionSilabica(String palabra){
        String resultado = "";
        String nuevaSilaba = "";
        for(int i = palabra.length()-1; i >= 0; i--){
            char c = palabra.charAt(i);
            boolean esCambio = c=='-';
            if(!esCambio){
                nuevaSilaba = c + nuevaSilaba;
            } else {
                resultado += nuevaSilaba;
                nuevaSilaba = "";
            }
        }
        resultado += nuevaSilaba;
        return resultado;
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
