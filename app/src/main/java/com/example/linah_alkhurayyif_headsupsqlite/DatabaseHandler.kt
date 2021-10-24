package com.example.linah_alkhurayyif_headsupsqlite

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DatabaseHandler(context: Context): SQLiteOpenHelper(context, "celebrities.db", null, 1){
    override fun onCreate(db: SQLiteDatabase?) {
        if(db != null){
            db.execSQL("CREATE TABLE celebrities (Name text, Taboo1 text, Taboo2 text, Taboo3 text)")
        }
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {}
    fun addCelebrities(name: String, taboo1: String, taboo2: String, taboo3: String): Long{
        val db = this.writableDatabase

        val contentValues = ContentValues()
        contentValues.put("Name", name)
        contentValues.put("Taboo1", taboo1)
        contentValues.put("Taboo2", taboo2)
        contentValues.put("Taboo3", taboo3)
        val success = db.insert("celebrities", null, contentValues)

        db.close()
        return success
    }
}