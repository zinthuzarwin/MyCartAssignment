package com.example.mycart.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mycart.R
import com.example.mycart.adapter.CardAdapter
import com.example.mycart.model.MyCart
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.fragment_cart.view.*

class MycartFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var cartArray=ArrayList<MyCart>()
        cartArray.add(MyCart("Fine Grain Sugar","$20.00",R.drawable.sugar,"1Kg"))
        cartArray.add(MyCart("Peanuts","$20.00",R.drawable.peanuts,"3Kg"))
        cartArray.add(MyCart("Dawat Rice","$80.00",R.drawable.rice,"2Kg"))
        var personAdapter= CardAdapter(cartArray)
        var root=inflater.inflate(R.layout.fragment_cart, container, false)
        root.recyclerView.layoutManager= LinearLayoutManager(context)
        root.recyclerView.adapter=personAdapter
        // Inflate the layout for this fragment
        return root
    }

}