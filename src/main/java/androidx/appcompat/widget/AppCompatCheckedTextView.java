package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import com.app.pornhub.R;

/* loaded from: classes.dex */
public class AppCompatCheckedTextView extends CheckedTextView {

    /* renamed from: c  reason: collision with root package name */
    public final f f769c;

    /* renamed from: f  reason: collision with root package name */
    public final e f770f;

    /* renamed from: j  reason: collision with root package name */
    public final q f771j;

    /* renamed from: m  reason: collision with root package name */
    public j f772m;

    public AppCompatCheckedTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkedTextViewStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007f A[Catch: all -> 0x00ab, TryCatch #1 {all -> 0x00ab, blocks: (B:3:0x0044, B:5:0x004a, B:7:0x0050, B:11:0x005f, B:13:0x0065, B:15:0x006b, B:16:0x0078, B:18:0x007f, B:19:0x0088, B:21:0x008f), top: B:30:0x0044 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008f A[Catch: all -> 0x00ab, TRY_LEAVE, TryCatch #1 {all -> 0x00ab, blocks: (B:3:0x0044, B:5:0x004a, B:7:0x0050, B:11:0x005f, B:13:0x0065, B:15:0x006b, B:16:0x0078, B:18:0x007f, B:19:0x0088, B:21:0x008f), top: B:30:0x0044 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AppCompatCheckedTextView(android.content.Context r10, android.util.AttributeSet r11, int r12) {
        /*
            r9 = this;
            androidx.appcompat.widget.m0.a(r10)
            r9.<init>(r10, r11, r12)
            android.content.Context r10 = r9.getContext()
            androidx.appcompat.widget.k0.a(r9, r10)
            androidx.appcompat.widget.q r10 = new androidx.appcompat.widget.q
            r10.<init>(r9)
            r9.f771j = r10
            r10.e(r11, r12)
            r10.b()
            androidx.appcompat.widget.e r10 = new androidx.appcompat.widget.e
            r10.<init>(r9)
            r9.f770f = r10
            r10.d(r11, r12)
            androidx.appcompat.widget.f r10 = new androidx.appcompat.widget.f
            r10.<init>(r9)
            r9.f769c = r10
            android.content.Context r0 = r9.getContext()
            int[] r3 = b7.k.H
            r8 = 0
            androidx.appcompat.widget.p0 r0 = androidx.appcompat.widget.p0.r(r0, r11, r3, r12, r8)
            android.content.Context r2 = r9.getContext()
            android.content.res.TypedArray r5 = r0.f1055b
            r7 = 0
            r1 = r9
            r4 = r11
            r6 = r12
            n0.x.u(r1, r2, r3, r4, r5, r6, r7)
            r1 = 1
            boolean r2 = r0.p(r1)     // Catch: java.lang.Throwable -> Lab
            if (r2 == 0) goto L5c
            int r2 = r0.m(r1, r8)     // Catch: java.lang.Throwable -> Lab
            if (r2 == 0) goto L5c
            android.content.Context r3 = r9.getContext()     // Catch: android.content.res.Resources.NotFoundException -> L5c java.lang.Throwable -> Lab
            android.graphics.drawable.Drawable r2 = f.a.a(r3, r2)     // Catch: android.content.res.Resources.NotFoundException -> L5c java.lang.Throwable -> Lab
            r9.setCheckMarkDrawable(r2)     // Catch: android.content.res.Resources.NotFoundException -> L5c java.lang.Throwable -> Lab
            goto L5d
        L5c:
            r1 = 0
        L5d:
            if (r1 != 0) goto L78
            boolean r1 = r0.p(r8)     // Catch: java.lang.Throwable -> Lab
            if (r1 == 0) goto L78
            int r1 = r0.m(r8, r8)     // Catch: java.lang.Throwable -> Lab
            if (r1 == 0) goto L78
            android.widget.CheckedTextView r2 = r10.f983a     // Catch: java.lang.Throwable -> Lab
            android.content.Context r3 = r2.getContext()     // Catch: java.lang.Throwable -> Lab
            android.graphics.drawable.Drawable r1 = f.a.a(r3, r1)     // Catch: java.lang.Throwable -> Lab
            r2.setCheckMarkDrawable(r1)     // Catch: java.lang.Throwable -> Lab
        L78:
            r1 = 2
            boolean r2 = r0.p(r1)     // Catch: java.lang.Throwable -> Lab
            if (r2 == 0) goto L88
            android.widget.CheckedTextView r2 = r10.f983a     // Catch: java.lang.Throwable -> Lab
            android.content.res.ColorStateList r1 = r0.c(r1)     // Catch: java.lang.Throwable -> Lab
            r2.setCheckMarkTintList(r1)     // Catch: java.lang.Throwable -> Lab
        L88:
            r1 = 3
            boolean r2 = r0.p(r1)     // Catch: java.lang.Throwable -> Lab
            if (r2 == 0) goto L9e
            android.widget.CheckedTextView r10 = r10.f983a     // Catch: java.lang.Throwable -> Lab
            r2 = -1
            int r1 = r0.j(r1, r2)     // Catch: java.lang.Throwable -> Lab
            r2 = 0
            android.graphics.PorterDuff$Mode r1 = androidx.appcompat.widget.v.e(r1, r2)     // Catch: java.lang.Throwable -> Lab
            r10.setCheckMarkTintMode(r1)     // Catch: java.lang.Throwable -> Lab
        L9e:
            android.content.res.TypedArray r10 = r0.f1055b
            r10.recycle()
            androidx.appcompat.widget.j r10 = r9.getEmojiTextViewHelper()
            r10.a(r11, r12)
            return
        Lab:
            r10 = move-exception
            android.content.res.TypedArray r11 = r0.f1055b
            r11.recycle()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatCheckedTextView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private j getEmojiTextViewHelper() {
        if (this.f772m == null) {
            this.f772m = new j(this);
        }
        return this.f772m;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        q qVar = this.f771j;
        if (qVar != null) {
            qVar.b();
        }
        e eVar = this.f770f;
        if (eVar != null) {
            eVar.a();
        }
        f fVar = this.f769c;
        if (fVar != null) {
            fVar.a();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return q0.h.g(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f770f;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f770f;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        f fVar = this.f769c;
        if (fVar != null) {
            return fVar.f984b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        f fVar = this.f769c;
        if (fVar != null) {
            return fVar.f985c;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        cb.e.X(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().f1024b.f18680a.c(z10);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f770f;
        if (eVar != null) {
            eVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f770f;
        if (eVar != null) {
            eVar.f(i10);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i10) {
        setCheckMarkDrawable(f.a.a(getContext(), i10));
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        f fVar = this.f769c;
        if (fVar != null) {
            if (fVar.f987f) {
                fVar.f987f = false;
                return;
            }
            fVar.f987f = true;
            fVar.a();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(q0.h.h(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().f1024b.f18680a.d(z10);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f770f;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f770f;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        f fVar = this.f769c;
        if (fVar != null) {
            fVar.f984b = colorStateList;
            fVar.d = true;
            fVar.a();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        f fVar = this.f769c;
        if (fVar != null) {
            fVar.f985c = mode;
            fVar.f986e = true;
            fVar.a();
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        q qVar = this.f771j;
        if (qVar != null) {
            qVar.f(context, i10);
        }
    }
}
