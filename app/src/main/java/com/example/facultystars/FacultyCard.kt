package com.example.facultystars
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.compose.ui.res.painterResource
@Composable
fun FacultyCard(faculty: FacultyMember, onClick: (FacultyMember) -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .clickable { onClick(faculty) },
    ) {
        Row(modifier = Modifier.padding(16.dp)) {
            Image(
                painter = painterResource(id = faculty.imageResId),
                contentDescription = faculty.name,
                modifier = Modifier
                    .size(64.dp)
                    .clip(CircleShape)
            )
            Spacer(modifier = Modifier.width(16.dp))
            Column {
                Text(faculty.name, style = MaterialTheme.typography.titleMedium)
                Text(faculty.title, style = MaterialTheme.typography.bodyMedium)
                Text(faculty.tagline, style = MaterialTheme.typography.bodySmall)
            }

        }
    }
}
