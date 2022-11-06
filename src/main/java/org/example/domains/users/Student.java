package org.example.domains.users;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.domains.QA.Variant;
import org.example.domains.auth.AuthUser;

import java.util.List;

/**
 * @author "Khazratov Aslonbek"
 * @since 10/07/2022 00:58 (Monday)
 * quiz-app-console-master/IntelliJ IDEA
 */

@Entity
@Table(name = "students")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;

    @OneToOne(targetEntity = AuthUser.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", nullable = false)
    private AuthUser user;

    @OneToMany(targetEntity = Variant.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "student_id")
    private List<Variant> variant;
}
