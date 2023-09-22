package pe.edu.upc.aaw.redcorp_application.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "GrupoDeProyecto")
public class GrupoDeProyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int idGrupoDeProyecto;
    @Column(name = "nombre",length = 100,nullable = false)
    private String nombre;
    @Column(name= "fechaCreacion",nullable = false)
    private LocalDate fechaCreacion;

    @ManyToOne
    @JoinColumn(name = "proyectoId")
    Proyecto proyecto;

    public GrupoDeProyecto() {
    }

    public GrupoDeProyecto(int idGrupoDeProyecto, String nombre, LocalDate fechaCreacion, Proyecto proyecto) {
        this.idGrupoDeProyecto = idGrupoDeProyecto;
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
        this.proyecto = proyecto;
    }

    public int getIdGrupoDeProyecto() {
        return idGrupoDeProyecto;
    }

    public void setIdGrupoDeProyecto(int idGrupoDeProyecto) {
        this.idGrupoDeProyecto = idGrupoDeProyecto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }

    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }
}
