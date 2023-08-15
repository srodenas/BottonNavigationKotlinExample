package com.pmdm.virgen.myapplication.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import com.pmdm.virgen.myapplication.databinding.FragmentDashboardBinding

class DashboardFragment : Fragment() {

    private var _binding: FragmentDashboardBinding? = null
    private val viewModelDash : DashboardViewModel by viewModels()  //delegamos a viewModels para crear una instancia del viewmodel


    private val binding get() = _binding!!  //devuelvo el binding en su getter


    //Al crear la vista
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        //utilizamos binding para los elementos de la vista. En container, tenemos la vista del fragmento a inflar.
        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        val root: View = binding.root

        //Observamos el liveData y actuamos cuando hay una modificación.
        viewModelDash.text2.observe(viewLifecycleOwner){
            binding.textDashboard.text = it  //actualizamos la vista.
        }
        return root  //devolvemos la vista creada.
    }


    //Al destruirse la vista.
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}