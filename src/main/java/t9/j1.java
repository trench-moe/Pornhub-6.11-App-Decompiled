package t9;

import com.google.android.gms.internal.cast.l1;
import com.google.android.gms.internal.cast.zzrc;
import t9.j1;

/* loaded from: classes2.dex */
public class j1<MessageType extends com.google.android.gms.internal.cast.l1<MessageType, BuilderType>, BuilderType extends j1<MessageType, BuilderType>> extends w0<MessageType, BuilderType> {

    /* renamed from: c  reason: collision with root package name */
    public final MessageType f15271c;

    /* renamed from: f  reason: collision with root package name */
    public MessageType f15272f;

    /* renamed from: j  reason: collision with root package name */
    public boolean f15273j = false;

    public j1(MessageType messagetype) {
        this.f15271c = messagetype;
        this.f15272f = (MessageType) messagetype.e(4, null, null);
    }

    public static final void a(MessageType messagetype, MessageType messagetype2) {
        q2.f15328c.a(messagetype.getClass()).d(messagetype, messagetype2);
    }

    public final BuilderType b(MessageType messagetype) {
        if (this.f15273j) {
            j();
            this.f15273j = false;
        }
        a(this.f15272f, messagetype);
        return this;
    }

    public final MessageType c() {
        MessageType d = d();
        boolean z10 = true;
        byte byteValue = ((Byte) d.e(1, null, null)).byteValue();
        if (byteValue != 1) {
            if (byteValue == 0) {
                z10 = false;
            } else {
                boolean a10 = q2.f15328c.a(d.getClass()).a(d);
                d.e(2, true != a10 ? null : d, null);
                z10 = a10;
            }
        }
        if (z10) {
            return d;
        }
        throw new zzrc();
    }

    public final Object clone() {
        j1 j1Var = (j1) this.f15271c.e(5, null, null);
        j1Var.b(d());
        return j1Var;
    }

    public MessageType d() {
        if (this.f15273j) {
            return this.f15272f;
        }
        MessageType messagetype = this.f15272f;
        q2.f15328c.a(messagetype.getClass()).f(messagetype);
        this.f15273j = true;
        return this.f15272f;
    }

    public void j() {
        MessageType messagetype = (MessageType) this.f15272f.e(4, null, null);
        q2.f15328c.a(messagetype.getClass()).d(messagetype, this.f15272f);
        this.f15272f = messagetype;
    }

    @Override // t9.k2
    public final /* synthetic */ j2 k() {
        return this.f15271c;
    }
}
