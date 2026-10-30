/*
 * Projeto.: Lista Simplesmente Ligada
 * Autor...: Professor Dreco
 * Classe..: SLista / 2025-S1
 * Objetivo: Projeto Lista Simplesmente Ligada
 */
package lista;

import static lista.Msg.msg_nl;

public class Main
{
    public static String tipo_prj = "Lista";
    
    public static void main(String[] args)
    {
        String tipo_lista = "lista";

        LseAlunos lista_Alunos = new LseAlunos();
        LseCursos lista_Cursos = new LseCursos();
        
        lista_Alunos.xarq_abre_arquivo(tipo_lista);

        int    tamanho = 0;
        int    posicao = 0;
        int    conteudo_int = 0;
        String conteudo_str = " ";
        
        int opcl = Msg.opcao_lista();
        int opc = 0;
        int pos = 0;
        
        while (opcl != 0)
        {
            switch (opcl)
            {
                case 1:
                {
                    opc = Msg.opcao_principal("Alunos");

                    while (opc != 0)
                    {
                        switch (opc)
                        {
                            case 1: // Inserção
                                Msg.limpatela();

                                if (lista_Alunos.vazia())
                                {
                                    lista_Alunos.inserir_por_posicao(1);
                                }
                                else
                                {
                                    pos = Msg.solicita_posicao();
                                    
                                    lista_Alunos.inserir_por_posicao(pos);
                                }
                                Msg.enter();
                                break;

                            case 2: // Remoção
                                Msg.limpatela();

                                if (lista_Alunos.vazia())
                                {
                                    Msg.msg_central ("A "+tipo_lista+"_Alunos está vazia, remoção não processada!");
                                }
                                else
                                {
                                    if (lista_Alunos.primeiroAluno == lista_Alunos.ultimoAluno)
                                    {
                                        lista_Alunos.remover_por_posicao(1);
                                    }
                                    else
                                    {
                                        pos = Msg.solicita_posicao();
                                    
                                        lista_Alunos.remover_por_posicao(pos);
                                    }
                                }

                                Msg.enter();
                                break;
                                
                            case 3: // Consulta
                                Msg.limpatela();

                                if (lista_Alunos.vazia())
                                {
                                    Msg.msg_central ("A "+tipo_lista+"_Alunos está vazia, consulta não processada!");
                                    Msg.enter();
                                }
                                else
                                {
                                    opc = Msg.opcao_consulta();

                                    Msg.limpatela();

                                    switch (opc)
                                    {
                                        case 1: // Consulta Geral
                                            lista_Alunos.consultar_geral();
                                            Msg.enter();
                                            break;

                                        case 2: // Consulta Posição
                                            posicao = Msg.solicita_posicao();

                                            if (posicao < 1)
                                            {
                                                Msg.msg_central ("Consulta nao realizada!");
                                            }
                                            else
                                            {
                                                lista_Alunos.consultar_posicao(posicao);
                                            }
                                            Msg.enter();
                                            break;

                                        case 3: // Consulta Conteúdo INT
                                            conteudo_int = Msg.solicita_conteudo_int();

                                            if (conteudo_int == 0)
                                            {
                                                Msg.msg_central ("Consulta nao realizada!");
                                            }
                                            else
                                            {
                                                lista_Alunos.consultar_conteudo_int(conteudo_int);
                                            }
                                            Msg.enter();
                                            break;

                                        case 4: // Consulta Conteúdo STR
                                            conteudo_str = Msg.solicita_conteudo_str();

                                            if (conteudo_str.isEmpty())
                                            {
                                                Msg.msg_central ("Consulta nao realizada!");
                                            }
                                            else
                                            {
                                                lista_Alunos.consultar_conteudo_str(conteudo_str);
                                            }
                                            Msg.enter();
                                            break;

                                        case 0:
                                            Msg.limpatela();
                                            Msg.msg_central ("Finalizando a consulta. Retornando.");
                                            Msg.enter();
                                            break;

                                        default:
                                            Msg.limpatela();
                                            Msg.msg_central ("Opção inválida, retornando...");
                                            Msg.enter();
                                    }
                                }
                                break;

                            case 4: // Inicialização
                                Msg.limpatela();

                                if (lista_Alunos.vazia())
                                {
                                    Msg.msg_central ("A "+tipo_lista+"_Alunos está vazia, inicialização não processada!");
                                }
                                else
                                {
                                    lista_Alunos.inicializar();
                                }
                                Msg.enter();
                                break;

                            case 5: // Tamanho da Lista
                                Msg.limpatela();

                                if (lista_Alunos.vazia())
                                {
                                    Msg.msg_central(">> A "+tipo_lista+" está vazia.");
                                }
                                else
                                {
                                    tamanho = lista_Alunos.tamanho();

                                    if (tamanho == 0)
                                    {
                                        Msg.msg_central (">> Aguarde a implementação do cálculo de tamanho!");
                                    }
                                    else
                                    {
                                        Msg.msg_central (">> O tamanho da "+tipo_lista+" é: ["+tamanho+"]\n\n");
                                    }

                                    tamanho = 0;
                                }

                                Msg.enter();
                                break;

                            case 6: // Especial 06

                                Msg.limpatela();
                                Msg.msg_central ("Especial 06");
                                Msg.enter();
                                break;

                            case 7: // Especial 07

                                Msg.limpatela();
                                Msg.msg_central ("Especial 07");
                                Msg.enter();
                                break;

                            case 8: // Especial 08

                                Msg.limpatela();
                                Msg.msg_central ("Especial 08");
                                Msg.enter();
                                break;

                            case 9: // Especial 09

                                Msg.limpatela();
                                Msg.msg_central ("Especial 09");
                                Msg.enter();
                                break;

                            case 10: // Especial 10

                                Msg.limpatela();
                                Msg.msg_central ("Especial 10");
                                Msg.enter();
                                break;

                            case 11: // Especial 11

                                Msg.limpatela();
                                Msg.msg_central ("Especial 11");
                                Msg.enter();
                                break;

                            case 12: // Especial 12

                                Msg.limpatela();
                                Msg.msg_central ("Especial 12");
                                Msg.enter();
                                break;

                            case 13: // Especial 13

                                Msg.limpatela();
                                Msg.msg_central ("Especial 13");
                                lista_Alunos.especial13();
                                Msg.enter();
                                break;

                            case 14: // Especial 14

                                Msg.limpatela();
                                Msg.msg_central ("Especial 14");
                                lista_Alunos.especial14();
                                Msg.enter();
                                break;

                            case 15: // Especial 15

                                Msg.limpatela();
                                Msg.msg_central ("Especial 15");
                                Msg.enter();
                                break;

                            case 0:
                                break;

                            default:
                                Msg.limpatela();
                                Msg.msg_central ("Opção inválida, retornando...");
                                Msg.enter();
                        }

                        opc = Msg.opcao_principal("Alunos");
                    }
                    break;
                }
                case 2:
                {
                    opc = Msg.opcao_principal("Cursos");

                    while (opc != 0)
                    {
                        switch (opc)
                        {
                            case 1: // Inserção
                                Msg.limpatela();
                                
                                lista_Cursos.inserir_final();

                                Msg.enter();
                                break;

                            case 2: // Remoção
                                Msg.limpatela();

                                if (lista_Cursos.vazia())
                                {
                                    Msg.msg_central ("A "+tipo_lista+"_Cursos está vazia, remoção não processada!");
                                }
                                else
                                {
                                    lista_Cursos.remover_inicio();
                                }
                                Msg.enter();
                                break;

                            case 3: // Consulta
                                Msg.limpatela();

                                if (lista_Cursos.vazia())
                                {
                                    Msg.msg_central ("A "+tipo_lista+"_Cursos está vazia, consulta não processada!");
                                    Msg.enter();
                                }
                                else
                                {
                                    opc = Msg.opcao_consulta();

                                    Msg.limpatela();

                                    switch (opc)
                                    {
                                        case 1: // Consulta Geral
                                            lista_Cursos.consultar_geral();
                                            Msg.enter();
                                            break;

                                        case 2: // Consulta Posição
                                            posicao = Msg.solicita_posicao();

                                            if (posicao < 1)
                                            {
                                                Msg.msg_central ("Consulta nao realizada!");
                                            }
                                            else
                                            {
                                                lista_Cursos.consultar_posicao(posicao);
                                            }
                                            Msg.enter();
                                            break;

                                        case 3: // Consulta Conteúdo INT
                                            conteudo_int = Msg.solicita_conteudo_int();

                                            if (conteudo_int == 0)
                                            {
                                                Msg.msg_central ("Consulta nao realizada!");
                                            }
                                            else
                                            {
                                                lista_Cursos.consultar_conteudo_int(conteudo_int);
                                            }
                                            Msg.enter();
                                            break;

                                        case 4: // Consulta Conteúdo STR
                                            conteudo_str = Msg.solicita_conteudo_str();

                                            if (conteudo_str.isEmpty())
                                            {
                                                Msg.msg_central ("Consulta nao realizada!");
                                            }
                                            else
                                            {
                                                lista_Cursos.consultar_conteudo_str(conteudo_str);
                                            }
                                            Msg.enter();
                                            break;

                                        default:
                                            Msg.limpatela();
                                            Msg.msg_central ("Opção inválida, retornando...");
                                            Msg.enter();
                                    }
                                }
                                break;

                            case 4: // Inicialização
                                Msg.limpatela();

                                if (lista_Cursos.vazia())
                                {
                                    Msg.msg_central ("A "+tipo_lista+"_Cursos está vazia, inicialização não processada!");
                                }
                                else
                                {
                                    lista_Cursos.inicializar();
                                }
                                Msg.enter();
                                break;

                            case 5: // Tamanho da Lista
                                Msg.limpatela();

                                if (lista_Cursos.vazia())
                                {
                                    Msg.msg_central(">> A "+tipo_lista+" está vazia.");
                                }
                                else
                                {
                                    tamanho = lista_Cursos.tamanho();

                                    if (tamanho == 0)
                                    {
                                        Msg.msg_central (">> Aguarde a implementação do cálculo de tamanho!");
                                    }
                                    else
                                    {
                                        Msg.msg_central (">> O tamanho da "+tipo_lista+" é: ["+tamanho+"]\n\n");
                                    }

                                    tamanho = 0;
                                }

                                Msg.enter();
                                break;

                            case 6: // Especial 06

                                Msg.limpatela();
                                Msg.msg_central ("Especial 06");
                                Msg.enter();
                                break;

                            case 7: // Especial 07

                                Msg.limpatela();
                                Msg.msg_central ("Especial 07");
                                Msg.enter();
                                break;

                            case 8: // Especial 08

                                Msg.limpatela();
                                Msg.msg_central ("Especial 08");
                                Msg.enter();
                                break;

                            case 9: // Especial 09

                                Msg.limpatela();
                                Msg.msg_central ("Especial 09");
                                Msg.enter();
                                break;

                            case 10: // Especial 10

                                Msg.limpatela();
                                Msg.msg_central ("Especial 10");
                                Msg.enter();
                                break;

                            case 11: // Especial 11

                                Msg.limpatela();
                                Msg.msg_central ("Especial 11");
                                Msg.enter();
                                break;

                            case 12: // Especial 12

                                Msg.limpatela();
                                Msg.msg_central ("Especial 12");
                                Msg.enter();
                                break;

                            case 13: // Especial 13

                                Msg.limpatela();
                                Msg.msg_central ("Especial 13");
                                Msg.enter();
                                break;

                            case 14: // Especial 14

                                Msg.limpatela();
                                Msg.msg_central ("Especial 14");
                                Msg.enter();
                                break;

                            case 15: // Especial 15

                                Msg.limpatela();
                                Msg.msg_central ("Especial 15");
                                Msg.enter();
                                break;

                            case 0:
                                break;

                            default:
                                Msg.limpatela();
                                Msg.msg_central ("Opção inválida, retornando...");
                                Msg.enter();
                        }

                        opc = Msg.opcao_principal("Cursos");
                    }
                }
                break;
            }
            
            opcl = Msg.opcao_lista();
        }
        
        Msg.limpatela();

        if (lista_Alunos.vazia())
        {
           Msg.msg_central ("O programa encerrou com a "+tipo_lista+"_Alunos vazia!");
        }
        else
        {
           Msg.msg_central ("Antes de encerrar, será apresentada a "+tipo_lista+"_Alunos na situação atual.");

           lista_Alunos.consultar_geral();

           lista_Alunos.xarq_salvar_arquivo(tipo_lista);
        }

        Msg.enter();
        
        if (lista_Cursos.vazia())
        {
           Msg.msg_central ("O programa encerrou com a "+tipo_lista+"_Cursos vazia!");
        }
        else
        {
           Msg.msg_central ("Antes de encerrar, será apresentada a "+tipo_lista+"_Cursos na situação atual.");

           lista_Cursos.consultar_geral();
        }
        
        Msg.enter();
    }
}
