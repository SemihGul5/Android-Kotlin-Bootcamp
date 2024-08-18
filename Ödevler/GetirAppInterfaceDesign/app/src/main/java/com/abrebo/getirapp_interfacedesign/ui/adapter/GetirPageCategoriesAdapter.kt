package com.abrebo.getirapp_interfacedesign.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.abrebo.getirapp_interfacedesign.data.model.Categories
import com.abrebo.getirapp_interfacedesign.databinding.FragmentGetirPageBinding
import com.abrebo.getirapp_interfacedesign.databinding.GetirPageCatalogLayoutBinding
import com.google.android.material.snackbar.Snackbar
import com.squareup.picasso.Picasso

class GetirPageCategoriesAdapter(var mContext:Context, var categories:List<Categories>):RecyclerView.Adapter<GetirPageCategoriesAdapter.CatalogCardHolder>() {

    inner class CatalogCardHolder(var binding:GetirPageCatalogLayoutBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CatalogCardHolder {
        val binding= GetirPageCatalogLayoutBinding.inflate(LayoutInflater.from(mContext), parent, false)
        return CatalogCardHolder(binding)
    }

    override fun getItemCount(): Int {
        return categories.size
    }

    override fun onBindViewHolder(holder: CatalogCardHolder, position: Int) {
        val category=categories.get(position)
        val t=holder.binding

        Picasso.get()
            .load(category.image)
            .into(t.imageViewCategories)
        t.textViewCategoriesTitle.text=category.title

        t.categoriesCardView.setOnClickListener {
            Snackbar.make(it,"${category.title}'a gidiliyor",Snackbar.LENGTH_SHORT).show()
        }
    }
}