package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import com.app.pornhub.R;

/* loaded from: classes.dex */
public class AppCompatEditText extends EditText implements n0.p {

    /* renamed from: c  reason: collision with root package name */
    public final e f773c;

    /* renamed from: f  reason: collision with root package name */
    public final q f774f;

    /* renamed from: j  reason: collision with root package name */
    public final p f775j;

    /* renamed from: m  reason: collision with root package name */
    public final q0.i f776m;
    public final i n;

    public AppCompatEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.editTextStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatEditText(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        m0.a(context);
        k0.a(this, getContext());
        e eVar = new e(this);
        this.f773c = eVar;
        eVar.d(attributeSet, i10);
        q qVar = new q(this);
        this.f774f = qVar;
        qVar.e(attributeSet, i10);
        qVar.b();
        this.f775j = new p(this);
        this.f776m = new q0.i();
        i iVar = new i(this);
        this.n = iVar;
        iVar.i(attributeSet, i10);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = super.isFocusable();
            int inputType = super.getInputType();
            KeyListener h10 = iVar.h(keyListener);
            if (h10 == keyListener) {
                return;
            }
            super.setKeyListener(h10);
            super.setRawInputType(inputType);
            super.setFocusable(isFocusable);
        }
    }

    @Override // n0.p
    public n0.c a(n0.c cVar) {
        return this.f776m.a(this, cVar);
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f773c;
        if (eVar != null) {
            eVar.a();
        }
        q qVar = this.f774f;
        if (qVar != null) {
            qVar.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return q0.h.g(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f773c;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f773c;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        p pVar;
        if (Build.VERSION.SDK_INT < 28 && (pVar = this.f775j) != null) {
            return pVar.d();
        }
        return super.getTextClassifier();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        int i10;
        String[] l10;
        String[] stringArray;
        InputConnection cVar;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f774f.g(this, onCreateInputConnection, editorInfo);
        cb.e.X(onCreateInputConnection, editorInfo, this);
        if (onCreateInputConnection != null && (i10 = Build.VERSION.SDK_INT) <= 30 && (l10 = n0.x.l(this)) != null) {
            if (i10 >= 25) {
                editorInfo.contentMimeTypes = l10;
            } else {
                if (editorInfo.extras == null) {
                    editorInfo.extras = new Bundle();
                }
                editorInfo.extras.putStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", l10);
                editorInfo.extras.putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", l10);
            }
            p0.d dVar = new p0.d(this);
            if (i10 >= 25) {
                cVar = new p0.b(onCreateInputConnection, false, dVar);
            } else {
                if (i10 >= 25) {
                    stringArray = editorInfo.contentMimeTypes;
                    if (stringArray == null) {
                        stringArray = p0.a.f13773a;
                    }
                } else {
                    Bundle bundle = editorInfo.extras;
                    if (bundle == null) {
                        stringArray = p0.a.f13773a;
                    } else {
                        stringArray = bundle.getStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
                        if (stringArray == null) {
                            stringArray = editorInfo.extras.getStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
                        }
                        if (stringArray == null) {
                            stringArray = p0.a.f13773a;
                        }
                    }
                }
                if (stringArray.length == 0) {
                    return this.n.j(onCreateInputConnection, editorInfo);
                }
                cVar = new p0.c(onCreateInputConnection, false, dVar);
            }
            onCreateInputConnection = cVar;
        }
        return this.n.j(onCreateInputConnection, editorInfo);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0071, code lost:
        return true;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onDragEvent(android.view.DragEvent r8) {
        /*
            r7 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r6 = 4
            r1 = 31
            r6 = 5
            r5 = 1
            r2 = r5
            r5 = 0
            r3 = r5
            if (r0 >= r1) goto L6e
            r6 = 2
            r1 = 24
            r6 = 6
            if (r0 < r1) goto L6e
            java.lang.Object r0 = r8.getLocalState()
            if (r0 != 0) goto L6e
            java.lang.String[] r0 = n0.x.l(r7)
            if (r0 != 0) goto L1f
            goto L6e
        L1f:
            android.content.Context r0 = r7.getContext()
        L23:
            boolean r1 = r0 instanceof android.content.ContextWrapper
            if (r1 == 0) goto L39
            boolean r1 = r0 instanceof android.app.Activity
            r6 = 6
            if (r1 == 0) goto L30
            android.app.Activity r0 = (android.app.Activity) r0
            r6 = 5
            goto L3b
        L30:
            r6 = 2
            android.content.ContextWrapper r0 = (android.content.ContextWrapper) r0
            android.content.Context r5 = r0.getBaseContext()
            r0 = r5
            goto L23
        L39:
            r5 = 0
            r0 = r5
        L3b:
            if (r0 != 0) goto L58
            r6 = 3
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r6 = 7
            r0.<init>()
            r6 = 1
            java.lang.String r1 = "Can't handle drop: no activity: view="
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "ReceiveContent"
            r6 = 2
            android.util.Log.i(r1, r0)
            goto L6e
        L58:
            int r1 = r8.getAction()
            if (r1 != r2) goto L60
            r6 = 2
            goto L6e
        L60:
            int r5 = r8.getAction()
            r1 = r5
            r5 = 3
            r4 = r5
            if (r1 != r4) goto L6e
            boolean r5 = androidx.appcompat.widget.m.a(r8, r7, r0)
            r3 = r5
        L6e:
            if (r3 == 0) goto L72
            r6 = 3
            return r2
        L72:
            boolean r8 = super.onDragEvent(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatEditText.onDragEvent(android.view.DragEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    @Override // android.widget.TextView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTextContextMenuItem(int r11) {
        /*
            r10 = this;
            r7 = r10
            int r0 = android.os.Build.VERSION.SDK_INT
            r9 = 5
            r1 = 0
            r9 = 1
            r2 = 31
            r9 = 6
            r3 = 1
            if (r0 >= r2) goto L63
            r9 = 5
            java.lang.String[] r9 = n0.x.l(r7)
            r4 = r9
            if (r4 == 0) goto L63
            r4 = 16908322(0x1020022, float:2.3877324E-38)
            if (r11 == r4) goto L20
            r5 = 16908337(0x1020031, float:2.3877366E-38)
            r9 = 3
            if (r11 == r5) goto L20
            goto L64
        L20:
            android.content.Context r9 = r7.getContext()
            r5 = r9
            java.lang.String r9 = "clipboard"
            r6 = r9
            java.lang.Object r5 = r5.getSystemService(r6)
            android.content.ClipboardManager r5 = (android.content.ClipboardManager) r5
            r9 = 2
            if (r5 != 0) goto L34
            r9 = 7
            r5 = 0
            goto L39
        L34:
            r9 = 2
            android.content.ClipData r5 = r5.getPrimaryClip()
        L39:
            if (r5 == 0) goto L61
            int r9 = r5.getItemCount()
            r6 = r9
            if (r6 <= 0) goto L61
            if (r0 < r2) goto L4b
            n0.c$a r0 = new n0.c$a
            r9 = 5
            r0.<init>(r5, r3)
            goto L52
        L4b:
            r9 = 6
            n0.c$c r0 = new n0.c$c
            r9 = 5
            r0.<init>(r5, r3)
        L52:
            if (r11 != r4) goto L55
            goto L57
        L55:
            r9 = 1
            r1 = r9
        L57:
            r0.c(r1)
            n0.c r0 = r0.build()
            n0.x.q(r7, r0)
        L61:
            r1 = 1
            r9 = 3
        L63:
            r9 = 2
        L64:
            if (r1 == 0) goto L67
            return r3
        L67:
            r9 = 7
            boolean r11 = super.onTextContextMenuItem(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatEditText.onTextContextMenuItem(int):boolean");
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f773c;
        if (eVar != null) {
            eVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f773c;
        if (eVar != null) {
            eVar.f(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(q0.h.h(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        ((z0.a) this.n.f1018f).f18666a.c(z10);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.n.h(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f773c;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f773c;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        q qVar = this.f774f;
        if (qVar != null) {
            qVar.f(context, i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        p pVar;
        if (Build.VERSION.SDK_INT < 28 && (pVar = this.f775j) != null) {
            pVar.f1053b = textClassifier;
            return;
        }
        super.setTextClassifier(textClassifier);
    }
}
