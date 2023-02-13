package com.miniproject.transactionflow.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import java.util.Date;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="user_table")
public class User {
    private String userName;
    private String mobileNumber;
    private double creditLimit;
    private Long lastFourDigitsOfPan;
    @ElementCollection
    private List<Integer> lenderId;
    @CreationTimestamp
    private Date createdAt;
    @UpdateTimestamp
    private Date updatedAt;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
