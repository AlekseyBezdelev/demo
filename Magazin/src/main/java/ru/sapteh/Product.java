package ru.sapteh;

import lombok.*;
import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Getter
@Setter
@Entity
@NoArgsConstructor
@RequiredArgsConstructor
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;
    @Column(name = "Title")
    @NonNull
    private String Title;
      @Column(name = "Cost")
    @NonNull
      private String Cost;
    @Column(name = "Description")
    @NonNull
    private String Description;
         @Column(name = "MainImagePath")
    @NonNull
    private String MainImagePath;
     @Column(name = "IsActive")
    @NonNull
       private String IsActive;
    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", Tittle=" + getTitle() +
                ", Cost=" + getCost() +
                ", Description=" + getDescription() +
                ", MainImagePath=" + getMainImagePath() +
                ", IsActive=" + getIsActive() +
                '}';
    }

}
