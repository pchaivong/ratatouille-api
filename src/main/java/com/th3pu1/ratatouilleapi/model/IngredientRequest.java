package com.th3pu1.ratatouilleapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.springframework.boot.jackson.JsonComponent;

import java.math.BigDecimal;

/**
 * Created by pchaivong on 9/2/2017 AD.
 */

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@JsonComponent
public class IngredientRequest {

    @JsonProperty("name")
    private String name;

    @JsonProperty("price")
    private BigDecimal price;

    @JsonProperty("cost-per-unit")
    private BigDecimal costPerUnit;

}