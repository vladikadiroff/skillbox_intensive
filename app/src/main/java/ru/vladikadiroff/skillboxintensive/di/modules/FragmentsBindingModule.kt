package ru.vladikadiroff.skillboxintensive.di.modules

import dagger.Module
import dagger.android.ContributesAndroidInjector
import ru.vladikadiroff.skillboxintensive.di.scopes.FragmentScope
import ru.vladikadiroff.skillboxintensive.ui.fragments.FirstLessonFragment

@Module
abstract class FragmentsBindingModule {

    @FragmentScope
    @ContributesAndroidInjector
    internal abstract fun bindFirstLessonFragment(): FirstLessonFragment

}