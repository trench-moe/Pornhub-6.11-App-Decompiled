package lc;

import android.content.Context;
import android.content.SharedPreferences;
import java.text.SimpleDateFormat;
import java.util.Date;

/* loaded from: classes2.dex */
public class e {

    /* renamed from: b  reason: collision with root package name */
    public static e f12777b;

    /* renamed from: c  reason: collision with root package name */
    public static final SimpleDateFormat f12778c = new SimpleDateFormat("dd/MM/yyyy z");

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f12779a;

    public e(Context context) {
        this.f12779a = context.getSharedPreferences("FirebaseAppHeartBeat", 0);
        context.getSharedPreferences("FirebaseAppHeartBeatStorage", 0);
    }

    public synchronized boolean a(String str, long j10) {
        if (!this.f12779a.contains(str)) {
            this.f12779a.edit().putLong(str, j10).apply();
            return true;
        }
        Date date = new Date(this.f12779a.getLong(str, -1L));
        Date date2 = new Date(j10);
        SimpleDateFormat simpleDateFormat = f12778c;
        if (!simpleDateFormat.format(date).equals(simpleDateFormat.format(date2))) {
            this.f12779a.edit().putLong(str, j10).apply();
            return true;
        }
        return false;
    }
}
