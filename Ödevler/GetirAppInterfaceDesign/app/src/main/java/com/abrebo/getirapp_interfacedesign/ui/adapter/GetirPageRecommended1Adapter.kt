package com.abrebo.getirapp_interfacedesign.ui.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.abrebo.getirapp_interfacedesign.data.model.Product
import com.abrebo.getirapp_interfacedesign.databinding.ProductLayoutBinding
import com.squareup.picasso.Picasso

class GetirPageRecommended1Adapter(var mContext:Context, var productLists:List<Product>):RecyclerView.Adapter<GetirPageRecommended1Adapter.ProductHolder>() {

    inner class ProductHolder(var binding: ProductLayoutBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductHolder {
        val binding= ProductLayoutBinding.inflate(LayoutInflater.from(mContext), parent, false)
        return ProductHolder(binding)
    }

    override fun getItemCount(): Int {
        return productLists.size
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ProductHolder, position: Int) {
        val product=productLists.get(position)
        val binding=holder.binding

        Picasso.get()
            .load(product.image)
            .into(binding.imageViewProduct)

        binding.textViewProductTitle.text=product.title
        binding.textViewPrice.text="₺${product.price}"
        binding.textViewProductBottom.text=product.alt

    }
}