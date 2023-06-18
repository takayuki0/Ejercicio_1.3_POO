public class Prueba {
    public static void main(String[] args) {

    BlocNotas miBloc = new BlocNotas();

    miBloc.llenarBloc();
    miBloc.aniadirNota(new NotaAlarma("Es Hora de salir a entrenar!", "05:00Hrs"));
    miBloc.aniadirNota(new Nota("Sé el cambio que quieres ver en el mundo"));
    miBloc.aniadirNota(new Nota("No tienes que ser grande para empezar. " + "\nPero tienes que empezar para poder ser grande"));
    miBloc.aniadirNota(new Nota("Podemos sufrir muchas derrotas pero \nno debemos ser derrotados"));
    miBloc.aniadirNota(new Nota("Sé amable, porque toda persona que \nconoces está librando una gran batalla"));
    miBloc.listarNotas();
    miBloc.cantidadDeNotas();
    miBloc.eliminarNota();
    miBloc.listarNotas();
    miBloc.cantidadDeNotas();
    



    }
}