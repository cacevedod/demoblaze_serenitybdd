# language: es
Característica: Carrito de compras
  Como usuario admin de Demoblaze
  Deseo poder agregar elementos al carrito
  Para comprarlos

  Escenario: Agregar Samsung galaxy s6 al carrito vacio como admin
    Dado que "Nicolas" se loguea como "admin"
    Cuando agrega el "Samsung galaxy s6" al carrito vacio
    Entonces debe ver como único elemento el "Samsung galaxy s6"

  Esquema del escenario: Agregar <Objeto> al carrito vacio
    Cuando "Nicolas" agrega el <Objeto> al carrito vacio
    Entonces debe ver como único elemento el <Objeto>
    Ejemplos:
      | Objeto              |
      | "Samsung galaxy s6" |
      | "Nexus 6"           |

  Escenario: Eliminar Samsung galaxy s6 del carrito teniendo otro elemento
    Dado "Nicolas" agrega "Samsung galaxy s6" y "Nexus 6" al carrito vacio
    Cuando elimina "Samsung galaxy s6"
    Entonces debe ver como único elemento el "Nexus 6"

  Escenario: Agregar 3 Samsung galaxy s6 al carrito
    Cuando  "Luci" agrega "3" "Samsung galaxy s6" al carrito
    Entonces debe ver "3" elementos de "Samsung galaxy s6"