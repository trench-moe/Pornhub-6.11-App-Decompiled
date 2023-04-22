package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.google.android.exoplayer2.ui.SubtitleView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import k8.c0;

/* loaded from: classes.dex */
final class WebViewSubtitleOutput extends FrameLayout implements SubtitleView.a {

    /* renamed from: c  reason: collision with root package name */
    public final CanvasSubtitleOutput f6590c;

    /* renamed from: f  reason: collision with root package name */
    public final WebView f6591f;

    /* renamed from: j  reason: collision with root package name */
    public List<y7.a> f6592j;

    /* renamed from: m  reason: collision with root package name */
    public com.google.android.exoplayer2.ui.a f6593m;
    public float n;

    /* renamed from: t  reason: collision with root package name */
    public int f6594t;

    /* renamed from: u  reason: collision with root package name */
    public float f6595u;

    /* loaded from: classes.dex */
    public class a extends WebView {
        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // android.webkit.WebView, android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            super.onTouchEvent(motionEvent);
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            super.performClick();
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f6596a;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            f6596a = iArr;
            try {
                iArr[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6596a[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6596a[Layout.Alignment.ALIGN_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public WebViewSubtitleOutput(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6592j = Collections.emptyList();
        this.f6593m = com.google.android.exoplayer2.ui.a.f6597g;
        this.n = 0.0533f;
        this.f6594t = 0;
        this.f6595u = 0.08f;
        CanvasSubtitleOutput canvasSubtitleOutput = new CanvasSubtitleOutput(context, attributeSet);
        this.f6590c = canvasSubtitleOutput;
        a aVar = new a(context, attributeSet);
        this.f6591f = aVar;
        aVar.setBackgroundColor(0);
        addView(canvasSubtitleOutput);
        addView(aVar);
    }

    public static int b(int i10) {
        if (i10 != 1) {
            return i10 != 2 ? 0 : -100;
        }
        return -50;
    }

    public static String c(Layout.Alignment alignment) {
        if (alignment == null) {
            return "center";
        }
        int i10 = b.f6596a[alignment.ordinal()];
        return i10 != 1 ? i10 != 2 ? "center" : "end" : "start";
    }

    @Override // com.google.android.exoplayer2.ui.SubtitleView.a
    public void a(List<y7.a> list, com.google.android.exoplayer2.ui.a aVar, float f10, int i10, float f11) {
        this.f6593m = aVar;
        this.n = f10;
        this.f6594t = i10;
        this.f6595u = f11;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            y7.a aVar2 = list.get(i11);
            if (aVar2.d != null) {
                arrayList.add(aVar2);
            } else {
                arrayList2.add(aVar2);
            }
        }
        if (this.f6592j.isEmpty()) {
            if (!arrayList2.isEmpty()) {
            }
            this.f6590c.a(arrayList, aVar, f10, i10, f11);
            invalidate();
        }
        this.f6592j = arrayList2;
        e();
        this.f6590c.a(arrayList, aVar, f10, i10, f11);
        invalidate();
    }

    public final String d(int i10, float f10) {
        float b10 = n.b(i10, f10, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        return b10 == -3.4028235E38f ? "unset" : c0.k("%.2fpx", Float.valueOf(b10 / getContext().getResources().getDisplayMetrics().density));
    }

    /* JADX WARN: Code restructure failed: missing block: B:184:0x048d, code lost:
        if (((android.text.style.TypefaceSpan) r9).getFamily() != null) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01c3, code lost:
        if (r5 != 0) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01c6, code lost:
        if (r5 != 0) goto L239;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01c8, code lost:
        r20 = "left";
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01ca, code lost:
        r3 = 2;
        r21 = "top";
        r22 = r20;
     */
    /* JADX WARN: Removed duplicated region for block: B:209:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x05cb  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x064a  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x066b  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x068f  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x06ab  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0521 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e() {
        /*
            Method dump skipped, instructions count: 1838
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.WebViewSubtitleOutput.e():void");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (!z10 || this.f6592j.isEmpty()) {
            return;
        }
        e();
    }
}
