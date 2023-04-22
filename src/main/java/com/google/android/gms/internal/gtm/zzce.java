package com.google.android.gms.internal.gtm;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import h9.o;
import java.io.Closeable;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import l9.d;
import p8.w;
import r3.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzce extends zzbs implements Closeable {
    private static final String zza = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' INTEGER NOT NULL, '%s' TEXT NOT NULL, '%s' TEXT NOT NULL, '%s' INTEGER);", "hits2", "hit_id", "hit_time", "hit_url", "hit_string", "hit_app_id");
    private static final String zzb = String.format("SELECT MAX(%s) FROM %s WHERE 1;", "hit_time", "hits2");
    private final zzcd zzc;
    private final zzfo zzd;
    private final zzfo zze;

    public zzce(zzbv zzbvVar) {
        super(zzbvVar);
        this.zzd = new zzfo(zzC());
        this.zze = new zzfo(zzC());
        this.zzc = new zzcd(this, zzbvVar.zza(), zzae());
    }

    private final long zzad(String str, String[] strArr, long j10) {
        Cursor cursor = null;
        try {
            try {
                cursor = zzf().rawQuery(str, strArr);
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return 0L;
                }
                long j11 = cursor.getLong(0);
                cursor.close();
                return j11;
            } catch (SQLiteException e10) {
                zzL("Database error", str, e10);
                throw e10;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String zzae() {
        zzw();
        zzw();
        return "google_analytics_v4.db";
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            this.zzc.close();
        } catch (SQLiteException e10) {
            zzK("Sql error closing database", e10);
        } catch (IllegalStateException e11) {
            zzK("Error closing database", e11);
        }
    }

    public final void zzZ(List<Long> list) {
        Objects.requireNonNull(list, "null reference");
        w.b();
        zzW();
        if (list.isEmpty()) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("hit_id");
        sb2.append(" in (");
        for (int i10 = 0; i10 < list.size(); i10++) {
            Long l10 = list.get(i10);
            if (l10 == null || l10.longValue() == 0) {
                throw new SQLiteException("Invalid hit id");
            }
            if (i10 > 0) {
                sb2.append(",");
            }
            sb2.append(l10);
        }
        sb2.append(")");
        String sb3 = sb2.toString();
        try {
            SQLiteDatabase zzf = zzf();
            zzP("Deleting dispatched hits. count", Integer.valueOf(list.size()));
            int delete = zzf.delete("hits2", sb3, null);
            if (delete != list.size()) {
                zzU("Deleted fewer hits then expected", Integer.valueOf(list.size()), Integer.valueOf(delete), sb3);
            }
        } catch (SQLiteException e10) {
            zzK("Error deleting hits", e10);
            throw e10;
        }
    }

    public final int zza() {
        w.b();
        zzW();
        if (this.zzd.zzc(86400000L)) {
            this.zzd.zzb();
            zzO("Deleting stale hits (if any)");
            SQLiteDatabase zzf = zzf();
            Objects.requireNonNull((c) zzC());
            int delete = zzf.delete("hits2", "hit_time < ?", new String[]{Long.toString(System.currentTimeMillis() - 2592000000L)});
            zzP("Deleted stale hits, count", Integer.valueOf(delete));
            return delete;
        }
        return 0;
    }

    public final void zzaa() {
        zzW();
        zzf().endTransaction();
    }

    public final void zzab() {
        zzW();
        zzf().setTransactionSuccessful();
    }

    public final boolean zzac() {
        return zzb() == 0;
    }

    public final long zzb() {
        w.b();
        zzW();
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = zzf().rawQuery("SELECT COUNT(*) FROM hits2", null);
                if (rawQuery.moveToFirst()) {
                    long j10 = rawQuery.getLong(0);
                    rawQuery.close();
                    return j10;
                }
                throw new SQLiteException("Database returned empty set");
            } catch (SQLiteException e10) {
                zzL("Database error", "SELECT COUNT(*) FROM hits2", e10);
                throw e10;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final long zzc() {
        w.b();
        zzW();
        return zzad(zzb, null, 0L);
    }

    @Override // com.google.android.gms.internal.gtm.zzbs
    public final void zzd() {
    }

    public final long zze(long j10, String str, String str2) {
        o.e(str);
        o.e(str2);
        zzW();
        w.b();
        return zzad("SELECT hits_count FROM properties WHERE app_uid=? AND cid=? AND tid=?", new String[]{"0", str, str2}, 0L);
    }

    public final SQLiteDatabase zzf() {
        try {
            return this.zzc.getWritableDatabase();
        } catch (SQLiteException e10) {
            zzS("Error opening database", e10);
            throw e10;
        }
    }

    public final List<zzex> zzj(long j10) {
        boolean z10;
        o.a(j10 >= 0);
        w.b();
        zzW();
        Cursor cursor = null;
        try {
            try {
                Cursor query = zzf().query("hits2", new String[]{"hit_id", "hit_time", "hit_string", "hit_url", "hit_app_id"}, null, null, null, null, String.format("%s ASC", "hit_id"), Long.toString(j10));
                try {
                    ArrayList arrayList = new ArrayList();
                    if (!query.moveToFirst()) {
                        query.close();
                        return arrayList;
                    }
                    do {
                        long j11 = query.getLong(0);
                        long j12 = query.getLong(1);
                        String string = query.getString(2);
                        String string2 = query.getString(3);
                        int i10 = query.getInt(4);
                        Map<String, String> zzk = zzk(string);
                        if (!TextUtils.isEmpty(string2) && string2.startsWith("http:")) {
                            z10 = false;
                            arrayList.add(new zzex(this, zzk, j12, z10, j11, i10, null));
                        }
                        z10 = true;
                        arrayList.add(new zzex(this, zzk, j12, z10, j11, i10, null));
                    } while (query.moveToNext());
                    query.close();
                    return arrayList;
                } catch (SQLiteException e10) {
                    e = e10;
                    cursor = query;
                    zzK("Error loading hits from the database", e);
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    cursor = query;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (SQLiteException e11) {
            e = e11;
        }
    }

    public final Map<String, String> zzk(String str) {
        if (TextUtils.isEmpty(str)) {
            return new HashMap(0);
        }
        try {
            if (!str.startsWith("?")) {
                str = str.length() != 0 ? "?".concat(str) : new String("?");
            }
            return d.a(new URI(str), "UTF-8");
        } catch (URISyntaxException e10) {
            zzK("Error parsing hit parameters", e10);
            return new HashMap(0);
        }
    }

    public final void zzm() {
        zzW();
        zzf().beginTransaction();
    }

    public final void zzn(long j10) {
        w.b();
        zzW();
        ArrayList arrayList = new ArrayList(1);
        Long valueOf = Long.valueOf(j10);
        arrayList.add(valueOf);
        zzP("Deleting hit, id", valueOf);
        zzZ(arrayList);
    }
}
