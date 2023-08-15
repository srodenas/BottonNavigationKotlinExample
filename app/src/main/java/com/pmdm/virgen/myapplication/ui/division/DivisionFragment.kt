package com.pmdm.virgen.myapplication.ui.division

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.pmdm.virgen.myapplication.R

class DivisionFragment : Fragment() {

    companion object {
        fun newInstance() = DivisionFragment()
    }

    private lateinit var viewModel: DivisionViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_division, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(DivisionViewModel::class.java)
        // TODO: Use the ViewModel
    }

}