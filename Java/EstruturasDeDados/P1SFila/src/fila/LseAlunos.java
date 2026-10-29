/*
 * Projeto.: Lista Simplesmente Ligada/Encadeada
 * Autor...: Professor Dreco
 * Classe..: LseAlunos
 * Objetivo: Criação e manutenção dos elementos na fila simplesmente encadeada
 */
package fila;
import java.util.Scanner;
import java.util.Set;

public class LseAlunos
{
    // Objetivo: atributos de determinação do primeiro e do último elemento da
    //           fila, para que seja realizada a sua gestão
    //
    public NohAluno primeiroAluno;
    public NohAluno ultimoAluno;
    
    // Objetivo: método para receber e tratar a digitação de um atributo dados
    //           (do tipo Object) quando de uma inserção ou consulta por conteúdo
    //
    public String digitacao (String tipo)
    {
        Scanner s = new Scanner(System.in);
        String dados = " ";

        do
        {
            Msg.limpatela();

            try
            {
                Msg.msg_pl("Digite o ["+tipo+"] para o elemento - não pode ser vazio: ");
                dados = s.nextLine();
            }
            catch(Exception e)
            {
                Msg.msg_pl ("Erro de digitação, não deixe a informação ["+tipo+"] vazia:");
            }
        } while (dados.isEmpty());

        return dados;
    }


    // Objetivo: método para receber e tratar a digitação do atributo codigo
    //           quando de uma inserção ou consulta por conteúdo
    //
    public Integer D_Id_Aluno ()
    {
        Msg.limpatela();
            
        Scanner s = new Scanner(System.in);
        Integer cod = 0;
        String texto = "Digite o valor para o Id do aluno (inteiro maior que zero): ";
        Integer erro = 0;

        do
        {
            try
            {
                Msg.msg_pl(texto);
                cod = Integer.parseInt(s.nextLine());
            }
            catch(Exception e)
            {
                texto = "Erro de digitação, o ID é obrigatório e inteiro maior que zero: ";
                erro = 1;
            }
            if((cod <= 0) && (erro == 0))
            {
                texto = "Erro de digitação, o ID é obrigatório e inteiro maior que zero: ";
            }
            erro = 0;
            Msg.limpatela();

        } while (cod <= 0);

        return cod;
    }

    // Objetivo: método para receber e tratar a digitação de um atributo dados
    //           Nome
    //
    public String D_Nome_Aluno ()
    {
        Msg.limpatela();
            
        Scanner s = new Scanner(System.in);
        String nome = " ";
        String texto = "Digite o NOME do aluno (obrigatório): ";

        do
        {
            Msg.limpatela();

            try
            {
                Msg.msg_pl(texto);
                nome = s.nextLine();
            }
            catch(Exception e)
            {
                texto = "Erro de digitação, o NOME é obrigatório: ";
            }

            Msg.limpatela();
            
        } while (nome.isEmpty());

        return nome;
    }

    // Objetivo: método para receber e tratar a digitação do atributo sexo
    //           quando de uma inserção ou consulta por conteúdo
    //
    public Integer D_Sexo_Aluno ()
    {
        Scanner s = new Scanner(System.in);
        int sexo  = 0;
        String texto = "Digite o valor para o SEXO do aluno (1.Mas 2.Fem): ";
        Integer erro = 0;

        do
        {
            Msg.limpatela();

            try
            {
                Msg.msg_pl(texto);
                sexo = Integer.parseInt(s.nextLine());
            }
            catch(Exception e)
            {
                texto = "Erro de digitação, o SEXO é obrigatório: ";
                erro = 1;
            }
            if((sexo < 1) || (sexo > 2) || (erro == 0))
            {
                texto = "Erro de digitação, o SEXO é obrigatório (1.Mas 2.Fem): ";
            }
            
            erro = 0;
        
            Msg.limpatela();

        } while ((sexo < 1) || (sexo > 2));

        return sexo;
    }

    // Objetivo: método para receber e tratar a digitação do atributo curso
    //           quando de uma inserção ou consulta por conteúdo
    //
    public Integer D_Curso_Aluno ()
    {
        Scanner s = new Scanner(System.in);
        int curso  = 0;
        String texto = "Digite o valor para o CURSO do aluno: ";
        Integer erro = 0;

        do
        {
            Msg.limpatela();
            
            try
            {
                Msg.msg_pl(texto);
                curso = Integer.parseInt(s.nextLine());
            }
            catch(Exception e)
            {
                texto = "Erro de digitação, o CURSO é obrigatório: ";
                erro = 1;
            }
            if ((curso < 1) || erro == 0)
            {
                texto = "Erro. O CURSO incorreto. Digite outro curso [1:999]: ";
            }

            erro = 0;

            Msg.limpatela();

        } while (curso < 1 || curso > 999);

        return curso;
    }

    // Objetivo: método para quantificar e informar a quantidade de
    //           elementos da fila, ou seja, seu tamanho
    //
    public int tamanho()
    {
        int t = 0;
        //
        // Aguarde a implementação do c??lculo de tamanho da lista
        //
        return t;
    }

    // Objetivo: método para verificar se a fila está vazia (true)
    //           ou não (false)
    //
    public boolean vazia()
    {
        boolean r = true;

        if (this.primeiroAluno != null)
        {
            r = false;
        }
        
        return r;
    }

    // Objetivo: método para inserir um novo elemento no final da fila
    //
    //
    public void inserir_final()
    {
        Msg.limpatela();
        Msg.msg_central ("PROCESSO DE INSERÇÃO NO FINAL");
        
        NohAluno novo = new NohAluno(); // Criação do objeto
        
        if (novo == null) // Não houve espaço na memória para inserir o elemento
        {
            Msg.msg_central("Não há espaço suficiente para a inserção. Retornado!");
        }
        else
        {
            // Popular os dados
            
            novo.setIdAluno(this.D_Id_Aluno());
            novo.setNmAluno(this.D_Nome_Aluno());
            novo.setIdCursoAluno(this.D_Curso_Aluno());
            novo.setSxAluno(this.D_Sexo_Aluno());
            
            // Verificar se a lista está vazia
            
            if (this.vazia())
            {
                // Primeiro e último elemento ao mesmo tempo (caixa vazia do supermercado)
                this.primeiroAluno = this.ultimoAluno = novo;
            }
            else
            {
                // Já existe elemento e o novo deve ser inserido no final da Fila
                this.ultimoAluno.setProximoAluno(novo);
                this.ultimoAluno = novo;
            }
        }
    } 

    // Objetivo: método para remover um elemento da primeira posição
    //           da fila
    //
    public void remover_inicio()
    {
        Msg.limpatela();
        Msg.msg_central ("PROCESSO DE REMOÇÃO NO INÍCIO");
        
        NohAluno liberar = null;
        liberar = this.primeiroAluno;
        
        Msg.msg_central(this.primeiroAluno.getNmAluno() + " foi removido.");
        
        if (this.primeiroAluno == this.ultimoAluno){ // se existir apenas 1 aluno na fila
            this.primeiroAluno = this.ultimoAluno = null; // 
        }
        else { 
            this.primeiroAluno = this.primeiroAluno.getProximoAluno(); //  primeiroAluno passa a ser o proximo aluno do primeiroAluno
            liberar.setProximoAluno(null); // torna o proximoaAluno do primeiro aluno como null, para remover ele da corrente
            
        }
        liberar.mostra_noh_Aluno(1, 1);
        System.gc(); // Garbage Collector para limpar quem removemos da corrente
    }

    // Objetivo: método para remover todos os elementos que estáo
    //           presentes na fila, inicializando-a. Tornando-a vazia.
    //
    public void inicializar()
    {
        Msg.limpatela();
        Msg.msg_central ("PROCESSO DE INICIALIZAÇÃO - Aguarde implementação");
    }

    // Objetivo: método para consultar todos os elementos que estáo
    //           presentes na fila
    //
    
    public void consultar_geral()
    {
        Msg.limpatela();
        Msg.msg_central ("PROCESSO DE CONSULTA GERAL");
        
        NohAluno aux = null;
        int pos = 0; 
        
        for (aux = this.primeiroAluno, pos = 1; // começa no primeiroAluno e com pos = 1 (posição 1)
                aux != null; // enquanto for diferente de null
                    aux = aux.getProximoAluno(), pos++) // passa pro proximoAluno e soma +1 no pos
        {
            aux.mostra_noh_Aluno(pos, pos); // mostra o aluno na posição pos
        }
    }

    // Objetivo: método para consultar se uma determinada posição está
    //           presente na fila e, se sim, qual elemento a ocupa
    //
    public void consultar_posicao(int posicao)
    {
        Msg.limpatela();
        Msg.msg_central ("PROCESSO DE CONSULTA POR POSIÇÃO");

        NohAluno aux = null;
        int pos = 0;
        

        for (aux = this.primeiroAluno, pos = 1; // começa com aux = primeiroAluno e com pos = 1
                (aux != null) && pos != posicao; // loop continua enquanto aux for diferente de null e a variavel pos for diferente da posição que o usuario pediu
                    aux = aux.getProximoAluno(), pos++){ // passa pro proximoAluno e soma +1 no pos
        }
            
        if (aux == null) // se não achar a posição pedida pelo o usuario
        {
            Msg.msg_central ("A posição ["+posicao+"] não encontrada na fila!");
        }
        else { // mostra o aluno
            aux.mostra_noh_Aluno(posicao, 1); // de qualquer jeito precisa do cabeçalho, pois vai consultar somente 1 aluno
        }
    }

    // Objetivo: método para consultar se um determinado elemento com conteúdo INT está
    //           presente na fila e, se sim, qual posição ele ocupa
    //
    public void consultar_conteudo_int(int conteudo)
    {
        Msg.limpatela();
        Msg.msg_central ("PROCESSO DE CONSULTA POR CONTEÚDO INTEIRO (ID)");
        NohAluno aux = null;
        int pos = 0;
        boolean achou = false;

        for (aux = this.primeiroAluno, pos = 1; // aux sendo o primeiroAluno com pos = 1
                (achou == false) && (aux != null); // loop continua enquanto nao achar o id informado e enquanto o atual aluno não for null
                    aux = aux.getProximoAluno(), pos++) // passa pro proximoAluno e soma +1 em pos
        {
            if (aux.getIdAluno() == conteudo) // se o id do aluno atual for igual ao informado pelo usuario
            {
                aux.mostra_noh_Aluno(pos, 1); 
                achou = true;
                
            }
        }
        if (achou == false){ // não achou o id informado
            Msg.msg_central ("Id ["+conteudo+"] não encontrado na fila!");
        }
    }

    // Objetivo: método para consultar se um determinado elemento com conteúdo STR está
    //           presente na fila e, se sim, qual posição ele ocupa
    //
    public void consultar_conteudo_str(String conteudo)
    {
        Msg.limpatela();
        Msg.msg_central ("PROCESSO DE CONSULTA POR CONTEÚDO (NOME)");
    }
    
    public void Especial06(){
        Msg.limpatela();
        Msg.msg_central("Pessoas do sexo feminino.");
        if (this.primeiroAluno == null) // lista vazia
        {
            Msg.msg_central("A lista está vazia. Retornando.");
            Msg.enter();
        }
        else 
        {
            NohAluno aux = null;
            int p = 0, pos = 1;

            for (aux = this.primeiroAluno, p = 1;
                    aux != null;
                        aux = aux.getProximoAluno(), p++)
            {
                if (aux.getSxAluno() == 2) // se sexo = 2, mostra o aluno 
                {
                    aux.mostra_noh_Aluno(p, pos); // precisa do pos pra mostrar o cabeçalho, pq numa situacao q o sexo for 2 e nao for o primeiro não mostraria
                    pos = 0; // para nao mostrar mais o cabeçalho
                }
            }
            
            if (pos == 1){ // numa situação que não houver sexo = 2 na  lista toda
                Msg.msg_central("Nenhuma pessoa encontrada.");
            }
            Msg.enter();
        }
    }
    
    public void Especial07(){
        Msg.limpatela();
        Msg.msg_central ("Todos os alunos cujo nome começa com a letra J.");
        NohAluno aux = this.primeiroAluno;
        int p = 0, pos = 1;
        
        if (this.primeiroAluno == null)
        {
            Msg.msg_central("A lista está vazia. Retornando.");
            Msg.enter();
        }
        else
        {
            for (aux = this.primeiroAluno, p = 1;
                    aux != null;
                        aux = aux.getProximoAluno(), p++)
            {
                char primeiraLetra = aux.getNmAluno().charAt(0); // pega a primeira letra do aluno  joga em primeiraLetra
                primeiraLetra = Character.toUpperCase(primeiraLetra); // passa essa primeiraLetra para maiúsculo e joga em primeiraLetra novamente
                
                if (primeiraLetra == 'J'){
                    aux.mostra_noh_Aluno(p, pos);
                    pos = 0;
                }
            }
            if (pos ==  1){
                Msg.msg_central("Nenhum nome encontrado. Retornando.");
            }
            Msg.enter();
        }
    }
    
    public void Especial08(){        
        
        if (this.vazia()){
            Msg.msg_central("Lista vazia.");
        }
        else {
            Msg.limpatela();
            Msg.msg_central("PROCESSO DE REMOÇÃO TOTAL DA LISTA");

            do {
                if (this.primeiroAluno == this.ultimoAluno){ // se houver apenas uma pessoa na lista
                    this.primeiroAluno = this.ultimoAluno = null; // torna ela como null, assim sendo excluida
                }
                else {
                    this.primeiroAluno = this.primeiroAluno.getProximoAluno(); // jogando o proximoAluno do atual, no atual, sobrepondo o atual e assim apaga-lo
                }
            } while (this.ultimoAluno != null); // ate o ultimo aluno

            Msg.msg_central("Lista esvaziada.");
        }
    }
    
    public void Especial09(){
        NohAluno anterior = null;
        NohAluno atual = this.primeiroAluno;
        
        if (this.vazia()){
            Msg.msg_central("Lista vazia.");
        }
        else {
            Msg.limpatela();
            Msg.msg_central("REMOÇÃO TODOS SEXO = 2");
            
            do {
                if (atual.getSxAluno() == 2){ // testa se o sexo do atual é 2
                    
                    if (anterior == null){ // aqui só quando o primeiro for sexo = 2, apenas joga o valor do proximo em cima do primeiroAluno e o gc limpa
                        this.primeiroAluno = this.primeiroAluno.getProximoAluno(); // o primeiro da fila passa a ser o que está depois do que está sendo removido
                    }
                    else { // faço o anterior apontar para o proximo do atual, assim removendo o atual da corrente
                        anterior.setProximoAluno(atual.getProximoAluno());
                    }
                    
                    atual = atual.getProximoAluno(); // aqui percorre a lista
                }
                
                else { // atualizando as variaveis para continuar ate o final da lista
                    anterior = atual; 
                    atual = atual.getProximoAluno();
                }
            } while (atual != null); // o codigo testa ate o ultimo aluno
            
            // aqui faz o this.ultimoAluno apontar para null
            if (this.primeiroAluno == null){
                this.ultimoAluno = null; // lista vazia
            }
            else {
                // fila não está vazia: precisa achar o novo último elemento andando até o fim
                NohAluno aux = this.primeiroAluno;
                
                while (aux.getProximoAluno() != null){ // vai testando os proximos para saber qual é o ultimo que retornará null
                    aux = aux.getProximoAluno();
                }
                
                this.ultimoAluno = aux; // aux parou no ultimo elemento real da fila, aux.getProximoAluno() == null.
            }
        }
    }
        
    public void Especial10(){
        if (this.vazia()){   
            Msg.msg_central("Lista vazia.");
        }
        else{
            Msg.msg_central("PROCESSO DE TROCAR O ESCOLHIDO COM O PRIMEIRO");
            int posicao = Msg.solicita_posicao();

            NohAluno atual = null;
            NohAluno anterior = null;
            int p = 0;

            for (atual = this.primeiroAluno, p = 1; // for para percorrer a lista ate a posicao desejada
                    atual != null && p < posicao;
                           anterior = atual, atual = atual.getProximoAluno(), p++)
            {
            }

            if (posicao < 1 || atual == null){// tratameto da posicao
               Msg.msg_central("Posicao inexistente...");
            }
            else if (anterior == null){ // se a posicao escolhida for a primeira
                Msg.msg_central("Aluno selecionado ja e o primeiro da fila...");
            }
            else{
                NohAluno primeiro = this.primeiroAluno;               // A
                NohAluno proxPrimeiro = primeiro.getProximoAluno();   // B
                NohAluno proxAtual = atual.getProximoAluno();         // D
                boolean eraUltimo = (atual == this.ultimoAluno);

                if (posicao == 2){
                    primeiro.setProximoAluno(proxAtual);   // A → proximo do escolhido
                    atual.setProximoAluno(primeiro);       // B → A
                }
                else{
                    atual.setProximoAluno(proxPrimeiro);   // C → B
                    anterior.setProximoAluno(primeiro);    // B → A
                    primeiro.setProximoAluno(proxAtual);   // A → D
                }

                this.primeiroAluno = atual;

                if (eraUltimo){
                    this.ultimoAluno = primeiro;   // o antigo primeiro vira o ultimo
                }
            }
        }
    }
    // Objetivo: método construtor da fila e que determina que ela
    //           está, iniciaDlmente, vazia
    //   
    public LseAlunos() 
    {
        this.primeiroAluno = this.ultimoAluno = null;
    }
}