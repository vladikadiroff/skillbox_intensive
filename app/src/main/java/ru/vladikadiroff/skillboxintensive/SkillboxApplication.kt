package ru.vladikadiroff.skillboxintensive

import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import ru.vladikadiroff.skillboxintensive.di.components.DaggerApplicationComponent

class SkillboxApplication: DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerApplicationComponent.builder().build()
    }

}