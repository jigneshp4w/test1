package org.expense.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity(name = "user_details")
public class User {
    @Id
    @GeneratedValue
    private int id;
    private String name;
}
