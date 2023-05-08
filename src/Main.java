/*
1.Crea una clase Persona con las siguientes variables:
        La edad
        El nombre
        El teléfono

2.Una vez creada la clase, crea una nueva clase Cliente que herede de Persona,
  esta nueva clase tendrá la variable credito solo para esa clase.

3.Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad,
  el telefono, el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.

4.Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona,
  y con una variable salario que solo tenga la clase Trabajador.
*/
public class Main {
    public static void main(String[] args) {
    Cliente cliente = new Cliente();
    cliente.edad = 39;
    cliente.nombre = "Anderson Moreno";
    cliente.telefono ="301123456";
    cliente.Credito = 200 ;
        System.out.println("****************************************");
        System.out.println("Nombre Cliente: " + cliente.nombre);
        System.out.println("Edad Cliente: " + cliente.edad);
        System.out.println("Telefono Cliente: " + cliente.telefono);
        System.out.println("Credito Cliente: $" + cliente.Credito);
    Trabajador trabajador = new Trabajador();
    trabajador.edad = 28;
    trabajador.nombre = "Ana Zapata";
    trabajador.telefono = "3102345687";
    trabajador.salario = 500;
        System.out.println("****************************************");
        System.out.println("Nombre Trabajador: " + trabajador.nombre);
        System.out.println("Edad Trabajador: " + trabajador.edad);
        System.out.println("Telefono Trabajador: " + trabajador.telefono);
        System.out.println("Salario Trabajador: $" + trabajador.salario);

    }
}