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
<img width="1081" alt="Captura de pantalla 2024-12-15 a las 10 08 46" src="https://github.com/user-attachments/assets/0eb3c4c0-ab90-4380-890e-55f1a4c4e23f" />

### Depuramos con Eclipse
Colocamos un breakpoint en la línea donde se modifica el atributo hunger, ya que este punto es clave porque el método play modifica múltiples atributos, y queremos verificar que todos se actualicen correctamente después de esta línea. Y otro breakpoint al comienzo del método getStatus() que permitirá observar qué valores tienen los atributos hunger, energy y mood cuando se evalúan las condiciones para determinar el estado del Tamagotchi.
<img width="919" alt="Captura de pantalla 2024-12-15 a las 13 37 13" src="https://github.com/user-attachments/assets/cbcf7a7d-a788-44a6-a607-89d9c5b687ef" />

### Inicio de la depuración

En el play se verifica que:

- hunger se incremente.
- mood se incremente.
- energy disminuya.
<img width="738" alt="Captura de pantalla 2024-12-15 a las 13 42 44" src="https://github.com/user-attachments/assets/349f34d2-755f-4c2f-9b9f-80b3d74524e7" />
<img width="729" alt="Captura de pantalla 2024-12-15 a las 13 43 05" src="https://github.com/user-attachments/assets/f1c0464d-b8d7-4e80-a41e-946b01587336" />

En el getStatus se verifica que:

- La lógica de evaluación de condiciones (energy <= 0, mood > 8, etc.) funcione correctamente según los valores actuales de los atributos.
<img width="738" alt="Captura de pantalla 2024-12-15 a las 13 43 41" src="https://github.com/user-attachments/assets/07f35a20-da37-4c6b-82bd-305b4407f9a0" />



