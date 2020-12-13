/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioncorredores.dto;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author mad_d
 */
public class Carrera {

    String nombre, lugar;
    Date fechaCarrera;
    int numeroParticipantes;
    //ArrayList donde se guardan los tiempos de cada corredor en al carrera
    ArrayList<Tiempo> tiempoCorredores = new ArrayList<>();
    boolean carreraAcabada;

    public Carrera(String nombre, String lugar, Date fechaCarrera, int numeroParticipantes, boolean carreraAcabada) {
        this.nombre = nombre;
        this.lugar = lugar;
        this.fechaCarrera = fechaCarrera;
        this.numeroParticipantes = numeroParticipantes;
        this.carreraAcabada = carreraAcabada;
    }

    public Carrera() {
        this(null, null, null, 0, false);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public Date getFechaCarrera() {
        return fechaCarrera;
    }

    public void setFechaCarrera(Date fechaCarrera) {
        this.fechaCarrera = fechaCarrera;
    }

    public int getNumeroParticipantes() {
        return numeroParticipantes;
    }

    public void setNumeroParticipantes(int numeroParticipantes) {
        this.numeroParticipantes = numeroParticipantes;
    }

    public boolean isCarreraAcabada() {
        return carreraAcabada;
    }

    public void setCarreraAcabada(boolean carreraAcabada) {
        this.carreraAcabada = carreraAcabada;
    }

    public void anadirTiempo(Tiempo tiempo) {

        tiempoCorredores.add(tiempo);

    }

    public ArrayList<Tiempo> getTiempoCorredores() {
        return tiempoCorredores;
    }

}
