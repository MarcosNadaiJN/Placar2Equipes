package mapa.pds1.placar2equipes;

public class Pontuacao {
    public static void verificaPontudacao (int equipe) {
        if (equipe == 1) {
            if (Tela.pontuacaoEquipe1 >= 12) {
                Tela.QuantidadeRodadasVencidasEquipe1++;
                Tela.pontuacaoEquipe1 = 0;
                Tela.pontuacaoEquipe2 = 0;
            }
        } else if (equipe == 2) {
            if (Tela.pontuacaoEquipe2 >= 12) {
                Tela.QuantidadeRodadasVencidasEquipe2++;
                Tela.pontuacaoEquipe2 = 0;
                Tela.pontuacaoEquipe1 = 0;
            }
        }
    }
    
   public static String verificaPlacar () {
       if (Tela.QuantidadeRodadasVencidasEquipe1 == 3) {
           Tela.CodigoEquipeVencedora = 1;
           Tela.pontuacaoEquipe1 = 0;
           Tela.pontuacaoEquipe2 = 0;
           Tela.QuantidadeRodadasVencidasEquipe1 = 0;
           Tela.QuantidadeRodadasVencidasEquipe2 = 0;
           return Tela.TextoNomeEquipe1;
       } else if (Tela.QuantidadeRodadasVencidasEquipe2 == 3) {
           Tela.CodigoEquipeVencedora = 2;
           Tela.pontuacaoEquipe1 = 0;
           Tela.pontuacaoEquipe2 = 0;
           Tela.QuantidadeRodadasVencidasEquipe1 = 0;
           Tela.QuantidadeRodadasVencidasEquipe2 = 0;
           return Tela.TextoNomeEquipe2;
       } else {
       } return "...";
   }
}
