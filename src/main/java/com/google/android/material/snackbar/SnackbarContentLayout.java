package com.google.android.material.snackbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.app.pornhub.R;
import java.util.WeakHashMap;
import n0.a0;
import n0.x;

/* loaded from: classes.dex */
public class SnackbarContentLayout extends LinearLayout implements db.f {

    /* renamed from: c  reason: collision with root package name */
    public TextView f7663c;

    /* renamed from: f  reason: collision with root package name */
    public Button f7664f;

    /* renamed from: j  reason: collision with root package name */
    public int f7665j;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final boolean a(int i10, int i11, int i12) {
        boolean z10;
        if (i10 != getOrientation()) {
            setOrientation(i10);
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f7663c.getPaddingTop() == i11 && this.f7663c.getPaddingBottom() == i12) {
            return z10;
        }
        TextView textView = this.f7663c;
        WeakHashMap<View, a0> weakHashMap = x.f13156a;
        if (x.e.g(textView)) {
            x.e.k(textView, x.e.f(textView), i11, x.e.e(textView), i12);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i11, textView.getPaddingRight(), i12);
        return true;
    }

    public Button getActionView() {
        return this.f7664f;
    }

    public TextView getMessageView() {
        return this.f7663c;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f7663c = (TextView) findViewById(R.id.snackbar_text);
        this.f7664f = (Button) findViewById(R.id.snackbar_action);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0051, code lost:
        if (a(1, r0, r0 - r7) != false) goto L17;
     */
    @Override // android.widget.LinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r12, int r13) {
        /*
            r11 = this;
            super.onMeasure(r12, r13)
            r9 = 3
            android.content.res.Resources r7 = r11.getResources()
            r0 = r7
            r1 = 2131165363(0x7f0700b3, float:1.794494E38)
            r10 = 3
            int r0 = r0.getDimensionPixelSize(r1)
            android.content.res.Resources r1 = r11.getResources()
            r2 = 2131165362(0x7f0700b2, float:1.7944939E38)
            r9 = 7
            int r7 = r1.getDimensionPixelSize(r2)
            r1 = r7
            android.widget.TextView r2 = r11.f7663c
            r8 = 6
            android.text.Layout r2 = r2.getLayout()
            int r7 = r2.getLineCount()
            r2 = r7
            r7 = 0
            r3 = r7
            r4 = 1
            r9 = 1
            if (r2 <= r4) goto L33
            r9 = 5
            r2 = 1
            goto L35
        L33:
            r7 = 0
            r2 = r7
        L35:
            if (r2 == 0) goto L54
            r8 = 6
            int r5 = r11.f7665j
            r10 = 2
            if (r5 <= 0) goto L54
            android.widget.Button r5 = r11.f7664f
            r10 = 4
            int r5 = r5.getMeasuredWidth()
            int r6 = r11.f7665j
            r9 = 4
            if (r5 <= r6) goto L54
            r8 = 7
            int r1 = r0 - r1
            r9 = 1
            boolean r0 = r11.a(r4, r0, r1)
            if (r0 == 0) goto L63
            goto L61
        L54:
            r10 = 3
            if (r2 == 0) goto L59
            r10 = 4
            goto L5a
        L59:
            r0 = r1
        L5a:
            boolean r0 = r11.a(r3, r0, r0)
            if (r0 == 0) goto L63
            r10 = 2
        L61:
            r3 = 1
            r8 = 5
        L63:
            r8 = 3
            if (r3 == 0) goto L6b
            r8 = 5
            super.onMeasure(r12, r13)
            r9 = 7
        L6b:
            r10 = 7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.SnackbarContentLayout.onMeasure(int, int):void");
    }

    public void setMaxInlineActionWidth(int i10) {
        this.f7665j = i10;
    }
}
