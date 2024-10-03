package com.aluracursos.appmusic.modelos;

public class MisFavoritos {

    public void adicione(Audio audio){
        if (audio.getClasificacion() >= 8){
            System.out.println(audio.getTitulo() + " Es uno de los primeros 10 favoritos del momento ");
        } else {
            System.out.println(audio.getTitulo() + " es uno de los primeros 50 favorito del momento ");

        }
    }
}
