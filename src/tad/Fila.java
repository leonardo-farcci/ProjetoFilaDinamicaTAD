package tad;

public class Fila {

    private static class No {

        public No prox;         //PROXIMO NÓ NA FILA
        public String valor;       //ELEMENTO ARMAZENADO NA FILA

        public No(String val) {     //CONSTRUTOR DO NÓ
            valor = val;
            prox = null;
        }
    }

    private No inicio;   //REPRESENTA O INICIO DA FILA
    private No fim;      //REPRESENTA O FIM DA FILA
    private int nElem;          //NUMERO de ELEMENTOs

    public Fila() {      //CONSTRUTOR DA FILA
        inicio = null;
        fim = null;
    }

    public boolean isEmpty() {      //RETORNA VERDADEIRO SE A FILA ESTIVER VAZIA
        return (inicio == null && fim == null);
    }

    public void inject(String elem) { //INSERINDO UM ITEM NO FINAL DA FILA
        No novoNo = new No(elem);
        if (isEmpty()) {
            inicio = novoNo;
            fim = novoNo;
        } else {
            fim.prox = novoNo;
            fim = novoNo;
        }
        nElem++;
    }

    public void eject() { //TIRAR ELEMENTO DO FIM DA FILA
            if(isEmpty()){
                System.out.println("Lista vazia");
            }else{
            No atual = inicio, previo = null;
            while(atual.prox != null){
                previo = atual;
                atual = atual.prox;
            }
            fim = previo;
            fim.prox = null;
            }
        nElem--;
    }
    
    public void push(String elem) { //INSERINDO UM ITEM NO INICIO DA FILA - ***
        No novoNo = new No(elem);
        if (isEmpty()) {
            inicio = novoNo;
            fim = novoNo;
        } else {
            novoNo.prox = inicio;
            inicio = novoNo;
            
        }
        nElem++;
    }

    public void pop() { //REMOVENDO UM ITEM NO INICIO DA FILA
        if (inicio == fim) {
            inicio = null;
            fim = null;
        } else {
            inicio = inicio.prox;
            
        }
        nElem--;
    }

    public void clear() { //REPOR AS CONDIÇÕES INICIAIS DA FILA
        inicio = null;
        fim = null;
    }

    public String show() {    //MOSTRA O INICIO DA FILA
        if (isEmpty()) {
            return "Pilha Vazia.";
        }
        String str = "Fila Dinamica: ";
        for (No nodo = inicio; nodo != null; nodo = nodo.prox) {
            str += " " + nodo.valor;
        }
        return str + "\n";
    }

    public void size() {
        System.out.println(nElem);
    }
}
