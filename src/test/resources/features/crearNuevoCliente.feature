#language: es

Característica: Iniciar sesion en la pagina serenity.is con usuario y contrasena y registrar un nuevo cliente exitosamente

  Antecedentes:  Inicio sesion
    Dado que mario abre la pagina "https://serenity.is/demo/"
    Y realiza el login exitoso con usuario y contraena "admin" "serenity"

  @Historia @Regresion
  Esquema del escenario: inciar sesion y registrar un nuevo cliente

    Cuando damos click en nuevo cliente, diligenciamos el formulario con los datos de nuevo cliente y le damos click en ahorrar
      | <identificacion> | <nombreEmpresa> | <nombreContrato> | <tituloContrato> | <representante> | <direccion> | <pais> | <ciudad> | <region> | <codigoPostal> | <telefono> | <fax> | <fechaContacto> | <ultimoContacto> | <correo> |
    Entonces mario vera el nuevo cliente en la lista de clientes registrados
      | <identificacion> |
    Ejemplos:
      | identificacion | nombreEmpresa | nombreContrato | tituloContrato | representante  | direccion    | pais      | ciudad       | region | codigoPostal | telefono | fax      | fechaContacto | ultimoContacto | correo               |
      | ABJVO          | tecnologiaM   | tecno          | tecnoligiaR    | Laura Callahan | calle45 # 37 | Argentina | Buenos Aires | centro | b7506        | 36258765 | 36258765 | 11/23/2022    | Laura Callahan | tecnologia@gmail.com |

  @Pedido @Regresion

  Esquema del escenario: Iniciar sesion e Ingresar un nuevo pedido correctamente al sistema

    Y que mario quiere crear un nuecvo pedido
      | <cliente> | <fechaPedido> | <fechaEntrega> | <empleado> |
    Cuando mario ingrese los datos del pedido y de click en guardar
      | <producto> | <precio> | <cantidad> |
    Entonces mario vera el nuepo pedio en la lista de pedidos registrados
    Ejemplos:
      | cliente                 | fechaPedido | fechaEntrega | empleado       | producto | precio | cantidad |
      | Around the Horn [AROUT] | 01/27/2023  | 02/02/2023   | Laura Callahan | Chai     | 30.00  | 17       |
