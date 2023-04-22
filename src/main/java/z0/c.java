package z0;

import android.os.Bundle;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;

/* loaded from: classes2.dex */
public final class c extends InputConnectionWrapper {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f18672a;

    /* renamed from: b  reason: collision with root package name */
    public final a f18673b;

    /* loaded from: classes2.dex */
    public static class a {
        /* JADX WARN: Code restructure failed: missing block: B:38:0x0064, code lost:
            if (java.lang.Character.isHighSurrogate(r5) != false) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x00a3, code lost:
            if (r13 != false) goto L57;
         */
        /* JADX WARN: Code restructure failed: missing block: B:66:0x00b3, code lost:
            if (java.lang.Character.isLowSurrogate(r5) != false) goto L98;
         */
        /* JADX WARN: Removed duplicated region for block: B:17:0x002c  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean a(android.view.inputmethod.InputConnection r9, android.text.Editable r10, int r11, int r12, boolean r13) {
            /*
                Method dump skipped, instructions count: 319
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: z0.c.a.a(android.view.inputmethod.InputConnection, android.text.Editable, int, int, boolean):boolean");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        super(inputConnection, false);
        a aVar = new a();
        this.f18672a = textView;
        this.f18673b = aVar;
        if (androidx.emoji2.text.d.c()) {
            androidx.emoji2.text.d a10 = androidx.emoji2.text.d.a();
            if (!a10.d() || editorInfo == null) {
                return;
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            a10.f1941e.c(editorInfo);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i10, int i11) {
        if (!this.f18673b.a(this, this.f18672a.getEditableText(), i10, i11, false) && !super.deleteSurroundingText(i10, i11)) {
            return false;
        }
        return true;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i10, int i11) {
        return this.f18673b.a(this, this.f18672a.getEditableText(), i10, i11, true) || super.deleteSurroundingTextInCodePoints(i10, i11);
    }
}
