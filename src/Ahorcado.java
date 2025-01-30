import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        //declaraciones y asignaciones
        String palabraSecreta = "inteligencia";
        int intentosMaximos = 10;
        int intentos = 0;
        boolean palabraAdivinada = false;

        //arreglos
        char[] letrasAdivinadas = new char[palabraSecreta.length()];

        //Estructura de control; interativa (bucle)
        for (int index = 0; index < letrasAdivinadas.length; index++) {
            letrasAdivinadas[index] = '_';
        }

        //Estructura de control; interativa (bucle)

        while(!palabraAdivinada && intentos < intentosMaximos){
            System.out.println("Palabra a adivinar: " + String.valueOf(letrasAdivinadas) +  " (" + palabraSecreta.length() + "letras)");
            System.out.println("Ingresa una letra, por favor");
            char letra = Character.toLowerCase(scanner.next().charAt(0));

            boolean letraCorrecta = false;


            for (int i = 0; i < palabraSecreta.length(); i++) {
                //estructura de control condicional
                if (palabraSecreta.charAt(i) == letra) {
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;
                    
                }
            }
            if (!letraCorrecta) {
                intentos++;
                System.out.println("letra incorrecta te quedan "+ (intentosMaximos - intentos) + " intentos.");
            }
            if (String.valueOf(letrasAdivinadas).equals(palabraSecreta)) {
                palabraAdivinada = true;
                System.out.println("¡Feliciddades¡ Has adivinado la palabra  secreta: " + palabraSecreta);
            }
        }
        if(!palabraAdivinada){
            System.out.println("Te has quedado sin intentos!, GAME OVER" );
        }
        scanner.close();
    }
}
