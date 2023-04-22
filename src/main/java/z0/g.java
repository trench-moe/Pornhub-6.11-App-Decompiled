package z0;

import android.text.Editable;
import android.text.Selection;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.d;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class g implements TextWatcher {

    /* renamed from: c  reason: collision with root package name */
    public final EditText f18685c;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f18686f;

    /* renamed from: j  reason: collision with root package name */
    public d.e f18687j;

    /* renamed from: m  reason: collision with root package name */
    public boolean f18688m = true;

    /* loaded from: classes2.dex */
    public static class a extends d.e {

        /* renamed from: a  reason: collision with root package name */
        public final Reference<EditText> f18689a;

        public a(EditText editText) {
            this.f18689a = new WeakReference(editText);
        }

        @Override // androidx.emoji2.text.d.e
        public void b() {
            g.a(this.f18689a.get(), 1);
        }
    }

    public g(EditText editText, boolean z10) {
        this.f18685c = editText;
        this.f18686f = z10;
    }

    public static void a(EditText editText, int i10) {
        if (i10 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            androidx.emoji2.text.d.a().h(editableText);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0063  */
    @Override // android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onTextChanged(java.lang.CharSequence r11, int r12, int r13, int r14) {
        /*
            r10 = this;
            android.widget.EditText r0 = r10.f18685c
            boolean r6 = r0.isInEditMode()
            r0 = r6
            if (r0 != 0) goto L76
            boolean r0 = r10.f18688m
            r7 = 6
            r1 = 1
            r9 = 2
            if (r0 == 0) goto L21
            boolean r0 = r10.f18686f
            if (r0 != 0) goto L1e
            r9 = 1
            boolean r6 = androidx.emoji2.text.d.c()
            r0 = r6
            if (r0 != 0) goto L1e
            r7 = 7
            goto L22
        L1e:
            r7 = 3
            r0 = 0
            goto L24
        L21:
            r8 = 7
        L22:
            r6 = 1
            r0 = r6
        L24:
            if (r0 == 0) goto L27
            goto L76
        L27:
            r9 = 2
            if (r13 > r14) goto L76
            r7 = 2
            boolean r13 = r11 instanceof android.text.Spannable
            r9 = 4
            if (r13 == 0) goto L76
            r8 = 3
            androidx.emoji2.text.d r13 = androidx.emoji2.text.d.a()
            int r6 = r13.b()
            r13 = r6
            if (r13 == 0) goto L59
            if (r13 == r1) goto L44
            r7 = 6
            r6 = 3
            r11 = r6
            if (r13 == r11) goto L59
            goto L76
        L44:
            r1 = r11
            android.text.Spannable r1 = (android.text.Spannable) r1
            androidx.emoji2.text.d r0 = androidx.emoji2.text.d.a()
            int r3 = r12 + r14
            r9 = 2
            r4 = 2147483647(0x7fffffff, float:NaN)
            r7 = 2
            r6 = 0
            r5 = r6
            r2 = r12
            r0.i(r1, r2, r3, r4, r5)
            goto L76
        L59:
            r7 = 7
            androidx.emoji2.text.d r6 = androidx.emoji2.text.d.a()
            r11 = r6
            androidx.emoji2.text.d$e r12 = r10.f18687j
            if (r12 != 0) goto L6f
            z0.g$a r12 = new z0.g$a
            r9 = 1
            android.widget.EditText r13 = r10.f18685c
            r12.<init>(r13)
            r7 = 5
            r10.f18687j = r12
            r7 = 6
        L6f:
            r7 = 4
            androidx.emoji2.text.d$e r12 = r10.f18687j
            r11.j(r12)
            r8 = 2
        L76:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z0.g.onTextChanged(java.lang.CharSequence, int, int, int):void");
    }
}
