package wc;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;

/* loaded from: classes2.dex */
public final class a extends vc.a<CharSequence> {

    /* renamed from: c  reason: collision with root package name */
    public final TextView f17460c;

    /* renamed from: wc.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0286a extends MainThreadDisposable implements TextWatcher {

        /* renamed from: c  reason: collision with root package name */
        public final TextView f17461c;

        /* renamed from: f  reason: collision with root package name */
        public final Observer<? super CharSequence> f17462f;

        public C0286a(TextView textView, Observer<? super CharSequence> observer) {
            this.f17461c = textView;
            this.f17462f = observer;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.f17461c.removeTextChangedListener(this);
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            if (isDisposed()) {
                return;
            }
            this.f17462f.onNext(charSequence);
        }
    }

    public a(TextView textView) {
        this.f17460c = textView;
    }

    @Override // vc.a
    public CharSequence a() {
        return this.f17460c.getText();
    }

    @Override // vc.a
    public void b(Observer<? super CharSequence> observer) {
        C0286a c0286a = new C0286a(this.f17460c, observer);
        observer.onSubscribe(c0286a);
        this.f17460c.addTextChangedListener(c0286a);
    }
}
