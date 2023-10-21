public class Main {
    public static void main(String[] args) {
        Cifrador prueba = new Cifrador();
        //prueba.cifraIdiomaLetra("uaugmsaumcmcapspreizxn", 'f');
        //prueba.cifraIdiomaLetra("peine", 'f');
        //prueba.cifraIdiomaLetra("aeroportuario", 'f');
        //prueba.cifraIdiomaLetra("cadenas perpetuas", 'p');
        System.out.println(prueba.dividirSilabas("esperanza"));
        System.out.println(prueba.dividirSilabas("speranza"));
        //prueba.cifraIdiomaLadron("cadenas perpetuas", 'i');
        //System.out.println(prueba.decifraLadron("cicadideninasis piperirpipetituasis"));
        //System.out.println(prueba.decifraLetra("capadepenapas peperpepetuapas"));    
        System.out.println(prueba.aplicaVesre("los animales nuevos")); 
        System.out.println(prueba.aplicaVesre("esperanza"));
        System.out.println(prueba.aplicaVesre("nuevos"));  
        System.out.println(prueba.aplicaVesre("los")); 
        System.out.println(prueba.inversionSilabica(prueba.dividirSilabas("animales")));
        System.out.println(prueba.inversionSilabica(prueba.dividirSilabas("nimale")));
    }        
}
