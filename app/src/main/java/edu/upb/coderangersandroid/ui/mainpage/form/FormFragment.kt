package edu.upb.coderangersandroid.ui.mainpage.form

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import edu.upb.coderangersandroid.R
import edu.upb.coderangersandroid.databinding.FragmentFormBinding
import edu.upb.coderangersandroid.databinding.FragmentProfileBinding

class FormFragment : Fragment() {
    private lateinit var binding: FragmentFormBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFormBinding.inflate(inflater, container, false)
        return binding.root
    }
}