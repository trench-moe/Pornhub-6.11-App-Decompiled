package com.mixpanel.android.mpmetrics;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import java.io.File;
import java.io.FilenameFilter;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class MPDbAdapter {

    /* renamed from: b  reason: collision with root package name */
    public static final Map<Context, MPDbAdapter> f8178b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public static final String f8179c;
    public static final String d;

    /* renamed from: e  reason: collision with root package name */
    public static final String f8180e;

    /* renamed from: f  reason: collision with root package name */
    public static final String f8181f;

    /* renamed from: g  reason: collision with root package name */
    public static final String f8182g;

    /* renamed from: h  reason: collision with root package name */
    public static final String f8183h;

    /* renamed from: i  reason: collision with root package name */
    public static final String f8184i;

    /* renamed from: j  reason: collision with root package name */
    public static final String f8185j;

    /* renamed from: a  reason: collision with root package name */
    public final a f8186a;

    /* loaded from: classes.dex */
    public enum Table {
        EVENTS("events"),
        PEOPLE("people"),
        ANONYMOUS_PEOPLE("anonymous_people"),
        GROUPS("groups");
        
        private final String mTableName;

        Table(String str) {
            this.mTableName = str;
        }

        public String b() {
            return this.mTableName;
        }
    }

    /* loaded from: classes.dex */
    public static class a extends SQLiteOpenHelper {

        /* renamed from: c  reason: collision with root package name */
        public final File f8191c;

        /* renamed from: f  reason: collision with root package name */
        public final cd.c f8192f;

        /* renamed from: j  reason: collision with root package name */
        public final Context f8193j;

        /* renamed from: com.mixpanel.android.mpmetrics.MPDbAdapter$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0107a implements FilenameFilter {
            public C0107a(a aVar) {
            }

            @Override // java.io.FilenameFilter
            public boolean accept(File file, String str) {
                return str.startsWith("com.mixpanel.android.mpmetrics.MixpanelAPI_");
            }
        }

        public a(Context context, String str) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, 7);
            this.f8191c = context.getDatabasePath(str);
            this.f8192f = cd.c.b(context);
            this.f8193j = context;
        }

        public void a() {
            close();
            this.f8191c.delete();
        }

        public final void c(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL(MPDbAdapter.f8181f);
            sQLiteDatabase.execSQL(MPDbAdapter.f8185j);
            File file = new File(this.f8193j.getApplicationInfo().dataDir, "shared_prefs");
            if (file.exists() && file.isDirectory()) {
                for (String str : file.list(new C0107a(this))) {
                    SharedPreferences sharedPreferences = this.f8193j.getSharedPreferences(str.split("\\.xml")[0], 0);
                    String string = sharedPreferences.getString("waiting_array", null);
                    if (string != null) {
                        try {
                            JSONArray jSONArray = new JSONArray(string);
                            sQLiteDatabase.beginTransaction();
                            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                                try {
                                    JSONObject jSONObject = jSONArray.getJSONObject(i10);
                                    String string2 = jSONObject.getString("$token");
                                    ContentValues contentValues = new ContentValues();
                                    contentValues.put("data", jSONObject.toString());
                                    contentValues.put("created_at", Long.valueOf(System.currentTimeMillis()));
                                    contentValues.put("automatic_data", Boolean.FALSE);
                                    contentValues.put("token", string2);
                                    sQLiteDatabase.insert(Table.ANONYMOUS_PEOPLE.b(), null, contentValues);
                                } catch (JSONException unused) {
                                }
                            }
                            sQLiteDatabase.setTransactionSuccessful();
                            sQLiteDatabase.endTransaction();
                        } catch (JSONException unused2) {
                        }
                        SharedPreferences.Editor edit = sharedPreferences.edit();
                        edit.remove("waiting_array");
                        edit.apply();
                    }
                }
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            cb.e.h0("MixpanelAPI.Database", "Creating a new Mixpanel events DB");
            sQLiteDatabase.execSQL(MPDbAdapter.f8179c);
            sQLiteDatabase.execSQL(MPDbAdapter.d);
            sQLiteDatabase.execSQL(MPDbAdapter.f8180e);
            sQLiteDatabase.execSQL(MPDbAdapter.f8181f);
            sQLiteDatabase.execSQL(MPDbAdapter.f8182g);
            sQLiteDatabase.execSQL(MPDbAdapter.f8183h);
            sQLiteDatabase.execSQL(MPDbAdapter.f8184i);
            sQLiteDatabase.execSQL(MPDbAdapter.f8185j);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            int i12;
            int i13;
            Table table = Table.PEOPLE;
            Table table2 = Table.EVENTS;
            cb.e.h0("MixpanelAPI.Database", "Upgrading app, replacing Mixpanel events DB");
            if (i10 < 4 || i11 > 7) {
                StringBuilder m10 = a1.a.m("DROP TABLE IF EXISTS ");
                m10.append(table2.b());
                sQLiteDatabase.execSQL(m10.toString());
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + table.b());
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + Table.GROUPS.b());
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + Table.ANONYMOUS_PEOPLE.b());
                sQLiteDatabase.execSQL(MPDbAdapter.f8179c);
                sQLiteDatabase.execSQL(MPDbAdapter.d);
                sQLiteDatabase.execSQL(MPDbAdapter.f8180e);
                sQLiteDatabase.execSQL(MPDbAdapter.f8181f);
                sQLiteDatabase.execSQL(MPDbAdapter.f8182g);
                sQLiteDatabase.execSQL(MPDbAdapter.f8183h);
                sQLiteDatabase.execSQL(MPDbAdapter.f8184i);
                sQLiteDatabase.execSQL(MPDbAdapter.f8185j);
                return;
            }
            if (i10 == 4) {
                StringBuilder m11 = a1.a.m("ALTER TABLE ");
                m11.append(table2.b());
                m11.append(" ADD COLUMN ");
                m11.append("automatic_data");
                m11.append(" INTEGER DEFAULT 0");
                sQLiteDatabase.execSQL(m11.toString());
                sQLiteDatabase.execSQL("ALTER TABLE " + table.b() + " ADD COLUMN automatic_data INTEGER DEFAULT 0");
                sQLiteDatabase.execSQL("ALTER TABLE " + table2.b() + " ADD COLUMN token STRING NOT NULL DEFAULT ''");
                sQLiteDatabase.execSQL("ALTER TABLE " + table.b() + " ADD COLUMN token STRING NOT NULL DEFAULT ''");
                StringBuilder sb2 = new StringBuilder();
                sb2.append("SELECT * FROM ");
                sb2.append(table2.b());
                Cursor rawQuery = sQLiteDatabase.rawQuery(sb2.toString(), null);
                while (rawQuery.moveToNext()) {
                    try {
                        String string = new JSONObject(rawQuery.getString(rawQuery.getColumnIndex("data"))).getJSONObject("properties").getString("token");
                        i13 = rawQuery.getInt(rawQuery.getColumnIndex("_id"));
                        try {
                            sQLiteDatabase.execSQL("UPDATE " + table2.b() + " SET token = '" + string + "' WHERE _id = " + i13);
                        } catch (JSONException unused) {
                            String b10 = table2.b();
                            sQLiteDatabase.delete(b10, "_id = " + i13, null);
                        }
                    } catch (JSONException unused2) {
                        i13 = 0;
                    }
                }
                StringBuilder m12 = a1.a.m("SELECT * FROM ");
                m12.append(table.b());
                Cursor rawQuery2 = sQLiteDatabase.rawQuery(m12.toString(), null);
                while (rawQuery2.moveToNext()) {
                    try {
                        String string2 = new JSONObject(rawQuery2.getString(rawQuery2.getColumnIndex("data"))).getString("$token");
                        i12 = rawQuery2.getInt(rawQuery2.getColumnIndex("_id"));
                        try {
                            sQLiteDatabase.execSQL("UPDATE " + table.b() + " SET token = '" + string2 + "' WHERE _id = " + i12);
                        } catch (JSONException unused3) {
                            String b11 = table.b();
                            sQLiteDatabase.delete(b11, "_id = " + i12, null);
                        }
                    } catch (JSONException unused4) {
                        i12 = 0;
                    }
                }
                sQLiteDatabase.execSQL(MPDbAdapter.f8180e);
                sQLiteDatabase.execSQL(MPDbAdapter.f8184i);
                c(sQLiteDatabase);
            }
            if (i10 == 5) {
                sQLiteDatabase.execSQL(MPDbAdapter.f8180e);
                sQLiteDatabase.execSQL(MPDbAdapter.f8184i);
                c(sQLiteDatabase);
            }
            if (i10 == 6) {
                c(sQLiteDatabase);
            }
        }
    }

    static {
        StringBuilder m10 = a1.a.m("CREATE TABLE ");
        Table table = Table.EVENTS;
        m10.append(table.b());
        m10.append(" (_id INTEGER PRIMARY KEY AUTOINCREMENT, ");
        m10.append("data");
        m10.append(" STRING NOT NULL, ");
        android.support.v4.media.a.o(m10, "created_at", " INTEGER NOT NULL, ", "automatic_data", " INTEGER DEFAULT 0, ");
        f8179c = android.support.v4.media.b.m(m10, "token", " STRING NOT NULL DEFAULT '')");
        StringBuilder m11 = a1.a.m("CREATE TABLE ");
        Table table2 = Table.PEOPLE;
        m11.append(table2.b());
        m11.append(" (_id INTEGER PRIMARY KEY AUTOINCREMENT, ");
        m11.append("data");
        m11.append(" STRING NOT NULL, ");
        android.support.v4.media.a.o(m11, "created_at", " INTEGER NOT NULL, ", "automatic_data", " INTEGER DEFAULT 0, ");
        d = android.support.v4.media.b.m(m11, "token", " STRING NOT NULL DEFAULT '')");
        StringBuilder m12 = a1.a.m("CREATE TABLE ");
        Table table3 = Table.GROUPS;
        m12.append(table3.b());
        m12.append(" (_id INTEGER PRIMARY KEY AUTOINCREMENT, ");
        m12.append("data");
        m12.append(" STRING NOT NULL, ");
        android.support.v4.media.a.o(m12, "created_at", " INTEGER NOT NULL, ", "automatic_data", " INTEGER DEFAULT 0, ");
        f8180e = android.support.v4.media.b.m(m12, "token", " STRING NOT NULL DEFAULT '')");
        StringBuilder m13 = a1.a.m("CREATE TABLE ");
        Table table4 = Table.ANONYMOUS_PEOPLE;
        m13.append(table4.b());
        m13.append(" (_id INTEGER PRIMARY KEY AUTOINCREMENT, ");
        m13.append("data");
        m13.append(" STRING NOT NULL, ");
        android.support.v4.media.a.o(m13, "created_at", " INTEGER NOT NULL, ", "automatic_data", " INTEGER DEFAULT 0, ");
        f8181f = android.support.v4.media.b.m(m13, "token", " STRING NOT NULL DEFAULT '')");
        StringBuilder m14 = a1.a.m("CREATE INDEX IF NOT EXISTS time_idx ON ");
        m14.append(table.b());
        m14.append(" (");
        m14.append("created_at");
        m14.append(");");
        f8182g = m14.toString();
        StringBuilder m15 = a1.a.m("CREATE INDEX IF NOT EXISTS time_idx ON ");
        m15.append(table2.b());
        m15.append(" (");
        m15.append("created_at");
        m15.append(");");
        f8183h = m15.toString();
        StringBuilder m16 = a1.a.m("CREATE INDEX IF NOT EXISTS time_idx ON ");
        m16.append(table3.b());
        m16.append(" (");
        m16.append("created_at");
        m16.append(");");
        f8184i = m16.toString();
        StringBuilder m17 = a1.a.m("CREATE INDEX IF NOT EXISTS time_idx ON ");
        m17.append(table4.b());
        m17.append(" (");
        m17.append("created_at");
        m17.append(");");
        f8185j = m17.toString();
    }

    public MPDbAdapter(Context context) {
        this.f8186a = new a(context, "mixpanel");
    }

    public static MPDbAdapter g(Context context) {
        MPDbAdapter mPDbAdapter;
        Map<Context, MPDbAdapter> map = f8178b;
        synchronized (map) {
            Context applicationContext = context.getApplicationContext();
            if (((HashMap) map).containsKey(applicationContext)) {
                mPDbAdapter = (MPDbAdapter) ((HashMap) map).get(applicationContext);
            } else {
                mPDbAdapter = new MPDbAdapter(applicationContext);
                ((HashMap) map).put(applicationContext, mPDbAdapter);
            }
        }
        return mPDbAdapter;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0093, code lost:
        if (r2 == null) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int a(org.json.JSONObject r11, java.lang.String r12, com.mixpanel.android.mpmetrics.MPDbAdapter.Table r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 205
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mixpanel.android.mpmetrics.MPDbAdapter.a(org.json.JSONObject, java.lang.String, com.mixpanel.android.mpmetrics.MPDbAdapter$Table, boolean):int");
    }

    public boolean b() {
        a aVar = this.f8186a;
        boolean z10 = true;
        if (aVar.f8191c.exists()) {
            if (Math.max(aVar.f8191c.getUsableSpace(), aVar.f8192f.f4035e) >= aVar.f8191c.length()) {
                return z10;
            }
            z10 = false;
        }
        return z10;
    }

    public void c(Table table, String str) {
        String b10 = table.b();
        try {
            try {
                SQLiteDatabase writableDatabase = this.f8186a.getWritableDatabase();
                writableDatabase.delete(b10, "token = '" + str + "'", null);
            } catch (SQLiteException e10) {
                cb.e.D("MixpanelAPI.Database", "Could not clean timed-out Mixpanel records from " + b10 + ". Re-initializing database.", e10);
                this.f8186a.a();
            }
            this.f8186a.close();
        } catch (Throwable th) {
            this.f8186a.close();
            throw th;
        }
    }

    public final void d(Table table, String str) {
        String b10 = table.b();
        try {
            try {
                SQLiteDatabase writableDatabase = this.f8186a.getWritableDatabase();
                writableDatabase.delete(b10, "automatic_data = 1 AND token = '" + str + "'", null);
            } catch (SQLiteException e10) {
                cb.e.D("MixpanelAPI.Database", "Could not clean automatic Mixpanel records from " + b10 + ". Re-initializing database.", e10);
                this.f8186a.a();
            }
            this.f8186a.close();
        } catch (Throwable th) {
            this.f8186a.close();
            throw th;
        }
    }

    public void e(long j10, Table table) {
        String b10 = table.b();
        try {
            try {
                SQLiteDatabase writableDatabase = this.f8186a.getWritableDatabase();
                writableDatabase.delete(b10, "created_at <= " + j10, null);
            } catch (SQLiteException e10) {
                cb.e.D("MixpanelAPI.Database", "Could not clean timed-out Mixpanel records from " + b10 + ". Re-initializing database.", e10);
                this.f8186a.a();
            }
            this.f8186a.close();
        } catch (Throwable th) {
            this.f8186a.close();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0143  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String[] f(com.mixpanel.android.mpmetrics.MPDbAdapter.Table r13, java.lang.String r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mixpanel.android.mpmetrics.MPDbAdapter.f(com.mixpanel.android.mpmetrics.MPDbAdapter$Table, java.lang.String, boolean):java.lang.String[]");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0125  */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v6, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int h(java.lang.String r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mixpanel.android.mpmetrics.MPDbAdapter.h(java.lang.String, java.lang.String):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ff  */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v6, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r8v1, types: [org.json.JSONObject] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int i(java.util.Map<java.lang.String, java.lang.String> r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mixpanel.android.mpmetrics.MPDbAdapter.i(java.util.Map, java.lang.String):int");
    }
}
