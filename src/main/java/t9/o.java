package t9;

import android.content.Context;
import android.widget.ImageView;
import com.app.pornhub.R;
import java.util.Objects;
import u8.e;

/* loaded from: classes2.dex */
public final class o extends y8.a {

    /* renamed from: b  reason: collision with root package name */
    public final ImageView f15305b;

    /* renamed from: c  reason: collision with root package name */
    public final String f15306c;
    public final String d;

    /* renamed from: e  reason: collision with root package name */
    public final Context f15307e;

    /* renamed from: f  reason: collision with root package name */
    public e.c f15308f;

    public o(ImageView imageView, Context context) {
        this.f15305b = imageView;
        Context applicationContext = context.getApplicationContext();
        this.f15307e = applicationContext;
        this.f15306c = applicationContext.getString(R.string.cast_mute);
        this.d = applicationContext.getString(R.string.cast_unmute);
        imageView.setEnabled(false);
        this.f15308f = null;
    }

    @Override // y8.a
    public final void b() {
        f();
    }

    @Override // y8.a
    public final void c() {
        this.f15305b.setEnabled(false);
    }

    @Override // y8.a
    public final void d(v8.d dVar) {
        if (this.f15308f == null) {
            this.f15308f = new n(this);
        }
        super.d(dVar);
        e.c cVar = this.f15308f;
        Objects.requireNonNull(dVar);
        h9.o.d("Must be called from the main thread.");
        if (cVar != null) {
            dVar.d.add(cVar);
        }
        f();
    }

    @Override // y8.a
    public final void e() {
        e.c cVar;
        this.f15305b.setEnabled(false);
        v8.d c10 = v8.b.c(this.f15307e).b().c();
        if (c10 != null && (cVar = this.f15308f) != null) {
            h9.o.d("Must be called from the main thread.");
            c10.d.remove(cVar);
        }
        this.f18545a = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f() {
        /*
            r7 = this;
            r3 = r7
            android.content.Context r0 = r3.f15307e
            r5 = 7
            v8.b r6 = v8.b.c(r0)
            r0 = r6
            v8.g r0 = r0.b()
            v8.d r0 = r0.c()
            r1 = 0
            if (r0 == 0) goto L53
            r6 = 3
            boolean r5 = r0.c()
            r2 = r5
            if (r2 == 0) goto L53
            w8.g r2 = r3.f18545a
            r6 = 1
            if (r2 == 0) goto L32
            r5 = 1
            boolean r2 = r2.j()
            if (r2 != 0) goto L29
            goto L33
        L29:
            android.widget.ImageView r1 = r3.f15305b
            r5 = 4
            r2 = 1
            r5 = 4
            r1.setEnabled(r2)
            goto L38
        L32:
            r5 = 2
        L33:
            android.widget.ImageView r2 = r3.f15305b
            r2.setEnabled(r1)
        L38:
            boolean r5 = r0.m()
            r0 = r5
            android.widget.ImageView r1 = r3.f15305b
            r6 = 5
            r1.setSelected(r0)
            android.widget.ImageView r1 = r3.f15305b
            if (r0 == 0) goto L4c
            r6 = 3
            java.lang.String r0 = r3.d
            r5 = 6
            goto L4f
        L4c:
            r6 = 7
            java.lang.String r0 = r3.f15306c
        L4f:
            r1.setContentDescription(r0)
            return
        L53:
            android.widget.ImageView r0 = r3.f15305b
            r6 = 6
            r0.setEnabled(r1)
            r5 = 5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t9.o.f():void");
    }
}
