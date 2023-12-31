package ru.andreewkov.questions.screen.list

import android.widget.Space
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ru.andreewkov.questions.data.Question
import ru.andreewkov.questions.screen.QuestionsListScreenUiProviderStub
import ru.andreewkov.questions.utils.Heart

@Preview
@Composable
fun QuestionCardPreview() {
    val question = QuestionsListScreenUiProviderStub.stubbedQuestions.first()
    QuestionCard(
        question = Question(
            id = question.id,
            title = question.title,
            answer = question.answer,
        )
    )
}

@Composable
fun QuestionCard(question: Question) {
    Surface(
        shadowElevation = 8.dp,
        shape = RoundedCornerShape(8.dp),
        color = MaterialTheme.colorScheme.primaryContainer
    ) {
        QuestionCardContent(question)
    }
}

@Composable
fun QuestionCardContent(question: Question) {
    Row {
        Column(modifier = Modifier.weight(1F)) {
            Text(text = question.title)
            Spacer(modifier = Modifier.height(16.dp))
            Text(text = question.answer)
        }
        LikeBox(
            modifier = Modifier
                .align(Alignment.Bottom)
                .padding(all = 12.dp)
        )
    }
}

@Composable
fun LikeBox(modifier: Modifier = Modifier) {
    Box(modifier = modifier) {
        Heart(size = 24.dp, color = Color.Gray)
    }
}
