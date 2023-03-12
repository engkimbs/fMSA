package com.engkimbs.recipeservice.domain.entity;

import lombok.*;
import org.springframework.data.annotation.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document("RMSHistory")
@NoArgsConstructor(access= AccessLevel.PUBLIC)
@AllArgsConstructor
@Builder
@Getter
public class RMSHistory {

    @Id
    String _id;

    String line;

    String area;

    String maker;

    String eqpModel;

    String eqpId;

    String rmsModel;

    Double value;

    @CreatedDate
    LocalDateTime created;
}
