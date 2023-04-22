package w8;

import android.content.DialogInterface;
import com.google.android.gms.cast.MediaTrack;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class e0 implements DialogInterface.OnClickListener {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ g0 f16979c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ g0 f16980f;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ h f16981j;

    public e0(h hVar, g0 g0Var, g0 g0Var2) {
        this.f16981j = hVar;
        this.f16979c = g0Var;
        this.f16980f = g0Var2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        h hVar = this.f16981j;
        g0 g0Var = this.f16979c;
        g0 g0Var2 = this.f16980f;
        if (!hVar.D0) {
            hVar.T0();
            return;
        }
        g gVar = hVar.I0;
        Objects.requireNonNull(gVar, "null reference");
        if (!gVar.j()) {
            hVar.T0();
            return;
        }
        ArrayList arrayList = new ArrayList();
        MediaTrack a10 = g0Var.a();
        if (a10 != null) {
            long j10 = a10.f6803c;
            if (j10 != -1) {
                arrayList.add(Long.valueOf(j10));
            }
        }
        MediaTrack a11 = g0Var2.a();
        if (a11 != null) {
            arrayList.add(Long.valueOf(a11.f6803c));
        }
        long[] jArr = hVar.G0;
        if (jArr != null && jArr.length > 0) {
            HashSet hashSet = new HashSet();
            for (MediaTrack mediaTrack : hVar.F0) {
                hashSet.add(Long.valueOf(mediaTrack.f6803c));
            }
            for (MediaTrack mediaTrack2 : hVar.E0) {
                hashSet.add(Long.valueOf(mediaTrack2.f6803c));
            }
            for (long j11 : jArr) {
                Long valueOf = Long.valueOf(j11);
                if (!hashSet.contains(valueOf)) {
                    arrayList.add(valueOf);
                }
            }
        }
        long[] jArr2 = new long[arrayList.size()];
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            jArr2[i11] = ((Long) arrayList.get(i11)).longValue();
        }
        Arrays.sort(jArr2);
        h9.o.d("Must be called from the main thread.");
        if (gVar.C()) {
            g.D(new l(gVar, jArr2, 0));
        } else {
            g.w(17, null);
        }
        hVar.T0();
    }
}
