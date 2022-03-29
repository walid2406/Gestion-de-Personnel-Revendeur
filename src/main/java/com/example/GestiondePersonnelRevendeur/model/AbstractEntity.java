package com.example.GestiondePersonnelRevendeur.model;

import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;


@AllArgsConstructor
@Builder
@Data
@Getter
@Setter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class AbstractEntity implements Serializable {

    public AbstractEntity(){

    }
    @Id
    @GeneratedValue
    private Integer id;

    @CreatedDate
    @Column(name = "created_date",updatable = false,nullable = false)

    private Instant creationDate;

    @LastModifiedDate
    @Column(name = "modified_date")

    private Instant lsatUpdatedDate;

}