package com.example.umshomework.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import com.example.umshomework.R
import com.example.umshomework.adapters.MyInfoAdapters
import com.example.umshomework.databinding.FragmentListBinding
import com.example.umshomework.models.MyInfo
import com.example.umshomework.utils.MyData

class ListFragment : Fragment(), MyInfoAdapters.RvAction {
    lateinit var binding: FragmentListBinding
    lateinit var myInfoAdapters: MyInfoAdapters
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentListBinding.inflate(layoutInflater)
        val position=arguments?.getInt("keyPosition")
        when(position){
            0->myInfoAdapters= MyInfoAdapters(this ,MyData.tarifList)
            1->myInfoAdapters= MyInfoAdapters(this ,MyData.daqiqaList)
            2->myInfoAdapters= MyInfoAdapters(this ,MyData.smsList)
            3->myInfoAdapters= MyInfoAdapters(this ,MyData.internetList)

        }
        binding.Rv.adapter=myInfoAdapters
        return binding.root
    }

    override fun itemClick(myInfo: MyInfo) {
        val bundle= bundleOf("keyInfo" to myInfo)
        val listFragment=InfoFragment()
        listFragment.arguments=bundle
        parentFragmentManager.beginTransaction()
            .replace(R.id.frame,listFragment)
            .addToBackStack("dlld")
            .commit()
    }


}