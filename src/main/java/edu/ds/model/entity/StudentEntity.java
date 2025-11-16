package edu.ds.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter@ToString

@Entity
@Table(name = "student")
public class StudentEntity {
    @Id
    private String id;

    @Column(name = "first_name", nullable = false, length = 64)
    private String firstName;

    @Column(name = "last_Name", nullable = false, length = 64)
    private String LastName;

    @Column(nullable = false, length = 16)
    private String gender;

    @Column(nullable = false, length = 8)
    private int grade;

    @Column(nullable = false, length = 128)
    private String address;

    @Column(nullable = false, length = 16)
    private String mobile;
}
