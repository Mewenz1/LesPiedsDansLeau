package com.example.lespiedsdansleau.DAO;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class SQLiteLesPiedsDansLeau extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 2;
    private static final String DATABASE_NAME = "dbLesPiedsDansLeau";
    private Context context = null;

    public SQLiteLesPiedsDansLeau(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        try {
            db.execSQL("DROP TABLE IF EXISTS Exploitation");
            db.execSQL("CREATE TABLE Exploitation (idEx INTEGER PRIMARY KEY AUTOINCREMENT,nomEx VARCHAR(100), descEx VARCHAR(100), typeEx VARCHAR(100))");
            db.execSQL("INSERT INTO Exploitation VALUES (1, ' ', ' ', ' ')");
            db.execSQL("INSERT INTO Exploitation VALUES (2, 'Officentrale', 'Ferme basée à cholet', 'Maraichage')");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1){
        onCreate(db);
    }
}
