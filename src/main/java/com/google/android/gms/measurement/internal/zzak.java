package com.google.android.gms.measurement.internal;

import a0.a;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import android.support.v4.media.b;
import android.text.TextUtils;
import com.appsflyer.oaid.BuildConfig;
import com.google.android.gms.internal.measurement.p;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import h9.o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.IntCompanionObject;
import r3.c;
import w9.e3;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzak extends zzkf {
    private static final String[] zza = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    private static final String[] zzb = {AppMeasurementSdk.ConditionalUserProperty.ORIGIN, "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    private static final String[] zzc = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;"};
    private static final String[] zzd = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    private static final String[] zze = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    private static final String[] zzg = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
    private static final String[] zzh = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    private static final String[] zzi = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
    private final zzaj zzj;
    private final zzkb zzk;

    public zzak(zzkp zzkpVar) {
        super(zzkpVar);
        this.zzk = new zzkb(this.zzs.zzav());
        this.zzs.zzf();
        this.zzj = new zzaj(this, this.zzs.zzau(), "google_app_measurement.db");
    }

    public static final void zzV(ContentValues contentValues, String str, Object obj) {
        o.e(AppMeasurementSdk.ConditionalUserProperty.VALUE);
        Objects.requireNonNull(obj, "null reference");
        if (obj instanceof String) {
            contentValues.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, (Long) obj);
        } else if (!(obj instanceof Double)) {
            throw new IllegalArgumentException("Invalid value type");
        } else {
            contentValues.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, (Double) obj);
        }
    }

    private final long zzZ(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = zzh().rawQuery(str, strArr);
                if (rawQuery.moveToFirst()) {
                    long j10 = rawQuery.getLong(0);
                    rawQuery.close();
                    return j10;
                }
                throw new SQLiteException("Database returned empty set");
            } catch (SQLiteException e10) {
                this.zzs.zzay().zzd().zzc("Database error", str, e10);
                throw e10;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    private final long zzaa(String str, String[] strArr, long j10) {
        Cursor cursor = null;
        try {
            try {
                cursor = zzh().rawQuery(str, strArr);
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return j10;
                }
                long j11 = cursor.getLong(0);
                cursor.close();
                return j11;
            } catch (SQLiteException e10) {
                this.zzs.zzay().zzd().zzc("Database error", str, e10);
                throw e10;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final void zzA(String str, String str2) {
        o.e(str);
        o.e(str2);
        zzg();
        zzW();
        try {
            zzh().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e10) {
            this.zzs.zzay().zzd().zzd("Error deleting user property. appId", zzeh.zzn(str), this.zzs.zzj().zzf(str2), e10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0314, code lost:
        r25.zzs.zzay().zzd().zzb("Failed to insert event filter (got -1). appId", com.google.android.gms.measurement.internal.zzeh.zzn(r26));
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0327, code lost:
        r4 = r21;
        r12 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x032f, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0330, code lost:
        r25.zzs.zzay().zzd().zzc("Error storing event filter. appId", com.google.android.gms.measurement.internal.zzeh.zzn(r26), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0345, code lost:
        r0 = r0.z().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0351, code lost:
        if (r0.hasNext() == false) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0353, code lost:
        r4 = (w9.l2) r0.next();
        zzW();
        zzg();
        h9.o.e(r26);
        java.util.Objects.requireNonNull(r4, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x036d, code lost:
        if (android.text.TextUtils.isEmpty(r4.w()) == false) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x036f, code lost:
        r0 = r25.zzs.zzay().zzk();
        r7 = com.google.android.gms.measurement.internal.zzeh.zzn(r26);
        r8 = java.lang.Integer.valueOf(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0387, code lost:
        if (r4.B() == false) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0389, code lost:
        r18 = java.lang.Integer.valueOf(r4.s());
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0394, code lost:
        r18 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0398, code lost:
        r0.zzd("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", r7, r8, java.lang.String.valueOf(r18));
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x03a1, code lost:
        r12 = r4.i();
        r13 = new android.content.ContentValues();
        r13.put(r3, r26);
        r23 = r0;
        r13.put("audience_id", java.lang.Integer.valueOf(r11));
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x03ba, code lost:
        if (r4.B() == false) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x03bc, code lost:
        r0 = java.lang.Integer.valueOf(r4.s());
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x03c5, code lost:
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x03c7, code lost:
        r13.put("filter_id", r0);
        r24 = r3;
        r13.put("property_name", r4.w());
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x03d9, code lost:
        if (r4.C() == false) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x03db, code lost:
        r0 = java.lang.Boolean.valueOf(r4.A());
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x03e4, code lost:
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x03e6, code lost:
        r13.put("session_scoped", r0);
        r13.put("data", r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x03f9, code lost:
        if (zzh().insertWithOnConflict("property_filters", null, r13, 5) != (-1)) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x03fb, code lost:
        r25.zzs.zzay().zzd().zzb("Failed to insert property filter (got -1). appId", com.google.android.gms.measurement.internal.zzeh.zzn(r26));
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x040f, code lost:
        r0 = r23;
        r3 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0415, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0416, code lost:
        r25.zzs.zzay().zzd().zzc("Error storing property filter. appId", com.google.android.gms.measurement.internal.zzeh.zzn(r26), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0429, code lost:
        zzW();
        zzg();
        h9.o.e(r26);
        r0 = zzh();
        r8 = r16;
        r0.delete("property_filters", r8, new java.lang.String[]{r26, java.lang.String.valueOf(r11)});
        r0.delete("event_filters", r8, new java.lang.String[]{r26, java.lang.String.valueOf(r11)});
        r16 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x045c, code lost:
        r18 = r9;
        r4 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0223, code lost:
        r12 = r0.z().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x022f, code lost:
        if (r12.hasNext() == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x023b, code lost:
        if (((w9.l2) r12.next()).B() != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x023d, code lost:
        r25.zzs.zzay().zzk().zzc("Property filter with no ID. Audience definition ignored. appId, audienceId", com.google.android.gms.measurement.internal.zzeh.zzn(r26), java.lang.Integer.valueOf(r11));
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0258, code lost:
        r12 = r0.y().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0264, code lost:
        r3 = "app_id";
        r21 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0272, code lost:
        if (r12.hasNext() == false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0274, code lost:
        r13 = (w9.e2) r12.next();
        zzW();
        zzg();
        h9.o.e(r26);
        java.util.Objects.requireNonNull(r13, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x028e, code lost:
        if (android.text.TextUtils.isEmpty(r13.y()) == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0290, code lost:
        r0 = r25.zzs.zzay().zzk();
        r4 = com.google.android.gms.measurement.internal.zzeh.zzn(r26);
        r7 = java.lang.Integer.valueOf(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x02a8, code lost:
        if (r13.G() == false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x02aa, code lost:
        r8 = java.lang.Integer.valueOf(r13.t());
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x02b3, code lost:
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x02b5, code lost:
        r0.zzd("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", r4, r7, java.lang.String.valueOf(r8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x02be, code lost:
        r4 = r13.i();
        r23 = r12;
        r12 = new android.content.ContentValues();
        r12.put("app_id", r26);
        r12.put("audience_id", java.lang.Integer.valueOf(r11));
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x02d7, code lost:
        if (r13.G() == false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x02d9, code lost:
        r3 = java.lang.Integer.valueOf(r13.t());
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x02e2, code lost:
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x02e3, code lost:
        r12.put("filter_id", r3);
        r12.put("event_name", r13.y());
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x02f3, code lost:
        if (r13.H() == false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x02f5, code lost:
        r3 = java.lang.Boolean.valueOf(r13.E());
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x02fe, code lost:
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0300, code lost:
        r12.put("session_scoped", r3);
        r12.put("data", r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0312, code lost:
        if (zzh().insertWithOnConflict("event_filters", null, r12, 5) != (-1)) goto L112;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzB(java.lang.String r26, java.util.List r27) {
        /*
            Method dump skipped, instructions count: 1380
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzak.zzB(java.lang.String, java.util.List):void");
    }

    public final void zzC() {
        zzW();
        zzh().setTransactionSuccessful();
    }

    public final void zzD(zzg zzgVar) {
        SQLiteDatabase zzh2;
        Objects.requireNonNull(zzgVar, "null reference");
        zzg();
        zzW();
        String zzt = zzgVar.zzt();
        Objects.requireNonNull(zzt, "null reference");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzt);
        contentValues.put("app_instance_id", zzgVar.zzu());
        contentValues.put("gmp_app_id", zzgVar.zzy());
        contentValues.put("resettable_device_id_hash", zzgVar.zzA());
        contentValues.put("last_bundle_index", Long.valueOf(zzgVar.zzo()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(zzgVar.zzp()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(zzgVar.zzn()));
        contentValues.put("app_version", zzgVar.zzw());
        contentValues.put("app_store", zzgVar.zzv());
        contentValues.put("gmp_version", Long.valueOf(zzgVar.zzm()));
        contentValues.put("dev_cert_hash", Long.valueOf(zzgVar.zzj()));
        contentValues.put("measurement_enabled", Boolean.valueOf(zzgVar.zzah()));
        contentValues.put("day", Long.valueOf(zzgVar.zzi()));
        contentValues.put("daily_public_events_count", Long.valueOf(zzgVar.zzg()));
        contentValues.put("daily_events_count", Long.valueOf(zzgVar.zzf()));
        contentValues.put("daily_conversions_count", Long.valueOf(zzgVar.zzd()));
        contentValues.put("config_fetched_time", Long.valueOf(zzgVar.zzc()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(zzgVar.zzl()));
        contentValues.put("app_version_int", Long.valueOf(zzgVar.zzb()));
        contentValues.put("firebase_instance_id", zzgVar.zzx());
        contentValues.put("daily_error_events_count", Long.valueOf(zzgVar.zze()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(zzgVar.zzh()));
        contentValues.put("health_monitor_sample", zzgVar.zzz());
        contentValues.put("android_id", Long.valueOf(zzgVar.zza()));
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(zzgVar.zzag()));
        contentValues.put("admob_app_id", zzgVar.zzr());
        contentValues.put("dynamite_version", Long.valueOf(zzgVar.zzk()));
        List zzB = zzgVar.zzB();
        try {
            if (zzB != null) {
                if (zzB.isEmpty()) {
                    this.zzs.zzay().zzk().zzb("Safelisted events should not be an empty list. appId", zzt);
                    p.b();
                    if (this.zzs.zzf().zzs(null, zzdu.zzaw) && !contentValues.containsKey("safelisted_events")) {
                        contentValues.put("safelisted_events", (String) null);
                    }
                    zzh2 = zzh();
                    if (zzh2.update("apps", contentValues, "app_id = ?", new String[]{zzt}) == 0 || zzh2.insertWithOnConflict("apps", null, contentValues, 5) != -1) {
                        return;
                    }
                    this.zzs.zzay().zzd().zzb("Failed to insert/update app (got -1). appId", zzeh.zzn(zzt));
                    return;
                }
                contentValues.put("safelisted_events", TextUtils.join(",", zzB));
            }
            zzh2 = zzh();
            if (zzh2.update("apps", contentValues, "app_id = ?", new String[]{zzt}) == 0) {
                return;
            }
            return;
        } catch (SQLiteException e10) {
            this.zzs.zzay().zzd().zzc("Error storing app. appId", zzeh.zzn(zzt), e10);
            return;
        }
        p.b();
        if (this.zzs.zzf().zzs(null, zzdu.zzaw)) {
            contentValues.put("safelisted_events", (String) null);
        }
    }

    public final void zzE(zzaq zzaqVar) {
        Objects.requireNonNull(zzaqVar, "null reference");
        zzg();
        zzW();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzaqVar.zza);
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.NAME, zzaqVar.zzb);
        contentValues.put("lifetime_count", Long.valueOf(zzaqVar.zzc));
        contentValues.put("current_bundle_count", Long.valueOf(zzaqVar.zzd));
        contentValues.put("last_fire_timestamp", Long.valueOf(zzaqVar.zzf));
        contentValues.put("last_bundled_timestamp", Long.valueOf(zzaqVar.zzg));
        contentValues.put("last_bundled_day", zzaqVar.zzh);
        contentValues.put("last_sampled_complex_event_id", zzaqVar.zzi);
        contentValues.put("last_sampling_rate", zzaqVar.zzj);
        contentValues.put("current_session_count", Long.valueOf(zzaqVar.zze));
        Boolean bool = zzaqVar.zzk;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (zzh().insertWithOnConflict("events", null, contentValues, 5) == -1) {
                this.zzs.zzay().zzd().zzb("Failed to insert/update event aggregates (got -1). appId", zzeh.zzn(zzaqVar.zza));
            }
        } catch (SQLiteException e10) {
            this.zzs.zzay().zzd().zzc("Error storing event aggregates. appId", zzeh.zzn(zzaqVar.zza), e10);
        }
    }

    public final boolean zzF() {
        return zzZ("select count(1) > 0 from raw_events", null) != 0;
    }

    public final boolean zzG() {
        return zzZ("select count(1) > 0 from queue where has_realtime = 1", null) != 0;
    }

    public final boolean zzH() {
        return zzZ("select count(1) > 0 from raw_events where realtime = 1", null) != 0;
    }

    public final boolean zzI() {
        Context zzau = this.zzs.zzau();
        this.zzs.zzf();
        return zzau.getDatabasePath("google_app_measurement.db").exists();
    }

    public final boolean zzJ(String str, Long l10, long j10, e3 e3Var) {
        zzg();
        zzW();
        Objects.requireNonNull(e3Var, "null reference");
        o.e(str);
        Objects.requireNonNull(l10, "null reference");
        byte[] i10 = e3Var.i();
        this.zzs.zzay().zzj().zzc("Saving complex main event, appId, data size", this.zzs.zzj().zzd(str), Integer.valueOf(i10.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l10);
        contentValues.put("children_to_process", Long.valueOf(j10));
        contentValues.put("main_event", i10);
        try {
            if (zzh().insertWithOnConflict("main_event_params", null, contentValues, 5) == -1) {
                this.zzs.zzay().zzd().zzb("Failed to insert complex main event (got -1). appId", zzeh.zzn(str));
                return false;
            }
            return true;
        } catch (SQLiteException e10) {
            this.zzs.zzay().zzd().zzc("Error storing complex main event. appId", zzeh.zzn(str), e10);
            return false;
        }
    }

    public final boolean zzK(zzab zzabVar) {
        Objects.requireNonNull(zzabVar, "null reference");
        zzg();
        zzW();
        String str = zzabVar.zza;
        Objects.requireNonNull(str, "null reference");
        if (zzp(str, zzabVar.zzc.zzb) == null) {
            long zzZ = zzZ("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            this.zzs.zzf();
            if (zzZ >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.ORIGIN, zzabVar.zzb);
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.NAME, zzabVar.zzc.zzb);
        Object zza2 = zzabVar.zzc.zza();
        Objects.requireNonNull(zza2, "null reference");
        zzV(contentValues, AppMeasurementSdk.ConditionalUserProperty.VALUE, zza2);
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, Boolean.valueOf(zzabVar.zze));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, zzabVar.zzf);
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.valueOf(zzabVar.zzh));
        contentValues.put("timed_out_event", this.zzs.zzv().zzan(zzabVar.zzg));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, Long.valueOf(zzabVar.zzd));
        contentValues.put("triggered_event", this.zzs.zzv().zzan(zzabVar.zzi));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, Long.valueOf(zzabVar.zzc.zzc));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.valueOf(zzabVar.zzj));
        contentValues.put("expired_event", this.zzs.zzv().zzan(zzabVar.zzk));
        try {
        } catch (SQLiteException e10) {
            this.zzs.zzay().zzd().zzc("Error storing conditional user property", zzeh.zzn(str), e10);
        }
        if (zzh().insertWithOnConflict("conditional_properties", null, contentValues, 5) == -1) {
            this.zzs.zzay().zzd().zzb("Failed to insert/update conditional user property (got -1)", zzeh.zzn(str));
            return true;
        }
        return true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(2:5|(6:7|8|9|10|(1:12)|14)(2:18|19))(2:20|(2:22|(1:24))))|25|8|9|10|(0)|14) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00e6, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00e7, code lost:
        r13.zzs.zzay().zzd().zzc("Error storing user property. appId", com.google.android.gms.measurement.internal.zzeh.zzn(r14.zza), r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ca A[Catch: SQLiteException -> 0x00e6, TRY_LEAVE, TryCatch #0 {SQLiteException -> 0x00e6, blocks: (B:18:0x00b5, B:20:0x00ca), top: B:25:0x00b5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzL(com.google.android.gms.measurement.internal.zzku r14) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzak.zzL(com.google.android.gms.measurement.internal.zzku):boolean");
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0231: MOVE  (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:85:0x0231 */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0234  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzU(java.lang.String r21, long r22, long r24, com.google.android.gms.measurement.internal.zzko r26) {
        /*
            Method dump skipped, instructions count: 568
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzak.zzU(java.lang.String, long, long, com.google.android.gms.measurement.internal.zzko):void");
    }

    public final int zza(String str, String str2) {
        o.e(str);
        o.e(str2);
        zzg();
        zzW();
        try {
            return zzh().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e10) {
            this.zzs.zzay().zzd().zzd("Error deleting conditional property", zzeh.zzn(str), this.zzs.zzj().zzf(str2), e10);
            return 0;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzkf
    public final boolean zzb() {
        return false;
    }

    public final long zzc(String str, String str2) {
        long zzaa;
        o.e(str);
        o.e("first_open_count");
        zzg();
        zzW();
        SQLiteDatabase zzh2 = zzh();
        zzh2.beginTransaction();
        long j10 = 0;
        try {
            try {
                zzaa = zzaa("select first_open_count from app2 where app_id=?", new String[]{str}, -1L);
                if (zzaa == -1) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("app_id", str);
                    contentValues.put("first_open_count", (Integer) 0);
                    contentValues.put("previous_install_count", (Integer) 0);
                    if (zzh2.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                        this.zzs.zzay().zzd().zzc("Failed to insert column (got -1). appId", zzeh.zzn(str), "first_open_count");
                        return -1L;
                    }
                    zzaa = 0;
                }
            } catch (SQLiteException e10) {
                e = e10;
            }
            try {
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("app_id", str);
                contentValues2.put("first_open_count", Long.valueOf(1 + zzaa));
                if (zzh2.update("app2", contentValues2, "app_id = ?", new String[]{str}) == 0) {
                    this.zzs.zzay().zzd().zzc("Failed to update column (got 0). appId", zzeh.zzn(str), "first_open_count");
                    return -1L;
                }
                zzh2.setTransactionSuccessful();
                return zzaa;
            } catch (SQLiteException e11) {
                e = e11;
                j10 = zzaa;
                this.zzs.zzay().zzd().zzd("Error inserting column. appId", zzeh.zzn(str), "first_open_count", e);
                zzh2.endTransaction();
                return j10;
            }
        } finally {
            zzh2.endTransaction();
        }
    }

    public final long zzd() {
        return zzaa("select max(bundle_end_timestamp) from queue", null, 0L);
    }

    public final long zze() {
        return zzaa("select max(timestamp) from raw_events", null, 0L);
    }

    public final long zzf(String str) {
        o.e(str);
        return zzaa("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    public final SQLiteDatabase zzh() {
        zzg();
        try {
            return this.zzj.getWritableDatabase();
        } catch (SQLiteException e10) {
            this.zzs.zzay().zzk().zzb("Error opening database", e10);
            throw e10;
        }
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x00fd: MOVE  (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:45:0x00fd */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0100  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.os.Bundle zzi(java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzak.zzi(java.lang.String):android.os.Bundle");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x012a A[Catch: SQLiteException -> 0x01e7, all -> 0x0206, TryCatch #0 {SQLiteException -> 0x01e7, blocks: (B:4:0x0060, B:8:0x006a, B:10:0x00d2, B:15:0x00dd, B:19:0x012f, B:21:0x016c, B:25:0x017c, B:24:0x0178, B:26:0x017f, B:28:0x0187, B:32:0x018f, B:36:0x01a8, B:38:0x01b5, B:39:0x01c7, B:41:0x01d0, B:35:0x01a4, B:18:0x012a), top: B:59:0x0060 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x016c A[Catch: SQLiteException -> 0x01e7, all -> 0x0206, TryCatch #0 {SQLiteException -> 0x01e7, blocks: (B:4:0x0060, B:8:0x006a, B:10:0x00d2, B:15:0x00dd, B:19:0x012f, B:21:0x016c, B:25:0x017c, B:24:0x0178, B:26:0x017f, B:28:0x0187, B:32:0x018f, B:36:0x01a8, B:38:0x01b5, B:39:0x01c7, B:41:0x01d0, B:35:0x01a4, B:18:0x012a), top: B:59:0x0060 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01a4 A[Catch: SQLiteException -> 0x01e7, all -> 0x0206, TryCatch #0 {SQLiteException -> 0x01e7, blocks: (B:4:0x0060, B:8:0x006a, B:10:0x00d2, B:15:0x00dd, B:19:0x012f, B:21:0x016c, B:25:0x017c, B:24:0x0178, B:26:0x017f, B:28:0x0187, B:32:0x018f, B:36:0x01a8, B:38:0x01b5, B:39:0x01c7, B:41:0x01d0, B:35:0x01a4, B:18:0x012a), top: B:59:0x0060 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01b5 A[Catch: SQLiteException -> 0x01e7, all -> 0x0206, TryCatch #0 {SQLiteException -> 0x01e7, blocks: (B:4:0x0060, B:8:0x006a, B:10:0x00d2, B:15:0x00dd, B:19:0x012f, B:21:0x016c, B:25:0x017c, B:24:0x0178, B:26:0x017f, B:28:0x0187, B:32:0x018f, B:36:0x01a8, B:38:0x01b5, B:39:0x01c7, B:41:0x01d0, B:35:0x01a4, B:18:0x012a), top: B:59:0x0060 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01d0 A[Catch: SQLiteException -> 0x01e7, all -> 0x0206, TRY_LEAVE, TryCatch #0 {SQLiteException -> 0x01e7, blocks: (B:4:0x0060, B:8:0x006a, B:10:0x00d2, B:15:0x00dd, B:19:0x012f, B:21:0x016c, B:25:0x017c, B:24:0x0178, B:26:0x017f, B:28:0x0187, B:32:0x018f, B:36:0x01a8, B:38:0x01b5, B:39:0x01c7, B:41:0x01d0, B:35:0x01a4, B:18:0x012a), top: B:59:0x0060 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x020a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.zzg zzj(java.lang.String r34) {
        /*
            Method dump skipped, instructions count: 526
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzak.zzj(java.lang.String):com.google.android.gms.measurement.internal.zzg");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0131  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.zzab zzk(java.lang.String r31, java.lang.String r32) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzak.zzk(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.zzab");
    }

    public final zzai zzl(long j10, String str, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        return zzm(j10, str, 1L, false, false, z12, false, z14);
    }

    public final zzai zzm(long j10, String str, long j11, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        o.e(str);
        zzg();
        zzW();
        String[] strArr = {str};
        zzai zzaiVar = new zzai();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase zzh2 = zzh();
                Cursor query = zzh2.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (!query.moveToFirst()) {
                    this.zzs.zzay().zzk().zzb("Not updating daily counts, app is not known. appId", zzeh.zzn(str));
                    query.close();
                    return zzaiVar;
                }
                if (query.getLong(0) == j10) {
                    zzaiVar.zzb = query.getLong(1);
                    zzaiVar.zza = query.getLong(2);
                    zzaiVar.zzc = query.getLong(3);
                    zzaiVar.zzd = query.getLong(4);
                    zzaiVar.zze = query.getLong(5);
                }
                if (z10) {
                    zzaiVar.zzb += j11;
                }
                if (z11) {
                    zzaiVar.zza += j11;
                }
                if (z12) {
                    zzaiVar.zzc += j11;
                }
                if (z13) {
                    zzaiVar.zzd += j11;
                }
                if (z14) {
                    zzaiVar.zze += j11;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("day", Long.valueOf(j10));
                contentValues.put("daily_public_events_count", Long.valueOf(zzaiVar.zza));
                contentValues.put("daily_events_count", Long.valueOf(zzaiVar.zzb));
                contentValues.put("daily_conversions_count", Long.valueOf(zzaiVar.zzc));
                contentValues.put("daily_error_events_count", Long.valueOf(zzaiVar.zzd));
                contentValues.put("daily_realtime_events_count", Long.valueOf(zzaiVar.zze));
                zzh2.update("apps", contentValues, "app_id=?", strArr);
                query.close();
                return zzaiVar;
            } catch (SQLiteException e10) {
                this.zzs.zzay().zzd().zzc("Error updating daily counts. appId", zzeh.zzn(str), e10);
                if (0 != 0) {
                    cursor.close();
                }
                return zzaiVar;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0158  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.zzaq zzn(java.lang.String r28, java.lang.String r29) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzak.zzn(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.zzaq");
    }

    /* JADX WARN: Not initialized variable reg: 11, insn: 0x00a5: MOVE  (r10 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]), block:B:28:0x00a5 */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.zzku zzp(java.lang.String r20, java.lang.String r21) {
        /*
            r19 = this;
            r1 = r19
            r9 = r21
            h9.o.e(r20)
            h9.o.e(r21)
            r19.zzg()
            r19.zzW()
            r10 = 0
            android.database.sqlite.SQLiteDatabase r11 = r19.zzh()     // Catch: java.lang.Throwable -> L7d android.database.sqlite.SQLiteException -> L7f
            java.lang.String r0 = "set_timestamp"
            java.lang.String r2 = "value"
            java.lang.String r3 = "origin"
            java.lang.String[] r13 = new java.lang.String[]{r0, r2, r3}     // Catch: java.lang.Throwable -> L7d android.database.sqlite.SQLiteException -> L7f
            r0 = 2
            java.lang.String[] r15 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L7d android.database.sqlite.SQLiteException -> L7f
            r2 = 0
            r15[r2] = r20     // Catch: java.lang.Throwable -> L7d android.database.sqlite.SQLiteException -> L7f
            r3 = 1
            r15[r3] = r9     // Catch: java.lang.Throwable -> L7d android.database.sqlite.SQLiteException -> L7f
            java.lang.String r12 = "user_attributes"
            java.lang.String r14 = "app_id=? and name=?"
            r16 = 7809(0x1e81, float:1.0943E-41)
            r16 = 0
            r17 = 0
            r18 = 0
            android.database.Cursor r11 = r11.query(r12, r13, r14, r15, r16, r17, r18)     // Catch: java.lang.Throwable -> L7d android.database.sqlite.SQLiteException -> L7f
            boolean r4 = r11.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L7b java.lang.Throwable -> La4
            if (r4 != 0) goto L42
            r11.close()
            return r10
        L42:
            long r6 = r11.getLong(r2)     // Catch: android.database.sqlite.SQLiteException -> L7b java.lang.Throwable -> La4
            java.lang.Object r8 = r1.zzq(r11, r3)     // Catch: android.database.sqlite.SQLiteException -> L7b java.lang.Throwable -> La4
            if (r8 != 0) goto L50
            r11.close()
            return r10
        L50:
            java.lang.String r4 = r11.getString(r0)     // Catch: android.database.sqlite.SQLiteException -> L7b java.lang.Throwable -> La4
            com.google.android.gms.measurement.internal.zzku r0 = new com.google.android.gms.measurement.internal.zzku     // Catch: android.database.sqlite.SQLiteException -> L7b java.lang.Throwable -> La4
            r2 = r0
            r3 = r20
            r5 = r21
            r2.<init>(r3, r4, r5, r6, r8)     // Catch: android.database.sqlite.SQLiteException -> L7b java.lang.Throwable -> La4
            boolean r2 = r11.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L7b java.lang.Throwable -> La4
            if (r2 == 0) goto L77
            com.google.android.gms.measurement.internal.zzfr r2 = r1.zzs     // Catch: android.database.sqlite.SQLiteException -> L7b java.lang.Throwable -> La4
            com.google.android.gms.measurement.internal.zzeh r2 = r2.zzay()     // Catch: android.database.sqlite.SQLiteException -> L7b java.lang.Throwable -> La4
            com.google.android.gms.measurement.internal.zzef r2 = r2.zzd()     // Catch: android.database.sqlite.SQLiteException -> L7b java.lang.Throwable -> La4
            java.lang.String r3 = "Got multiple records for user property, expected one. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzeh.zzn(r20)     // Catch: android.database.sqlite.SQLiteException -> L7b java.lang.Throwable -> La4
            r2.zzb(r3, r4)     // Catch: android.database.sqlite.SQLiteException -> L7b java.lang.Throwable -> La4
        L77:
            r11.close()
            return r0
        L7b:
            r0 = move-exception
            goto L81
        L7d:
            r0 = move-exception
            goto La6
        L7f:
            r0 = move-exception
            r11 = r10
        L81:
            com.google.android.gms.measurement.internal.zzfr r2 = r1.zzs     // Catch: java.lang.Throwable -> La4
            com.google.android.gms.measurement.internal.zzeh r2 = r2.zzay()     // Catch: java.lang.Throwable -> La4
            com.google.android.gms.measurement.internal.zzef r2 = r2.zzd()     // Catch: java.lang.Throwable -> La4
            java.lang.String r3 = "Error querying user property. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzeh.zzn(r20)     // Catch: java.lang.Throwable -> La4
            com.google.android.gms.measurement.internal.zzfr r5 = r1.zzs     // Catch: java.lang.Throwable -> La4
            com.google.android.gms.measurement.internal.zzec r5 = r5.zzj()     // Catch: java.lang.Throwable -> La4
            java.lang.String r5 = r5.zzf(r9)     // Catch: java.lang.Throwable -> La4
            r2.zzd(r3, r4, r5, r0)     // Catch: java.lang.Throwable -> La4
            if (r11 == 0) goto La3
            r11.close()
        La3:
            return r10
        La4:
            r0 = move-exception
            r10 = r11
        La6:
            if (r10 == 0) goto Lab
            r10.close()
        Lab:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzak.zzp(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.zzku");
    }

    public final Object zzq(Cursor cursor, int i10) {
        int type = cursor.getType(i10);
        if (type == 0) {
            a.t(this.zzs, "Loaded invalid null value from database");
            return null;
        } else if (type != 1) {
            if (type != 2) {
                if (type != 3) {
                    if (type != 4) {
                        this.zzs.zzay().zzd().zzb("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
                        return null;
                    }
                    a.t(this.zzs, "Loaded invalid blob type value, ignoring it");
                    return null;
                }
                return cursor.getString(i10);
            }
            return Double.valueOf(cursor.getDouble(i10));
        } else {
            return Long.valueOf(cursor.getLong(i10));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004b  */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.String[], java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String zzr() {
        /*
            r9 = this;
            r6 = r9
            android.database.sqlite.SQLiteDatabase r0 = r6.zzh()
            r8 = 0
            r1 = r8
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch: java.lang.Throwable -> L25 android.database.sqlite.SQLiteException -> L27
            boolean r8 = r0.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L23 java.lang.Throwable -> L45
            r2 = r8
            if (r2 == 0) goto L1f
            r2 = 0
            r8 = 7
            java.lang.String r8 = r0.getString(r2)     // Catch: android.database.sqlite.SQLiteException -> L23 java.lang.Throwable -> L45
            r1 = r8
            r0.close()
            return r1
        L1f:
            r0.close()
            return r1
        L23:
            r2 = move-exception
            goto L2a
        L25:
            r0 = move-exception
            goto L49
        L27:
            r0 = move-exception
            r2 = r0
            r0 = r1
        L2a:
            r8 = 4
            com.google.android.gms.measurement.internal.zzfr r3 = r6.zzs     // Catch: java.lang.Throwable -> L45
            com.google.android.gms.measurement.internal.zzeh r8 = r3.zzay()     // Catch: java.lang.Throwable -> L45
            r3 = r8
            com.google.android.gms.measurement.internal.zzef r8 = r3.zzd()     // Catch: java.lang.Throwable -> L45
            r3 = r8
            java.lang.String r8 = "Database error getting next bundle app id"
            r4 = r8
            r3.zzb(r4, r2)     // Catch: java.lang.Throwable -> L45
            if (r0 == 0) goto L43
            r0.close()
            r8 = 2
        L43:
            r8 = 5
            return r1
        L45:
            r1 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
        L49:
            if (r1 == 0) goto L4f
            r8 = 3
            r1.close()
        L4f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzak.zzr():java.lang.String");
    }

    public final List zzs(String str, String str2, String str3) {
        o.e(str);
        zzg();
        zzW();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb2 = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb2.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb2.append(" and name glob ?");
        }
        return zzt(sb2.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x005a, code lost:
        r2 = r27.zzs.zzay().zzd();
        r27.zzs.zzf();
        r2.zzb("Read more than the max allowed conditional properties, ignoring extra", 1000);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List zzt(java.lang.String r28, java.lang.String[] r29) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzak.zzt(java.lang.String, java.lang.String[]):java.util.List");
    }

    public final List zzu(String str) {
        o.e(str);
        zzg();
        zzW();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                this.zzs.zzf();
                cursor = zzh().query("user_attributes", new String[]{AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.ORIGIN, "set_timestamp", AppMeasurementSdk.ConditionalUserProperty.VALUE}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return arrayList;
                }
                do {
                    String string = cursor.getString(0);
                    String string2 = cursor.getString(1);
                    if (string2 == null) {
                        string2 = BuildConfig.FLAVOR;
                    }
                    String str2 = string2;
                    long j10 = cursor.getLong(2);
                    Object zzq = zzq(cursor, 3);
                    if (zzq == null) {
                        this.zzs.zzay().zzd().zzb("Read invalid user property value, ignoring it. appId", zzeh.zzn(str));
                    } else {
                        arrayList.add(new zzku(str, str2, string, j10, zzq));
                    }
                } while (cursor.moveToNext());
                cursor.close();
                return arrayList;
            } catch (SQLiteException e10) {
                this.zzs.zzay().zzd().zzc("Error querying user properties. appId", zzeh.zzn(str), e10);
                List emptyList = Collections.emptyList();
                if (cursor != null) {
                    cursor.close();
                }
                return emptyList;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x009f, code lost:
        r2 = r16.zzs.zzay().zzd();
        r16.zzs.zzf();
        r2.zzb("Read more than the max allowed user properties, ignoring excess", 1000);
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0121 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List zzv(java.lang.String r17, java.lang.String r18, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzak.zzv(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    public final void zzw() {
        zzW();
        zzh().beginTransaction();
    }

    public final void zzx() {
        zzW();
        zzh().endTransaction();
    }

    public final void zzy(List list) {
        zzg();
        zzW();
        Objects.requireNonNull(list, "null reference");
        if (list.size() == 0) {
            throw new IllegalArgumentException("Given Integer is zero");
        }
        if (zzI()) {
            String join = TextUtils.join(",", list);
            String n = b.n(new StringBuilder(String.valueOf(join).length() + 2), "(", join, ")");
            if (zzZ(b.n(new StringBuilder(n.length() + 80), "SELECT COUNT(1) FROM queue WHERE rowid IN ", n, " AND retry_count =  2147483647 LIMIT 1"), null) > 0) {
                android.support.v4.media.a.m(this.zzs, "The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase zzh2 = zzh();
                StringBuilder sb2 = new StringBuilder(n.length() + 127);
                sb2.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb2.append(n);
                sb2.append(" AND (retry_count IS NULL OR retry_count < ");
                sb2.append(IntCompanionObject.MAX_VALUE);
                sb2.append(")");
                zzh2.execSQL(sb2.toString());
            } catch (SQLiteException e10) {
                this.zzs.zzay().zzd().zzb("Error incrementing retry count. error", e10);
            }
        }
    }

    public final void zzz() {
        zzg();
        zzW();
        if (zzI()) {
            long zza2 = this.zzf.zzs().zza.zza();
            Objects.requireNonNull((c) this.zzs.zzav());
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long abs = Math.abs(elapsedRealtime - zza2);
            this.zzs.zzf();
            if (abs > ((Long) zzdu.zzx.zza(null)).longValue()) {
                this.zzf.zzs().zza.zzb(elapsedRealtime);
                zzg();
                zzW();
                if (!zzI()) {
                    return;
                }
                SQLiteDatabase zzh2 = zzh();
                Objects.requireNonNull((c) this.zzs.zzav());
                this.zzs.zzf();
                int delete = zzh2.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(zzaf.zzA())});
                if (delete > 0) {
                    this.zzs.zzay().zzj().zzb("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
                }
            }
        }
    }
}
