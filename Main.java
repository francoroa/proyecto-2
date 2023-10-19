public class Main {
    public static void main(String[] args) {
        Cifrador prueba = new Cifrador();
        prueba.cifraIdiomaLetra("monstruos", 'f');
        prueba.cifraIdiomaLetra("peine", 'f');
        prueba.cifraIdiomaLetra("aeroportuario", 'f');
        prueba.cifraIdiomaLetra("cadenas perpetuas", 'p');
        System.out.println(prueba.dividirSilabas("esperanza"));
        prueba.cifraIdiomaLadron("monstruos", 'i');

    }        
}
