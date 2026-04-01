package mjc0324.personal01.gamecrud;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class GameDto {
    private Integer id;
    private String name;
    private String grade;
    private Integer price;
    private String imgUrl;
}
