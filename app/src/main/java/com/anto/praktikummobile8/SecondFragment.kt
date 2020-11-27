package com.anto.praktikummobile8

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.google.android.material.textfield.TextInputEditText

class SecondFragment : Fragment() {
    //Inisiasi public constructor kosong
    private var communicationViewModel: CommunicationViewModel? = null
    private var txtName: TextView? = null

    //Inisiasi View Model
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        communicationViewModel = ViewModelProviders.
        of(requireActivity()).
        get(CommunicationViewModel::class.java)
    }

    //Inisiasi View Model
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    //Mengembangkan Tata Letak Fragment
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        txtName = view.findViewById(R.id.textViewName)
        val nameEditText = view.findViewById<TextInputEditText>(R.id.textInputTextName)
        communicationViewModel!!.name.observe(requireActivity(),
            Observer { s -> txtName!!.text = s })
    }

    //Mengakses Member Dari Class Tanpa Objek
    companion object {
        fun newInstance(): SecondFragment {
            return SecondFragment()
        }
    }
}