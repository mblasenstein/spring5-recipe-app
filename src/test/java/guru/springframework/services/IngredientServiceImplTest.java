package guru.springframework.services;

import guru.springframework.converters.IngredientToIngredientCommand;
import guru.springframework.converters.UnitOfMeasureToUnitOfMeasureCommand;
import guru.springframework.repositories.RecipeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class IngredientServiceImplTest {

    @Mock
    RecipeRepository recipeRepository;

    IngredientService ingredientService;

    @InjectMocks
    private final IngredientToIngredientCommand ingredientToIngredientCommand;

    //init converters
    public IngredientServiceImplTest() {
        this.ingredientToIngredientCommand = new IngredientToIngredientCommand(new UnitOfMeasureToUnitOfMeasureCommand());
    }

    @BeforeEach
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);

        ingredientService = new IngredientServiceImpl(ingredientToIngredientCommand, recipeRepository);
    }

    @Test
    public void findByRecipeIdAndId() throws Exception {
    }

//    @Test
//    public void findByRecipeIdAndReceipeIdHappyPath() throws Exception {
//        //given
//        Recipe recipe = new Recipe();
//        recipe.setId(1L);
//
//        Ingredient ingredient1 = new Ingredient();
//        ingredient1.setId(1L);
//
//        Ingredient ingredient2 = new Ingredient();
//        ingredient2.setId(1L);
//
//        Ingredient ingredient3 = new Ingredient();
//        ingredient3.setId(3L);
//
//        recipe.addIngredient(ingredient1);
//        recipe.addIngredient(ingredient2);
//        recipe.addIngredient(ingredient3);
//        Optional<Recipe> recipeOptional = Optional.of(recipe);
//
//        when(recipeRepository.findById(anyLong())).thenReturn(recipeOptional);
//
//        //then
//        IngredientCommand ingredientCommand = ingredientService.findByRecipeIdAndIngredientId(1L, 3L);
//
//        //when
//        assertEquals(Long.valueOf(3L), ingredientCommand.getId());
//        assertEquals(Long.valueOf(1L), ingredientCommand.getRecipeId());
//        verify(recipeRepository, times(1)).findById(anyLong());
//    }

}