package com.itis.myapplication

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.google.android.material.snackbar.Snackbar
import com.itis.myapplication.databinding.FragmentEmptyBinding

class EmptyFragment : Fragment(R.layout.fragment_empty) {
    private var binding : FragmentEmptyBinding? = null;

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentEmptyBinding.bind(view)

        val className = arguments?.getString("CLASS_NAME").toString()
        Snackbar.make(binding!!.root, className, Snackbar.LENGTH_LONG).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null;
    }
}