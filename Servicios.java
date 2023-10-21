public interface Servicios {
    /**
    * Usando el idioma de la consonante x, cifra un mensaje .
    *
    * @param original El texto a cifrar .
    * @param x La consonante con la que se va a cifrar .
    * @return el mensaje cifrado .
    */
    public String cifraIdiomaLetra ( String original , char x );
    /**
    * Descifra un mensaje escrito en idima de la consonante x, donde
    * la consonante x con que se cifr  ́o se puede inferir del mensaje .
    *
    * @param mensaje El texto a descifrar .
    * @return el mensaje descifrado .
    */
    public String descifraIdiomaLetra ( String mensaje );
    /**
    * Usando el idioma del ladr  ́on y la vocal v, cifra un mensaje .
    *
    * @param original El texto a cifrar .
    * @param v La vocal de apoyo en el cifrado .
    * @return el mensaje cifrado .
    */
    public String cifraIdiomaLadron ( String original , char v );
    /**
    * Descifra un mensaje escrito en idioma del ladr  ́on, donde
    * la vocal v con que se cifr  ́o se puede inferir del mensaje .
    *
    * @param mensaje El texto a descifrar .
    * @return el mensaje descifrado .
    */
    public String descifraIdiomaLadron ( String mensaje );
    /**
    * Aplica vesre a un mensaje , ya sea para cifrarlo o decscifrarlo .
    *
    * @param mensaje El texto con el que se va a trabajar .
    * @return el mensaje tras aplicarle vesre .
    */
    public String aplicaVesre ( String mensaje );
}
