public class Main {
    public static void main(String[] args) {
        Pilha p = new Pilha();
        Fila f = new Fila();
        ArvoreBinaria arvore = new ArvoreBinaria();
        if (p.estaVazia()) System.out.println("Pilha vazia");
        p.addPrato(1);
        p.addPrato(3);
        p.addPrato(5);
        p.addPrato(2);
        System.out.println("Pilha de pratos: " + p.pratos);
        System.out.println("Tamanho da pilha: " + p.tamanho());
        System.out.println("Prato na última posição: " + p.ultimoPrato());
        System.out.println("Remover prato: " + p.removerUltimoPrato());
        System.out.println("Pilha de pratos atualizada: " + p.pratos);

        System.out.println("*================================================*");
        if (f.estaVazia()) System.out.println("Fila Vazia");
        f.enqueue(1);
        f.enqueue(2);
        f.enqueue(3);
        f.enqueue(4);
        System.out.println("Fila do supermercado: " + f.fila);
        System.out.println("Primeiro da fila: " + f.peek());
        System.out.println("Tamanho da fila: " + f.tamanho());
        System.out.println("Remover o primeiro da fila: " + f.dequeue());
        System.out.println("Fila atualizada: " + f.fila);

        arvore.inserir(10);
        arvore.inserir(5);
        arvore.inserir(15);
        arvore.inserir(3);
        arvore.inserir(7);
        arvore.inserir(12);
        arvore.inserir(20);

    }
}
