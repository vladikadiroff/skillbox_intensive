package ru.vladikadiroff.skillboxintensive.di.modules

import dagger.Module
import dagger.android.ContributesAndroidInjector
import ru.vladikadiroff.skillboxintensive.di.scopes.ActivityScope
import ru.vladikadiroff.skillboxintensive.ui.activities.MainActivity

@Module
abstract class ActivityBindingModule {

    @ActivityScope
    @ContributesAndroidInjector(modules = [FragmentsBindingModule::class, ViewModelFactoryModule::class])
    abstract fun bindMainActivity(): MainActivity


}