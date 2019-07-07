package ru.skillbranch.devintensive.utils

object Utils {
    fun parseFullName(fullName:String?):Pair<String?,String?>{
        val parts : List<String>? = fullName?.split(" ")
        val firstName = when(parts?.getOrNull(0)) {
            "" -> null
            " " -> null
            else -> parts?.getOrNull(0)
        }
        val lastName = when(parts?.getOrNull(1)) {
            "" -> null
            " " -> null
            else -> parts?.getOrNull(1)
        }

        return firstName to lastName
    }

    fun transliteration(payload: String, divider: String = " "): String {
       // TODO
        return "todo"
    }

    fun toInitials(firstName: String?, lastName: String?): String? {
       // TODO
        val firstNameChar : Char? = firstName?.toUpperCase()?.trim()?.get(0)
        val lastNameChar : Char? = lastName?.toUpperCase()?.trim()?.get(0)
        var Initials : String? = ""
        //if (firstName?.trim()?.isNotEmpty()!!) firstNameChar=firstName[0]
        //if (lastName?.trim()?.isNotEmpty()!!) lastNameChar=lastName[0]
        println("${firstNameChar.toString()} ${lastNameChar.toString()}")
        if (firstNameChar.toString() !== "null") Initials+=firstNameChar.toString()
        if (lastNameChar.toString() !== "null") Initials+=lastNameChar.toString()

        return Initials
    }
}