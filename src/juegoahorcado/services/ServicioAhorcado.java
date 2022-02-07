//Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener 
//como atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y 
//la  cantidad  jugadas  máximas  que  puede  realizar  el  usuario.  Definir  los  siguientes 
//métodos con los parámetros que sean necesarios: 
// 
//• Constructores, tanto el vacío como el parametrizado. 
//• Metodo  crearJuego():  le  pide  la  palabra  al  usuario  y  cantidad  de  jugadas  máxima. 
//Con la palabra del usuario, pone la longitud de la palabra, como la longitud del vector. 
//Después  ingresa  la  palabra  en  el  vector,  letra  por  letra,  quedando  cada  letra  de  la 
//palabra en un índice del vector. Y también, guarda en cantidad de jugadas máximas, 
//el valor que ingresó el usuario y encontradas en 0. 
//• Método  longitud():  muestra  la  longitud  de  la  palabra  que  se  debe  encontrar.  Nota: 
//buscar como se usa el vector.length. 
//• Método buscar(letra):  este método recibe una letra dada por el usuario y busca sila 
//letra ingresada es parte de la palabra o no. También informará si la letra estaba o no. 
//• Método encontradas(letra):  que reciba una letra ingresada por el usuario y muestre 
//cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá 
//devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se 
//busque una letra que no esté, se le restará uno a sus oportunidades. 
//• Método intentos(): para mostrar cuantas oportunidades le queda al jugador. 
//• Método juego(): el método juego se encargará de llamar todos los métodos 
//previamente mencionados e informará cuando el usuario descubra toda la palabra o 
//se quede sin intentos. Este método se llamará en el main.
package juegoahorcado.services;

import java.util.Scanner;
import juegoahorcado.entities.Ahorcado;

/**
 *
 * @author ati
 */
public class ServicioAhorcado {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Ahorcado comenzarJuego() {

        Ahorcado nuevoJuego = new Ahorcado();

        System.out.println("Ingrese la palabra");
        String palabra = leer.next();

        nuevoJuego.setCantLetras(palabra.length());
        
        String[] buscarLetra = new String[nuevoJuego.getCantLetras()];

        for (int i = 0; i < palabra.length(); i++) {

            
           
         buscarLetra[i] = palabra.substring(i, i+1);

        }

        nuevoJuego.setBuscar(buscarLetra);

        System.out.println("Ingrese la cant de jugadas");
        nuevoJuego.setJugadasMax(leer.nextInt());

        return nuevoJuego;
    }

    public int longitud(String[] buscar) {

        return buscar.length;
    }

    public int buscar(String letra, String[] buscar) {

        int cont = 0;

        for (int i = 0; i < buscar.length; i++) {
            if (buscar[i].equals(letra)) {

                cont++;
            }

        }

        if (cont == 0) {

            System.out.println("No se ha encontrado esa letra en la palabra.");

        } else {

            System.out.println("La palabra contiene esa letra");
        }

        return cont;
    }

    public boolean encontradas(String letra, Ahorcado nuevoJuego) {

        boolean seEncontraron = false;
        if (buscar(letra, nuevoJuego.getBuscar()) == 0) {

            nuevoJuego.setJugadasMax(nuevoJuego.getJugadasMax() - 1);

            seEncontraron = false;
        } else {

            nuevoJuego.setLetrasEncontradas(nuevoJuego.getLetrasEncontradas() + buscar(letra, nuevoJuego.getBuscar()));
            seEncontraron = true;

        }

        System.out.println("Se han encontrado " + nuevoJuego.getLetrasEncontradas() + " de " + nuevoJuego.getBuscar().length + " letras!");
        return seEncontraron;
    }

    public void juego(Ahorcado nuevoJuego) {

        String letra;
        int opc = 0;

        while (nuevoJuego.getJugadasMax() != 0 && nuevoJuego.getLetrasEncontradas() != nuevoJuego.getCantLetras()) {

            System.out.println("Menu Ahorcado:\n"
                    + "\n"
                    + "1 . Muestra longitud de la palabra.\n"
                    + "2 . Ingresa una letra!\n"
                    + "3 . Muestra la cantidad de intentos.");

            System.out.println("");
            System.out.println("Ingrese la opción!");

            opc = leer.nextInt();

            switch (opc) {

                case 1:

                    System.out.println("El largo de la palabra es : " + longitud(nuevoJuego.getBuscar()));
                    System.out.println("");
                    break;
                case 2:
                    letra = leer.next();
                    encontradas(letra, nuevoJuego);
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("Tienes" + nuevoJuego.getJugadasMax() + "intentos!");
                    break;

            }

        }

    }

}
