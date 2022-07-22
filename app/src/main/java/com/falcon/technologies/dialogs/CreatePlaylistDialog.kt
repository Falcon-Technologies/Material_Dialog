package com.falcon.technologies.dialogs

import android.app.Dialog
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import com.falcon.technologies.R
import com.falcon.technologies.databinding.PlaylistDialogBinding
import com.falcon.technologies.extension.colorButtons
import com.falcon.technologies.extension.materialDialog


class CreatePlaylistDialog : DialogFragment() {
    private var _binding: PlaylistDialogBinding? = null
    private val binding get() = _binding!!

    companion object {
        fun create(): CreatePlaylistDialog {
            return CreatePlaylistDialog()
        }
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        _binding = PlaylistDialogBinding.inflate(layoutInflater)

        return materialDialog(R.string.new_playlist_title)
            .setView(binding.root)
            .setPositiveButton(R.string.create_action) { _, _ ->
                Toast.makeText(requireContext(), "create clicked", Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton(R.string.action_cancel) { _, _ ->
                Toast.makeText(requireContext(), "cancel click", Toast.LENGTH_SHORT).show()
            }
            .create()
            .colorButtons()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
