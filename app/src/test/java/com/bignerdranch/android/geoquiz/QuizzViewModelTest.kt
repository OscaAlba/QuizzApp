package com.bignerdranch.android.geoquiz

import alba.oscar.quizzapp.CURRENT_INDEX_KEY
import alba.oscar.quizzapp.QuizzViewModel
import alba.oscar.quizzapp.R
import androidx.lifecycle.SavedStateHandle
import org.junit.Assert.assertEquals
import org.junit.Test
class QuizViewModelTest {
    @Test
    fun providesExpectedQuestionText() {
        val savedStateHandle = SavedStateHandle()
        val quizViewModel = QuizzViewModel(savedStateHandle)
        assertEquals(R.string.pregunta_art35, quizViewModel.currentQuestionText)
    }


    @Test
    fun wrapsAroundQuestionBank() {
        val savedStateHandle = SavedStateHandle(mapOf(CURRENT_INDEX_KEY to 5))
        val quizViewModel = QuizzViewModel(savedStateHandle)
        assertEquals(R.string.pregunta_art35, quizViewModel.currentQuestionText)
        quizViewModel.moveToNext()
        assertEquals(R.string.pregunta_art35, quizViewModel.currentQuestionText)
    }
}
