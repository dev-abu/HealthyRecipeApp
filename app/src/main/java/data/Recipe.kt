package data


data class Recipe(
     val id: Int,
     val title: String,
     val description: String,
     val ingredients: List<String>,
     val imageResId: Int
 )