package com.example.facultystars
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.facultystars.ui.theme.FacultyStarsTheme
import com.example.facultystars.FacultyListScreen  // adjust if needed
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FacultyApp() {
    FacultyStarsTheme {
        Scaffold(
            topBar = {
                TopAppBar(
                    title = { Text(text = "Montclair Faculty Stars") }
                )
            }
        ) { padding ->
            FacultyListScreen(modifier = Modifier.padding(padding))
        }
    }
}
