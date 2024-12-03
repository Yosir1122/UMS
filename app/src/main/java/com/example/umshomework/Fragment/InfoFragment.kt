package com.example.umshomework.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.umshomework.R
import com.example.umshomework.databinding.FragmentInfoBinding
import com.example.umshomework.models.MyInfo

class InfoFragment : Fragment() {
    lateinit var binding: FragmentInfoBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentInfoBinding.inflate(layoutInflater)
        val myInfo=arguments?.getSerializable("keyInfo") as MyInfo
        binding.tv.text=myInfo.toString()
        return binding.root
    }

}