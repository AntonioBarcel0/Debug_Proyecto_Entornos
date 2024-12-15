package tamagotchi;

public class Tamagotchi {

    // Atributos
    private int hunger;
    private int energy;
    private int mood;

    // Creamos el constructor para inicializar los atributos
    public Tamagotchi() {
        this.hunger = 4;
        this.energy = 4;
        this.mood = 4;
    }

    // Creamos el método para jugar
    public String play() {
        hunger += 1;       // Incrementa el hambre
        mood += 1;         // Incrementa su humor
        energy -= 1;       // Disminuye su energía
        return getStatus();
    }

    // Creamos el método para comer
    public String eat() {
        hunger -= 2;       // Disminuye el hambre
        if (hunger < 0) hunger = 0; // Control para que no baje de 0
        energy -= 1;       // Disminuye su energía
        return getStatus();
    }

    // Creamos el método para dormir
    public String sleep() {
        energy += 2;       // Incrementa su energía
        return "(-_-) zZZ"; // Siempre nos devuelve el estado dormido cuando duerme
    }
    
 // Creamos el método para ver los estados del Tamagotchi
    private String getStatus() {
        if (energy <= 0) {
            energy = 0;   // Asegura que la energía baje de 0
            return "(-_-) zZZ"; // Dormido
        }
        if (mood > 8) {
            return ":-)"; // Contento
        }
        if (energy < 3) {
            return "(-_-)"; // Cansado
        }
        if (mood < 2) {
            return "ఠ_ఠ"; // Enfadado
        }
        return ":-|"; // Normal
    }
    
   // Método main para imprimir por pantalla.
    public static void main(String[] args) {
        Tamagotchi tamagotchi = new Tamagotchi();
        
        System.out.println(tamagotchi.play());  
        System.out.println(tamagotchi.eat());   
        System.out.println(tamagotchi.sleep()); 
    }
}
	
