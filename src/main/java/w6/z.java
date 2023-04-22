package w6;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import kotlin.io.ConstantsKt;

/* loaded from: classes2.dex */
public final class z implements e9.l {

    /* renamed from: c  reason: collision with root package name */
    public Object f16896c;

    /* renamed from: f  reason: collision with root package name */
    public Object f16897f;

    public z(int i10) {
        if (i10 != 1) {
            return;
        }
        this.f16896c = new ByteArrayOutputStream(ConstantsKt.MINIMUM_BLOCK_SIZE);
        this.f16897f = new DataOutputStream((ByteArrayOutputStream) this.f16896c);
    }

    public /* synthetic */ z(u8.l0 l0Var, String str) {
        this.f16896c = l0Var;
        this.f16897f = str;
    }

    public void a() {
        this.f16896c = null;
        this.f16897f = null;
    }

    @Override // e9.l
    public void accept(Object obj, Object obj2) {
        u8.l0 l0Var = (u8.l0) this.f16896c;
        ea.h<Status> hVar = (ea.h) obj2;
        l0Var.g();
        a9.f fVar = (a9.f) ((a9.c0) obj).getService();
        Parcel a12 = fVar.a1();
        a12.writeString((String) this.f16897f);
        fVar.d1(5, a12);
        synchronized (l0Var.f15719s) {
            if (l0Var.f15716p == null) {
                l0Var.f15716p = hVar;
                return;
            }
            hVar.f9273a.o(u8.l0.e(2001));
        }
    }
}
