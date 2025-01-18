package org.expense.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity(name="expense_tracker")
public class ExpenceTracker {
    @Id
    @GeneratedValue
    private int id;
    @ManyToOne()
    private int userId;
}
