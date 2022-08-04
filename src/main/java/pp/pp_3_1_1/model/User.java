package myApp.model;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "usernames")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    @NonNull
    private String firstName;

    @Column(name = "email")
    @NonNull
    private String email;

    @Column(name = "age")
    @NonNull
    private byte age;
}
