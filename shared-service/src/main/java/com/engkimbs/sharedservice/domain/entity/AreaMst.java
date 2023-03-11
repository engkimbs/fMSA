package com.engkimbs.sharedservice.domain.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Entity
@Table(name="AREA_MST")
@EntityListeners(AuditingEntityListener.class)
@NoArgsConstructor(access= AccessLevel.PUBLIC)
@AllArgsConstructor
@Builder
@Getter
public class AreaMst {

    @Id
    @SequenceGenerator(
            name = "area_mst_sequence_generator",
            sequenceName = "area_mst_sequence",
            initialValue = 10,
            allocationSize = 1)
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "area_mst_sequence_generator")
    Long id;

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

    public AreaMst updateAreaMst(AreaMst areaMst) {
        this.area = areaMst.getArea();
        this.description = areaMst.getDescription();
        return this;
    }
}