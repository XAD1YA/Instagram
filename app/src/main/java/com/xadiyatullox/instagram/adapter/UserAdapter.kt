package com.xadiyatullox.instagram.adapter

import android.provider.ContactsContract
import android.widget.ListAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.xadiyatullox.instagram.model.Data

class UserAdapter : ListAdapter<Data, UserAdapter.UserViewHolder>(DiffCallBack()) {
    private class DiffCallBack : DiffUtil.ItemCallback<ContactsContract.RawContacts.Data>() {
        override fun areItemsTheSame(
            oldItem: ContactsContract.RawContacts.Data,
            newItem: ContactsContract.RawContacts.Data
        ): Boolean {

        }

        override fun areContentsTheSame(
            oldItem: ContactsContract.RawContacts.Data,
            newItem: ContactsContract.RawContacts.Data
        ): Boolean {

        }
    }
    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.bind(equals(position))
    }

    inner class UserViewHolder(private val binding: ItemLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(data: Data) {
            with(binding) {
                Glide.with(img)
                    .load(data.avatar)
                    .circleCrop()
                    .into(img)
            }
        }
        }
}
