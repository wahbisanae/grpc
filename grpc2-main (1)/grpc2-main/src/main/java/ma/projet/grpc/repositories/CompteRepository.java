package ma.projet.grpc.repositories;


import ma.projet.grpc.entites.Compte;
import org.springframework.data.jpa.repository. JpaRepository;
public interface CompteRepository extends JpaRepository<Compte, String> {
}