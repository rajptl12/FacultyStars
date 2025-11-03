package com.example.facultystars

import com.example.facultystars.R
data class FacultyMember(
    val name: String,
    val title: String,
    val imageResId: Int,
    val tagline: String
)
object FacultyDataProvider {
    val facultyList: List<FacultyMember> = listOf(
        FacultyMember(
            name = "Denise Marques, PhD",
            title = "Associate Director of Clinical Training ",
            imageResId = R.drawable.professor1,
            tagline = "Core Faculty Member"
        ),
        FacultyMember(
            name = "Elizabeth Chan, PhD",
            title = "Assistant Professor",
            imageResId = R.drawable.professor2,
            tagline = "Loves teaching advanced algebra"
        ),
        FacultyMember(
            name = "Joshua Sandry, PhD",
            title = "Assistant Professor",
            imageResId = R.drawable.professor3,
            tagline = "Cognitive impairment and neuropsychological changes in multiple sclerosis and traumatic brain injury"
        ),
        FacultyMember(
            name = "Laura Lakusta, PhD",
            title = "Professor",
            imageResId = R.drawable.professor4,
            tagline = "Language and cognitive development in typically developing infants and children, as well as children with developmental disorders, such as Autism Spectrum Disorder, Specific Language Impairment, and Williams syndrome"
        ),
        FacultyMember(
            name = "Jazmin Reyes-Portillo, PhD",
            title = "Associate Professor",
            imageResId = R.drawable.professor5,
            tagline = "Youth mental health services, including use of technology to increase racial/ethnic minority youth access to and use of mental health treatment for internalizing disorders"
        )
    )
}
