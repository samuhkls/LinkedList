public class Lista {

    public static void main(String[] args) {
        ListaEncadeada<String> lista = new ListaEncadeada<>();

        System.out.println("Tamanho da lista =" + lista.getTamanho());

        lista.adiciona("Craudio");
        lista.adiciona("Camila");
        lista.adiciona("Miguel");
        lista.adiciona("Elis");
        lista.adiciona("Lucas");

        System.out.println("");

        System.out.println(lista);
        System.out.println("Tamanho da lista = " + lista.getTamanho());
        System.out.println("Inicio da lista = " + lista.getInicio().getElemento());
        System.out.println("Fim da Lista = " + lista.getFim().getElemento());

        lista.remover("Camila");

        System.out.println(lista);
        System.out.println("Tamanho da lista = " + lista.getTamanho());
        System.out.println("Inicio da lista = " + lista.getInicio().getElemento());
        System.out.println("Fim da Lista = " + lista.getFim().getElemento());
    }
}