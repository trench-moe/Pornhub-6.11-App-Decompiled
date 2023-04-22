package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import kotlin.KotlinVersion;
import t9.j0;

/* loaded from: classes.dex */
public class MockView extends View {
    public int A;

    /* renamed from: c  reason: collision with root package name */
    public Paint f1549c;

    /* renamed from: f  reason: collision with root package name */
    public Paint f1550f;

    /* renamed from: j  reason: collision with root package name */
    public Paint f1551j;

    /* renamed from: m  reason: collision with root package name */
    public boolean f1552m;
    public boolean n;

    /* renamed from: t  reason: collision with root package name */
    public String f1553t;

    /* renamed from: u  reason: collision with root package name */
    public Rect f1554u;

    /* renamed from: w  reason: collision with root package name */
    public int f1555w;
    public int y;

    /* renamed from: z  reason: collision with root package name */
    public int f1556z;

    public MockView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1549c = new Paint();
        this.f1550f = new Paint();
        this.f1551j = new Paint();
        this.f1552m = true;
        this.n = true;
        this.f1553t = null;
        this.f1554u = new Rect();
        this.f1555w = Color.argb((int) KotlinVersion.MAX_COMPONENT_VALUE, 0, 0, 0);
        this.y = Color.argb((int) KotlinVersion.MAX_COMPONENT_VALUE, 200, 200, 200);
        this.f1556z = Color.argb((int) KotlinVersion.MAX_COMPONENT_VALUE, 50, 50, 50);
        this.A = 4;
        a(context, attributeSet);
    }

    public MockView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1549c = new Paint();
        this.f1550f = new Paint();
        this.f1551j = new Paint();
        this.f1552m = true;
        this.n = true;
        this.f1553t = null;
        this.f1554u = new Rect();
        this.f1555w = Color.argb((int) KotlinVersion.MAX_COMPONENT_VALUE, 0, 0, 0);
        this.y = Color.argb((int) KotlinVersion.MAX_COMPONENT_VALUE, 200, 200, 200);
        this.f1556z = Color.argb((int) KotlinVersion.MAX_COMPONENT_VALUE, 50, 50, 50);
        this.A = 4;
        a(context, attributeSet);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j0.N);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 1) {
                    this.f1553t = obtainStyledAttributes.getString(index);
                } else if (index == 4) {
                    this.f1552m = obtainStyledAttributes.getBoolean(index, this.f1552m);
                } else if (index == 0) {
                    this.f1555w = obtainStyledAttributes.getColor(index, this.f1555w);
                } else if (index == 2) {
                    this.f1556z = obtainStyledAttributes.getColor(index, this.f1556z);
                } else if (index == 3) {
                    this.y = obtainStyledAttributes.getColor(index, this.y);
                } else if (index == 5) {
                    this.n = obtainStyledAttributes.getBoolean(index, this.n);
                }
            }
            obtainStyledAttributes.recycle();
        }
        if (this.f1553t == null) {
            try {
                this.f1553t = context.getResources().getResourceEntryName(getId());
            } catch (Exception unused) {
            }
        }
        this.f1549c.setColor(this.f1555w);
        this.f1549c.setAntiAlias(true);
        this.f1550f.setColor(this.y);
        this.f1550f.setAntiAlias(true);
        this.f1551j.setColor(this.f1556z);
        this.A = Math.round((getResources().getDisplayMetrics().xdpi / 160.0f) * this.A);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f1552m) {
            width--;
            height--;
            float f10 = width;
            float f11 = height;
            canvas.drawLine(0.0f, 0.0f, f10, f11, this.f1549c);
            canvas.drawLine(0.0f, f11, f10, 0.0f, this.f1549c);
            canvas.drawLine(0.0f, 0.0f, f10, 0.0f, this.f1549c);
            canvas.drawLine(f10, 0.0f, f10, f11, this.f1549c);
            canvas.drawLine(f10, f11, 0.0f, f11, this.f1549c);
            canvas.drawLine(0.0f, f11, 0.0f, 0.0f, this.f1549c);
        }
        String str = this.f1553t;
        if (str != null && this.n) {
            this.f1550f.getTextBounds(str, 0, str.length(), this.f1554u);
            float width2 = (width - this.f1554u.width()) / 2.0f;
            float height2 = ((height - this.f1554u.height()) / 2.0f) + this.f1554u.height();
            this.f1554u.offset((int) width2, (int) height2);
            Rect rect = this.f1554u;
            int i10 = rect.left;
            int i11 = this.A;
            rect.set(i10 - i11, rect.top - i11, rect.right + i11, rect.bottom + i11);
            canvas.drawRect(this.f1554u, this.f1551j);
            canvas.drawText(this.f1553t, width2, height2, this.f1550f);
        }
    }
}
