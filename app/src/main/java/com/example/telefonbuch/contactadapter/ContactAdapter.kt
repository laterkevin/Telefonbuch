package com.example.telefonbuch.contactadapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.telefonbuch.data.model.Contact
import com.example.telefonbuch.databinding.ContactListBinding

class ContactAdapter(
    private val context: Context,
    private val dataset: List<Contact>
) : RecyclerView.Adapter<ContactAdapter.ItemViewHolder>() {

    class ItemViewHolder(val binding: ContactListBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {

        val binding = ContactListBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return ItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {

        val item = dataset[position]

        holder.binding.cardImage.setImageResource(item.imageResource)





    }

    override fun getItemCount(): Int {
        return dataset.size
    }
}
