package mjc0324.personal01;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

@RestController
public class GameRestController {

    @PostMapping("/api/insert-data")
    public void insertData(@RequestBody GameDto gameDto) {
        System.out.println("insertData" + gameDto.toString());
    }
}
