package com.gy.bean;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "PEOPLE".
*/
public class peopleDao extends AbstractDao<people, String> {

    public static final String TABLENAME = "PEOPLE";

    /**
     * Properties of entity people.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, String.class, "Id", true, "ID");
        public final static Property Name = new Property(1, String.class, "Name", false, "NAME");
        public final static Property Sex = new Property(2, String.class, "Sex", false, "SEX");
    }


    public peopleDao(DaoConfig config) {
        super(config);
    }
    
    public peopleDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"PEOPLE\" (" + //
                "\"ID\" TEXT PRIMARY KEY NOT NULL ," + // 0: Id
                "\"NAME\" TEXT," + // 1: Name
                "\"SEX\" TEXT);"); // 2: Sex
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"PEOPLE\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, people entity) {
        stmt.clearBindings();
 
        String Id = entity.getId();
        if (Id != null) {
            stmt.bindString(1, Id);
        }
 
        String Name = entity.getName();
        if (Name != null) {
            stmt.bindString(2, Name);
        }
 
        String Sex = entity.getSex();
        if (Sex != null) {
            stmt.bindString(3, Sex);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, people entity) {
        stmt.clearBindings();
 
        String Id = entity.getId();
        if (Id != null) {
            stmt.bindString(1, Id);
        }
 
        String Name = entity.getName();
        if (Name != null) {
            stmt.bindString(2, Name);
        }
 
        String Sex = entity.getSex();
        if (Sex != null) {
            stmt.bindString(3, Sex);
        }
    }

    @Override
    public String readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0);
    }    

    @Override
    public people readEntity(Cursor cursor, int offset) {
        people entity = new people( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // Id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // Name
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2) // Sex
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, people entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setName(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setSex(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
     }
    
    @Override
    protected final String updateKeyAfterInsert(people entity, long rowId) {
        return entity.getId();
    }
    
    @Override
    public String getKey(people entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(people entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
