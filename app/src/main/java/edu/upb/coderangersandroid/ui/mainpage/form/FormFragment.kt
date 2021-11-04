package edu.upb.coderangersandroid.ui.mainpage.form

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import edu.upb.coderangersandroid.databinding.FragmentFormBinding
import edu.upb.coderangersandroid.ui.mainpage.MainPageActivity
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

class FormFragment : Fragment() {
    private lateinit var binding: FragmentFormBinding
    private val postFromFragmentViewModel : PostFromFragmentViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFormBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.buttontoAction.setOnClickListener {
            val publisher = binding.serviceName.toString()
            val shortDescription = binding.shortDescription.toString()
            val imageUrl = ""
            val ownerName =  ""
            val phone = binding.PhoneNumber.toString()
            postFromFragmentViewModel.post(publisher, shortDescription,imageUrl,ownerName,phone).
            onEach { val intent = Intent(context, MainPageActivity::class.java)
                startActivity(intent)
            }.launchIn(CoroutineScope(Dispatchers.Main))
        }
    }
}