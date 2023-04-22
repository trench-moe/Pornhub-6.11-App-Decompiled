package t9;

import android.content.SharedPreferences;
import com.google.android.datatransport.Priority;
import java.util.UUID;
import org.checkerframework.dataflow.qual.Pure;

/* loaded from: classes2.dex */
public final class y {

    /* renamed from: a  reason: collision with root package name */
    public final i6.e<com.google.android.gms.internal.cast.m> f15366a;

    /* renamed from: b  reason: collision with root package name */
    public final String f15367b;

    /* renamed from: c  reason: collision with root package name */
    public final int f15368c;

    public y(SharedPreferences sharedPreferences, i6.e<com.google.android.gms.internal.cast.m> eVar, long j10) {
        this.f15366a = eVar;
        String string = sharedPreferences.getString("client_sender_id", null);
        if (string == null) {
            string = UUID.randomUUID().toString();
            sharedPreferences.edit().putString("client_sender_id", string).apply();
        }
        this.f15367b = string;
        this.f15368c = j10 == 0 ? 1 : 2;
    }

    @Pure
    public final void a(com.google.android.gms.internal.cast.m mVar, int i10) {
        r0 o10 = com.google.android.gms.internal.cast.m.o(mVar);
        String str = this.f15367b;
        if (o10.f15273j) {
            o10.j();
            o10.f15273j = false;
        }
        com.google.android.gms.internal.cast.m.w((com.google.android.gms.internal.cast.m) o10.f15272f, str);
        com.google.android.gms.internal.cast.m c10 = o10.c();
        ((l6.t) this.f15366a).a(this.f15368c + (-1) != 0 ? new i6.a(Integer.valueOf(i10 - 1), c10, Priority.DEFAULT) : new i6.a(Integer.valueOf(i10 - 1), c10, Priority.VERY_LOW), l6.s.f12312f);
    }
}
