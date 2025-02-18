package data


import com.uog.healthyrecipe.R

object RecipeData {

    val recipes = listOf(
        Recipe(
            id = 1,
            title = "Spaghetti Cabonara",
            description ="A classic Italian pasta dish made with eggs, cheese, pancetta...",
            ingredients = listOf(
                "Item 1",
                "Item 2",
                "Item 3...",
            ),
            imageResId = R.mipmap.spaghetti_carbonara)

    )
}