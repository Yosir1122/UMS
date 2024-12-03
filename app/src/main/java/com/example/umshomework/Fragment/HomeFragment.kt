package com.example.umshomework.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import com.example.umshomework.R
import com.example.umshomework.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
    lateinit var binding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentHomeBinding.inflate(layoutInflater)
        binding.apply {

            Tarif.setOnClickListener {
                val bundle= bundleOf("keyPosition" to 0)
                val listFragment=ListFragment()
                listFragment.arguments=bundle
                parentFragmentManager.beginTransaction()
                    .replace(R.id.frame,listFragment)
                    .addToBackStack("dlld")
                    .commit()

            }
            Daqiqa.setOnClickListener {
                val bundle= bundleOf("keyPosition" to 1)
                val listFragment=ListFragment()
                listFragment.arguments=bundle
                parentFragmentManager.beginTransaction()
                    .replace(R.id.frame,listFragment)
                    .addToBackStack("dlld")
                    .commit()
            }
            Sms.setOnClickListener {
                val bundle= bundleOf("keyPosition" to 2)
                val listFragment=ListFragment()
                listFragment.arguments=bundle
                parentFragmentManager.beginTransaction()
                    .replace(R.id.frame,listFragment)
                    .addToBackStack("dlld")
                    .commit()
            }
            Internet.setOnClickListener {
                val bundle= bundleOf("keyPosition" to 3)
                val listFragment=ListFragment()
                listFragment.arguments=bundle
                parentFragmentManager.beginTransaction()
                    .replace(R.id.frame,listFragment)
                    .addToBackStack("dlld")
                    .commit()
            }

        }
        return binding.root
    }

}