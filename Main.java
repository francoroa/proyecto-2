import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cifrador prueba = new Cifrador();

        System.out.println("____________________________");
         Scanner sc = new Scanner(System.in);
         boolean continuar = true;
         while(continuar){
             System.out.println("Bienvenide el menú, por favor, elige alguna de nuestras opciones:");
             System.out.println("Opción 1: Cifrador idioma letra");
             System.out.println("Opción 2: Descifrador idioma letra");
             System.out.println("Opción 3: Cifrador idioma ladron");
             System.out.println("Opción 4: Descifrador idioma ladron");
             System.out.println("Opción 5: Aplicador vesre");
             System.out.println("Opción 5: Terminar ejecución");
             int opcion = sc.nextInt();
             sc.nextLine();
             switch(opcion){
                 case 1:
                     System.out.println("Escribe una cadena de texto a cifrar (letra)");
                     String cadenaLetra = sc.nextLine();
                     System.out.println("Escribe la consonante cifradora");
                     char x = sc.next().charAt(0);
                     prueba.cifraIdiomaLetra(cadenaLetra, x);
                     break;
                 case 2:
                     System.out.println("Escribe la cadena en idioma letra a descifrar");
                     String cifraLetra = sc.nextLine();
                     prueba.decifraLetra(cifraLetra);
                     break;
                 case 3:
                     System.out.println("Escribe una cadena de texto a cifrar (ladron)");
                     String cadenaLadron = sc.nextLine();
                     System.out.println("Escribe la consonante cifradora");
                     char v = sc.next().charAt(0);
                     prueba.cifraIdiomaLadron(cadenaLadron, v);
                     break;
                 case 4:
                     System.out.println("Escribe la cadena en idioma ladron a descifrar");
                     String cifraLadron = sc.nextLine();
                     prueba.decifraLadron(cifraLadron);
                     break;
                 case 5:
                     System.out.println("Escribe la cadena a aplicar vesre");
                     String cadenaVesre = sc.nextLine();
                     prueba.aplicaVesre(cadenaVesre);
                     break;
                 case 6:
                     continuar = false;
                     break;
                 default:
                     System.out.println("Opción no válida. Por favor, elige una opción del menú.");
                     break;
             }
             
             if (continuar) {
                 System.out.println("¿Deseas utilizar otra opción? (Y/n)");
                 String respuesta = sc.nextLine().toLowerCase();
                 if (respuesta.equals("n")) {
                     System.out.println("Hasta luego :)");
                     continuar = false;
                 }
             }
         }
         sc.close();
         
        // prueba.cifraIdiomaLetra("uaugmsaumcmcapspreizxn", 'f');
        // prueba.cifraIdiomaLetra("peine", 'f');
        // prueba.cifraIdiomaLetra("aeroportuario", 'f');
        // prueba.cifraIdiomaLetra("cadenas perpetuas", 'p');
        // System.out.println(prueba.dividirSilabas("esperanza"));
        // System.out.println(prueba.dividirSilabas("speranza"));
        // prueba.cifraIdiomaLadron("cadenas perpetuas", 'i');
        // System.out.println(prueba.decifraLadron("cicadideninasis piperirpipetituasis"));
        // System.out.println(prueba.decifraLetra("capadepenapas peperpepetuapas"));    
        // System.out.println(prueba.dividirSilabas("los animales nuevos"));
        // System.out.println(prueba.aplicaVesre("los animales nuevos")); 
        // System.out.println(prueba.dividirSilabas("esperanza"));
        // System.out.println(prueba.aplicaVesre("esperanza"));
        // System.out.println(prueba.dividirSilabas("nuevos"));
        // System.out.println(prueba.aplicaVesre("nuevos")); 
        // System.out.println(prueba.dividirSilabas("los")); 
        // System.out.println(prueba.aplicaVesre("los")); 
        // System.out.println(prueba.inversionSilabica(prueba.dividirSilabas("animales")));
        // System.out.println(prueba.inversionSilabica(prueba.dividirSilabas("nimale")));

    }        
}
