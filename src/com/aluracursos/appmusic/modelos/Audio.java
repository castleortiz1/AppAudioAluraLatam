package com.aluracursos.appmusic.modelos;


public class Audio {
    // atributos
    private String titulo;
    private String artista;
    private int totalDeReproducciones;
    private int totalDeMeGusta;
    private int clasificacion;

    // constructor
    public void meGusta() {
        this.totalDeMeGusta++;

    }

    public void reproduce(){
        this.totalDeReproducciones++;

    }

    // getters and setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getTotalDeReproducciones() {
        return totalDeReproducciones;
    }

    public void setTotalDeReproducciones(int totalDeReproducciones) {
        this.totalDeReproducciones = totalDeReproducciones;
    }

    public int getTotalDeMeGusta() {
        return totalDeMeGusta;
    }

    public void setTotalDeMeGusta(int totalDeMeGusta) {
        this.totalDeMeGusta = totalDeMeGusta;
    }

    public int getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(int clasificacion) {
        this.clasificacion = clasificacion;
    }
}
