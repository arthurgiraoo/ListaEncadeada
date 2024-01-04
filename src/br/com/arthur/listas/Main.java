package br.com.arthur.listas;

public class Main {
    public static void main(String[] args) {
        ListaEncadeada<String> lista1  =new ListaEncadeada<>();

        lista1.add("teste 1");
        lista1.add("teste 2");
        lista1.add("teste 3");
        lista1.add("teste 4");

        System.out.println(lista1.get(0));
        System.out.println(lista1.get(1));
        System.out.println(lista1.get(2));
        System.out.println(lista1.get(3));

        System.out.println(lista1.remove(3));

        System.out.println(lista1);


    }
}
