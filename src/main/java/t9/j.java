package t9;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.cast.MediaInfo;
import java.util.List;

/* loaded from: classes2.dex */
public final class j extends y8.a {

    /* renamed from: b  reason: collision with root package name */
    public final ImageView f15252b;

    /* renamed from: c  reason: collision with root package name */
    public final w8.b f15253c;
    public final Bitmap d;

    /* renamed from: e  reason: collision with root package name */
    public final View f15254e;

    /* renamed from: f  reason: collision with root package name */
    public final w8.c f15255f;

    /* renamed from: g  reason: collision with root package name */
    public final x8.b f15256g;

    public j(ImageView imageView, Context context, w8.b bVar, int i10, View view) {
        this.f15252b = imageView;
        this.f15253c = bVar;
        this.d = i10 != 0 ? BitmapFactory.decodeResource(context.getResources(), i10) : null;
        this.f15254e = null;
        v8.b d = v8.b.d(context);
        if (d != null) {
            w8.a aVar = d.a().f16074t;
            this.f15255f = aVar != null ? aVar.p0() : null;
        } else {
            this.f15255f = null;
        }
        this.f15256g = new x8.b(context.getApplicationContext());
    }

    @Override // y8.a
    public final void b() {
        g();
    }

    @Override // y8.a
    public final void d(v8.d dVar) {
        super.d(dVar);
        this.f15256g.f18066f = new k2.c(this, 8);
        f();
        g();
    }

    @Override // y8.a
    public final void e() {
        this.f15256g.a();
        f();
        this.f18545a = null;
    }

    public final void f() {
        View view = this.f15254e;
        if (view != null) {
            view.setVisibility(0);
            this.f15252b.setVisibility(4);
        }
        Bitmap bitmap = this.d;
        if (bitmap != null) {
            this.f15252b.setImageBitmap(bitmap);
        }
    }

    public final void g() {
        List<g9.a> list;
        g9.a b10;
        Uri uri;
        w8.g gVar = this.f18545a;
        if (gVar != null && gVar.j()) {
            MediaInfo f10 = gVar.f();
            Uri uri2 = null;
            if (f10 != null) {
                w8.c cVar = this.f15255f;
                if (cVar == null || (b10 = cVar.b(f10.f6797m, this.f15253c)) == null || (uri = b10.f9883f) == null) {
                    u8.j jVar = f10.f6797m;
                    if (jVar != null && (list = jVar.f15693c) != null && list.size() > 0) {
                        uri2 = jVar.f15693c.get(0).f9883f;
                    }
                } else {
                    uri2 = uri;
                }
            }
            if (uri2 == null) {
                f();
                return;
            } else {
                this.f15256g.b(uri2);
                return;
            }
        }
        f();
    }
}
