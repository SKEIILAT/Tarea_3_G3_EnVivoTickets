# EnVivoTickets
# Descripción de los patrones de diseño aplicados y su justificación
1. # Chain of Responsibility:
# Descripción: 
Este patrón permite pasar una solicitud a lo largo de una cadena de objetos receptores, donde cada uno tiene la posibilidad de procesar la solicitud o pasarla al siguiente objeto de la cadena.
# Justificación: 
El Chain of Responsibility se seleccionó ya que permite 
encadenar distintos niveles de soporte (por ejemplo, nivel básico de atención al cliente, 
soporte técnico y administración del evento). Si el primer nivel no soluciona el problema, 
lo pasa al siguiente, y así sucesivamente, sin que el cliente o el desarrollador deba hacer 
nuevo código con lógicas separadas para cada posible camino de resolución. Así se reduce 
la complejidad y se facilita la incorporación de nuevos niveles de soporte.

2. # Decorator (Opciones adicionales en los tickets):
# Descripción: 
El patrón Decorator permite añadir funcionalidades adicionales a un objeto de forma dinámica, sin alterar su estructura. Este patrón utiliza la composición en lugar de la herencia para añadir responsabilidades a los objetos.
# Justificación: 
El Decorator se seleccionó ya que permite agregar un ticket 
estándar con una o varias funcionalidades extras. Así, en lugar de tener que crear nuevas 
clases por cada variación (por ejemplo, "TicketConBebidas", 
"TicketConBebidasYEstacionamiento"), se parte de un objeto base (el ticket) al que se le 
agregan decoradores. Esto simplifica el tener que agregar más detalles de ofertas 
adicionales sin cambiar la estructura interna del ticket original.

3. # Observer:
# Descripción:
En este patrón, un objeto (el sujeto) mantiene una lista de sus dependientes (los observadores) y notifica a estos observadores cuando su estado cambia.
# Justificación:
El Observer se seleccionó ya que permite que cada evento 
notifique automáticamente a todos los usuarios suscritos sobre cualquier cambio. Cuando 
ocurre una modificación, el evento (sujeto) envía una actualización a todos sus 
observadores (usuarios), manteniendo la información sincronizada y mejorando la 
experiencia del cliente al proporcionarle actualizaciones inmediatas.

4. # Abstract Factory
# Descripción:
Este patrón proporciona una interfaz para crear familias de objetos relacionados sin especificar sus clases concretas
# Justificación: 
El Abstract Factory se seleccionó ya que permite crear 
familias de objetos (como conjuntos de asientos, políticas de precios y configuraciones 
de espectáculos) sin especificar las clases concretas. Al definir fábricas abstractas, resulta 
sencillo añadir nuevas categorías de asientos, tipos de espectáculos o políticas de precio, 
ya que cada fábrica se encarga de proveer los objetos apropiados. Estos facilitan la 
adaptación del sistema a nuevas modalidades de eventos que haya sin afectar la lógica ya 
existente
