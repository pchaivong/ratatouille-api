package com.th3pu1.ratatouilleapi.entity;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by pchaivong on 9/2/2017 AD.
 */

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "INGREDIENT")
@Entity
public class Ingredient {

    @Id
    @GeneratedValue
    @Column(name = "ID")
    private long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "PRICE")
    private BigDecimal price;


    @Column(name = "COST_PER_UNIT")
    private BigDecimal costPerUnit;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="CATEGORY_ID", referencedColumnName="ID")
    private Category category;

}
