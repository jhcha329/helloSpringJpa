package kr.ac.hansung.cse.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 카테고리 등록 폼 DTO
 *
 * Category 엔티티를 직접 폼에 바인딩하지 않고,
 * 웹 입력 검증은 별도 DTO에서 처리합니다.
 */
@Getter
@Setter
@NoArgsConstructor
public class CategoryForm {

    @NotBlank(message = "카테고리 이름을 입력하세요.")
    @Size(max = 50, message = "카테고리 이름은 50자 이하여야 합니다.")
    private String name;
}
