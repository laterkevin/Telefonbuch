package com.example.telefonbuch

import android.content.Context
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.view.WindowManager
import android.view.inputmethod.InputMethodManager
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.telefonbuch.contactadapter.ContactAdapter
import com.example.telefonbuch.data.Datasource
import com.example.telefonbuch.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val contact = Datasource().loadContact()

        binding.contactRecycler.adapter = ContactAdapter(this, contact)

        binding.contactRecycler.setHasFixedSize(true)
    }
    class MainActivity : AppCompatActivity() {
        lateinit var editText: EditText
        lateinit var textView: TextView
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)
            editText = findViewById(R.id.editTextName)
            editText = findViewById(R.id.editTextTelefonummer)
            textView = findViewById(R.id.textView)
            title = "KotlinApp"
        }

        fun setText(view: View) {
            val newText = editText.text.toString()
            textView.text = newText
            closeKeyBoard()
        }

        private fun closeKeyBoard() {
            val view = this.currentFocus
            if (view != null) {
                val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
                imm.hideSoftInputFromWindow(view.windowToken, 0)
            }
        }
    }
}