package com.example.room_examples.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.room_examples.db.entity.Contact;
import com.example.room_examples.db.entity.ContactDao;

@Database(entities = {Contact.class},version = 1)
public abstract class ContactsAppDataBase extends RoomDatabase {

    public abstract ContactDao getContactDAO();







}
