package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Objects;
import w1.a;
import w1.c;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        c cVar = remoteActionCompat.f1805a;
        if (aVar.i(1)) {
            cVar = aVar.o();
        }
        remoteActionCompat.f1805a = (IconCompat) cVar;
        CharSequence charSequence = remoteActionCompat.f1806b;
        if (aVar.i(2)) {
            charSequence = aVar.h();
        }
        remoteActionCompat.f1806b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f1807c;
        if (aVar.i(3)) {
            charSequence2 = aVar.h();
        }
        remoteActionCompat.f1807c = charSequence2;
        remoteActionCompat.d = (PendingIntent) aVar.m(remoteActionCompat.d, 4);
        boolean z10 = remoteActionCompat.f1808e;
        if (aVar.i(5)) {
            z10 = aVar.f();
        }
        remoteActionCompat.f1808e = z10;
        boolean z11 = remoteActionCompat.f1809f;
        if (aVar.i(6)) {
            z11 = aVar.f();
        }
        remoteActionCompat.f1809f = z11;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, a aVar) {
        Objects.requireNonNull(aVar);
        IconCompat iconCompat = remoteActionCompat.f1805a;
        aVar.p(1);
        aVar.w(iconCompat);
        CharSequence charSequence = remoteActionCompat.f1806b;
        aVar.p(2);
        aVar.s(charSequence);
        CharSequence charSequence2 = remoteActionCompat.f1807c;
        aVar.p(3);
        aVar.s(charSequence2);
        PendingIntent pendingIntent = remoteActionCompat.d;
        aVar.p(4);
        aVar.u(pendingIntent);
        boolean z10 = remoteActionCompat.f1808e;
        aVar.p(5);
        aVar.q(z10);
        boolean z11 = remoteActionCompat.f1809f;
        aVar.p(6);
        aVar.q(z11);
    }
}
