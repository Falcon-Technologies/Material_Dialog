package com.falcon.technologies

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.falcon.technologies.databinding.ActivityMainBinding
import com.falcon.technologies.dialogs.CreatePlaylistDialog
import com.falcon.technologies.dialogs.DeleteSongDialog

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        listeners()
    }

    private fun listeners() {
        binding.createNewPlaylist.setOnClickListener(this)
        binding.deleteSongs.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        when(p0){
            binding.createNewPlaylist->{
                Toast.makeText(this, "Create", Toast.LENGTH_SHORT).show()
                CreatePlaylistDialog.create().show(supportFragmentManager,"CreateNewPlaylist")
            }
            binding.deleteSongs->{
                Toast.makeText(this, "Delete song clicked", Toast.LENGTH_SHORT).show()
                DeleteSongDialog.create().show(supportFragmentManager,"DeleteSongDialog")
            }
        }
    }
}