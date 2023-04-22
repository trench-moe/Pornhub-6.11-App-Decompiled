package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

/* loaded from: classes.dex */
public final class v0 extends Writer {

    /* renamed from: c  reason: collision with root package name */
    public final String f2274c;

    /* renamed from: f  reason: collision with root package name */
    public StringBuilder f2275f = new StringBuilder(128);

    public v0(String str) {
        this.f2274c = str;
    }

    public final void a() {
        if (this.f2275f.length() > 0) {
            Log.d(this.f2274c, this.f2275f.toString());
            StringBuilder sb2 = this.f2275f;
            sb2.delete(0, sb2.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        a();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            char c10 = cArr[i10 + i12];
            if (c10 == '\n') {
                a();
            } else {
                this.f2275f.append(c10);
            }
        }
    }
}
