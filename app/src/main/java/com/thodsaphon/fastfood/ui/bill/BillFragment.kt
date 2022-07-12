package com.thodsaphon.fastfood.ui.bill

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.thodsaphon.fastfood.R

class BillFragment : Fragment() {

    companion object {
        fun newInstance() = BillFragment()
    }

    private lateinit var viewModel: BillViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_bill, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(BillViewModel::class.java)
        // TODO: Use the ViewModel
    }

}