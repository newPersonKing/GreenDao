package com;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.gy.bean.DaoMaster;

import org.greenrobot.greendao.database.Database;

/**
 * Created by emcc-pc on 2018/4/26.
 * 第二个版本 greendao 数据库升级 保存旧数据
 */

public class MyOpenHelper extends DaoMaster.DevOpenHelper {

    public MyOpenHelper(Context context, String name) {
        super(context, name);
    }

    public MyOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory) {
        super(context, name, factory);
    }

    @Override
    public void onUpgrade(Database db, int oldVersion, int newVersion) {
             TMigrationHelper.getInstance().migrate(db);
    }
}
