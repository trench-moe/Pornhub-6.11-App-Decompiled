package pl.droidsonroids.gif;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class g extends h {
    public g(b bVar) {
        super(bVar);
    }

    @Override // pl.droidsonroids.gif.h
    public void a() {
        b bVar = this.f14133c;
        long p10 = bVar.f14118u.p(bVar.f14117t);
        if (p10 >= 0) {
            this.f14133c.f14115j = SystemClock.uptimeMillis() + p10;
            if (this.f14133c.isVisible() && this.f14133c.f14114f) {
                b bVar2 = this.f14133c;
                if (!bVar2.B) {
                    bVar2.f14113c.remove(this);
                    b bVar3 = this.f14133c;
                    bVar3.F = bVar3.f14113c.schedule(this, p10, TimeUnit.MILLISECONDS);
                }
            }
            if (!this.f14133c.f14119w.isEmpty() && this.f14133c.f14118u.b() == this.f14133c.f14118u.i() - 1) {
                b bVar4 = this.f14133c;
                ef.d dVar = bVar4.C;
                int c10 = bVar4.f14118u.c();
                if (c10 != 0 && c10 >= bVar4.f14118u.g()) {
                    c10--;
                }
                dVar.sendEmptyMessageAtTime(c10, this.f14133c.f14115j);
            }
        } else {
            b bVar5 = this.f14133c;
            bVar5.f14115j = Long.MIN_VALUE;
            bVar5.f14114f = false;
        }
        if (!this.f14133c.isVisible() || this.f14133c.C.hasMessages(-1)) {
            return;
        }
        this.f14133c.C.sendEmptyMessageAtTime(-1, 0L);
    }
}
