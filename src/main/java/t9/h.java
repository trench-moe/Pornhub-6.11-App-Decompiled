package t9;

import android.content.Context;
import android.view.View;
import com.app.pornhub.R;

/* loaded from: classes2.dex */
public final class h extends y8.a {

    /* renamed from: b  reason: collision with root package name */
    public final View f15228b;

    /* renamed from: c  reason: collision with root package name */
    public final String f15229c;
    public final String d;

    public h(View view, Context context) {
        this.f15228b = view;
        this.f15229c = context.getString(R.string.cast_closed_captions);
        this.d = context.getString(R.string.cast_closed_captions_unavailable);
        view.setEnabled(false);
    }

    @Override // y8.a
    public final void b() {
        f();
    }

    @Override // y8.a
    public final void c() {
        this.f15228b.setEnabled(false);
    }

    @Override // y8.a
    public final void d(v8.d dVar) {
        super.d(dVar);
        this.f15228b.setEnabled(true);
        f();
    }

    @Override // y8.a
    public final void e() {
        this.f15228b.setEnabled(false);
        this.f18545a = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f() {
        /*
            r10 = this;
            r7 = r10
            w8.g r0 = r7.f18545a
            r9 = 1
            r9 = 0
            r1 = r9
            if (r0 == 0) goto L61
            boolean r9 = r0.j()
            r2 = r9
            if (r2 == 0) goto L61
            com.google.android.gms.cast.MediaInfo r9 = r0.f()
            r2 = r9
            if (r2 != 0) goto L18
            r9 = 6
            goto L61
        L18:
            java.util.List<com.google.android.gms.cast.MediaTrack> r2 = r2.f6798t
            if (r2 == 0) goto L61
            r9 = 2
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L61
            java.util.Iterator r2 = r2.iterator()
            r9 = 0
            r3 = r9
        L29:
            r9 = 7
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L61
            r9 = 1
            java.lang.Object r4 = r2.next()
            com.google.android.gms.cast.MediaTrack r4 = (com.google.android.gms.cast.MediaTrack) r4
            int r4 = r4.f6804f
            r9 = 5
            r9 = 2
            r5 = r9
            r9 = 1
            r6 = r9
            if (r4 != r5) goto L47
            int r3 = r3 + 1
            r9 = 5
            if (r3 <= r6) goto L29
            r9 = 4
            goto L4a
        L47:
            r9 = 3
            if (r4 != r6) goto L29
        L4a:
            boolean r9 = r0.p()
            r0 = r9
            if (r0 != 0) goto L61
            r9 = 6
            android.view.View r0 = r7.f15228b
            r9 = 6
            r0.setEnabled(r6)
            r9 = 4
            android.view.View r0 = r7.f15228b
            java.lang.String r1 = r7.f15229c
            r0.setContentDescription(r1)
            return
        L61:
            android.view.View r0 = r7.f15228b
            r0.setEnabled(r1)
            android.view.View r0 = r7.f15228b
            r9 = 4
            java.lang.String r1 = r7.d
            r0.setContentDescription(r1)
            r9 = 4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t9.h.f():void");
    }
}
