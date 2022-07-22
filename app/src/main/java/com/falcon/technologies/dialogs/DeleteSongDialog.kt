package com.falcon.technologies.dialogs

import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.fragment.app.DialogFragment
import com.falcon.technologies.R
import com.falcon.technologies.databinding.DialogDeleteSongBinding
import com.falcon.technologies.extension.materialDialog

class DeleteSongDialog : DialogFragment() {
    private var _binding: DialogDeleteSongBinding? = null
    private val binding get() = _binding!!



    companion object{
        fun create():DeleteSongDialog{
            return DeleteSongDialog()
        }
    }


    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        _binding = DialogDeleteSongBinding.inflate(layoutInflater)


        binding.delete.setOnClickListener{
            Toast.makeText(requireContext(), "delete clicked", Toast.LENGTH_SHORT).show()
            dismiss()
        }
        return materialDialog(R.string.delete_song)
            .setView(binding.root)
            .setBackground(ContextCompat.getDrawable(requireContext(),R.drawable.dialog_bg))
            .create()

    }
}