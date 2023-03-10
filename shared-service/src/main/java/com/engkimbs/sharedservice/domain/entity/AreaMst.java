package com.engkimbs.sharedservice.domain.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

@Entity
@Table(name="area_mst")
@NoArgsConstructor(access= AccessLevel.PROTECTED)
@Getter
public class AreaMst {

    @Id
    @SequenceGenerator(
            name = "area_mst_sequence_generator",
            sequenceName = "area_mst_sequence",
            initialValue = 1,
            allocationSize = 1)
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "area_mst_sequence_generator")
    String id;

    String area;

    String description;

    @CreatedDate
    LocalDateTime created;

    @CreatedBy
    String createdBy;

    @LastModifiedDate
    LocalDateTime lastModified;

    @LastModifiedBy
    String lastModifiedBy;
}