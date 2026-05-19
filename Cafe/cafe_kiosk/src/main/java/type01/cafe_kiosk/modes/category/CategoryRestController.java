package type01.cafe_kiosk.modes.category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import type01.cafe_kiosk.common.ApiResponse;

@RestController
@RequestMapping("api/V1/cat")
public class CategoryRestController {

    @Autowired
    private CategoryRepository categoryRepository;

    @PostMapping
    public ResponseEntity<ApiResponse<CategoryEntity>> insert(@RequestBody CategoryDto data) {
        CategoryEntity entity = new CategoryEntity();
        entity.setId(data.getId());
        entity.setName(data.getName());
        CategoryEntity result = this.categoryRepository.save(entity);
        return ResponseEntity.status(201).body(ApiResponse.insert_success, "ok", result);
    }
}
