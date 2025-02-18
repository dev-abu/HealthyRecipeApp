package com.uog.healthyrecipe

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.app.ComponentActivity
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.uog.healthyrecipe.ui.theme.HealthyRecipeTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HealthyRecipeTheme {
                val navController = rememberNavController()
                Scaffold(
                    topBar = {
                      TopAppBar(
                          title = {
                              Text(
                                  text = stringResource(id = R.string.app_name)
                              )
                          }
                      )

                    }) { paddingValues ->
                    RecipeNavHost(navController = navController, paddingValues)
                }
            }
        }
    }
}

@Composable
fun RecipeNavHost(navController: NavHostController, paddingValues: PaddingValues)
// composable is used to create User Interface components in Jetpack Compose
// or Kotlin sha
{
    NavHost(
        navController = navController,
        startDestination = "recipe_list",
        Modifier.padding(paddingValues)) {
        // padding values are used control the internal spacing of a component
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun RecipeNavPreview() {
    HealthyRecipeTheme {
        val navController = rememberNavController()
         RecipeNavHost(navController = navController, paddingValues = PaddingValues())
    }
}