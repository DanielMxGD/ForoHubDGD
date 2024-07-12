package ChallengeAlura.ForoHubDGD.Repository;

import ChallengeAlura.ForoHubDGD.Topico.DatosListadoTopico;
import ChallengeAlura.ForoHubDGD.Topico.Topico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicoRepository extends JpaRepository<Topico,Long> {
    DatosListadoTopico findAllById(Long id);
}
