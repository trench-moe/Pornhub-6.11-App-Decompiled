package z0;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.d;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes2.dex */
public final class d implements InputFilter {

    /* renamed from: c  reason: collision with root package name */
    public final TextView f18674c;

    /* renamed from: f  reason: collision with root package name */
    public d.e f18675f;

    /* loaded from: classes2.dex */
    public static class a extends d.e {

        /* renamed from: a  reason: collision with root package name */
        public final Reference<TextView> f18676a;

        /* renamed from: b  reason: collision with root package name */
        public final Reference<d> f18677b;

        public a(TextView textView, d dVar) {
            this.f18676a = new WeakReference(textView);
            this.f18677b = new WeakReference(dVar);
        }

        @Override // androidx.emoji2.text.d.e
        public void b() {
            InputFilter[] filters;
            TextView textView = this.f18676a.get();
            d dVar = this.f18677b.get();
            boolean z10 = false;
            if (dVar != null && textView != null && (filters = textView.getFilters()) != null) {
                int i10 = 0;
                while (true) {
                    if (i10 >= filters.length) {
                        break;
                    } else if (filters[i10] == dVar) {
                        z10 = true;
                        break;
                    } else {
                        i10++;
                    }
                }
            }
            if (z10 && textView.isAttachedToWindow()) {
                CharSequence h10 = androidx.emoji2.text.d.a().h(textView.getText());
                int selectionStart = Selection.getSelectionStart(h10);
                int selectionEnd = Selection.getSelectionEnd(h10);
                textView.setText(h10);
                if (h10 instanceof Spannable) {
                    Spannable spannable = (Spannable) h10;
                    if (selectionStart >= 0 && selectionEnd >= 0) {
                        Selection.setSelection(spannable, selectionStart, selectionEnd);
                    } else if (selectionStart >= 0) {
                        Selection.setSelection(spannable, selectionStart);
                    } else if (selectionEnd >= 0) {
                        Selection.setSelection(spannable, selectionEnd);
                    }
                }
            }
        }
    }

    public d(TextView textView) {
        this.f18674c = textView;
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        if (this.f18674c.isInEditMode()) {
            return charSequence;
        }
        int b10 = androidx.emoji2.text.d.a().b();
        if (b10 != 0) {
            boolean z10 = true;
            if (b10 == 1) {
                if (i13 == 0 && i12 == 0 && spanned.length() == 0 && charSequence == this.f18674c.getText()) {
                    z10 = false;
                }
                if (z10 && charSequence != null) {
                    if (i10 != 0 || i11 != charSequence.length()) {
                        charSequence = charSequence.subSequence(i10, i11);
                    }
                    CharSequence charSequence2 = charSequence;
                    charSequence = androidx.emoji2.text.d.a().i(charSequence2, 0, charSequence2.length(), IntCompanionObject.MAX_VALUE, 0);
                }
                return charSequence;
            } else if (b10 != 3) {
                return charSequence;
            }
        }
        androidx.emoji2.text.d a10 = androidx.emoji2.text.d.a();
        if (this.f18675f == null) {
            this.f18675f = new a(this.f18674c, this);
        }
        a10.j(this.f18675f);
        return charSequence;
    }
}
