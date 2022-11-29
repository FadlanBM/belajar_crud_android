package com.example.belajar_crud.room

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
@Dao
interface NoteDao {

    @Insert
    fun  addNote(note: Note)

    @Update
    fun updatenote(note: Note)

    @Delete
    fun deleteNote(note: Note)

    @Query(value = "SELECT * FROM note")
    fun getNotes(note: Note): List<Note>
}