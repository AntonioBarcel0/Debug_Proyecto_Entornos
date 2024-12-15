# Debug_Proyecto_Entornos
Entrega del primer proyecto evaluable de la asignatura de Entornos de Desarrollo de 1ºDAW: "Debug"

## FizzBuzz!!

### Realizamos el Kata
En primer lugar he tenido que realizar el primer Kata, llamado "FizzBuzz!!", en que debemos listar números desde el 1 hasta el 100. Funciona de la siguiente manera: 
- Cuando toque iterar un número divisible entre 3, deberá mostrarse en pantalla lo siguiente: "Fizz!!".
- Cuando toque iterar un número divisible entre 5, deberá mostrarse en pantalla lo siguiente: "Buzz!!".
- Cuando toque iterar un número divisible entre 3 y 5, deberá mostrarse en pantalla lo siguiente: "FizzBuzz!!". 
<img width="854" alt="Captura de pantalla 2024-12-15 a las 10 07 31" src="https://github.com/user-attachments/assets/5ab2bff6-af00-4b6c-a3d2-cc46ea3c5b12" />

### Depuramos con Eclipse
A continuación, debemos probar los métodos de depuración con el IDE de Eclipse. He colocado dos breakpoints:
1. Dentro del bucle 'for', justo al inicio del bloque para verificar los valores de i en cada iteración.
2. Dentro de la condición (i % 3 == 0 && i % 5 == 0), para observar cuándo un número cumple con esta condición.
#### Colocación de los breakpoints
<img width="702" alt="Captura de pantalla 2024-12-15 a las 12 56 12" src="https://github.com/user-attachments/assets/2a4fec7d-19e3-4dbb-a98f-e87659586268" />

#### Inicio de la depuración
<img width="701" alt="Captura de pantalla 2024-12-15 a las 12 59 30" src="https://github.com/user-attachments/assets/b79a9a65-fb0c-41ae-9ce7-af9e0734451b" />

<img width="707" alt="Captura de pantalla 2024-12-15 a las 13 00 03" src="https://github.com/user-attachments/assets/a25e2e35-fbca-453a-9e60-42a015495f34" />

## Tamagotchi
En segundo lugar he tenido que realizar el Kata llamado "Tamagotchi!", en el que debemos crear un programa en Java que modele un Tamagotchi, una mascota electrónica. Generando una serie de atributos entre los que se encuentra:
- Hambre (hunger)
- Energía (energy)
- Humor (mood)

Este Tamagotchi, nos desvelará cuál es su estado, a partir de una serie de valores obtenidos gracias a unos métodos que debemos crear:
1. play
2. Eat
3. Sleep

Sabremos cómo se encuentra nuestra mascota mediante simbología que la representa gráficamente:
- `:-)` (contento) **cuando el humor está por encima de 8**
- `(-_-)` (cansado) **cuando la energía esté por debajo de 3**
- `(-_-) zZZ` (dormido) **cuando la energía llega a 0 o cuando se le ordena dormir.**
- `ఠ_ఠ` (enfadado) **cuando el humor esté por debajo de 2**
- `:-|` (normal) **resto de casos**
<img width="1079" alt="Captura de pantalla 2024-12-15 a las 10 08 01" src="https://github.com/user-attachments/assets/1c779b21-2d2e-4735-8099-eaf7022b602c" />
<img width="1080" alt="Captura de pantalla 2024-12-15 a las 10 08 20" src="https://github.com/user-attachments/assets/63a27ec7-95be-43f9-9f63-23c5b45b2004" />

