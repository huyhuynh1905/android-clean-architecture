package com.huyhuynh.android_clean_architecture.utils

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.huyhuynh.android_clean_architecture.domain.model.NoteEntity
import com.huyhuynh.android_clean_architecture.presentation.adapter.ListNoteAdapter

object BindingUtils {
    @BindingAdapter("setListNote")
    @JvmStatic
    fun setListNote(recyclerView: RecyclerView, items: List<NoteEntity>?) {
        val adapter: RecyclerView.Adapter<*>? = recyclerView.adapter
        if (adapter != null && adapter is ListNoteAdapter) {
            if (items != null) {
                adapter.setNewData(items)
            }
        }
    }
}