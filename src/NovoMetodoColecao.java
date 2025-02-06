
import java.util.*;

public class NovoMetodoColecao {

        public static void main(String args[]){
            separando();
        }

        private static void separando() {
            System.out.println("Lista de Alunos Presente em Sala");

            List<String> lista = new ArrayList<String>();
            lista.add("João da Silva-M");
            lista.add("Antonio Sousa-M");
            lista.add("Ana Oliveira-F");
            lista.add("Vitor Cunha-M");
            lista.add("Beatriz Souza-F");
            lista.add("Júlia Santos-F");
            lista.add("Lúcia Ferreira-F");

            Collections.sort(lista);
            System.out.println(lista);


            String texto = "João da Silva-M,Antpnio Sousa-M,Ana Oliveira-F,Vitor Cunha-M,Beatriz Souza-F,Júlia Santos-F,";

            List<String> nomes = new ArrayList<>();
            List<String> nomes2 = new ArrayList<>();
            nomes.add("João da Silva-M");
            nomes.add("Antpnio Sousa-M");
            nomes.add("Vitor Cunha-M");
            nomes.add("Ana Oliveira-F");
            nomes.add("Beatriz Souza-F");
            nomes.add("Júlia Santos-F");

            List<String> nomesMasculinos1 = new ArrayList<>();
            List<String> nomesFemininos2 = new ArrayList<>();
            List<String> nomesMasculinos = new ArrayList<>();
            List<String> nomesFemininos = new ArrayList<>();

            String[] nomes3 = texto.split("");

            for (String nome : nomes) {
                if (nome.endsWith("-M")) {
                    nomesMasculinos.add(nome);
                } else if (nome.endsWith("-F") ) {
                    nomesFemininos.add(nome);
                }
            }

            System.out.println("Nomes Masculinos: " + nomesMasculinos);
            System.out.println("Nomes Femininos: " + nomesFemininos);
        }


}

