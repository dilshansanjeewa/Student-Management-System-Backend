package edu.ds.model.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter@ToString
public class Student {
    private String id;
    private String firstName;
    private String LastName;
    private String gender;
    private int grade;
    private String address;
    private String mobile;
}
