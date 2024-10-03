package com.aluracursos.appmusic.principal;
import com.aluracursos.appmusic.modelos.Cancion;
import com.aluracursos.appmusic.modelos.MisFavoritos;
import com.aluracursos.appmusic.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Cancion miCancion = new Cancion();
        miCancion.setTitulo("Despacito");
        miCancion.setCantante("Luis Fonsi");;

        Podcast miPodcast = new Podcast();
        miPodcast.setPresentador("Jonisai");
        miPodcast.setTitulo("La Vida es una Musica");

        // Canciones(metodo)
        for (int i = 0; i < 7000; i++){
            miCancion.meGusta();
        }
        for (int i = 0; i < 2000; i++) {
            miCancion.reproduce();
        }

        // Podcast (metodo)
        for (int i = 0; i < 3000; i++){
            miPodcast.meGusta();
        }
        for (int i = 0; i < 2000; i++) {
            miPodcast.reproduce();
        }

        System.out.println("Total de reproduciones: " + miCancion.getTotalDeReproducciones());
        System.out.println("Total de me Gusta: " + miCancion.getTotalDeMeGusta());

        System.out.println("Presentador: " + miPodcast.getPresentador());
        System.out.println("Título: " + miPodcast.getTitulo());

        MisFavoritos favoritos = new MisFavoritos();
        favoritos.adicione(miPodcast);
        favoritos.adicione(miCancion);
    }
}
