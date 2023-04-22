package t9;

import android.view.View;
import android.widget.TextView;

/* loaded from: classes2.dex */
public final class k extends y8.a {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f15277b = 0;

    /* renamed from: c  reason: collision with root package name */
    public final Object f15278c;

    public k(View view) {
        this.f15278c = view;
        view.setEnabled(false);
    }

    public k(TextView textView) {
        this.f15278c = textView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0047, code lost:
        if (r1 != 4) goto L33;
     */
    @Override // y8.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b() {
        /*
            r11 = this;
            r7 = r11
            int r0 = r7.f15277b
            java.lang.String r9 = "Smob - Mod obfuscation tool v4.6 by Kirlif'"
            switch(r0) {
                case 1: goto La;
                default: goto L8;
            }
        L8:
            r9 = 1
            return
        La:
            w8.g r0 = r7.f18545a
            r9 = 7
            if (r0 != 0) goto L10
            goto L87
        L10:
            com.google.android.gms.cast.MediaInfo r9 = r0.f()
            r0 = r9
            if (r0 != 0) goto L18
            goto L87
        L18:
            r9 = 5
            u8.j r0 = r0.f6797m
            r10 = 4
            if (r0 != 0) goto L1f
            goto L87
        L1f:
            android.os.Bundle r1 = r0.f15694f
            r10 = 5
            java.lang.String r10 = "com.google.android.gms.cast.metadata.SUBTITLE"
            r2 = r10
            boolean r9 = r1.containsKey(r2)
            r1 = r9
            java.lang.String r3 = "com.google.android.gms.cast.metadata.COMPOSER"
            r10 = 4
            java.lang.String r10 = "com.google.android.gms.cast.metadata.ALBUM_ARTIST"
            r4 = r10
            java.lang.String r10 = "com.google.android.gms.cast.metadata.ARTIST"
            r5 = r10
            if (r1 != 0) goto L76
            int r1 = r0.f15695j
            r6 = 1
            r9 = 4
            if (r1 == r6) goto L72
            r9 = 6
            r9 = 2
            r6 = r9
            if (r1 == r6) goto L6d
            r6 = 3
            r10 = 3
            if (r1 == r6) goto L4a
            r10 = 2
            r3 = 4
            r10 = 6
            if (r1 == r3) goto L54
            goto L76
        L4a:
            android.os.Bundle r1 = r0.f15694f
            r10 = 7
            boolean r10 = r1.containsKey(r5)
            r1 = r10
            if (r1 == 0) goto L56
        L54:
            r2 = r5
            goto L76
        L56:
            r10 = 7
            android.os.Bundle r1 = r0.f15694f
            boolean r1 = r1.containsKey(r4)
            if (r1 == 0) goto L61
            r2 = r4
            goto L76
        L61:
            r10 = 2
            android.os.Bundle r1 = r0.f15694f
            boolean r9 = r1.containsKey(r3)
            r1 = r9
            if (r1 == 0) goto L76
            r2 = r3
            goto L76
        L6d:
            r9 = 1
            java.lang.String r10 = "com.google.android.gms.cast.metadata.SERIES_TITLE"
            r2 = r10
            goto L76
        L72:
            r9 = 3
            java.lang.String r10 = "com.google.android.gms.cast.metadata.STUDIO"
            r2 = r10
        L76:
            java.lang.String r9 = r0.q0(r2)
            r0 = r9
            if (r0 == 0) goto L87
            r9 = 2
            java.lang.Object r1 = r7.f15278c
            android.widget.TextView r1 = (android.widget.TextView) r1
            r9 = 3
            r1.setText(r0)
            r9 = 6
        L87:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t9.k.b():void");
    }

    @Override // y8.a
    public void d(v8.d dVar) {
        switch (this.f15277b) {
            case 0:
                super.d(dVar);
                ((View) this.f15278c).setEnabled(true);
                return;
            default:
                super.d(dVar);
                return;
        }
    }

    @Override // y8.a
    public void e() {
        switch (this.f15277b) {
            case 0:
                ((View) this.f15278c).setEnabled(false);
                this.f18545a = null;
                return;
            default:
                this.f18545a = null;
                return;
        }
    }
}
