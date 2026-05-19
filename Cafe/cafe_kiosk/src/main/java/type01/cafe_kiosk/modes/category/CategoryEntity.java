package type01.cafe_kiosk.modes.category;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "category")

public class CategoryEntity {
    @Id
    private Integer id;

    @Column(name = "name" , length = 50, nullable = false)
    private String name;
}
