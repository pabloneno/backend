/*
● O objetivo da eleição deve ser definido pela equipe e deve ser apresentado
no programa. Exemplo: “Eleição do Coordenador do Curso”.
● Essa eleição deve possuir no mínimo 4 candidatos. O nome dos candidatos
devem aparecer na tela do programa para o usuário poder escolher.
● Cada voto deve ser dado pelo número do candidato, permitindo-se ainda o
voto em branco (0) e voto nulo (quando vota em um candidato que não
existe).
● No final da eleição, o programa deve emitir um relatório contendo a votação
de cada candidato, de votos em branco, de votos nulos e o candidato eleito
(se houve empate, ele também deve ser divulgado).
● Deverá ser considerado que a cidade possui somente 5 eleitores.

*/

#include <stdio.h>
#include <math.h>
#include <string.h>
int main()
{

  int voto;
  int candidato1 = 0;
  int candidato2 = 0;
  int candidato3 = 0;
  int candidato4 = 0;
  int brancos = 0;
  int nulos = 0;
  int contador = 1;
  char nomec1[30], nomec2[30], nomec3[30], nomec4[30];

  strcpy(nomec1, "ANA PAULA DE SOUZA\0");
  strcpy(nomec2, "GISELLE CRISTINA CARDOSO\0");
  strcpy(nomec3, "RAFAEL DALONSO SCHULTZ\0");
  strcpy(nomec4, "STRAUS MICHALSKY\0");

  // imprime cabecalho do nosso programa
  printf("***********************************************\n");
  printf("* Bem vindo a Eleicao do Coordenador do Curso *\n");
  printf("***********************************************\n");

  printf("\n");
  printf("\n");

  printf("***************Bem vindo a URNA******************\n");
  printf("*******CANDIDATOS A COORDENADOR DO CURSO*********\n");
  printf("*%s *********************VOTE 10*\n", nomec1);
  printf("*%s ***************VOTE 13*\n", nomec2);
  printf("*%s *****************VOTE 25*\n", nomec3);
  printf("*%s ***********************VOTE 50*\n", nomec4);
  printf("*VOTO EM BRANCO   **********************DIGITE 0*\n");
  printf("*VOTO NULO   ***DIGITE QUALQUER NUMERO DIFERENTE*\n");
  printf("*************************************************\n");

  printf("ELEITOR %d, DIGITE O SEU VOTO: ", contador);
  scanf("%d", &voto);

  if (voto == 10)
  {
    candidato1 = candidato1 + 1;
  }
  else if (voto == 13)
  {
    candidato2 = candidato2 + 1;
  }
  else if (voto == 25)
  {
    candidato3 = candidato3 + 1;
  }
  else if (voto == 50)
  {
    candidato4 = candidato4 + 1;
  }
  else if (voto == 0)
  {
    brancos = brancos + 1;
  }
  else
  {
    nulos = nulos + 1;
  }
  contador++;

  /* SEGUNDO ELEITOR */
  printf("ELEITOR %d, DIGITE O SEU VOTO: ", contador);
  scanf("%d", &voto);

  if (voto == 10)
  {
    candidato1 = candidato1 + 1;
  }
  else if (voto == 13)
  {
    candidato2 = candidato2 + 1;
  }
  else if (voto == 25)
  {
    candidato3 = candidato3 + 1;
  }
  else if (voto == 50)
  {
    candidato4 = candidato4 + 1;
  }
  else if (voto == 0)
  {
    brancos = brancos + 1;
  }
  else
  {
    nulos = nulos + 1;
  }
  contador++;
  /* TERCEIRO ELEITOR */
  printf("ELEITOR %d, DIGITE O SEU VOTO: ", contador);
  scanf("%d", &voto);

  if (voto == 10)
  {
    candidato1 = candidato1 + 1;
  }
  else if (voto == 13)
  {
    candidato2 = candidato2 + 1;
  }
  else if (voto == 25)
  {
    candidato3 = candidato3 + 1;
  }
  else if (voto == 50)
  {
    candidato4 = candidato4 + 1;
  }
  else if (voto == 0)
  {
    brancos = brancos + 1;
  }
  else
  {
    nulos = nulos + 1;
  }
  contador++;
  /* QUARTO ELEITOR */
  printf("ELEITOR %d, DIGITE O SEU VOTO: ", contador);
  scanf("%d", &voto);

  if (voto == 10)
  {
    candidato1 = candidato1 + 1;
  }
  else if (voto == 13)
  {
    candidato2 = candidato2 + 1;
  }
  else if (voto == 25)
  {
    candidato3 = candidato3 + 1;
  }
  else if (voto == 50)
  {
    candidato4 = candidato4 + 1;
  }
  else if (voto == 0)
  {
    brancos = brancos + 1;
  }
  else
  {
    nulos = nulos + 1;
  }
  contador++;

  /* QUINTO ELEITOR*/
  printf("ELEITOR %d, DIGITE O SEU VOTO: ", contador);
  scanf("%d", &voto);

  if (voto == 10)
  {
    candidato1 = candidato1 + 1;
  }
  else if (voto == 13)
  {
    candidato2 = candidato2 + 1;
  }
  else if (voto == 25)
  {
    candidato3 = candidato3 + 1;
  }
  else if (voto == 50)
  {
    candidato4 = candidato4 + 1;
  }
  else if (voto == 0)
  {
    brancos = brancos + 1;
  }
  else
  {
    nulos = nulos + 1;
  }

  /* APURACAO */
  printf("\n");
  printf("\n");
  printf("*RESULTADO FINAL: *********************************\n");
  printf("*%s ********************* %d VOTOS**\n", nomec1, candidato1);
  printf("*%s *************** %d VOTOS**\n", nomec2, candidato2);
  printf("*%s ***************** %d VOTOS**\n", nomec3, candidato3);
  printf("*%s *********************** %d VOTOS**\n", nomec4, candidato4);
  printf("*VOTOS EM BRANCO ************************ %d VOTOS**\n", brancos);
  printf("*VOTOS NULOS **************************** %d VOTOS**\n", nulos);
  printf("***************************************************\n");

  /* RESULTADO FINAL*/
  if (candidato1 > candidato2 && candidato1 > candidato3 && candidato1 > candidato4)
  {
    printf("VENCEDOR: %s\n", nomec1);
  }
  else if (candidato2 > candidato1 && candidato2 > candidato3 && candidato2 > candidato4)
  {
    printf("VENCEDOR: %s\n", nomec2);
  }
  else if (candidato3 > candidato1 && candidato3 > candidato2 && candidato3 > candidato4)
  {
    printf("VENCEDOR: %s\n", nomec3);
  }
  else if (candidato4 > candidato1 && candidato4 > candidato2 && candidato4 > candidato3)
  {
    printf("VENCEDOR: %s\n", nomec4);
  }
  else if (candidato1 == candidato2 && candidato1 != candidato3 && candidato1 != candidato4 && candidato1 > 0)
  {
    printf("VENCEDORES: %s e %s\n", nomec1, nomec2);
  }
  else if (candidato1 != candidato2 && candidato1 == candidato3 && candidato1 != candidato4 && candidato1 > 0)
  {
    printf("VENCEDORES: %s e %s\n", nomec1, nomec3);
  }
  else if (candidato1 != candidato2 && candidato1 != candidato3 && candidato1 == candidato4 && candidato1 > 0)
  {
    printf("VENCEDORES: %s e %s\n", nomec1, nomec4);
  }
  else if (candidato2 != candidato1 && candidato2 == candidato3 && candidato2 != candidato4 && candidato2 > 0)
  {
    printf("VENCEDORES: %s e %s\n", nomec2, nomec3);
  }
  else if (candidato2 != candidato1 && candidato2 != candidato3 && candidato2 == candidato4 && candidato2 > 0)
  {
    printf("VENCEDORES: %s e %s\n", nomec2, nomec4);
  }
  else if (candidato3 != candidato1 && candidato3 != candidato2 && candidato3 == candidato4 && candidato3 > 0)
  {
    printf("VENCEDORES: %s e %s\n", nomec3, nomec4);
  }
  else
  {
    printf("NAO HOUVE GANHADOR.\nTOTAL DE VOTOS NULOS: %d.\nTOTAL DE VOTOS BRANCOS: %d", nulos, brancos);
  }

  return 0;
}