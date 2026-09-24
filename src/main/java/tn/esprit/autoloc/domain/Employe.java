package tn.esprit.autoloc.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tn.esprit.autoloc.domain.enums.RoleEmploye;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idEmploye;
    String nom;
    String prenom;
    RoleEmploye roleEmploye;
}
