package je;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.widget.ImageView;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f11705a = 0;

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final Context f11706a;

        /* renamed from: b  reason: collision with root package name */
        public final View f11707b;

        /* renamed from: c  reason: collision with root package name */
        public final b f11708c;

        public a(Context context, View view, b bVar, boolean z10) {
            this.f11706a = context;
            this.f11707b = view;
            this.f11708c = bVar;
        }

        public void a(ImageView imageView) {
            this.f11708c.f11701a = this.f11707b.getMeasuredWidth();
            this.f11708c.f11702b = this.f11707b.getMeasuredHeight();
            imageView.setImageDrawable(new BitmapDrawable(this.f11706a.getResources(), je.a.b(this.f11707b, this.f11708c)));
        }
    }
}
