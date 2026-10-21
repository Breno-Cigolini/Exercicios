public class ArvoreBinaria {
    No raiz;

    public ArvoreBinaria(){
        raiz = null;
    }

    public void inserir(int valor){
        raiz = inserirRecursivo(raiz, valor);
    }

    private No inserirRecursivo(No noAtual, int valor){
        if (noAtual == null){
            return new No(valor);
        }
        if (valor < noAtual.dado){
            noAtual.esquerdo = inserirRecursivo(noAtual.esquerdo, valor);
        }
        else if (valor > noAtual.dado) {
            noAtual.direito = inserirRecursivo(noAtual.direito, valor);
        }
        return noAtual;
    }
}
