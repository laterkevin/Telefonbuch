package com.example.telefonbuch.data

import com.example.telefonbuch.R
import com.example.telefonbuch.data.model.Contact

class Datasource() {

    fun loadContact(): List<Contact> {
        return listOf(
            Contact(
                "Placeholder",
                42.66,
                R.drawable.pgo_en_72,
                false
            ),
            Contact(
                "Placeholder",
                36.91,
                R.drawable.pgo_en_3,
                false
            ),
            Contact(
                "Placeholder",
                34.86,
                R.drawable.pgo_en_24,
                true
            ),
            Contact(
                "Placeholder",
                34.86,
                R.drawable.pgo_en_17,
                true
            ),
        )
    }
}