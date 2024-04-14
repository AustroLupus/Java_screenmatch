package com.aluracursos.screenmatch.modelos;

public class Pelicula {
    private String nombre;
    private int fechaDeLanzamiento;
    private int duracionEnMinutos;
    private boolean incluidoEnElPlan;
    private double sumaDeLasEvaluaciones;
    private int totalDeLasEvaluaciones;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public void setIncluidoEnElPlan(boolean incluidoEnElPlan) {
        this.incluidoEnElPlan = incluidoEnElPlan;
    }

    public int getTotalDeLasEvaluaciones() {
        return totalDeLasEvaluaciones;
    }

    public void muestraFichaTecnica() {
        System.out.println("EL nombre de la película es: " + nombre);
        System.out.println("Su fecha de lanzamiento es: " + fechaDeLanzamiento);
        System.out.println("Duration en minutos: " + duracionEnMinutos);
    }

    public void evalua(double nota) {
        sumaDeLasEvaluaciones += nota;
        totalDeLasEvaluaciones++;
    }

    public double calculaMedia(){
        return sumaDeLasEvaluaciones/totalDeLasEvaluaciones;
    }
}