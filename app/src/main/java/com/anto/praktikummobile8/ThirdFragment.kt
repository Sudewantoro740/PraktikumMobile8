package com.anto.praktikummobile8

import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.ViewModelProviders


class ThirdFragment : Fragment() {
    //Inisiasi public constructor kosong
    private var communicationViewModel: CommunicationViewModel? = null
    private var txtName: TextView? = null

    //Inisiasi View Model
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        communicationViewModel = ViewModelProviders.
        of(requireActivity()).   get(CommunicationViewModel::class.java)
    }

    //Mengembangkan Tata Letak Fragment
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?     ): View? {
        return inflater.inflate(R.layout.fragment_third,
            container, false)     }

    //Mengakses Member Dari Class Tanpa Objek
    companion object {
        fun newInstance(): ThirdFragment{
            return ThirdFragment()         }
    }
}