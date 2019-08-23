package guru.springframework.services;

import guru.springframework.domain.Recipe;

import java.util.Set;

public interface RecipeLister {

    public Set<Recipe> getRecipeList();
}
