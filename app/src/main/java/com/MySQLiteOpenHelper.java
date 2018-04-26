package com;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.gy.bean.DaoMaster;

import org.greenrobot.greendao.database.Database;

/**
 * Created by emcc-pc on 2018/4/26.
 * 第一个版本 greendao 升级保存旧的数据
 */

public class MySQLiteOpenHelper extends DaoMaster.DevOpenHelper {

    public MySQLiteOpenHelper(Context context, String name) {
        super(context, name);
    }

    public MySQLiteOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory) {
        super(context, name, factory);
    }

    @Override
    public void onUpgrade(Database db, int oldVersion, int newVersion) {
        super.onUpgrade(db, oldVersion, newVersion);
        MigrationHelper.migrate(db,new MigrationHelper.ReCreateAllTableListener(){

            @Override
            public void onCreateAllTables(Database db, boolean ifNotExists) {
                 DaoMaster.dropAllTables(db,ifNotExists);
            }

            @Override
            public void onDropAllTables(Database db, boolean ifExists) {
                DaoMaster.dropAllTables(db,ifExists);
            }
        });
    }
}
