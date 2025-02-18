package com.uog.healthyrecipe

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.uog.healthyrecipe.ui.theme.HealthyRecipeTheme
import data.Recipe
import data.RecipeData

@Composable
fun RecipeListScreen(navHostController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(text = "Choose a Recipe", style = MaterialTheme.typography.headlineSmall)

        Spacer(modifier = Modifier.height(20.dp))

        RecipeData.recipes.forEach { recipe ->
            RecipeItem(recipe, onClick ={
                navController.navigate(
                    "recipe${recipe.id}"
                )
            })
        }
    }
}

@Composable
fun RecipeItem(recipe: Recipe, onClick: () -> Unit) {
}

@Preview(showBackground = true)
@Composable
fun PreviewRecipeListScreen(){
    HealthyRecipeTheme {
        val navController = rememberNavController()
        RecipeListScreen(navHostController = navController)
    }

}