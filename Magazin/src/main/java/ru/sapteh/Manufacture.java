package ru.sapteh;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "manufacture")
@Entity


public class Manufacture {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name", nullable = false)
    private String name;

    @OneToMany(mappedBy = "manufacture", fetch = FetchType.LAZY)
    private Set<ProductSale> productSales;

    @Override
    public String toString() {
        return "Munufacture{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
