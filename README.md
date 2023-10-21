
# Proyecto 2 - Jerigonzas

## Introducción
Las jerigonzas son variantes dialectales lúdicas usadas para entretener, o bien, para poder hablar en secreto con alguien en particular sin que el resto entienda el mensaje. En este proyecto deberás implementar un traductor de jerigonzas, permitiendo cifrar y descifrar los mensajes.

### Sobre las jerigonzas

Hay distintos tipos de jerigonzas, en el proyecto solo se abordarán 3 tipos:

#### Idioma de la (alguna consonante)

En español, los más conocidos son los idiomas de la F y de la P, pero se puede generalizar con cualquier consonante.

Consiste en tomar cierta consonante, digamos x, y en un mensaje cualquiera dividir las palabras en sílabas, agregar x al final de cada sílaba y repetir la última vocal usada. En caso de que la sílaba original terminara en una o más consonantes, dichas consonantes se colocan después de la x y la vocal.

Técnicamente, después de x van tantas vocales como irían en la sílaba original a partir de la vocal fuerte, de tal modo que 'peine' en idioma F sería 'pefeinefe' y no 'peifinefe', sin embargo, para facilidad del proyecto se omitirá esta regla.

#### Idioma de la (alguna consonante)

Consiste en tomar cierta vocal, digamos 'v', y en un mensaje cualquiera duplicar todas las consonantes, colocando 'v' en medio de cada duplicado nuevo

#### Vesre

En su presentación más simple, la jerigonza vesre consiste en alterar el orden de las sílabas de una palabra, poniéndolas en el orden inverso en que se encontraban originalmente. De hecho, la palabra 'vesre' es 'revés' escrita en vesre.

Debido a la simplificación del español en el proyecto (consultar la sección Sobre la implementación), si una palabra inicia con una o más vocales, dichas vocales se quedarán fijas durante la inversión de las sílabas. Lo mismo ocurrirá si una palabra termina en una o más consonantes, dichas consonantes se quedarán fijas durante la inversión de las sílabas.
## Ejecución y Uso

El proyecto fue diseñado para poder ser utilizado utilizando un menú en la terminal. El menú consta de 5 opciones, las cuales incluyen la cifra y descifra del idioma ladrón e idioma letra, y la aplicación de la jerigonza verse. Todas pueden ser aplicadas en cadenas de palabras. 

El menú es ejecutado a traves de los siguientes comandos.

```console
foo@bar:~$ javac Main.java
foo@bar:~$ java Main.java
```

## Limitaciones

No se encontró ningún limitante después de realizar distintas pruebas sobre los métodos. Se utilizó un método normalizador para las cadenas, pero el mismo no incluye acentos distintos a "´" y limita el uso de dieresis a la "u". Si se utiliza el descifrador de ladrón en una cifra letra, se obtiene una excepción y el programa corta ejecución.
## Autores

 - Virueña Roa Franco, 424058298

