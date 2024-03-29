package ru.andreewkov.questions.presentation.di

import dagger.Component
import ru.andreewkov.questions.data_api.DataApi
import ru.andreewkov.questions.di.ComponentHolder
import ru.andreewkov.questions.presentation.viewmodel.MainViewModel
import ru.andreewkov.questions.presentation.viewmodel.QuestionListViewModel

@Component(
    dependencies = [DataApi::class],
)
interface PresentationComponent : ComponentHolder.Component {
    fun inject(viewModel: MainViewModel)

    fun inject(viewModel: QuestionListViewModel)
}