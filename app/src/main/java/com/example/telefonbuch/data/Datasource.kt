package com.example.telefonbuch.data

import com.example.telefonbuch.R
import com.example.telefonbuch.data.model.Contact

class Datasource() {

    fun loadContact(): MutableList<Contact> {
        return mutableListOf(
            Contact(
                R.drawable.avatar,
                "Ruth P. Soto",
                "+16894454220",

            ),
            Contact(
                R.drawable.avatar,
                "Laverne R. McClain",
                "+17276011856",

                ),
            Contact(
                R.drawable.avatar,
                "Randy B. Walker",
                "+13646512711",

                ),
            Contact(
                R.drawable.avatar,
                "Sally D. Lewis",
                "+18789018231",

                ),
            Contact(
                R.drawable.avatar,
                "Maureen R. Rodriquez",
                "+16194782584",

                ),
            Contact(
                R.drawable.avatar,
                "Elizabeth T. Tucker",
                "+15885614746",

                ),
            Contact(
                R.drawable.avatar,
                "Michelle T. Ryder",
                "+18785293261",

                ),
            Contact(
                R.drawable.avatar,
                "Cheri S. Lawson",
                "+12059989105",

                ),
            Contact(
                R.drawable.avatar,
                "Rickey S. Collier",
                "+18592929573",

                ),
            Contact(
                R.drawable.avatar,
                "Michelle R. Cameron",
                "+14453331984",

                ),
            Contact(
                R.drawable.avatar,
                "Wayne K. Cox",
                "+12815925690",

                ),
            Contact(
                R.drawable.avatar,
                "Joyce T. Russell",
                "+15044351692",

                ),
            Contact(
                R.drawable.avatar,
                "Anthony E. George",
                "+17168738370",

                ),
        )
    }
}