package com.itis.myapplication

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.itis.myapplication.databinding.FragmentMainBinding

class MainFragment : Fragment(R.layout.fragment_main) {
    private var binding : FragmentMainBinding? = null;

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMainBinding.bind(view)

        val bundle = Bundle()
        bundle.putString("CLASS_NAME", this.javaClass.simpleName)
        binding?.run {
            btnToEmptyFragment.setOnClickListener {
                findNavController().navigate(
                    R.id.action_mainFragment_to_emptyFragment, bundle
                )
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

}