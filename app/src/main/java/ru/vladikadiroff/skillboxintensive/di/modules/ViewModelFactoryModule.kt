package ru.vladikadiroff.skillboxintensive.di.modules

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import ru.vladikadiroff.skillboxintensive.di.factories.ViewModelFactory
import ru.vladikadiroff.skillboxintensive.di.keys.ViewModelKey
import ru.vladikadiroff.skillboxintensive.di.scopes.ActivityScope
import ru.vladikadiroff.skillboxintensive.viewmodels.FirstLessonViewModel

@Module
abstract class ViewModelFactoryModule {

    @Binds
    @ActivityScope
    internal abstract fun bindViewModelFactory(factory: ViewModelFactory):ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(FirstLessonViewModel::class)
    internal abstract fun firstLessonFragment(viewModel: FirstLessonViewModel): ViewModel

}