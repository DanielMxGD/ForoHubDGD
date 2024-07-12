package ChallengeAlura.ForoHubDGD.Topico;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record DatosListadoTopico(
        @NotNull
        Long id,
        @NotBlank
        String titulo,
        @NotBlank
        String mensaje,
        @NotBlank
        String fechaDeCreacion,
        @NotBlank
        Boolean status,
        @NotBlank
        String autor,
        @NotBlank
        String curso
) {
    public DatosListadoTopico (Topico topico){
        this(topico.getId(),topico.getTitulo(), topico.getMensaje(), topico.getFechaDeCreacion(),topico.getStatus(), topico.getAutor(), topico.getCurso());

    }
}
