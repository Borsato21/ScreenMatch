package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(6);
        Serie lost = new Serie("Lost", 2000);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(9);
        var filmeDoDiego = new Filme("A Forja", 2024);
        filmeDoDiego.avalia(10);

        Filme f1 = filmeDoDiego;

        List<Titulo> lista = new LinkedList<>();
        lista.add(filmeDoDiego);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);
        for (Titulo item: lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2){
                System.out.println("Classificação " +filme.getClassificacao());      }
            }

        ArrayList<String> buscaPorArtistas = new ArrayList<>();
        buscaPorArtistas.add("Vítor");
        buscaPorArtistas.add("Fernando");
        buscaPorArtistas.add("Manu");
        System.out.println(buscaPorArtistas);

        Collections.sort(buscaPorArtistas);
        System.out.println("A pos ordenação da lista");
        System.out.println(buscaPorArtistas);

        Collections.sort(lista);
        System.out.println("Lista de Titulos ordenados");
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano");
        System.out.println(lista);
    }
}
