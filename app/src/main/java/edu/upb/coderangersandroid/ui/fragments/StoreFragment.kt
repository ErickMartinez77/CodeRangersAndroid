package edu.upb.coderangersandroid.ui.fragments

import androidx.fragment.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import edu.upb.coderangersandroid.R
import edu.upb.coderangersandroid.databinding.FragmentStoreBinding

class StoreFragment: Fragment() {
    private lateinit var binding: FragmentStoreBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentStoreBinding.inflate(inflater, container, false)
        return binding.root
    }
}