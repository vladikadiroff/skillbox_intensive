package ru.vladikadiroff.skillboxintensive.ui.fragments

import android.view.LayoutInflater
import android.view.ViewGroup
import ru.vladikadiroff.skillboxintensive.R
import ru.vladikadiroff.skillboxintensive.databinding.FragmentFirstLessonBinding
import ru.vladikadiroff.skillboxintensive.ui.abstracts.BaseFragment
import ru.vladikadiroff.skillboxintensive.viewmodels.FirstLessonViewModel

class FirstLessonFragment: BaseFragment<FragmentFirstLessonBinding, FirstLessonViewModel>(){

    override val viewModelClass = FirstLessonViewModel::class.java
    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) ->
    FragmentFirstLessonBinding = FragmentFirstLessonBinding::inflate

    override fun initFragment() {
        with(binding){
            button1.setOnClickListener { viewModel.onClickButton(getString(R.string.button_1)) }
            button2.setOnClickListener { viewModel.onClickButton(getString(R.string.button_2)) }
            button3.setOnClickListener { viewModel.onClickButton(getString(R.string.button_3)) }
        }
    }

}