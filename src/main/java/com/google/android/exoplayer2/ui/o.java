package com.google.android.exoplayer2.ui;

/* loaded from: classes.dex */
public interface o {

    /* loaded from: classes.dex */
    public interface a {
        void c(o oVar, long j10);

        void k(o oVar, long j10, boolean z10);

        void l(o oVar, long j10);
    }

    void a(long[] jArr, boolean[] zArr, int i10);

    void b(a aVar);

    long getPreferredUpdateDelay();

    void setBufferedPosition(long j10);

    void setDuration(long j10);

    void setEnabled(boolean z10);

    void setPosition(long j10);
}
