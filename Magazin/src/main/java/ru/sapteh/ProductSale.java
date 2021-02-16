package ru.sapteh;

import lombok.*;
import ru.sapteh.Manufacture;
import ru.sapteh.Product;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "productSale")
@Entity
public class ProductSale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "registr_date")
    @NonNull
    private Date registrationDate = new Date();

    @ManyToOne
    @JoinColumn(name = "manufactyre_id", nullable = false)
    @NonNull
    private Manufacture manufacture;

    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    @NonNull
    private Product product;

    @Override
    public String toString() {
        return "ProductSale{" +
                "id=" + id +
                ", RegistrationDate=" + registrationDate +
                ", productId=" + getProduct().getId() +
                ", manufactyreId=" + getManufacture().getName() +
                '}';
    }

}