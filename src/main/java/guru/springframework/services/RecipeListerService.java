package guru.springframework.services;

import guru.springframework.domain.Recipe;
import guru.springframework.repositories.RecipeRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class RecipeListerService implements RecipeLister {

    private RecipeRepository recipeRepository;

    public RecipeListerService(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    public Set<Recipe> getRecipeList() {
        Iterable<Recipe> iterableRecipes = recipeRepository.findAll();
        Set<Recipe> recipes = new HashSet<>();
        iterableRecipes.forEach(recipes::add);
        return recipes;
    }
}
