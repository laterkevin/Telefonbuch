package com.example.telefonbuch.data

import com.example.telefonbuch.data.model.Contact

class Datasource() {

    fun loadContact(): List<Contact> {
        return listOf(
            Contact(
                "Placeholder",
                "Max Mustermann",
                0,
                "Teststraße",
                17.10.1983
            ),
            Contact(
                "Placeholder",
                "Max Mustermann",
                0,
                "Teststraße",
                17.10.1983
            ),
            Contact(
                "Placeholder",
                "Max Mustermann",
                0,
                "Teststraße",
                17.10.1983
            ),
            Contact(
                "Placeholder",
                "Max Mustermann",
                0,
                "Teststraße",
                17.10.1983
            ),
            Contact(
                "Placeholder",
                "Max Mustermann",
                0,
                "Teststraße",
                17.10.1983
            ),
        )
    }
}