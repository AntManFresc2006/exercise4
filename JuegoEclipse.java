package Eclipse;

import java.util.Scanner;

public class JuegoEclipse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int eleccion, personajeUno, personajeDos, personajeTres, personajeCuatro, dado;
		
		System.out.println("\n Saludos, este es un juego de batalla de hasta 5 personajes, que son los siguientes.");
		System.out.println("\t1er personaje: Eclipse.");
		System.out.println("\t2ndo personaje: Evil.");
		System.out.println("\t3er personaje: Cosmic.");
		System.out.println("\t4to personaje: Elina.");
		System.out.println("\t5to personaje: Keravnos.");
		System.out.println("\t6to personaje: ChuhZmR.");
		do {
			System.out.println("\nAhora, dime que es lo que quieres hacer, ¿Preferirias establecer un modo de combate 1vs1 (pulsa '1'), un modo de combate 2v2 (pulsa '2'), preferirias ver la informacion de cada personaje? (pulsa '3'), o preferirias acabar este juego? (pulsa '4')");
			eleccion = sc.nextInt();
			switch (eleccion) {
			case 1:
				System.out.println("¡¡¡Perfecto!!! ¿Cual personaje quieres escoger? Escoge pulsando un numero del 1 al 6.");
				personajeUno=sc.nextInt();
				reeleccion(personajeUno);
				sysoPersonaje(personajeUno);
				personajeDos = randomizer();
				sysoPersonaje(personajeDos);
				
				break;
			case 2:
				break;
			case 3:
				String[][] informacion = new String [6][6];
				System.out.println("\nGenial, pulsa un numero del personaje del cual quieres buscar informacion, y a continuacion te mostrare su informacion.");
				int personajeElegir = sc.nextInt();
				reeleccion(personajeElegir);
				personajeElegir = personajeElegir -1;
				informacion(informacion);
				String [][] character = informacion;
				
				infoPJ(character, personajeElegir);
				
				
				break;
			case 4:
				System.out.println("\nMuchas gracias por haber jugado a este juego de batallas, ¡¡¡Espero que te haya gustado!!! :D");
				break;
				default:
					System.out.println(eleccion+"\n no es un numero de nuestro menu, vuelve a intentarlo.");
			}
			} while (eleccion!=4);
		}

	
	
	
	public static String[] [] informacion (String [][] informacion) {
		informacion[0][0] = "\nEclipse, este es el personaje principal y el héroe de este mundo, al igual que todos los personajes de este juego, sus habilidades son muy poderosas e interesantes. Procede de la raza 'Phaisa' y sus habilidades que lo caracterizan son la manipulacion de su propia energia, la invulnerabilidad de ataques fisicos y su Soulfuck.";
		informacion[0][1] = "Clonación: Eclipse usara esta habilidad para crear una cantidad indefinida de clones, pueden ser 1 clon como minimo, y 4 como maximo.";
		informacion[0][2] = "Clonación: Eclipse usara esta habilidad para crear una cantidad indefinida de clones, pueden ser 1 clon como minimo, y 4 como maximo.";
		informacion[0][3] = "Clonación: Eclipse usara esta habilidad para crear una cantidad indefinida de clones, pueden ser 1 clon como minimo, y 4 como maximo.";
		informacion[0][4] = "Clonación: Eclipse usara esta habilidad para crear una cantidad indefinida de clones, pueden ser 1 clon como minimo, y 4 como maximo.";
		informacion[0][5] = "Clonación: Eclipse usara esta habilidad para crear una cantidad indefinida de clones, pueden ser 1 clon como minimo, y 4 como maximo.";
		informacion[1][0] = "\nEvil, este es el hermano gemelo de Eclipse, quien posee las mismas habilidades y hax que Eclipse, tambien es el rival malvado del mismo, asi que su fuerza de destruccion es mayor que la de Eclipse, pero Eclipse es mejor que Evil cuando se trata de inteligencia y durabilidad.";
		informacion[1][1] = "";
		informacion[1][2] = "";
		informacion[1][3] = "";
		informacion[1][4] = "";
		informacion[1][5] = "";
		informacion[2][0] = "\nCosmic, el dios del universo de Eclipse, sus habilidades llegan hasta niveles divinos, como la habilidad 'Time-Warping' o 'ItemChanges', que se explicaran en el panel de personajes.";
		informacion[2][1] = "";
		informacion[2][2] = "";
		informacion[2][3] = "";
		informacion[2][4] = "";
		informacion[2][5] = "";
		informacion[3][0] = "\nElina, ella es otra de las heroinas de este mundo, su set de ataques consiste en la manipulacion del tiempo y la capacidad de atrapar al enemigo en dimensiones especiales, haciendo uso de las 'Cosmic-Skills', que le permite atacar fisicamente tanto a Eclipse como a Evil, atacar a dioses como Cosmic, y demas.";
		informacion[3][1] = "";
		informacion[3][2] = "";
		informacion[3][3] = "";
		informacion[3][4] = "";
		informacion[3][5] = "";
		informacion[4][0] = "\nKeravnos, este es el mejor amigo de Eclipse, tiene habilidades de manipulacion del espacio-tiempo, Time-Stopping y demas.";
		informacion[4][1] = "";
		informacion[4][2] = "";
		informacion[4][3] = "";
		informacion[4][4] = "";
		informacion[4][5] = "";
		informacion[5][0] = "\nChuhZmR, este es sin duda alguna el personaje mas desbalanceado del juego, tiende a ser perezoso y normalmente la suerte de este mismo es demasiado baja, por suerte, tiene habilidades como 'BeforeDay' o 'ClassRest' que lo convierten en alguien muy poderoso si lo sabes utilizar.";
		informacion[5][1] = "BeforeDay: El usuario permanecera en estado de reposo por unos 3 turnos, al finalizar ese estado de reposo, este se recuperara toda su vida, y todos sus stats aumentaran x3.";
		informacion[5][2] = "ClassRest: El usuario usará un turno para dormir, en este estado se recuperara el 50% de toda su vida.";
		informacion[5][3] = "Gambling: Este movimiento siempre se ejecutara antes que el movimiento del enemigo, aqui, el usuario debera escoger cual sera el movimiento que hara su enemigo, en caso de no acertar, recibira el daño, y si acierta, el enemigo recibira el daño de su mismo ataque con un bonus de x0.25.";
		informacion[5][4] = "Golpes normales: El usuario lanzara un golpe al enemigo, si, solamente eso.";
		informacion[5][5] = "Super-Perfect-Cell-Kamehameha: El usuario lanzara un kamehameha a la perfeccion al enemigo, capaz de destruir facilmente el sistema solar";
		
		
		return informacion;
	}
	public static void infoPJ(String [][] informacion, int numero) {
		System.out.println(informacion[numero][0]);
		System.out.println("Aqui te enseñare todas las habilidades de tu personaje. :)");
		for (int i = 0; i<6; i++) {
			System.out.println("\n"+(i+1)+": "+informacion[numero][i]);
		}
		
	}
	public static void reeleccion(int personaje) {
		Scanner sc = new Scanner(System.in);
		while (personaje < 1 || personaje > 6) {
			System.out.println(personaje+" no es un numero asignado a los 6 personajes de nuestro roster, por favor, vuelve a intentarlo.");
			personaje = sc.nextInt();
			
		}
	}
	
	public static int randomizer () {
		int max = 6;
		int min = 1;
		int range = (max-min) + min;
		int random = (int) ((range * Math.random())+min);
		return random;
	}
	public static void sysoPersonaje(int personaje) {
		if (personaje == 1) {
			System.out.println("El personaje es... Eclipse");
		}
		if (personaje == 2) {
			System.out.println("El personaje es... Evil");
		}
		if (personaje == 3) {
			System.out.println("El personaje es... Cosmic");
		}
		if (personaje == 4) {
			System.out.println("El personaje es... Elina");
		}
		if (personaje == 5) {
			System.out.println("El personaje es... Keravnos");
		}
		if (personaje == 6) {
			System.out.println("El personaje es... ChuhZmR");
		}
	}
}
