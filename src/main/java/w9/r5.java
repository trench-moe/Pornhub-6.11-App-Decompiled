package w9;

import com.google.android.gms.internal.measurement.zzkh;
import com.google.android.gms.internal.measurement.zzma;
import java.io.IOException;
import w9.r5;
import w9.u5;

/* loaded from: classes2.dex */
public class r5<MessageType extends u5<MessageType, BuilderType>, BuilderType extends r5<MessageType, BuilderType>> implements r6 {

    /* renamed from: c  reason: collision with root package name */
    public final u5 f17294c;

    /* renamed from: f  reason: collision with root package name */
    public u5 f17295f;

    /* renamed from: j  reason: collision with root package name */
    public boolean f17296j = false;

    public r5(MessageType messagetype) {
        this.f17294c = messagetype;
        this.f17295f = (u5) messagetype.r(4, null, null);
    }

    @Override // w9.t6
    public final /* synthetic */ s6 d() {
        return this.f17294c;
    }

    public void g() {
        u5 u5Var = (u5) this.f17295f.r(4, null, null);
        z6.f17390c.a(u5Var.getClass()).g(u5Var, this.f17295f);
        this.f17295f = u5Var;
    }

    /* renamed from: i */
    public final r5 clone() {
        r5 r5Var = (r5) this.f17294c.r(5, null, null);
        r5Var.j(n());
        return r5Var;
    }

    public final r5 j(u5 u5Var) {
        if (this.f17296j) {
            g();
            this.f17296j = false;
        }
        u5 u5Var2 = this.f17295f;
        z6.f17390c.a(u5Var2.getClass()).g(u5Var2, u5Var);
        return this;
    }

    public final r5 k(byte[] bArr, int i10, int i11, i5 i5Var) {
        if (this.f17296j) {
            g();
            this.f17296j = false;
        }
        try {
            z6.f17390c.a(this.f17295f.getClass()).i(this.f17295f, bArr, 0, i11, new b5(i5Var));
            return this;
        } catch (zzkh e10) {
            throw e10;
        } catch (IOException e11) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e11);
        } catch (IndexOutOfBoundsException unused) {
            throw zzkh.d();
        }
    }

    public final MessageType l() {
        MessageType n = n();
        byte byteValue = ((Byte) n.r(1, null, null)).byteValue();
        if (byteValue != 1) {
            if (byteValue != 0) {
                boolean f10 = z6.f17390c.a(n.getClass()).f(n);
                n.r(2, true != f10 ? null : n, null);
                if (f10) {
                }
            }
            throw new zzma();
        }
        return n;
    }

    public MessageType n() {
        if (this.f17296j) {
            return (MessageType) this.f17295f;
        }
        u5 u5Var = this.f17295f;
        z6.f17390c.a(u5Var.getClass()).a(u5Var);
        this.f17296j = true;
        return (MessageType) this.f17295f;
    }
}
