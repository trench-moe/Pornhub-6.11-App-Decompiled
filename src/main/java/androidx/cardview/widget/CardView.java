package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import cb.e;
import com.app.pornhub.R;
import o.b;
import o.c;

/* loaded from: classes.dex */
public class CardView extends FrameLayout {

    /* renamed from: w  reason: collision with root package name */
    public static final int[] f1151w = {16842801};
    public static final b y = new e();

    /* renamed from: c  reason: collision with root package name */
    public boolean f1152c;

    /* renamed from: f  reason: collision with root package name */
    public boolean f1153f;

    /* renamed from: j  reason: collision with root package name */
    public int f1154j;

    /* renamed from: m  reason: collision with root package name */
    public int f1155m;
    public final Rect n;

    /* renamed from: t  reason: collision with root package name */
    public final Rect f1156t;

    /* renamed from: u  reason: collision with root package name */
    public final o.a f1157u;

    /* loaded from: classes.dex */
    public class a implements o.a {

        /* renamed from: a  reason: collision with root package name */
        public Drawable f1158a;

        public a() {
        }

        public boolean a() {
            return CardView.this.getPreventCornerOverlap();
        }

        public void b(int i10, int i11, int i12, int i13) {
            CardView.this.f1156t.set(i10, i11, i12, i13);
            CardView cardView = CardView.this;
            Rect rect = cardView.n;
            CardView.super.setPadding(i10 + rect.left, i11 + rect.top, i12 + rect.right, i13 + rect.bottom);
        }
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.cardViewStyle);
    }

    public CardView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.n = rect;
        this.f1156t = new Rect();
        a aVar = new a();
        this.f1157u = aVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o9.b.f13627z, i10, R.style.CardView);
        if (obtainStyledAttributes.hasValue(2)) {
            valueOf = obtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(f1151w);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            valueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(R.color.cardview_light_background) : getResources().getColor(R.color.cardview_dark_background));
        }
        float dimension = obtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(5, 0.0f);
        this.f1152c = obtainStyledAttributes.getBoolean(7, false);
        this.f1153f = obtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        this.f1154j = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f1155m = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        c cVar = new c(valueOf, dimension);
        aVar.f1158a = cVar;
        CardView.this.setBackgroundDrawable(cVar);
        CardView cardView = CardView.this;
        cardView.setClipToOutline(true);
        cardView.setElevation(dimension2);
        ((e) y).a0(aVar, dimension3);
    }

    public ColorStateList getCardBackgroundColor() {
        return ((e) y).G(this.f1157u).f13471h;
    }

    public float getCardElevation() {
        return CardView.this.getElevation();
    }

    public int getContentPaddingBottom() {
        return this.n.bottom;
    }

    public int getContentPaddingLeft() {
        return this.n.left;
    }

    public int getContentPaddingRight() {
        return this.n.right;
    }

    public int getContentPaddingTop() {
        return this.n.top;
    }

    public float getMaxCardElevation() {
        return ((e) y).I(this.f1157u);
    }

    public boolean getPreventCornerOverlap() {
        return this.f1153f;
    }

    public float getRadius() {
        return ((e) y).J(this.f1157u);
    }

    public boolean getUseCompatPadding() {
        return this.f1152c;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    public void setCardBackgroundColor(int i10) {
        b bVar = y;
        o.a aVar = this.f1157u;
        ColorStateList valueOf = ColorStateList.valueOf(i10);
        c G = ((e) bVar).G(aVar);
        G.b(valueOf);
        G.invalidateSelf();
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        c G = ((e) y).G(this.f1157u);
        G.b(colorStateList);
        G.invalidateSelf();
    }

    public void setCardElevation(float f10) {
        CardView.this.setElevation(f10);
    }

    public void setMaxCardElevation(float f10) {
        ((e) y).a0(this.f1157u, f10);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i10) {
        this.f1155m = i10;
        super.setMinimumHeight(i10);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i10) {
        this.f1154j = i10;
        super.setMinimumWidth(i10);
    }

    @Override // android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i10, int i11, int i12, int i13) {
    }

    public void setPreventCornerOverlap(boolean z10) {
        if (z10 != this.f1153f) {
            this.f1153f = z10;
            b bVar = y;
            o.a aVar = this.f1157u;
            e eVar = (e) bVar;
            eVar.a0(aVar, eVar.G(aVar).f13468e);
        }
    }

    public void setRadius(float f10) {
        c G = ((e) y).G(this.f1157u);
        if (f10 == G.f13465a) {
            return;
        }
        G.f13465a = f10;
        G.c(null);
        G.invalidateSelf();
    }

    public void setUseCompatPadding(boolean z10) {
        if (this.f1152c != z10) {
            this.f1152c = z10;
            b bVar = y;
            o.a aVar = this.f1157u;
            e eVar = (e) bVar;
            eVar.a0(aVar, eVar.G(aVar).f13468e);
        }
    }
}
