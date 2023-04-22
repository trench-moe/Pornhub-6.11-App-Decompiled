package ha;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.app.pornhub.R;
import com.appsflyer.oaid.BuildConfig;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import java.util.WeakHashMap;
import kotlin.KotlinVersion;
import n0.a0;
import n0.x;
import ua.g;
import ua.j;
import za.c;
import za.d;

/* loaded from: classes2.dex */
public class a extends Drawable implements g.b {
    public int A;
    public float B;
    public float C;
    public float D;
    public WeakReference<View> E;
    public WeakReference<FrameLayout> F;

    /* renamed from: c  reason: collision with root package name */
    public final WeakReference<Context> f10397c;

    /* renamed from: f  reason: collision with root package name */
    public final cb.g f10398f;

    /* renamed from: j  reason: collision with root package name */
    public final g f10399j;

    /* renamed from: m  reason: collision with root package name */
    public final Rect f10400m;
    public float n;

    /* renamed from: t  reason: collision with root package name */
    public float f10401t;

    /* renamed from: u  reason: collision with root package name */
    public float f10402u;

    /* renamed from: w  reason: collision with root package name */
    public final C0148a f10403w;
    public float y;

    /* renamed from: z  reason: collision with root package name */
    public float f10404z;

    /* renamed from: ha.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0148a implements Parcelable {
        public static final Parcelable.Creator<C0148a> CREATOR = new C0149a();
        public int A;
        public int B;
        public int C;
        public int D;
        public int E;
        public int F;

        /* renamed from: c  reason: collision with root package name */
        public int f10405c;

        /* renamed from: f  reason: collision with root package name */
        public int f10406f;

        /* renamed from: j  reason: collision with root package name */
        public int f10407j;

        /* renamed from: m  reason: collision with root package name */
        public int f10408m;
        public int n;

        /* renamed from: t  reason: collision with root package name */
        public CharSequence f10409t;

        /* renamed from: u  reason: collision with root package name */
        public int f10410u;

        /* renamed from: w  reason: collision with root package name */
        public int f10411w;
        public int y;

        /* renamed from: z  reason: collision with root package name */
        public boolean f10412z;

        /* renamed from: ha.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static class C0149a implements Parcelable.Creator<C0148a> {
            @Override // android.os.Parcelable.Creator
            public C0148a createFromParcel(Parcel parcel) {
                return new C0148a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public C0148a[] newArray(int i10) {
                return new C0148a[i10];
            }
        }

        public C0148a(Context context) {
            this.f10407j = KotlinVersion.MAX_COMPONENT_VALUE;
            this.f10408m = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(2132017706, m9.a.f13026v0);
            obtainStyledAttributes.getDimension(0, 0.0f);
            ColorStateList a10 = c.a(context, obtainStyledAttributes, 3);
            c.a(context, obtainStyledAttributes, 4);
            c.a(context, obtainStyledAttributes, 5);
            obtainStyledAttributes.getInt(2, 0);
            obtainStyledAttributes.getInt(1, 1);
            int i10 = obtainStyledAttributes.hasValue(12) ? 12 : 10;
            obtainStyledAttributes.getResourceId(i10, 0);
            obtainStyledAttributes.getString(i10);
            obtainStyledAttributes.getBoolean(14, false);
            c.a(context, obtainStyledAttributes, 6);
            obtainStyledAttributes.getFloat(7, 0.0f);
            obtainStyledAttributes.getFloat(8, 0.0f);
            obtainStyledAttributes.getFloat(9, 0.0f);
            obtainStyledAttributes.recycle();
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(2132017706, m9.a.f13003d0);
            obtainStyledAttributes2.hasValue(0);
            obtainStyledAttributes2.getFloat(0, 0.0f);
            obtainStyledAttributes2.recycle();
            this.f10406f = a10.getDefaultColor();
            this.f10409t = context.getString(R.string.mtrl_badge_numberless_content_description);
            this.f10410u = R.plurals.mtrl_badge_content_description;
            this.f10411w = R.string.mtrl_exceed_max_badge_number_content_description;
            this.f10412z = true;
        }

        public C0148a(Parcel parcel) {
            this.f10407j = KotlinVersion.MAX_COMPONENT_VALUE;
            this.f10408m = -1;
            this.f10405c = parcel.readInt();
            this.f10406f = parcel.readInt();
            this.f10407j = parcel.readInt();
            this.f10408m = parcel.readInt();
            this.n = parcel.readInt();
            this.f10409t = parcel.readString();
            this.f10410u = parcel.readInt();
            this.y = parcel.readInt();
            this.A = parcel.readInt();
            this.B = parcel.readInt();
            this.C = parcel.readInt();
            this.D = parcel.readInt();
            this.E = parcel.readInt();
            this.F = parcel.readInt();
            this.f10412z = parcel.readInt() != 0;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f10405c);
            parcel.writeInt(this.f10406f);
            parcel.writeInt(this.f10407j);
            parcel.writeInt(this.f10408m);
            parcel.writeInt(this.n);
            parcel.writeString(this.f10409t.toString());
            parcel.writeInt(this.f10410u);
            parcel.writeInt(this.y);
            parcel.writeInt(this.A);
            parcel.writeInt(this.B);
            parcel.writeInt(this.C);
            parcel.writeInt(this.D);
            parcel.writeInt(this.E);
            parcel.writeInt(this.F);
            parcel.writeInt(this.f10412z ? 1 : 0);
        }
    }

    public a(Context context) {
        d dVar;
        Context context2;
        WeakReference<Context> weakReference = new WeakReference<>(context);
        this.f10397c = weakReference;
        j.c(context, j.f15817b, "Theme.MaterialComponents");
        Resources resources = context.getResources();
        this.f10400m = new Rect();
        this.f10398f = new cb.g();
        this.n = resources.getDimensionPixelSize(R.dimen.mtrl_badge_radius);
        this.f10402u = resources.getDimensionPixelSize(R.dimen.mtrl_badge_long_text_horizontal_padding);
        this.f10401t = resources.getDimensionPixelSize(R.dimen.mtrl_badge_with_text_radius);
        g gVar = new g(this);
        this.f10399j = gVar;
        gVar.f15809a.setTextAlign(Paint.Align.CENTER);
        this.f10403w = new C0148a(context);
        Context context3 = weakReference.get();
        if (context3 == null || gVar.f15813f == (dVar = new d(context3, 2132017706)) || (context2 = weakReference.get()) == null) {
            return;
        }
        gVar.b(dVar, context2);
        m();
    }

    @Override // ua.g.b
    public void a() {
        invalidateSelf();
    }

    public final String b() {
        if (e() <= this.A) {
            return NumberFormat.getInstance().format(e());
        }
        Context context = this.f10397c.get();
        return context == null ? BuildConfig.FLAVOR : context.getString(R.string.mtrl_exceed_max_badge_number_suffix, Integer.valueOf(this.A), "+");
    }

    public CharSequence c() {
        Context context;
        if (isVisible()) {
            if (f()) {
                if (this.f10403w.f10410u <= 0 || (context = this.f10397c.get()) == null) {
                    return null;
                }
                int e10 = e();
                int i10 = this.A;
                return e10 <= i10 ? context.getResources().getQuantityString(this.f10403w.f10410u, e(), Integer.valueOf(e())) : context.getString(this.f10403w.f10411w, Integer.valueOf(i10));
            }
            return this.f10403w.f10409t;
        }
        return null;
    }

    public FrameLayout d() {
        WeakReference<FrameLayout> weakReference = this.F;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (!getBounds().isEmpty() && this.f10403w.f10407j != 0 && isVisible()) {
            this.f10398f.draw(canvas);
            if (f()) {
                Rect rect = new Rect();
                String b10 = b();
                this.f10399j.f15809a.getTextBounds(b10, 0, b10.length(), rect);
                canvas.drawText(b10, this.y, this.f10404z + (rect.height() / 2), this.f10399j.f15809a);
            }
        }
    }

    public int e() {
        if (f()) {
            return this.f10403w.f10408m;
        }
        return 0;
    }

    public boolean f() {
        return this.f10403w.f10408m != -1;
    }

    public void g(int i10) {
        this.f10403w.f10405c = i10;
        ColorStateList valueOf = ColorStateList.valueOf(i10);
        cb.g gVar = this.f10398f;
        if (gVar.f3929c.d != valueOf) {
            gVar.r(valueOf);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f10403w.f10407j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f10400m.height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f10400m.width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public void h(int i10) {
        C0148a c0148a = this.f10403w;
        if (c0148a.y != i10) {
            c0148a.y = i10;
            WeakReference<View> weakReference = this.E;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            View view = this.E.get();
            WeakReference<FrameLayout> weakReference2 = this.F;
            l(view, weakReference2 != null ? weakReference2.get() : null);
        }
    }

    public void i(int i10) {
        this.f10403w.f10406f = i10;
        if (this.f10399j.f15809a.getColor() != i10) {
            this.f10399j.f15809a.setColor(i10);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return false;
    }

    public void j(int i10) {
        C0148a c0148a = this.f10403w;
        if (c0148a.n != i10) {
            c0148a.n = i10;
            this.A = ((int) Math.pow(10.0d, i10 - 1.0d)) - 1;
            this.f10399j.d = true;
            m();
            invalidateSelf();
        }
    }

    public void k(int i10) {
        int max = Math.max(0, i10);
        C0148a c0148a = this.f10403w;
        if (c0148a.f10408m != max) {
            c0148a.f10408m = max;
            this.f10399j.d = true;
            m();
            invalidateSelf();
        }
    }

    public void l(View view, FrameLayout frameLayout) {
        this.E = new WeakReference<>(view);
        this.F = new WeakReference<>(frameLayout);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        m();
        invalidateSelf();
    }

    public final void m() {
        Context context = this.f10397c.get();
        WeakReference<View> weakReference = this.E;
        FrameLayout frameLayout = null;
        View view = weakReference != null ? weakReference.get() : null;
        if (context != null && view != null) {
            Rect rect = new Rect();
            rect.set(this.f10400m);
            Rect rect2 = new Rect();
            view.getDrawingRect(rect2);
            WeakReference<FrameLayout> weakReference2 = this.F;
            if (weakReference2 != null) {
                frameLayout = weakReference2.get();
            }
            if (frameLayout != null) {
                if (frameLayout == null) {
                    frameLayout = (ViewGroup) view.getParent();
                }
                frameLayout.offsetDescendantRectToMyCoords(view, rect2);
            }
            int i10 = f() ? this.f10403w.D : this.f10403w.B;
            C0148a c0148a = this.f10403w;
            int i11 = i10 + c0148a.F;
            int i12 = c0148a.y;
            if (i12 == 8388691 || i12 == 8388693) {
                this.f10404z = rect2.bottom - i11;
            } else {
                this.f10404z = rect2.top + i11;
            }
            if (e() <= 9) {
                float f10 = !f() ? this.n : this.f10401t;
                this.B = f10;
                this.D = f10;
                this.C = f10;
            } else {
                float f11 = this.f10401t;
                this.B = f11;
                this.D = f11;
                this.C = (this.f10399j.a(b()) / 2.0f) + this.f10402u;
            }
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(f() ? R.dimen.mtrl_badge_text_horizontal_edge_offset : R.dimen.mtrl_badge_horizontal_edge_offset);
            int i13 = f() ? this.f10403w.C : this.f10403w.A;
            C0148a c0148a2 = this.f10403w;
            int i14 = i13 + c0148a2.E;
            int i15 = c0148a2.y;
            if (i15 == 8388659 || i15 == 8388691) {
                WeakHashMap<View, a0> weakHashMap = x.f13156a;
                this.y = x.e.d(view) == 0 ? (rect2.left - this.C) + dimensionPixelSize + i14 : ((rect2.right + this.C) - dimensionPixelSize) - i14;
            } else {
                WeakHashMap<View, a0> weakHashMap2 = x.f13156a;
                this.y = x.e.d(view) == 0 ? ((rect2.right + this.C) - dimensionPixelSize) - i14 : (rect2.left - this.C) + dimensionPixelSize + i14;
            }
            Rect rect3 = this.f10400m;
            float f12 = this.y;
            float f13 = this.f10404z;
            float f14 = this.C;
            float f15 = this.D;
            rect3.set((int) (f12 - f14), (int) (f13 - f15), (int) (f12 + f14), (int) (f13 + f15));
            cb.g gVar = this.f10398f;
            gVar.f3929c.f3938a = gVar.f3929c.f3938a.g(this.B);
            gVar.invalidateSelf();
            if (rect.equals(this.f10400m)) {
                return;
            }
            this.f10398f.setBounds(this.f10400m);
        }
    }

    @Override // android.graphics.drawable.Drawable, ua.g.b
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f10403w.f10407j = i10;
        this.f10399j.f15809a.setAlpha(i10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
