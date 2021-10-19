package edu.upb.coderangersandroid.ui.mainpage.tabs.feed.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import edu.upb.coderangersandroid.R
import edu.upb.coderangersandroid.databinding.FragmentServiceDetailsBinding

class ServiceProfileFragment : Fragment() {
    private lateinit var binding: FragmentServiceDetailsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentServiceDetailsBinding.inflate(inflater,container,false)
        return binding.root
    }

}