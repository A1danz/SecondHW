package com.itis.myapplication

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.itis.myapplication.databinding.FragmentAboutBinding
import com.itis.myapplication.databinding.FragmentProfileBinding

class AboutFragment : Fragment(R.layout.fragment_about) {
    private var binding : FragmentAboutBinding? = null;

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentAboutBinding.bind(view)

        val bundle = Bundle()
        bundle.putString("CLASS_NAME", this.javaClass.simpleName)
        binding?.run {
            btnToEmptyFragment.setOnClickListener {
                findNavController().navigate(
                    R.id.action_aboutFragment_to_emptyFragment, bundle
                )
            }
        }
//        val className = arguments?.getString("CLASS_NAME").toString()
//        Snackbar.make(binding!!.root, className, Snackbar.LENGTH_LONG).show()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}