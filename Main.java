public class Main {
    public static void main(String[] args) {
        Cifrador prueba = new Cifrador();
        //prueba.cifraIdiomaLetra("monstruos", 'f');
        //prueba.cifraIdiomaLetra("peine", 'f');
        //prueba.cifraIdiomaLetra("aeroportuario", 'f');
        //prueba.cifraIdiomaLetra("cadenas perpetuas", 'p');
        //System.out.println(prueba.dividirSilabas("polinomio"));
        prueba.cifraIdiomaLadron("cadenas perpetuas", 'i');
        System.out.println(prueba.decifraLadron("cicadideninasis i piperirpipetituasis"));
    }        
}
