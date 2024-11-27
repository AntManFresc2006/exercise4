package Eclipse;

import java.util.Scanner;

public class JuegoEclipse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int eleccion, personajeUno, personajeDos, personajeTres, personajeCuatro, dado, verificado, verificadoDos;
		String cadena;

		System.out.println("\n Saludos, este es un juego de batalla de hasta 5 personajes, que son los siguientes.");
		System.out.println("\t1er personaje: Eclipse.");
		System.out.println("\t2ndo personaje: Evil.");
		System.out.println("\t3er personaje: Cosmic.");
		System.out.println("\t4to personaje: Elina.");
		System.out.println("\t5to personaje: Keravnos.");
		System.out.println("\t6to personaje: ChuhZmR.");
		do {
			System.out.println(
					"\nAhora, dime que es lo que quieres hacer, ¿Preferirias establecer un modo de combate 1vs1 (pulsa '1'), un modo de combate 2v2 (pulsa '2'), preferirias ver la informacion de cada personaje? (pulsa '3'), o preferirias acabar este juego? (pulsa '4')");
			eleccion = sc.nextInt();
			switch (eleccion) {
			case 1:
				System.out.println(
						"¡¡¡Perfecto!!! ¿Cual personaje quieres escoger? Escoge pulsando un numero del 1 al 6.");
				personajeUno = sc.nextInt();
				verificado = reeleccion(personajeUno);
				cadena = "";
				sysoPersonaje(verificado, cadena);
				personajeDos = randomizer();
				cadena = "";
				sysoEnemigo(personajeDos, cadena);
				break;
			case 2:
				System.out.println(
						"¡¡¡Perfecto!!! ¿Cual personaje quieres escoger? Escoge pulsando un numero del 1 al 6.");
				personajeUno = sc.nextInt();
				verificado = reeleccion(personajeUno);
				cadena = "";
				sysoPersonaje(verificado, cadena);
				personajeDos = sc.nextInt();
				verificadoDos = segundaReeleccion(personajeUno, personajeDos);
				cadena = "";
				sysoPersonaje(verificadoDos, cadena);
				personajeTres = randomizer();
				cadena = "";
				sysoEnemigo(personajeTres, cadena);
				personajeCuatro = randomizer();
				cadena = "";
				sysoEnemigo(personajeCuatro, cadena);
				break;
			case 3:
				String[][] informacion = new String[6][7];
				System.out.println(
						"\nGenial, pulsa un numero del personaje del cual quieres buscar informacion, y a continuacion te mostrare su informacion.");
				int personajeElegir = sc.nextInt();
				verificado = reeleccion(personajeElegir);
				verificado = verificado - 1;
				informacion(informacion);
				String[][] character = informacion;

				infoPJ(character, verificado);

				break;
			case 4:
				System.out.println(
						"\nMuchas gracias por haber jugado a este juego de batallas, ¡¡¡Espero que te haya gustado!!! :D");
				break;
			default:
				System.out.println(eleccion + "\n no es un numero de nuestro menu, vuelve a intentarlo.");
			}
		} while (eleccion != 4);
	}

	public static String[][] informacion(String[][] informacion) {
		informacion[0][0] = "\nEclipse, este es el personaje principal y el héroe de este mundo, al igual que todos los personajes de este juego, sus habilidades son muy poderosas e interesantes. Procede de la raza 'Phaisa' y sus habilidades que lo caracterizan son la manipulacion de su propia energia, la invulnerabilidad de ataques fisicos y su Soulfuck.";
		informacion[0][1] = "Clonación: Eclipse usara esta habilidad para crear una cantidad indefinida de clones, pueden ser 1 clon como minimo, y 4 como maximo, solo durara 1 turno.";
		informacion[0][2] = "Stat-Boosts: Eclipse potenciara un unico apartado de sus stats, el stat en cuestion sera completamente aleatorio y no se puede elegir.";
		informacion[0][3] = "Soulfuck: este ataque consiste en una serie de movimientos que manipulan y atacan el alma del enemigo, y adquiere un bonus de poder de un x0.25 ante seres inmateriales como Cosmic o Evil.";
		informacion[0][4] = "Adapting: Eclipse aprende el ultimo ataque o movimiento que haya usado su enemigo, sin incluir Divine-Attacks.";
		informacion[0][5] = "Energy-Attacks: Eclipse lanza un orbe de energia contra el enemigo, existe una posibilidad del 20% de que ese ataque absorba la salud de su enemigo en favor del propio Eclipse.";
		informacion[0][6] = "Intangibility: Los ataques fisicos tienen un 20% de probabilidad de fallar y potenciar el ataque y la defensa de Eclipse.";
		informacion[1][0] = "\nEvil, este es el hermano gemelo de Eclipse, quien posee las mismas habilidades y hax que Eclipse, tambien es el rival malvado del mismo, asi que su fuerza de destruccion es mayor que la de Eclipse, pero Eclipse es mejor que Evil cuando se trata de inteligencia y durabilidad.";
		informacion[1][1] = "Mental Manipulation: Evil lanzara pequeños orbes de energia que llegaran a la mente del enemigo y hara que se ataque a si mismo, este movimiento solo funciona con ataques no-fisicos, y siempre se realizara despues de que el enemigo lance su ataque.";
		informacion[1][2] = "";
		informacion[1][3] = "Soulfuck: este ataque consiste en una serie de movimientos que manipulan y atacan el alma del enemigo, y adquiere un bonus de poder de un x0.25 ante seres inmateriales como Cosmic o Eclipse.";
		informacion[1][4] = "";
		informacion[1][5] = "";
		informacion[1][6] = "Intangibility: Los ataques fisicos tienen un 20% de probabilidad de fallar y potenciar el ataque y la defensa de Evil.";
		informacion[2][0] = "\nCosmic, el dios del universo de Eclipse, sus habilidades llegan hasta niveles divinos, como la habilidad 'Time-Warping' y demas, que se explicaran en el panel de personajes.";
		informacion[2][1] = "Body-Change: Cosmic cambiara de tipo, puede cambiar de tipo inmaterial a tipo fisico, y viceversa.";
		informacion[2][2] = "";
		informacion[2][3] = "";
		informacion[2][4] = "";
		informacion[2][5] = "";
		informacion[2][6] = "";
		informacion[3][0] = "\nElina, ella es otra de las heroinas de este mundo, su set de ataques consiste en la manipulacion del tiempo y la capacidad de atrapar al enemigo en dimensiones especiales, haciendo uso de las 'Cosmic-Skills', que le permite atacar fisicamente tanto a Eclipse como a Evil, atacar a dioses como Cosmic, y demas.";
		informacion[3][1] = "";
		informacion[3][2] = "";
		informacion[3][3] = "";
		informacion[3][4] = "";
		informacion[3][5] = "";
		informacion[3][6] = "Armor: Elina posee una armadura que la cubre ante ataques fisicos y ataques mentales, su defensa sube un 10% ante ataques fisicos y un 25% ante ataques mentales.";
		informacion[4][0] = "\nKeravnos, este es el mejor amigo de Eclipse, tiene habilidades de manipulacion del espacio-tiempo, Time-Stopping y demas.";
		informacion[4][1] = "Item-Warping: Keravnos alterara la composicion fisica de todos los items del enemigo, haciendo que los elementos curativos le resten vida al enemigo, y que los elementos que potencien los atributos fisicos de su enemigo, se los baje.";
		informacion[4][2] = "Cosmic Skill: Black Holes: Keravnos enviara al enemigo a una dimension donde este no puede moverse ni defenderse, Keravnos lanzara una orda de agujeros negros, el minimo de agujeros negros es de 2 agujeros, y el maximo de 6.";
		informacion[4][3] = "Cosmic Skill: Mental Illness: Keravnos enviara al enemigo a una dimension donde torturara mentalmente al enemigo mentalmente, quitándole vida y bajando ligeramente su defensa, este movimiento es mas destructivo contra seres como Cosmic, Eclipse o Evil, tambien existe una posbilidad del 15% de que el enemigo sufra trastornos cerebrales y pueda hacerse daño a si mismo.";
		informacion[4][4] = "Time-Stop: Keravnos usara sus poderes sobrenaturales para detener el tiempo por el siguiente turno, esta tecnica solo se puede usar una sola vez.";
		informacion[4][5] = "Fastering: Keravnos alterara el entorno de batalla, haciendo que los personajes mas rapidos sean los mas rapidos, esta habilidad dura 5 turnos en total.";
		informacion[4][6] = "Equitative: los ataques fisicos que se lance contra seres inmateriales como Cosmic, Eclipse o Evil les hara daño, ignorando la intangibilidad de estos gracias a su Reality-Warping.";
		informacion[5][0] = "\nChuhZmR, este es sin duda alguna el personaje mas desbalanceado del juego, tiende a ser perezoso y normalmente la suerte de este mismo es demasiado baja, por suerte, tiene habilidades como 'BeforeDay' o 'ClassRest' que lo convierten en alguien muy poderoso si lo sabes utilizar.";
		informacion[5][1] = "BeforeDay: El usuario permanecera en estado de reposo por unos 3 turnos, al finalizar ese estado de reposo, este se recuperara toda su vida, y todos sus stats aumentaran x3.";
		informacion[5][2] = "ClassRest: El usuario usará un turno para dormir, en este estado se recuperara el 50% de toda su vida.";
		informacion[5][3] = "Gambling: Este movimiento siempre se ejecutara antes que el movimiento del enemigo, aqui, el usuario debera escoger cual sera el movimiento que hara su enemigo, en caso de no acertar, recibira el daño, y si acierta, el enemigo recibira el daño de su mismo ataque con un bonus de x0.25.";
		informacion[5][4] = "Golpes normales: El usuario lanzara un golpe al enemigo, si, solamente eso.";
		informacion[5][5] = "Super-Perfect-Cell-Kamehameha: El usuario lanzara un kamehameha a la perfeccion al enemigo, capaz de destruir facilmente el sistema solar";
		informacion[5][6] = "Infinite: El usuario tiene una cantidad infinita de items a su disposicion.";

		return informacion;
	}

	public static void infoPJ(String[][] informacion, int numero) {
		System.out.println(informacion[numero][0]);
		System.out.println("Aqui te enseñare todas las habilidades de tu personaje. :)");
		for (int i = 1; i < 7; i++) {
			if (i == 6) {
				System.out.println("\nLa habilidad es ----> " + informacion[numero][i]);
			} else {
				System.out.println("\n" + i + ": " + informacion[numero][i]);
			}
		}

	}

	public static int segundaReeleccion(int primerPersonaje, int segundoPersonaje) {
		Scanner sc = new Scanner(System.in);

		while (segundoPersonaje < 1 || segundoPersonaje > 6) {
			System.out.println(segundoPersonaje
					+ " no es un numero asignado a los 6 personajes de nuestro roster, por favor, vuelve a intentarlo.");
			segundoPersonaje = sc.nextInt();
		}

		while (segundoPersonaje == primerPersonaje) {

			System.out.println("Error, no se puede escoger dos veces al mismo personaje.");
			segundoPersonaje = sc.nextInt();
		}
		return segundoPersonaje;
	}

	public static int reeleccion(int primerPersonaje) {
		Scanner sc = new Scanner(System.in);
		while (primerPersonaje < 1 || primerPersonaje > 6) {
			System.out.println(primerPersonaje
					+ " no es un numero asignado a los 6 personajes de nuestro roster, por favor, vuelve a intentarlo.");
			primerPersonaje = sc.nextInt();
		}
		return primerPersonaje;

	}

	public static int randomizer() {
		int max = 6;
		int min = 1;
		int range = (max - min) + min;
		int random = (int) ((range * Math.random()) + min);
		return random;
	}

	public static void sysoPersonaje(int personaje, String cadena) {
		cadena = "Has escogido a... ";
		if (personaje == 1) {
			cadena += "Eclipse.";
		}
		if (personaje == 2) {
			cadena += "Evil.";
		}
		if (personaje == 3) {
			cadena += "Cosmic.";
		}
		if (personaje == 4) {
			cadena += "Elina.";
		}
		if (personaje == 5) {
			cadena += "Keravnos.";
		}
		if (personaje == 6) {
			cadena += "ChuhZmR.";
		}
		System.out.println(cadena);
	}

	public static void sysoEnemigo(int personaje, String cadena) {
		cadena = "Y tu enemigo es... ";
		if (personaje == 1) {
			cadena += "Eclipse.";
		}
		if (personaje == 2) {
			cadena += "Evil.";
		}
		if (personaje == 3) {
			cadena += "Cosmic.";
		}
		if (personaje == 4) {
			cadena += "Elina.";
		}
		if (personaje == 5) {
			cadena += "Keravnos.";
		}
		if (personaje == 6) {
			cadena += "ChuhZmR.";
		}
		System.out.println(cadena);
	}
}