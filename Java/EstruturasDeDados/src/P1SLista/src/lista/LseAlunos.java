/*
 * Projeto.: Lista Simplesmente Ligada/Encadeada
 * Autor...: Professor Dreco
 * Classe..: LseAlunos
 * Objetivo: Criação e manutenção dos elementos na lista simplesmente encadeada
 */
package lista;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class LseAlunos
{
    // Objetivo: atributos de determinação do primeiro e do último elemento da
    //           lista, para que seja realizada a sua gestão
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
    //           elementos da lista, ou seja, seu tamanho
    //
    public int tamanho()
    {
        int t = 0;
        NohAluno aux = this.primeiroAluno;
        while (aux != null){
            t++;
            aux = aux.getProximoAluno();
        }
        return t;
    }

    // Objetivo: método para verificar se a lista está vazia (true)
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


    // Objetivo: método para inserir um novo elemento no final da lista
    //
    //
    public void inserir_por_posicao(int pos)
    {
        Msg.limpatela();
        Msg.msg_central ("PROCESSO DE INSERÇÃO POR POSIÇÃO");
        
        if (pos < 1 || pos > this.tamanho() + 1){
            Msg.msg_central("POSICAO INVALIDA");
            return;
        }
        if (pos == 1){
            Msg.limpatela();
            Msg.msg_central ("PROCESSO DE INSERÇÃO NO INÍCIO");
            
            NohAluno novo = new NohAluno();
            
            novo.setIdAluno(this.D_Id_Aluno());
            novo.setIdCursoAluno(this.D_Curso_Aluno());
            novo.setNmAluno(this.D_Nome_Aluno());
            novo.setSxAluno(this.D_Sexo_Aluno());
            
            novo.setProximoAluno(this.primeiroAluno);
            if (this.primeiroAluno == null){
                this.ultimoAluno = novo;
            }
            this.primeiroAluno = novo;
            novo.mostra_noh_Aluno(pos, 1);
            
        }
        else {
            if (pos == (this.tamanho() + 1)){
                Msg.limpatela();
                Msg.msg_central ("PROCESSO DE INSERÇÃO NO FINAL");

                NohAluno novo = new NohAluno();

                novo.setIdAluno(this.D_Id_Aluno());
                novo.setNmAluno(this.D_Nome_Aluno());
                novo.setIdCursoAluno(this.D_Curso_Aluno());
                novo.setSxAluno(this.D_Sexo_Aluno());

                this.ultimoAluno.setProximoAluno(novo);
                this.ultimoAluno = novo;

                novo.mostra_noh_Aluno(pos, 1);
            }
            else {
                Msg.limpatela();
                Msg.msg_central ("PROCESSO DE INSERÇÃO NO MEIO");
                
                NohAluno aux, anterior = null;
                int p = 0;
                
                for (aux = this.primeiroAluno; p != pos - 1; anterior = aux, aux = aux.getProximoAluno(), p++){
                }
                
                NohAluno novo = new NohAluno();

                novo.setIdAluno(this.D_Id_Aluno());
                novo.setNmAluno(this.D_Nome_Aluno());
                novo.setIdCursoAluno(this.D_Curso_Aluno());
                novo.setSxAluno(this.D_Sexo_Aluno());
               
                anterior.setProximoAluno(novo);
                novo.setProximoAluno(aux);
                
                novo.mostra_noh_Aluno(pos, 1);
            }
        }
    } 

    // Objetivo: método para remover um elemento da última posição
    //           da lista
    //
    public void remover_por_posicao(int pos)
    {
        Msg.limpatela();
        Msg.msg_central ("PROCESSO DE REMOÇÃO POR POSIÇÃO"); 
    }
    

    // Objetivo: método para remover todos os elementos que estáo
    //           presentes na lista, inicializando-a. Tornando-a vazia.
    //
    public void inicializar()
    {
        Msg.limpatela();
        Msg.msg_central ("PROCESSO DE INICIALIZAÇÃO - Aguarde implementação");
    }

    // Objetivo: método para consultar todos os elementos que estáo
    //           presentes na lista
    //
    
    public void consultar_geral()
    {
        Msg.limpatela();
        Msg.msg_central ("PROCESSO DE CONSULTA GERAL");
        
        NohAluno aux = null;
        int pos = 0;
        
        for (aux = this.primeiroAluno, pos = 1;
                aux != null;
                    aux = aux.getProximoAluno(), pos++)
        {
            aux.mostra_noh_Aluno(pos, pos);
        }
    }

    // Objetivo: método para consultar se uma determinada posição está
    //           presente na lista e, se sim, qual elemento a ocupa
    //
    public void consultar_posicao(int posicao)
    {
        Msg.limpatela();
        Msg.msg_central ("PROCESSO DE CONSULTA POR POSIÇÃO");
        
        NohAluno aux = null;
        int pos = 0;
        
        for (aux = this.primeiroAluno, pos = 1;
                aux != null && pos != posicao;
                   aux = aux.getProximoAluno(), pos++) {}
        
        if (aux == null)
        {
            Msg.msg_central("A posição ["+posicao+"] não existe na lista.");
        }
        else
        {
            aux.mostra_noh_Aluno(posicao, 1);
        }
    }

    // Objetivo: método para consultar se um determinado elemento com conteúdo INT está
    //           presente na lista e, se sim, qual posição ele ocupa
    //
    public void consultar_conteudo_int(int conteudo)
    {
        Msg.limpatela();
        Msg.msg_central ("PROCESSO DE CONSULTA POR CONTEÚDO INTEIRO (ID)");
        
        NohAluno aux = null;
        int pos = 0;
        
        for (aux = this.primeiroAluno, pos = 1;
                aux != null && aux.getIdAluno() != conteudo;
                   aux = aux.getProximoAluno(), pos++) {}
        
        if (aux == null)
        {
            Msg.msg_central("O ID ["+conteudo+"] não existe na lista.");
        }
        else
        {
            aux.mostra_noh_Aluno(pos, 1);
        }
    }

    // Objetivo: método para consultar se um determinado elemento com conteúdo STR está
    //           presente na lista e, se sim, qual posição ele ocupa
    //
    public void consultar_conteudo_str(String conteudo)
    {
        Msg.limpatela();
        Msg.msg_central ("PROCESSO DE CONSULTA POR CONTEÚDO (NOME)");
        Msg.limpatela();
        Msg.msg_central ("PROCESSO DE CONSULTA POR CONTEÚDO");
        
        NohAluno aux = null;
        int pos = 0;
        
        for (aux = this.primeiroAluno, pos = 1;
                aux != null && aux.getNmAluno().compareTo(conteudo) != 0;
                   aux = aux.getProximoAluno(), pos++) {}
        
        if (aux == null)
        {
            Msg.msg_central("O NOME ["+conteudo+"] não existe na lista.");
        }
        else
        {
            aux.mostra_noh_Aluno(pos, 1);
        }
    }
    
    public void especial06 ()
    {
        Msg.msg_central("Especial 06 - Aguarde orientações.");
    }
    
    public void especial07 ()
    {
        Msg.msg_central("Especial 07 - Aguarde orientações.");
    }
    
    public void especial08 ()
    {
        Msg.msg_central("Especial 08 - Aguarde orientações.");
    }
    
    public void especial09 ()
    {
        Msg.msg_central("Especial 09 - Aguarde orientações.");
    }
    
    public void especial10 ()
    {
        Msg.msg_central("Especial 10 - Aguarde orientações.");
    }
    
    public void especial11 ()
    {
        Msg.msg_central("Especial 11 - Aguarde orientações.");
    }
    
    public void especial12 ()
    {
        Msg.msg_central("Especial 12 - Aguarde orientações.");
    }

    // Objetivo: método para listar todos os elementos da estrutura cujo nome comece
    //           com o texto digitado pelo usuário
    //
    public void especial13()
    {
        int qtd = 0;

        if (this.vazia())
        {
            Msg.msg_central("A lista está vazia, processo não executado. Retornando.");
        }
        else
        { 
            String parte_nome = Msg.solicita_conteudo_str();

            NohAluno aux = null;

            int tam = parte_nome.length();
            int pos = 0;
            int flag = 1;
            String trecho_nome = "";

            for (aux = this.primeiroAluno, pos = 1;
                    aux != null;
                        aux = aux.getProximoAluno(), pos++)
            {
//                trecho_nome = aux.getNmAluno().toString().substring(0, tam);

                if ((aux.getNmAluno().toString().length() >= tam) &&
                    (aux.getNmAluno().toString().substring(0, tam).compareTo(parte_nome) == 0))                     
                {
                    aux.mostra_noh_Aluno(pos, flag);
                    qtd++;
                    flag = 0;
                }
            }

            if (qtd == 0)
            {
                Msg.msg_central("Não há nomes que se iniciam com ["+parte_nome+"]");
            }
        }
    }

            // Objetivo: método para listar a estrutura de forma inversa, ou seja,
    //           do último elemento para o primeiro elemento 
    //
    public void especial14()
    {
        if (this.vazia())
        {
            Msg.msg_central("A lista está vazia, processo não executado. Retornando.");
        }
        else
        {
            NohAluno aux = null;
            NohAluno pivot = null;
            pivot = this.ultimoAluno;

            int pos = 0;
            int flag = 1;

            do
            {
                for (aux = this.primeiroAluno, pos = 1;
                        aux.getProximoAluno() != pivot;
                            aux = aux.getProximoAluno(), pos++);

                pivot.mostra_noh_Aluno(pos+1, flag);

                flag = 0;

                pivot = aux;
            } while (pivot != this.primeiroAluno);   

            pivot.mostra_noh_Aluno(pos, -1);
        }
    }
    
    public void especial15 ()
    {
        Msg.msg_central("Especial 15 - Aguarde orientações.");
    }
    
    public void especial16 ()
    {
        Msg.msg_central("Especial 16 - Aguarde orientações.");
    }

    // Carga de arquivo de teste de lista simplemente encadeada
    // Objetivo: carregar/salvar dados em arquivos
    
    public String xarq_escolhe_nome_arquivo (String texto, String operacao)
    {
        Scanner s = new Scanner(System.in);
        String dados = " ";

        do
        {
            Msg.limpatela();

            try
            {
                Msg.msg_nl ("Digite o nome do arquivo para "+operacao+" da ["+texto+"] ou x para não "+operacao+" - não pode ser vazio: ");
                dados = s.nextLine();
            }
            catch(Exception e)
            {
                Msg.msg_nl ("Erro de digitação, não deixe a informação vazia:");
            }
        } while (dados.isEmpty());

        return dados;
    }
    
    public int xarq_tamanho_arquivo(String nome_arquivo)
    {
        //
        // Esta função lê o arquivo de dados e conta quantos registros ele possui.
        // A quantidade de registros é retornada e poderá ser utilizada como argumento
        // na criação do vetor de trabalho
        //
        int tamanho = 0;
        boolean prossegue = true;

        FileInputStream stream = null;

        try
        {
            stream = new FileInputStream(nome_arquivo);
            
            InputStreamReader streamReader = new InputStreamReader(stream);
            BufferedReader reader = new BufferedReader(streamReader);
            String line = null;
            Msg.msg_central ("Arquivo aberto!");
            //
            // Levantamento do tamanho do arquivo em termos de linhas
            //
            try
            {
                while ((line = reader.readLine()) != null)
                {
                    tamanho++;
                }

                try
                {
                    reader.close();
                }
                catch (IOException ioe)
                {
                    Msg.msg_central ("Erro no fechamento do arquivo de leitura!");
                }

                try
                {
                    streamReader.close();
                }
                catch (IOException ioe)
                {
                    Msg.msg_central ("Erro no fechamento do arquivo de stream reader!");
                }

                try
                {
                    stream.close();
                }
                catch (IOException ioe)
                {
                    Msg.msg_central ("Erro no fechamento do arquivo stream!");
                }
            }
            catch (IOException ioe)
            {
                prossegue = false;
                Msg.msg_central ("Arquivo com problemas na leitura!");
            }
        }
        catch (FileNotFoundException fe)
        {
            Msg.msg_central ("Arquivo não encontrado!");
            prossegue = false;
        }

        return tamanho;
    }

    
    public int xarq_abre_arquivo (String texto)
    {
        //
        // Esta função lê o arquivo de dados e cria um vetor cujo tamanho é a
        // quantidade de registros do arquivo. O vetor, após ser populado, é devolvido
        // como resposta para o processo chamador.
        //
        Msg.msg_central ("Preparação do arquivo de entrada para carga da ["+texto+"]");

        String nome_arquivo = this.xarq_escolhe_nome_arquivo(texto, "dar carga");

        int tv = 0;

        if (nome_arquivo.equals("x"))
        {
            Msg.msg_central ("Não será utilizado arquivo para entrada de dados para a ["+texto+"].");
        }
        else
        {
            Msg.msg_central ("O arquivo a ser utilizado arquivo para entrada de dados é ["+nome_arquivo+"].");
            Msg.enter();
            
            tv = this.xarq_tamanho_arquivo(nome_arquivo);

            if (tv != 0)
            {
                int i = 0;

                boolean prossegue = true;

                if (prossegue)
                {
                    Msg.msg_central ("Gravando dados na ["+texto+"]......");

                    try
                    {
                        FileInputStream stream = null;
                        InputStreamReader streamReader;
                        BufferedReader reader;
                        String line = null;
                        stream = new FileInputStream(nome_arquivo);
                        streamReader = new InputStreamReader(stream);
                        reader = new BufferedReader(streamReader);
                        line = null;
                        int id = 0;
                        String nome = "";
                        int curso = 0;
                        int sexo = 0;
                        

                        if (prossegue)
                        {
                            try
                            {
                                while ((line = reader.readLine()) != null)
                                {
                                    String[] elemento = line.split(";");

//                                    Msg.msg_pl ("...Carregando Posição: ["+i+"] - Número: ["+elemento[0]+"]");

                                    if (elemento.length != 0) {
                                        id = Integer.valueOf(elemento[0].toString());
                                        nome = elemento[1];
                                        curso = Integer.valueOf(elemento[2].toString());
                                        sexo = Integer.valueOf(elemento[3].toString());
                                        
                                        NohAluno novo = new NohAluno(id, nome, sexo, curso, null);

                                        if (this.primeiroAluno == null)
                                        {
                                            this.primeiroAluno = this.ultimoAluno =  novo;
                                        }
                                        else
                                        {
                                            this.ultimoAluno.setProximoAluno(novo);
                                            this.ultimoAluno = novo;
                                        }
//                                        System.out.println("ID: " + id + " | NOME: " + nome + " | CURSO: " + curso + " | SEXO: " + sexo);
                                    }

                                    i++;
                                }
                                
                                if (i == 0)
                                {
                                    Msg.msg_central("Não houve carregamento de dados.");
                                }
                                else
                                {
                                    if (i == 1)
                                    {
                                        Msg.msg_central("Apenas [1] elemento carregado.");
                                    }
                                    else
                                    {
                                        Msg.msg_central("["+i+"] elementos carregados.");
                                    }
                                }
                            }
                            catch (IOException ioe)
                            {
                                prossegue = false;
                                Msg.msg_central ("Arquivo com problemas na leitura!");
                            }

                            try
                            {
                                reader.close();
                            }
                            catch (IOException ioe)
                            {
                                Msg.msg_central ("Erro no fechamento do arquivo de leitura!");
                            }

                            try
                            {
                                streamReader.close();
                            }
                            catch (IOException ioe)
                            {
                                Msg.msg_central ("Erro no fechamentdo do arquivo de stream reader!");
                            }

                            try
                            {
                                stream.close();
                            }
                            catch (IOException ioe)
                            {
                                Msg.msg_central ("Erro no fechamento do arquivo stream!");
                            }
                        }
                        else
                        {
                            tv = 0;
                        }
                    }
                    catch (FileNotFoundException fe)
                    {
                        prossegue = false;
                        Msg.msg_central ("Arquivo não encontrado!");
                    }
                }
            }
        }
        Msg.enter();
        
        return tv;
    }

    public void xarq_salvar_arquivo (String texto)
    {
        //
        // Esta função recebe um vetor populado e, para cada posição (coluna), grava
        // um registro no arquivo de resposta, cujo nome é informado na função.
        //
        Msg.msg_central ("Gravando arquivo de saída da ["+texto+"]");

        String nome_arquivo = this.xarq_escolhe_nome_arquivo(texto, "salvar");

        int t = nome_arquivo.length();
        
        if ((nome_arquivo.contains("x")) && (t == 1))
        {
            Msg.msg_central ("Não será utilizado arquivo para gravação de dados da ["+texto+"].");
        }
        else
        {
            FileWriter fileWriter = null;

            try
            {
                fileWriter = new FileWriter(nome_arquivo);
            }
            catch (IOException ex)
            {
                Msg.msg_central ("Erro na gravação!");
            }

            PrintWriter writer = new PrintWriter(fileWriter);

            int i = 0;
            NohAluno aux = this.primeiroAluno;

            do
            {
                writer.write(aux.getIdAluno()+";"+aux.getNmAluno()+";"+aux.getIdCursoAluno()+";"+aux.getSxAluno()+";\n");
                aux = aux.getProximoAluno();
                i++;
            }
            while (aux != null);

            writer.close();

            try
            {
                fileWriter.close();
                Msg.msg_central ("Arquivo gravado da ["+texto+"] com ["+i+"] linhas!");
            }
            catch (IOException ex)
            {
                Msg.msg_central ("Erro no fechamento do arquivo!");
            }
        }
    }
    // Objetivo: método construtor da lista e que determina que ela
    //           está, inicialmente, vazia
    //   
    public LseAlunos()
    {
        this.primeiroAluno = this.ultimoAluno = null;
    }
}