package com.aditya.trainingplatform.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Batch {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @NotBlank
  private String title;

  @NotBlank
  private String subject;

  private int maxCapacity;

  private LocalDate startDate;
  private LocalDate endDate;

  @ManyToOne
  private Trainer assignedTrainer;

  @ManyToMany
  private List<Student> enrolledStudents;
}
