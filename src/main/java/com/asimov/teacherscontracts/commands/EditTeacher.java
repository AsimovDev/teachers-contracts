package com.asimov.teacherscontracts.commands;

import lombok.Value;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Value
public class EditTeacher {
    @TargetAggregateIdentifier
    private String teacherId;
    private String firstName;
    private String lastName;
    private String point;
    private String age;
    private String email;
    private String password;
    private String phone;
}
