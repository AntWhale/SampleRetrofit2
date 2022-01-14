package com.boo.sample.sampleretrofit2

import android.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.boo.sample.sampleretrofit2.databinding.ItemEmgmedBinding

class EmdMedAdapter : ListAdapter<>(){
    class EmgMedViewHolder(private val binding: ItemEmgmedBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(item: Row){
            with(binding){
                tvName.text = item.mEDCAREINSTNM
                tvType.text = item.dISTRCTDIVNM
                tvPhone.text = item.eMGNCYCENTERTELNO
                tvWgs84lat.text = "위도: ${item.rEFINEWGS84LAT}"
            }
        }
    }
}