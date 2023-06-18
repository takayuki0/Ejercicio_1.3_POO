import java.util.ArrayList;
import java.util.Scanner;

public class BlocNotas {
    private ArrayList<Nota> blocDeNotas;

    public BlocNotas() {

        blocDeNotas = new ArrayList<>();
    }

    public void aniadirNota(Nota nota){
        blocDeNotas.add(nota);
    }
    public void llenarBloc(){
        blocDeNotas.add(new Nota("El momento en que quieres dejarlo " + "\nes justo el momento en que tienes que seguir avanzando"));
        blocDeNotas.add(new NotaAlarma("Mi primera nota es un " +
                "recordatorio", "18:00Hrs."));
        blocDeNotas.add(new NotaAlarma("La lógica te llevará de la \nA "+
                "a la Z. La imaginación te llevará a cualquier lugar",
                "00:00Hrs."));
        blocDeNotas.add(new Nota("Los ArraysList son mas " +
                "complicados \nde lo que parecen."));
        blocDeNotas.add(new NotaAlarma("Es hora de estudiar Java!",
                "06:00Hrs."));
    }

    public void listarNotas(){
        for (Nota nota : blocDeNotas) {
            System.out.println(nota.toString());
        }
    }

    public void cantidadDeNotas(){
        System.out.println("El bloc de notas posee un total de: " + blocDeNotas.size() + " notas." +
                "\n____________________________________________________________");
    }

    public void eliminarNota(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el ID de la nota que desea eliminar: ");
        int id = entrada.nextInt();

        blocDeNotas.remove(id - 1);
        System.out.println("Haz eliminado la nota Nro: " + id +
                "\n____________________________________________________________");
    }
}