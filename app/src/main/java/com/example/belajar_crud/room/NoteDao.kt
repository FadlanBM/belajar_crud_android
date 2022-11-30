package com.example.belajar_crud.room

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
@Dao
interface NoteDao {

    @Insert
    suspend fun  addNote(note: Note)

    @Update
   suspend fun updatenote(note: Note)

    @Delete
    suspend fun deleteNote(note: Note)

    @Query(value = "SELECT * FROM note")
    suspend fun getNotes(note: Note): List<Note>
}