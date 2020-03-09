package com.example.mycart.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mycart.R
import com.example.mycart.model.MyCart
import kotlinx.android.synthetic.main.cart_item.view.*

class CardAdapter(var myCartList: ArrayList<MyCart>) :   //Obj array list ko argu a nay nae htae
    RecyclerView.Adapter<CardAdapter.CartViewHolder>() {

    inner class CartViewHolder(itemView: View) ://view nae call ya mal
        RecyclerView.ViewHolder(itemView) {
        fun bindmyCart(myCart: MyCart) {
            itemView.name.text = myCart.name
            itemView.price.text = myCart.price
            itemView.profile_img.setImageResource(myCart.profileImage)
            itemView.weight.text=myCart.price
        }
    }

    //..............rec put mal layout...rec puttin work
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CartViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.cart_item, parent, false)
        return CartViewHolder(view)
    }

    //............rec mr output ml count a yay a twat
    override fun getItemCount(): Int {
        return myCartList.size
    }

    override fun onBindViewHolder(holder: CartViewHolder, position: Int) {
        holder.bindmyCart(myCartList[position])//array tae insert
    }


}