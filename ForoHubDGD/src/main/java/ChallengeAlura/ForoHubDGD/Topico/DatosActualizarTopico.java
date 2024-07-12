package ChallengeAlura.ForoHubDGD.Topico;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DatosActualizarTopico(
                                    Long id,

                                    String titulo,

                                    String mensaje,

                                    String fechaDeCreacion,

                                    Boolean status,

                                    String autor,

                                    String curso
) {

    public DatosActualizarTopico(Topico topico) {
        this(topico.getId(), topico.getTitulo(), topico.getMensaje(), topico.getFechaDeCreacion(), topico.getStatus(), topico.getAutor(), topico.getCurso());

    }
}

