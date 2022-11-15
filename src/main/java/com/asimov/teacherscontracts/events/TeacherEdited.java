package com.asimov.teacherscontracts.events;

import lombok.Value;

import java.time.Instant;

@Value
public class TeacherEdited {
    private String teacherId;
    private String point;
    private String firstName;
    private String lastName;
    private String age;
    private String email;
    private String password;
    private String phone;
    private Instant ocurredOn;
}
