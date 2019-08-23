package guru.springframework.controllers;

import guru.springframework.domain.Recipe;
import guru.springframework.services.RecipeListerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;
import java.util.Set;

@Controller
public class IndexController {

    private final RecipeListerService recipeListerService;
    private static Logger log = LoggerFactory.getLogger(IndexController.class);

    public IndexController(RecipeListerService recipeListerService) {

        this.recipeListerService = recipeListerService;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model) {
        log.debug("Getting index page");

        Set<Recipe> recipes = recipeListerService.getRecipeList();
        model.addAttribute("recipes", recipes);

        return "index";
    }
}
