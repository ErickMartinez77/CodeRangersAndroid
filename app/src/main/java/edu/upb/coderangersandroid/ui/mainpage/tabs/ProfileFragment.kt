package edu.upb.coderangersandroid.ui.mainpage.tabs

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import edu.upb.coderangersandroid.databinding.FragmentProfileBinding
import edu.upb.coderangersandroid.ui.mainpage.tabs.profile.ProfileViewModel
import edu.upb.coderangersandroid.ui.mainpage.viewmodels.UserViewModel

class ProfileFragment : Fragment() {

    private val profileViewModel: ProfileViewModel by viewModels()
    private val userViewModel: UserViewModel by activityViewModels()
    private lateinit var binding: FragmentProfileBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentProfileBinding.inflate(inflater, container, false)
        binding.profileViewModel = profileViewModel
        binding.userViewModel = userViewModel
        binding.lifecycleOwner = this
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.ivEdit.setOnClickListener {
            val editMode = profileViewModel.editModelEnable.value!!
            profileViewModel.editModelEnable.postValue(!editMode)
            userViewModel.updateUser()
        }
    }

}