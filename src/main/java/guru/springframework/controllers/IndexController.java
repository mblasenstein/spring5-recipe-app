package guru.springframework.controllers;

import guru.springframework.domain.Category;
import guru.springframework.domain.UnitOfMeasure;
import guru.springframework.repositories.CategoryRepository;
import guru.springframework.repositories.UnitOfMeasureRespository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

/**
 * Created by jt on 6/1/17.
 */
@Controller
public class IndexController {

    private CategoryRepository categoryRepository;
    private UnitOfMeasureRespository unitOfMeasureRespository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRespository unitOfMeasureRespository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRespository = unitOfMeasureRespository;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(){

        Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRespository.findByDescription("Teaspoon");

        System.out.println("Category ID is: " + categoryOptional.get().getId());
        System.out.println("Unit of Measure ID is: " + unitOfMeasureOptional.get().getId());

        return "index";
    }
}
