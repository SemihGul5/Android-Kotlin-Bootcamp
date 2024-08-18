package com.abrebo.getirapp_interfacedesign.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.PagerSnapHelper
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.abrebo.getirapp_interfacedesign.data.model.Banner
import com.abrebo.getirapp_interfacedesign.data.model.Categories
import com.abrebo.getirapp_interfacedesign.data.model.Product
import com.abrebo.getirapp_interfacedesign.databinding.FragmentGetirPageBinding
import com.abrebo.getirapp_interfacedesign.ui.adapter.GetirPageBannerAdapter
import com.abrebo.getirapp_interfacedesign.ui.adapter.GetirPageCategoriesAdapter
import com.abrebo.getirapp_interfacedesign.ui.adapter.GetirPageRecommended1Adapter

class GetirPageFragment : Fragment() {
    private lateinit var binding:FragmentGetirPageBinding
    private lateinit var images:List<Banner>
    private lateinit var categories: List<Categories>
    private lateinit var products:List<Product>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding=FragmentGetirPageBinding.inflate(inflater, container, false)
        allListsInit()

        val viewPagerAdapter=GetirPageBannerAdapter(requireContext(),images)
        val snapHelper = PagerSnapHelper()
        snapHelper.attachToRecyclerView(binding.recyclerViewBanner)
        binding.recyclerViewBanner.layoutManager=StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL)
        binding.recyclerViewBanner.adapter=viewPagerAdapter

        val categoryAdapter=GetirPageCategoriesAdapter(requireContext(),categories)
        binding.recyclerViewCategories.layoutManager=StaggeredGridLayoutManager(4,StaggeredGridLayoutManager.VERTICAL)
        binding.recyclerViewCategories.adapter=categoryAdapter


        val recommended1Adapter=GetirPageRecommended1Adapter(requireContext(),products)
        binding.rec1RecyclerView.layoutManager=LinearLayoutManager(requireContext(),LinearLayoutManager.HORIZONTAL,false)
        binding.rec1RecyclerView.adapter=recommended1Adapter
        binding.rec2RecyclerView.layoutManager=LinearLayoutManager(requireContext(),LinearLayoutManager.HORIZONTAL,false)
        binding.rec2RecyclerView.adapter=recommended1Adapter








        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
    private fun allListsInit(){
        images= listOf(
            Banner(1,"https://cdn.getir.com/misc/611e55d33ea65bef40f9ba05_banner_tr_1629378026496.jpeg"),
            Banner(2,"https://cdn.getir.com/misc/611e4a50c270af509cd486b5_banner_tr_1629375115516.jpeg"),
            Banner(3,"https://cdn.getir.com/misc/5fb524d4c725f1530045cefc_banner_tr_1609343376255.jpeg"),
            Banner(4,"https://cdn.getir.com/misc/6069cee3f7be2b6472dc8b5f_banner_tr_1629921878792.jpeg")
        )
        categories= listOf(
            Categories(1,"Yeni Ürünler","http://cdn.getir.com/cat/5697c78dc181490f00c99fea_f7ef7ccb-f3a4-4388-b787-232967c16320.jpeg"),
            Categories(2,"İndirimler","http://cdn.getir.com/cat/5fd8c58f3bdc2389a56e0fb0_3322c10f-2eed-4ce9-ab5a-90db5ce067f2.jpeg"),
            Categories(3,"Su & İçecek","http://cdn.getir.com/cat/551430043427d5010a3a5c5e_1619242669958_1619242670038.jpeg"),
            Categories(4,"Meyve & Sebze","http://cdn.getir.com/cat/5928113e616cab00041ec6de_1619242870968_1619242871055.jpeg"),
            Categories(5,"Fırından","http://cdn.getir.com/cat/566eeb85f9facb0f00b1cb16_1619242817768_1619242817849.jpeg"),
            Categories(6,"Temel Gıda","http://cdn.getir.com/cat/56dfcfba86004203000a870d_1619242834654_1619242834734.jpeg"),
            Categories(7,"Atıştırmalık","http://cdn.getir.com/cat/56dfe03cf82055030022cdc0_1619242841966_1619242842053.jpeg"),
            Categories(8,"Dondurma","http://cdn.getir.com/cat/55bca8484dcda90c00e3aa80_1619242741382_1619242741482.jpeg"),
            Categories(9,"Yiyecek","http://cdn.getir.com/cat/551430043427d5010a3a5c5d_1619242660025_1619242660107.jpeg"),
            Categories(10,"Süt & Kahvaltı","http://cdn.getir.com/cat/56dfed05ab747f03008d9379_1619242850313_1619242850394.jpeg"),
            Categories(11,"Fit & Form","http://cdn.getir.com/cat/57e2996551f3ee030027e28b_1619242858559_1619242858642.jpeg"),
            Categories(12,"Kişisel Bakım","http://cdn.getir.com/cat/551430043427d5010a3a5c5c_1619242651249_1619242651335.jpeg"),
            Categories(13,"Ev Bakım","http://cdn.getir.com/cat/55449fdf02632e11003c2da8_1619242719523_1619242719602.jpeg"),
            Categories(14,"Ev & Yaşam","http://cdn.getir.com/cat/5b06b056b883b700044e3e4c_1619242916956_1619242917048.jpeg"),
            Categories(15,"Teknoloji","http://cdn.getir.com/cat/551430043427d5010a3a5c62_1619242697597_1619242697702.jpeg"),
            Categories(16,"Evcil Hayvan","http://cdn.getir.com/cat/551430043427d5010a3a5c63_1619242711604_1619242711687.jpeg"),
            Categories(17,"Bebek","http://cdn.getir.com/cat/551430043427d5010a3a5c5b_1619242620186_1619242620271.jpeg"),
            Categories(18,"Cinsel Sağlık","http://cdn.getir.com/cat/559c07b093be370c0063dd29_1619242727735_1619242727816.jpeg"),
            Categories(19,"Giyim","http://cdn.getir.com/cat/551430043427d5010a3a5c5f_1619242679723_1619242679822.jpeg")

        )
        products= listOf(
            Product(1,"Lay's Mevsim Yeşillikli","https://cdn.getir.com/product/5bc97aabb137fb001d751ac7_tr_1609123518121.jpeg","96 g",6.36),
            Product(2,"Eti Canga","https://cdn.getir.com/product/5f3538dc71a71226677fba17_tr_1624437105104.jpeg","45 g",2.85),
            Product(3,"Kuzeyden","https://cdn.getir.com/product/5a7b20fd8e19da0004bb27f8_tr_1615375864268.jpeg","1.5 L",2.95),
            Product(4,"Kızılay Erzincan","https://cdn.getir.com/product/60018c5bca2126d84459c47f_tr_1610788125046.jpeg","6 x 200 ml",5.9),
            Product(5,"Ülker Napoliten","https://cdn.getir.com/product/574b2219dee8a90300f18d24_tr_1599938278519.jpeg","33 g",3.3),
            Product(6,"Kavrulmuş Siyah Ay Çekirdeği","https://cdn.getir.com/product/5ccaf4ff1a1763000175a869_tr_1580904995656.jpeg","180 g",10.95),
            Product(7,"Magnum Badem","https://cdn.getir.com/product/559fec01f462100c00461d5c_tr_1618323765236.jpeg","100 ml",7.5),
            Product(8,"İçim %3 Yağlı Süt","https://cdn.getir.com/product/5ced482d4a8a2a000137da6d_tr_1623652387464.jpeg","1 L",7.95),
        )
    }

}