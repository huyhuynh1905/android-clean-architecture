package com.huyhuynh.android_clean_architecture.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.huyhuynh.android_clean_architecture.databinding.ItemNotedBinding
import com.huyhuynh.android_clean_architecture.domain.model.NoteEntity
import com.huyhuynh.android_clean_architecture.BR

class ListNoteAdapter(var listNote: List<NoteEntity>,var onItemClickListener: OnItemClickListener) : RecyclerView.Adapter<ListNoteAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
        ViewHolder(ItemNotedBinding.inflate(LayoutInflater.from(parent.context), parent, false))

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binData(listNote[position], onItemClickListener)
    }

    override fun getItemCount(): Int {
        return listNote.size
    }



    class ViewHolder(var binding: ItemNotedBinding) : RecyclerView.ViewHolder(binding.root) {
        fun binData(value: NoteEntity,onItemClickListener: OnItemClickListener,) {
            binding.apply {
                setVariable(BR.noteEntity, value)
                executePendingBindings()
            }
            binding.btnDelete.setOnClickListener {
                onItemClickListener.onDeleteItem(value)
            }

        }
    }
    fun setNewData(newItems: List<NoteEntity>) {
        this.listNote = newItems
        notifyDataSetChanged()
    }

    interface OnItemClickListener {
        fun onDeleteItem(value: NoteEntity)
    }
}