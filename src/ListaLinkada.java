import java.util.LinkedList;

public class ListaLinkada {
    public static void main(String[] args) {
        LinkedList<Double> notas2 = new LinkedList<>();

        notas2.add(7d);
        notas2.add(9.3);
        notas2.add(10d);
        notas2.add(4.5);
        notas2.add(1.7);

        System.out.println(notas2);

        //COMO O CÓDIGO DIZ GETFIRST PEGA O PRIMEIRO ELEMENTO DA LISTA E MOSTRA APENAS ELE
        //DEVO COLOCAR AS OUTRAS OPÇÕES DE COMANDO
        System.out.println("Primeira nota: "+ notas2.getFirst());
        System.out.println("Ultima nota: "+ notas2.getLast());
        System.out.println(notas2);

        //REMOVE O PRIMEIRO ELEMENTO DA LISTA
        notas2.removeFirst();
        notas2.removeLast();
        System.out.println("Primeira nota com remoção: " + notas2.getFirst());
        System.out.println("Ultima nota com remoção: " + notas2.getLast());
        System.out.println(notas2);

        //OQUE SERÁ QUE ACONTECE QUANDO EU USAR O ADD?
        notas2.addFirst(8d);
        notas2.addLast(6.5);

        System.out.println("Primeira nota: " + notas2.getFirst());
        System.out.println("Ultima nota: " + notas2.getLast());
        System.out.println(notas2);




    }
}
