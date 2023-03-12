package com.engkimbs.recipeservice.domain.entity;

import com.engkimbs.recipeservice.domain.entity.vo.RMSInterlock;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Entity
@Table(name="RMS_MST")
@EntityListeners(AuditingEntityListener.class)
@NoArgsConstructor(access= AccessLevel.PUBLIC)
@AllArgsConstructor
@Builder
@Getter
public class RMSMst {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String line;

    String area;

    String maker;

    String eqpModel;

    String eqpId;

    String rmsModel;

    @Embedded
    RMSInterlock interlock;

    @CreatedDate
    LocalDateTime created;

    @CreatedBy
    String createdBy;

    @LastModifiedDate
    LocalDateTime lastModified;

    @LastModifiedBy
    String lastModifiedBy;

    @PrePersist
    private void prePersist() {
        this.createdBy = this.createdBy == null ? "SA" : this.createdBy;
        this.lastModifiedBy = this.lastModifiedBy == null ? "SA" : this.lastModifiedBy;
    }

    @PreUpdate
    private void preUpdate() {
        this.lastModifiedBy = this.lastModifiedBy == null ? "SA" : this.lastModifiedBy;
    }

    public void updateRMSMst(RMSMst rmsMst) {
        this.line = rmsMst.getLine();
        this.area = rmsMst.getArea();
        this.maker = rmsMst.getMaker();
        this.eqpModel = rmsMst.getEqpModel();
        this.eqpId = rmsMst.getEqpId();
        this.rmsModel = rmsMst.getRmsModel();
    }
}