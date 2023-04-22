package n7;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Objects;
import n7.e;

/* loaded from: classes2.dex */
public class d extends Handler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f13382a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, Looper looper) {
        super(looper);
        this.f13382a = eVar;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        e.a aVar;
        e eVar = this.f13382a;
        Objects.requireNonNull(eVar);
        int i10 = message.what;
        if (i10 == 0) {
            aVar = (e.a) message.obj;
            try {
                eVar.f13385a.queueInputBuffer(aVar.f13391a, aVar.f13392b, aVar.f13393c, aVar.f13394e, aVar.f13395f);
            } catch (RuntimeException e10) {
                eVar.d.set(e10);
            }
        } else if (i10 != 1) {
            if (i10 != 2) {
                eVar.d.set(new IllegalStateException(String.valueOf(message.what)));
            } else {
                eVar.f13388e.b();
            }
            aVar = null;
        } else {
            aVar = (e.a) message.obj;
            int i11 = aVar.f13391a;
            int i12 = aVar.f13392b;
            MediaCodec.CryptoInfo cryptoInfo = aVar.d;
            long j10 = aVar.f13394e;
            int i13 = aVar.f13395f;
            try {
                if (eVar.f13389f) {
                    synchronized (e.f13384i) {
                        eVar.f13385a.queueSecureInputBuffer(i11, i12, cryptoInfo, j10, i13);
                    }
                } else {
                    eVar.f13385a.queueSecureInputBuffer(i11, i12, cryptoInfo, j10, i13);
                }
            } catch (RuntimeException e11) {
                eVar.d.set(e11);
            }
        }
        if (aVar != null) {
            ArrayDeque<e.a> arrayDeque = e.f13383h;
            synchronized (arrayDeque) {
                arrayDeque.add(aVar);
            }
        }
    }
}
