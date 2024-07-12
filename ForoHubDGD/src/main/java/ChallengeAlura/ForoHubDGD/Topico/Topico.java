package ChallengeAlura.ForoHubDGD.Topico;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Entity(name = "Topico")
@Table(name = "topicos")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String mensaje;
    private String fechaDeCreacion;
    private Boolean status;
    private String autor;
    private String curso;

    public Topico(DatosTopico datosTopico) {
        this.titulo = datosTopico.titulo();
        this.mensaje = datosTopico.mensaje();
        this.fechaDeCreacion = datosTopico.fechaDeCreacion();
        this.status = true;
        this.autor = datosTopico.autor();
        this.curso = datosTopico.curso();
    }

    public String getTitulo() {
        return titulo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public String getAutor() {
        return autor;
    }

    public String getCurso() {
        return curso;
    }

    public String getFechaDeCreacion() {
        return fechaDeCreacion;
    }

    public Boolean getStatus() {
        return status;
    }

    public Long getId() {
        return id;
    }

    public void actualizarDatos(DatosActualizarTopico datosActualizarTopico) {
        if(datosActualizarTopico.titulo() != null){
            this.titulo= datosActualizarTopico.titulo();
        }if(datosActualizarTopico.mensaje() != null){
            this.mensaje = datosActualizarTopico.mensaje();
        }if(datosActualizarTopico.fechaDeCreacion() != null){
            this.fechaDeCreacion = datosActualizarTopico.fechaDeCreacion();
        }if(datosActualizarTopico.status() != null){
            this.status = datosActualizarTopico.status();
        }if(datosActualizarTopico.autor() != null){
            this.autor = datosActualizarTopico.autor();
        }if(datosActualizarTopico.curso() != null){
            this.curso = datosActualizarTopico.curso();
        }

    }
}
