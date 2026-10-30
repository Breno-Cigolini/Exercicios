/*
 * Projeto.: Lista Simplesmente Ligada/Encadeada
 * Autor...: Professor Dreco
 * Classe..: LseAlunos
 * Objetivo: Criação e manutenção dos elementos na dequelp simplesmente encadeada
 */
package dequelp;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LseAlunos
{
    // Objetivo: atributos de determinação do primeiro e do último elemento da
    //           dequelp, para que seja realizada a sua gestão
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
    //           elementos da dequelp, ou seja, seu tamanho
    //
    public int tamanho()
    {
        int t = 0;
        //
        // Aguarde a implementação do c??lculo de tamanho da lista
        //
        return t;
    }

    // Objetivo: método para verificar se a dequelp está vazia (true)
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

    // Objetivo: método para inserir um novo elemento no início da dequelp
    //
    //
    public void inserir_inicio()
    {
        Msg.limpatela();
        Msg.msg_central ("PROCESSO DE INSERÇÃO NO INÍCIO");
        
        NohAluno novoAluno = new NohAluno();
        
        novoAluno.setIdAluno(this.D_Id_Aluno());
        novoAluno.setNmAluno(this.D_Nome_Aluno());
        novoAluno.setIdCursoAluno(this.D_Curso_Aluno());
        novoAluno.setSxAluno(this.D_Sexo_Aluno());
        
        novoAluno.setProximoAluno(this.primeiroAluno);
        this.primeiroAluno = novoAluno;
        novoAluno.mostra_noh_Aluno(1, 0);
        
    } 

    // Objetivo: método para inserir um novo elemento no final da dequelp
    //
    //
    public void inserir_final()
    {
        Msg.limpatela();
        Msg.msg_central ("PROCESSO DE INSERÇÃO NO FINAL");
        
        NohAluno novo = new NohAluno();
        
        if (novo == null)
        {
            Msg.msg_pl("Não há memória disponível, finalizando a inserção.");
        }
        else
        {
            novo.setIdAluno(this.D_Id_Aluno());
            novo.setNmAluno(this.D_Nome_Aluno());
            novo.setIdCursoAluno(this.D_Curso_Aluno());
            novo.setSxAluno(this.D_Sexo_Aluno());
            
            if (this.vazia())
            {
                this.primeiroAluno = this.ultimoAluno = novo;
            }
            else
            {
                this.ultimoAluno.setProximoAluno(novo);
                this.ultimoAluno = novo;
            }
            
        }
    } 

    // Objetivo: método para remover um elemento da primeira posição
    //           da dequelp
    //
    public void remover_inicio()
    {
        Msg.limpatela();
        Msg.msg_central ("PROCESSO DE REMOÇÃO NO INÍCIO");
        
        NohAluno liberar = this.primeiroAluno;
        
        this.primeiroAluno = this.primeiroAluno.getProximoAluno();
        
        if (this.primeiroAluno == null)
        {
            this.ultimoAluno = null;
        }
        else
        {
            liberar.setProximoAluno(null);
        }
        
        liberar.mostra_noh_Aluno(1, 0);
        
    }

    // Objetivo: método para remover um elemento da primeira posição
    //           da dequelp
    //
    public void remover_final()
    {
        Msg.limpatela();
        Msg.msg_central ("PROCESSO DE REMOÇÃO NO FINAL");
        
        NohAluno anterior = new NohAluno();
        
        for (anterior = this.primeiroAluno; anterior.getProximoAluno() != this.ultimoAluno; anterior = anterior.getProximoAluno()){
        }
        
        this.ultimoAluno.mostra_noh_Aluno(1, 0);
        anterior.setProximoAluno(null);
        this.ultimoAluno = anterior;
    }

    // Objetivo: método para remover todos os elementos que estáo
    //           presentes na dequelp, inicializando-a. Tornando-a vazia.
    //
    public void inicializar()
    {
        Msg.limpatela();
        Msg.msg_central ("PROCESSO DE INICIALIZAÇÃO - Aguarde implementação");
    }

    // Objetivo: método para consultar todos os elementos que estáo
    //           presentes na dequelp
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
            aux.mostra_noh_Aluno(pos, 0);
        }
    }

    // Objetivo: método para consultar se uma determinada posição está
    //           presente na dequelp e, se sim, qual elemento a ocupa
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
    //           presente na dequelp e, se sim, qual posição ele ocupa
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
    //           presente na dequelp e, se sim, qual posição ele ocupa
    //
    public void consultar_conteudo_str(String conteudo)
    {
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

    // Objetivo: método construtor da dequelp e que determina que ela
    //           está, inicialmente, vazia
    //
    public LseAlunos()
    {
        this.primeiroAluno = this.ultimoAluno = null;
    }
}