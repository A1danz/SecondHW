package com.itis.myapplication

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.itis.myapplication.databinding.FragmentProfileBinding
import com.itis.myapplication.databinding.FragmentSettingsBinding

class ProfileFragment : Fragment(R.layout.fragment_profile) {
    private var binding : FragmentProfileBinding? = null;

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentProfileBinding.bind(view)

        val bundle = Bundle()
        bundle.putString("CLASS_NAME", this.javaClass.simpleName)
        binding?.run {
            btnToEmptyFragment.setOnClickListener {
                findNavController().navigate(
                    R.id.action_profileFragment_to_emptyFragment, bundle
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