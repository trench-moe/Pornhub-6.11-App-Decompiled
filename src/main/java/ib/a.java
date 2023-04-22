package ib;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import cb.e;
import cb.f;
import cb.g;
import cb.h;
import cb.k;
import java.util.Objects;
import ua.g;

/* loaded from: classes2.dex */
public class a extends g implements g.b {
    public CharSequence P;
    public final Context Q;
    public final Paint.FontMetrics R;
    public final ua.g S;
    public final View.OnLayoutChangeListener T;
    public final Rect U;
    public int V;
    public int W;
    public int X;
    public int Y;
    public int Z;

    /* renamed from: a0  reason: collision with root package name */
    public int f10685a0;

    /* renamed from: b0  reason: collision with root package name */
    public float f10686b0;

    /* renamed from: c0  reason: collision with root package name */
    public float f10687c0;

    /* renamed from: d0  reason: collision with root package name */
    public float f10688d0;

    /* renamed from: e0  reason: collision with root package name */
    public float f10689e0;

    /* renamed from: ib.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class View$OnLayoutChangeListenerC0155a implements View.OnLayoutChangeListener {
        public View$OnLayoutChangeListenerC0155a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            a aVar = a.this;
            Objects.requireNonNull(aVar);
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            aVar.f10685a0 = iArr[0];
            view.getWindowVisibleDisplayFrame(aVar.U);
        }
    }

    public a(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.R = new Paint.FontMetrics();
        ua.g gVar = new ua.g(this);
        this.S = gVar;
        this.T = new View$OnLayoutChangeListenerC0155a();
        this.U = new Rect();
        this.f10686b0 = 1.0f;
        this.f10687c0 = 1.0f;
        this.f10688d0 = 0.5f;
        this.f10689e0 = 1.0f;
        this.Q = context;
        gVar.f15809a.density = context.getResources().getDisplayMetrics().density;
        gVar.f15809a.setTextAlign(Paint.Align.CENTER);
    }

    public final float D() {
        int i10;
        if (((this.U.right - getBounds().right) - this.f10685a0) - this.Y < 0) {
            i10 = ((this.U.right - getBounds().right) - this.f10685a0) - this.Y;
        } else if (((this.U.left - getBounds().left) - this.f10685a0) + this.Y <= 0) {
            return 0.0f;
        } else {
            i10 = ((this.U.left - getBounds().left) - this.f10685a0) + this.Y;
        }
        return i10;
    }

    public final e E() {
        float width = ((float) (getBounds().width() - (Math.sqrt(2.0d) * this.Z))) / 2.0f;
        return new h(new f(this.Z), Math.min(Math.max(-D(), -width), width));
    }

    @Override // ua.g.b
    public void a() {
        invalidateSelf();
    }

    @Override // cb.g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        canvas.save();
        float D = D();
        double sqrt = Math.sqrt(2.0d);
        canvas.scale(this.f10686b0, this.f10687c0, (getBounds().width() * 0.5f) + getBounds().left, (getBounds().height() * this.f10688d0) + getBounds().top);
        canvas.translate(D, (float) (-((sqrt * this.Z) - this.Z)));
        super.draw(canvas);
        if (this.P != null) {
            Rect bounds = getBounds();
            this.S.f15809a.getFontMetrics(this.R);
            Paint.FontMetrics fontMetrics = this.R;
            int centerY = (int) (bounds.centerY() - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f));
            ua.g gVar = this.S;
            if (gVar.f15813f != null) {
                gVar.f15809a.drawableState = getState();
                ua.g gVar2 = this.S;
                gVar2.f15813f.e(this.Q, gVar2.f15809a, gVar2.f15810b);
                this.S.f15809a.setAlpha((int) (this.f10689e0 * 255.0f));
            }
            CharSequence charSequence = this.P;
            canvas.drawText(charSequence, 0, charSequence.length(), bounds.centerX(), centerY, this.S.f15809a);
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) Math.max(this.S.f15809a.getTextSize(), this.X);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        float f10 = this.V * 2;
        CharSequence charSequence = this.P;
        return (int) Math.max(f10 + (charSequence == null ? 0.0f : this.S.a(charSequence.toString())), this.W);
    }

    @Override // cb.g, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        k kVar = this.f3929c.f3938a;
        Objects.requireNonNull(kVar);
        k.b bVar = new k.b(kVar);
        bVar.f3980k = E();
        this.f3929c.f3938a = bVar.a();
        invalidateSelf();
    }

    @Override // cb.g, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }
}
