package com.example.facultystars
import android.widget.Toast
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
@Composable
fun FacultyListScreen(modifier: Modifier = Modifier) {
    val context = LocalContext.current

    LazyColumn(modifier = modifier) {
        items(FacultyDataProvider.facultyList) { faculty ->
            FacultyCard(faculty) {
                Toast.makeText(context, "Clicked: ${it.name}", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
