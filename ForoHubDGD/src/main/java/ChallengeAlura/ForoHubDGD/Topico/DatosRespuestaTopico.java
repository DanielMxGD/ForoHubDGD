package ChallengeAlura.ForoHubDGD.Topico;

import jakarta.validation.constraints.NotBlank;

public record DatosRespuestaTopico(
        @NotBlank
        Long id,
        @NotBlank
        String titulo,
        @NotBlank
        String mensaje,

        String fechaDeCreacion,

                                   Boolean status,

                                   String autor,

                                   String curso) {
}
