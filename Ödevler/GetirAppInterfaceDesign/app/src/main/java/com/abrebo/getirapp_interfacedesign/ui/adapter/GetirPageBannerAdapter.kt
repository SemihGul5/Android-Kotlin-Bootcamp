package com.abrebo.getirapp_interfacedesign.ui.adapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.abrebo.getirapp_interfacedesign.data.model.Banner
import com.abrebo.getirapp_interfacedesign.databinding.BannerLayoutBinding
import com.squareup.picasso.Picasso

class GetirPageBannerAdapter(val mContext:Context, val bannerList:List<Banner>):RecyclerView.Adapter<GetirPageBannerAdapter.ViewPagerHolder>() {

    inner class ViewPagerHolder(val binding: BannerLayoutBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerHolder {
        val binding= BannerLayoutBinding.inflate(LayoutInflater.from(mContext), parent, false)
        return ViewPagerHolder(binding)
    }

    override fun getItemCount(): Int {
        return bannerList.size
    }

    override fun onBindViewHolder(holder: ViewPagerHolder, position: Int) {
        val t=holder.binding
        val banner=bannerList.get(position)
        Picasso.get()
            .load(banner.image)
            .into(t.imageViewViewPager)

        t.bannerCardView.setOnClickListener {
            Log.e("Mesaj",banner.image)
        }


    }
}