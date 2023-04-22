package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.KotlinVersion;
import t9.j0;

/* loaded from: classes.dex */
public class Placeholder extends View {

    /* renamed from: c  reason: collision with root package name */
    public int f1673c;

    /* renamed from: f  reason: collision with root package name */
    public View f1674f;

    /* renamed from: j  reason: collision with root package name */
    public int f1675j;

    public Placeholder(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1673c = -1;
        this.f1674f = null;
        this.f1675j = 4;
        a(attributeSet);
    }

    public Placeholder(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1673c = -1;
        this.f1674f = null;
        this.f1675j = 4;
        a(attributeSet);
    }

    public final void a(AttributeSet attributeSet) {
        super.setVisibility(this.f1675j);
        this.f1673c = -1;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, j0.C);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 0) {
                    this.f1673c = obtainStyledAttributes.getResourceId(index, this.f1673c);
                } else if (index == 1) {
                    this.f1675j = obtainStyledAttributes.getInt(index, this.f1675j);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public View getContent() {
        return this.f1674f;
    }

    public int getEmptyVisibility() {
        return this.f1675j;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(KotlinVersion.MAX_COMPONENT_VALUE, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize(rect.height());
            int height = rect.height();
            int width = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((width / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((rect.height() / 2.0f) + (height / 2.0f)) - rect.bottom, paint);
        }
    }

    public void setContentId(int i10) {
        View findViewById;
        if (this.f1673c == i10) {
            return;
        }
        View view = this.f1674f;
        if (view != null) {
            view.setVisibility(0);
            ((ConstraintLayout.LayoutParams) this.f1674f.getLayoutParams()).f1626f0 = false;
            this.f1674f = null;
        }
        this.f1673c = i10;
        if (i10 != -1 && (findViewById = ((View) getParent()).findViewById(i10)) != null) {
            findViewById.setVisibility(8);
        }
    }

    public void setEmptyVisibility(int i10) {
        this.f1675j = i10;
    }
}
