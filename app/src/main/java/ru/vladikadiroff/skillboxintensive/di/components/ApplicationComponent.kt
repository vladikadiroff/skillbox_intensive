package ru.vladikadiroff.skillboxintensive.di.components

import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import ru.vladikadiroff.skillboxintensive.SkillboxApplication
import ru.vladikadiroff.skillboxintensive.di.modules.ActivityBindingModule
import ru.vladikadiroff.skillboxintensive.di.scopes.ApplicationScope

@ApplicationScope
@Component(modules = [AndroidSupportInjectionModule::class, ActivityBindingModule::class])
interface ApplicationComponent: AndroidInjector<SkillboxApplication> {
    fun build(): ApplicationComponent
}