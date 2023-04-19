package pl.cuzz.gymSharks.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "user_dimensions")
public class UserDimensions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate date;
    private double neck;
    private double arm;
    private double forearm;
    private double wrist;
    private double chest;
    private double waist;
    private double thigh;
    private double calf;

    @ManyToOne
    private User user;
}
