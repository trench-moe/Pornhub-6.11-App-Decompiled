package q9;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class b implements Callable<Integer> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ SharedPreferences f14435c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ String f14436f;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Integer f14437j;

    public b(SharedPreferences sharedPreferences, String str, Integer num) {
        this.f14435c = sharedPreferences;
        this.f14436f = str;
        this.f14437j = num;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Integer call() {
        return Integer.valueOf(this.f14435c.getInt(this.f14436f, this.f14437j.intValue()));
    }
}
